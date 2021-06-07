// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.models;

/**
 * The receiver settle mode.
 *
 * @see <a href="http://docs.oasis-open.org/amqp/core/v1.0/csprd01/amqp-core-transport-v1.0-csprd01.html#type-receiver-settle-mode">Receiver
 *     settle mode.</a>
 */
public enum ReceiverSettleMode {
    /**
     * The receiver will spontaneously settle all incoming transfers.
     */
    FIRST(0),
    /**
     * The receiver will only settle after sending the disposition to the sender and receiving a disposition indicating
     * settlement of the delivery from the sender.
     *
     * @see DeliveryOutcome
     */
    SECOND(1);

    private final int value;

    ReceiverSettleMode(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the receive settle mode.
     *
     * @return The value of the receive settle mode.
     */
    public int getValue() {
        return value;
    }

    /**
     * Gets the corresponding ReceiverSettleMode for the given value.
     *
     * @param value Value to convert.
     * @return The corresponding {@link ReceiverSettleMode}.
     * @throws IllegalArgumentException if the value is not one of the supported values.
     */
    public static ReceiverSettleMode fromValue(int value) {
        switch (value) {
            case 0:
                return ReceiverSettleMode.FIRST;
            case 1:
                return ReceiverSettleMode.SECOND;
            default:
                throw new IllegalArgumentException(
                    "The value can be only 0 (for FIRST), 1 (for SECOND).");
        }
    }
}
