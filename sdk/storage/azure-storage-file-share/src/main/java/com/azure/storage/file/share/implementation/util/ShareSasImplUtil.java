// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.share.implementation.util;

import com.azure.core.util.Configuration;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.storage.common.StorageSharedKeyCredential;
import com.azure.storage.common.implementation.Constants;
import com.azure.storage.common.implementation.StorageImplUtils;
import com.azure.storage.common.implementation.TimeAndFormat;
import com.azure.storage.common.sas.SasIpRange;
import com.azure.storage.common.sas.SasProtocol;
import com.azure.storage.file.share.ShareServiceVersion;
import com.azure.storage.file.share.sas.ShareFileSasPermission;
import com.azure.storage.file.share.sas.ShareSasPermission;
import com.azure.storage.file.share.sas.ShareServiceSasSignatureValues;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

import static com.azure.storage.common.implementation.SasImplUtils.formatQueryParameterDate;
import static com.azure.storage.common.implementation.SasImplUtils.tryAppendQueryParameter;

/**
 * This class provides helper methods for common file service sas patterns.
 *
 * RESERVED FOR INTERNAL USE.
 */
public class ShareSasImplUtil {
    /**
     * The SAS file constant.
     */
    private static final String SAS_FILE_CONSTANT = "f";

    /**
     * The SAS share constant.
     */
    private static final String SAS_SHARE_CONSTANT = "s";

    private static final ClientLogger LOGGER = new ClientLogger(ShareSasImplUtil.class);

    private static final String VERSION = Configuration.getGlobalConfiguration()
        .get(Constants.PROPERTY_AZURE_STORAGE_SAS_SERVICE_VERSION, ShareServiceVersion.getLatest().getVersion());

    private SasProtocol protocol;

    private OffsetDateTime startTime;

    private OffsetDateTime expiryTime;

    private String permissions;

    private SasIpRange sasIpRange;

    private String shareName;

    private String filePath;

    private String resource;

    private String identifier;

    private String cacheControl;

    private String contentDisposition;

    private String contentEncoding;

    private String contentLanguage;

    private String contentType;

    /**
     * Creates a new {@link ShareSasImplUtil} with the specified parameters
     *
     * @param sasValues {@link ShareServiceSasSignatureValues}
     * @param shareName The share name
     */
    public ShareSasImplUtil(ShareServiceSasSignatureValues sasValues, String shareName) {
        this(sasValues, shareName, null);
    }

    /**
     * Creates a new {@link ShareSasImplUtil} with the specified parameters
     *
     * @param sasValues {@link ShareServiceSasSignatureValues}
     * @param shareName The share name
     * @param filePath The file path
     */
    public ShareSasImplUtil(ShareServiceSasSignatureValues sasValues, String shareName, String filePath) {
        Objects.requireNonNull(sasValues);
        this.protocol = sasValues.getProtocol();
        this.startTime = sasValues.getStartTime();
        this.expiryTime = sasValues.getExpiryTime();
        this.permissions = sasValues.getPermissions();
        this.sasIpRange = sasValues.getSasIpRange();
        this.shareName = shareName;
        this.filePath = filePath;
        this.identifier = sasValues.getIdentifier();
        this.cacheControl = sasValues.getCacheControl();
        this.contentDisposition = sasValues.getContentDisposition();
        this.contentEncoding = sasValues.getContentEncoding();
        this.contentLanguage = sasValues.getContentLanguage();
        this.contentType = sasValues.getContentType();
    }

    /**
     * Generates a Sas signed with a {@link StorageSharedKeyCredential}
     *
     * @param storageSharedKeyCredentials {@link StorageSharedKeyCredential}
     * @param context Additional context that is passed through the code when generating a SAS.
     * @return A String representing the Sas
     */
    public String generateSas(StorageSharedKeyCredential storageSharedKeyCredentials, Context context) {
        return generateSas(storageSharedKeyCredentials, null, context);
    }

    /**
     * Generates a Sas signed with a {@link StorageSharedKeyCredential}
     *
     * @param storageSharedKeyCredentials {@link StorageSharedKeyCredential}
     * @param stringToSignHandler For debugging purposes only. Returns the string to sign that was used to generate the
     * signature.
     * @param context Additional context that is passed through the code when generating a SAS.
     * @return A String representing the Sas
     */
    public String generateSas(StorageSharedKeyCredential storageSharedKeyCredentials,
        Consumer<String> stringToSignHandler, Context context) {
        StorageImplUtils.assertNotNull("storageSharedKeyCredentials", storageSharedKeyCredentials);

        ensureState();

        // Signature is generated on the un-url-encoded values.
        final String canonicalName = getCanonicalName(storageSharedKeyCredentials.getAccountName());
        final String stringToSign = stringToSign(canonicalName);
        StorageImplUtils.logStringToSign(LOGGER, stringToSign, context);
        final String signature = storageSharedKeyCredentials.computeHmac256(stringToSign);

        if (stringToSignHandler != null) {
            stringToSignHandler.accept(stringToSign);
        }

        return encode(signature);
    }

