// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.models;

/**
 * The sender settlement types.
 *
 * @see <a href="http://docs.oasis-open.org/amqp/core/v1.0/csprd01/amqp-core-transport-v1.0-csprd01.html#type-sender-settle-mode">Sender
 *     settle mode</a>
 */
public enum SenderSettleMode {
    /**
     * The sender will send all deliveries initially unsettled to the receiver.
     */
    UNSETTLED(0),
    /**
     * The sender will send all deliveries settled to the receiver.
     */
    SETTLED(1),
    /**
     * The sender may send a mixture of settled and unsettled deliveries to the receiver.
     */
    MIXED(2);

    private final int value;

    SenderSettleMode(int value) {
        this.value = value;
    }

    /**
     * Gets the value of this settle mode.
     *
     * @return The value of the settle mode.
     */
    public int getValue() {
        return value;
    }

    /**
     * Gets the corresponding SenderSettleMode for the given value.
     *
     * @param value Value to convert.
     * @return The corresponding {@link SenderSettleMode}.
     * @throws IllegalArgumentException if the value is not one of the supported values.
     */
    public static SenderSettleMode fromValue(int value) {
        switch (value) {
            case 0:
                return SenderSettleMode.UNSETTLED;
            case 1:
                return SenderSettleMode.SETTLED;
            case 2:
                return SenderSettleMode.MIXED;
            default:
                throw new IllegalArgumentException(
                    "The value can be only 0 (for UNSETTLED), 1 (for SETTLED) and 2 (for MIXED)");
        }
    }
}
