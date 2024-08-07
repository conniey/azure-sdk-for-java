// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation;

import com.azure.cosmos.implementation.apachecommons.collections.map.UnmodifiableMap;
import com.azure.cosmos.implementation.apachecommons.lang.StringUtils;
import com.azure.cosmos.implementation.routing.PartitionKeyInternal;
import com.azure.cosmos.models.PartitionKeyDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import static com.azure.cosmos.implementation.Utils.ValueHolder;

/**
 * Used internally to provides helper functions to work with session tokens in the Azure Cosmos DB database service.
 */
public class SessionTokenHelper {

    private static final Logger logger = LoggerFactory.getLogger(SessionTokenHelper.class);

    public static void setOriginalSessionToken(RxDocumentServiceRequest request, String originalSessionToken) {
        if (request == null) {
            throw new IllegalArgumentException("request is null");
        }

        if (originalSessionToken == null) {
            request.getHeaders().remove(HttpConstants.HttpHeaders.SESSION_TOKEN);
        } else {
            request.getHeaders().put(HttpConstants.HttpHeaders.SESSION_TOKEN, originalSessionToken);
        }
    }

    public static void setPartitionLocalSessionToken(RxDocumentServiceRequest request, ISessionContainer sessionContainer) {
        setPartitionLocalSessionToken(request, request.requestContext.resolvedPartitionKeyRange.getId(), sessionContainer);
    }

    public static void setPartitionLocalSessionToken(RxDocumentServiceRequest request, String partitionKeyRangeId, ISessionContainer sessionContainer) {
        String originalSessionToken = request.getHeaders().get(HttpConstants.HttpHeaders.SESSION_TOKEN);

        if (Strings.isNullOrEmpty(partitionKeyRangeId)) {
            // AddressCache/address resolution didn't produce partition key range id.
            // In this case it is a bug.
            throw new InternalServerErrorException(
                Exceptions.getInternalServerErrorMessage(RMResources.PartitionKeyRangeIdAbsentInContext),
                HttpConstants.SubStatusCodes.MISSING_PARTITION_KEY_RANGE_ID_IN_CONTEXT);
        }

        if (StringUtils.isNotEmpty(originalSessionToken)) {
            ISessionToken sessionToken = getLocalSessionToken(request, originalSessionToken, partitionKeyRangeId);
            request.requestContext.sessionToken = sessionToken;
        } else {
            // use ambient session token.
            ISessionToken sessionToken = sessionContainer.resolvePartitionLocalSessionToken(request, partitionKeyRangeId);
            request.requestContext.sessionToken = sessionToken;
        }

        if (request.requestContext.sessionToken == null) {
            request.getHeaders().remove(HttpConstants.HttpHeaders.SESSION_TOKEN);
        } else {

            request.getHeaders().put(HttpConstants.HttpHeaders.SESSION_TOKEN,
                                     concatPartitionKeyRangeIdWithSessionToken(partitionKeyRangeId, request.requestContext.sessionToken.convertToString()));
        }
    }