    /**
     * Encodes a Sas from the values in this type.
     * @param signature The signature of the Sas.
     * @return A String representing the Sas.
     */
    private String encode(String signature) {
        /*
         We should be url-encoding each key and each value, but because we know all the keys and values will encode to
         themselves, we cheat except for the signature value.
         */
        StringBuilder sb = new StringBuilder();

        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SERVICE_VERSION, VERSION);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_PROTOCOL, this.protocol);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_START_TIME,
            formatQueryParameterDate(new TimeAndFormat(this.startTime, null)));
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_EXPIRY_TIME,
            formatQueryParameterDate(new TimeAndFormat(this.expiryTime, null)));
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_IP_RANGE, this.sasIpRange);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_IDENTIFIER, this.identifier);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_RESOURCE, this.resource);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_PERMISSIONS, this.permissions);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNATURE, signature);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CACHE_CONTROL, this.cacheControl);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CONTENT_DISPOSITION, this.contentDisposition);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CONTENT_ENCODING, this.contentEncoding);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CONTENT_LANGUAGE, this.contentLanguage);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CONTENT_TYPE, this.contentType);

        return sb.toString();

    }

    /**
     * Ensures that the builder's properties are in a consistent state.
    
     * 1. If there is no version, use latest.
     * 2. If there is no identifier set, ensure expiryTime and permissions are set.
     * 3. Resource name is chosen by:
     *    a. If "FilePath" is _not_ set, it is a share resource.
     *    b. Otherwise, it is a file resource.
     * 4. Reparse permissions depending on what the resource is. If it is an unrecognised resource, do nothing.
     */
    private void ensureState() {
        if (identifier == null) {
            if (expiryTime == null || permissions == null) {
                throw LOGGER.logExceptionAsError(new IllegalStateException(
                    "If identifier is not set, expiry time " + "and permissions must be set"));
            }
        }

        if (CoreUtils.isNullOrEmpty(filePath)) {
            resource = SAS_SHARE_CONSTANT;
        } else {
            resource = SAS_FILE_CONSTANT;
        }

        if (permissions != null) {
            switch (resource) {
                case SAS_FILE_CONSTANT:
                    permissions = ShareFileSasPermission.parse(permissions).toString();
                    break;

                case SAS_SHARE_CONSTANT:
                    permissions = ShareSasPermission.parse(permissions).toString();
                    break;

                default:
                    // We won't reparse the permissions if we don't know the type.
                    LOGGER.info("Not re-parsing permissions. Resource type '{}' is unknown.", resource);
                    break;
            }
        }
    }

    /**
     * Computes the canonical name for a share or file resource for SAS signing.
     * Share: "/file/account/sharename"
     * File: "/file/account/sharename/filename"
     * File: "/file/account/sharename/directoryname/filename"
     *
     * @param account The name of the storage account.
     * @return The canonical resource name.
     */
    private String getCanonicalName(String account) {
        return !CoreUtils.isNullOrEmpty(filePath)
            ? "/file/" + account + "/" + shareName + "/" + filePath.replace('\\', '/')
            : "/file/" + account + "/" + shareName;
    }

    private String stringToSign(String canonicalName) {
        return String.join("\n", this.permissions == null ? "" : this.permissions,
            this.startTime == null ? "" : Constants.ISO_8601_UTC_DATE_FORMATTER.format(this.startTime),
            this.expiryTime == null ? "" : Constants.ISO_8601_UTC_DATE_FORMATTER.format(this.expiryTime), canonicalName,
            this.identifier == null ? "" : this.identifier, this.sasIpRange == null ? "" : this.sasIpRange.toString(),
            this.protocol == null ? "" : this.protocol.toString(), VERSION == null ? "" : VERSION,
            this.cacheControl == null ? "" : this.cacheControl,
            this.contentDisposition == null ? "" : this.contentDisposition,
            this.contentEncoding == null ? "" : this.contentEncoding,
            this.contentLanguage == null ? "" : this.contentLanguage, this.contentType == null ? "" : this.contentType);
    }
}
