// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.IterableStream;
import com.azure.messaging.eventhubs.models.EventPosition;

import java.time.Instant;
import java.util.Arrays;
import java.util.Objects;

/**
 * Holds information about an Event Hub which can come handy while performing operations like {@link
 * EventHubConsumerAsyncClient#receiveFromPartition(String, EventPosition) receiving events from a specific partition}.
 *
 * @see EventHubConsumerAsyncClient
 * @see EventHubConsumerClient
 */
@Immutable
public final class EventHubProperties {
    private final String name;
    private final Instant createdAt;
    private final IterableStream<String> partitionIds;
    private final Integer geoReplicationFactor;

    /**
     * Creates an instance of {@link EventHubProperties}.
     *
     * @param name Name of the Event Hub.
     * @param createdAt Datetime the Event Hub was created, in UTC.
     * @param partitionIds The partitions ids in the Event Hub.
     * @param geoReplicationFactor Number of times a namespace has been replicated (due to fail overs). {@code null} if
     * geo-disaster recovery fail over is not enabled.
     *
     * @throws NullPointerException if {@code name}, {@code createdAt}, or {@code partitionIds} is {@code null}.
     */
    EventHubProperties(final String name, final Instant createdAt, final String[] partitionIds, final Integer geoReplicationFactor) {
        this.name = Objects.requireNonNull(name, "'name' cannot be null.");
        this.createdAt = Objects.requireNonNull(createdAt, "'createdAt' cannot be null.");
        this.partitionIds = new IterableStream<>(Arrays.asList(
            Objects.requireNonNull(partitionIds, "'partitionIds' cannot be null.")));
        this.geoReplicationFactor = geoReplicationFactor;
    }

    /**
     * Gets the name of the Event Hub.
     *
     * @return Name of the Event Hub.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the instant, in UTC, at which Event Hub was created.
     *
     * @return The instant, in UTC, at which the Event Hub was created.
     */
    public Instant getCreatedAt() {
        return createdAt;
    }

    /**
     * Gets the list of partition identifiers of the Event Hub.
     *
     * @return The list of partition identifiers of the Event Hub.
     */
    public IterableStream<String> getPartitionIds() {
        return partitionIds;
    }

    /**
     * Gets the geo-replication factor.
     *
     * @return The geo-replication factor for the namespace. {@code null} if geo-disaster recovery fail over is not
     * enabled.
     */
    Integer getGeoReplicationFactor() {
        return geoReplicationFactor;
    }
}