    private static ISessionToken getLocalSessionToken(
            RxDocumentServiceRequest request,
            String globalSessionToken,
            String partitionKeyRangeId) {

        if (partitionKeyRangeId == null) {
            // AddressCache/address resolution didn't produce partition key range id.
            // In this case it is a bug.
            throw new IllegalStateException("Partition key range Id is absent in the context.");
        }

        // Convert global session token to local - there's no point in sending global token over the wire to the backend.
        // Global session token is comma separated array of <partitionkeyrangeid>:<lsn> pairs. For example:
        //          2:425344,748:2341234,99:42344
        // Local session token is single <partitionkeyrangeid>:<lsn> pair.
        // Backend only cares about pair which relates to the range owned by the partition.
        String[] localTokens = StringUtils.split(globalSessionToken, ",");
        Set<String> partitionKeyRangeSet = new HashSet<>();
        partitionKeyRangeSet.add(partitionKeyRangeId);

        ISessionToken highestSessionToken = null;

        if (request.requestContext.resolvedPartitionKeyRange != null && request.requestContext.resolvedPartitionKeyRange.getParents() != null) {
            partitionKeyRangeSet.addAll(request.requestContext.resolvedPartitionKeyRange.getParents());
        }

        for (String localToken : localTokens) {
            String[] items = StringUtils.split(localToken, ":");
            if (items.length != 2) {
                throw new BadRequestException(String.format(RMResources.InvalidSessionToken, partitionKeyRangeId));
            }

            ISessionToken parsedSessionToken = SessionTokenHelper.parse(items[1]);

            if (partitionKeyRangeSet.contains(items[0])) {

                if (highestSessionToken == null) {
                    highestSessionToken = parsedSessionToken;
                } else {
                    highestSessionToken = highestSessionToken.merge(parsedSessionToken);
                }
            }
        }

        if (highestSessionToken == null) {
            if (StringUtils.isNotEmpty(globalSessionToken)) {
                Set<String> sessionTokenEvaluationResults = request.requestContext.getSessionTokenEvaluationResults();

                String evaluationResult = "The session token : " + globalSessionToken + " for pkRangeId : " + partitionKeyRangeId +
                    " and collectionRid : " + request.requestContext.resolvedCollectionRid + " could not be evaluated, " +
                    "the request will fallback " +
                    "to eventual consistency.";

                sessionTokenEvaluationResults.add(evaluationResult);

                if (Configs.shouldLogIncorrectlyMappedSessionToken()) {
                    logger.warn(evaluationResult);
                }
            }
        }

        return highestSessionToken;
    }

    static ISessionToken resolvePartitionLocalSessionToken(RxDocumentServiceRequest request,
                                                           String partitionKeyRangeId,
                                                           ConcurrentHashMap<String, ISessionToken> rangeIdToTokenMap) {
        if (rangeIdToTokenMap != null) {
            if (rangeIdToTokenMap.containsKey(partitionKeyRangeId)) {
                return rangeIdToTokenMap.get(partitionKeyRangeId);
            } else {
                ISessionToken parentSessionToken = null;

                Collection<String> parents = request.requestContext.resolvedPartitionKeyRange.getParents();
                if (parents != null && !parents.isEmpty()) {
                    List<String> parentsList = new ArrayList<>(parents);
                    for (int i = parentsList.size() - 1; i >= 0; i--) {
                        String parentId = parentsList.get(i);
                        if (rangeIdToTokenMap.containsKey(parentId)) {
                            // A partition can have more than 1 parent (merge). In that case, we apply Merge to generate a token with both parent's max LSNs
                            parentSessionToken =
                                parentSessionToken != null
                                    ? parentSessionToken.merge(rangeIdToTokenMap.get(parentId)) : rangeIdToTokenMap.get(parentId);
                        }
                    }

                    return parentSessionToken;
                }
            }
        }

        return null;
    }

    static ISessionToken resolvePartitionLocalSessionToken(RxDocumentServiceRequest request,
                                                           PartitionKeyBasedBloomFilter partitionKeyBasedBloomFilter,
                                                           PartitionScopedRegionLevelProgress partitionScopedRegionLevelProgress,
                                                           PartitionKeyInternal partitionKey,
                                                           PartitionKeyDefinition partitionKeyDefinition,
                                                           Long collectionRid,
                                                           String partitionKeyRangeId,
                                                           String firstEffectivePreferredReadableRegion,
                                                           boolean canUseBloomFilter) {

        if (partitionScopedRegionLevelProgress != null) {

            Set<String> partitionKeyPossibleRegions = new HashSet<>();

            if (partitionScopedRegionLevelProgress.isPartitionKeyRangeIdPresent(partitionKeyRangeId)) {

                if (canUseBloomFilter) {
                    partitionKeyPossibleRegions = partitionKeyBasedBloomFilter
                        .tryGetPossibleRegionsLogicalPartitionResolvedTo(
                            request,
                            collectionRid,
                            partitionKey,
                            partitionKeyDefinition);

                    return partitionScopedRegionLevelProgress
                        .tryResolveSessionToken(
                            request,
                            partitionKeyPossibleRegions,
                            partitionKeyRangeId,
                            firstEffectivePreferredReadableRegion,
                            true);

                }

                return partitionScopedRegionLevelProgress
                    .tryResolveSessionToken(
                        request,
                        partitionKeyPossibleRegions,
                        partitionKeyRangeId,
                        firstEffectivePreferredReadableRegion,
                        false);

            } else {
                if (canUseBloomFilter) {
                    partitionKeyPossibleRegions = partitionKeyBasedBloomFilter
                        .tryGetPossibleRegionsLogicalPartitionResolvedTo(
                            request,
                            collectionRid,
                            partitionKey,
                            partitionKeyDefinition);
                }

                ISessionToken parentSessionToken = null;

                Collection<String> parents = request.requestContext.resolvedPartitionKeyRange.getParents();
                if (parents != null && !parents.isEmpty()) {
                    List<String> parentsList = new ArrayList<>(parents);
                    for (int i = parentsList.size() - 1; i >= 0; i--) {
                        String parentPkRangeId = parentsList.get(i);
                        if (partitionScopedRegionLevelProgress.isPartitionKeyRangeIdPresent(parentPkRangeId)) {
                            // A partition can have more than 1 parent (merge). In that case, we apply Merge to
                            // generate a token with both parent's max LSNs
                            ISessionToken resolvedSessionTokenForParentPkRangeId = null;

                            resolvedSessionTokenForParentPkRangeId = partitionScopedRegionLevelProgress
                                .tryResolveSessionToken(
                                    request,
                                    partitionKeyPossibleRegions,
                                    parentPkRangeId,
                                    firstEffectivePreferredReadableRegion,
                                    canUseBloomFilter);

                            if (resolvedSessionTokenForParentPkRangeId != null) {
                                parentSessionToken = parentSessionToken != null ?
                                    parentSessionToken.merge(resolvedSessionTokenForParentPkRangeId) :
                                    resolvedSessionTokenForParentPkRangeId;
                            }
                        }
                    }

                    return parentSessionToken;
                }
            }
        }

        return null;
    }

    public static ISessionToken parse(String sessionToken) {
        ValueHolder<ISessionToken> partitionKeyRangeSessionToken = ValueHolder.initialize(null);

        if (SessionTokenHelper.tryParse(sessionToken, partitionKeyRangeSessionToken)) {
            return partitionKeyRangeSessionToken.v;
        } else {
            throw new RuntimeException(new BadRequestException(String.format(RMResources.InvalidSessionToken, sessionToken)));
        }
    }

    static boolean tryParse(String sessionToken, ValueHolder<ISessionToken> parsedSessionToken) {
        parsedSessionToken.v = null;
        if (!Strings.isNullOrEmpty(sessionToken)) {
            String[] sessionTokenSegments = StringUtils.split(sessionToken,":");
            return VectorSessionToken.tryCreate(sessionTokenSegments[sessionTokenSegments.length - 1], parsedSessionToken);
        } else {
            return false;
        }
    }

    public static void validateAndRemoveSessionToken(RxDocumentServiceRequest request) {
        String sessionToken = request.getHeaders().get(HttpConstants.HttpHeaders.SESSION_TOKEN);
        if (!Strings.isNullOrEmpty(sessionToken)) {
            getLocalSessionToken(request, sessionToken, StringUtils.EMPTY);
            request.getHeaders().remove(HttpConstants.HttpHeaders.SESSION_TOKEN);
        }
    }

    public static  String concatPartitionKeyRangeIdWithSessionToken(String partitionKeyRangeRid, String sessionToken) {
        // e.g., "1:xyz"
        return partitionKeyRangeRid + ":" + sessionToken;
    }

    public static boolean tryEvaluateLocalLsnByRegionMappingWithNullSafety(ISessionToken sessionToken, Utils.ValueHolder<UnmodifiableMap<Integer, Long>> localLsnByRegion) {

        if (sessionToken instanceof VectorSessionToken) {
            VectorSessionToken castVectorSessionToken = Utils.as(sessionToken, VectorSessionToken.class);
            localLsnByRegion.v = castVectorSessionToken.getLocalLsnByRegion();

            return localLsnByRegion.v != null;
        }

        return false;
    }

    public static boolean tryEvaluateVersion(ISessionToken sessionToken, Utils.ValueHolder<Long> version) {

        if (sessionToken instanceof VectorSessionToken) {
            VectorSessionToken castVectorSessionToken = Utils.as(sessionToken, VectorSessionToken.class);
            version.v = castVectorSessionToken.getVersion();
            return true;
        }

        return false;
    }
}
