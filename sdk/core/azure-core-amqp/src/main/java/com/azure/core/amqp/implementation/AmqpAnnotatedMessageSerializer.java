// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.implementation;

import com.azure.core.amqp.models.AmqpAnnotatedMessage;
import com.azure.core.util.logging.ClientLogger;
import org.apache.qpid.proton.amqp.Binary;
import org.apache.qpid.proton.amqp.Decimal128;
import org.apache.qpid.proton.amqp.Decimal32;
import org.apache.qpid.proton.amqp.Decimal64;
import org.apache.qpid.proton.amqp.Symbol;
import org.apache.qpid.proton.amqp.UnsignedByte;
import org.apache.qpid.proton.amqp.UnsignedInteger;
import org.apache.qpid.proton.amqp.UnsignedLong;
import org.apache.qpid.proton.amqp.UnsignedShort;
import org.apache.qpid.proton.amqp.messaging.AmqpSequence;
import org.apache.qpid.proton.amqp.messaging.AmqpValue;
import org.apache.qpid.proton.amqp.messaging.ApplicationProperties;
import org.apache.qpid.proton.amqp.messaging.Data;
import org.apache.qpid.proton.amqp.messaging.MessageAnnotations;
import org.apache.qpid.proton.amqp.messaging.Section;
import org.apache.qpid.proton.amqp.transaction.Declare;
import org.apache.qpid.proton.amqp.transaction.Discharge;
import org.apache.qpid.proton.message.Message;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * Serializes and deserializes an AmqpAnnotatedMessage.
 */
public class AmqpAnnotatedMessageSerializer implements MessageSerializer {
    private final ClientLogger logger = new ClientLogger(AmqpAnnotatedMessageSerializer.class);

    /**
     * Gets the serialized size of the AMQP message.
     */
    @Override
    public int getSize(Message amqpMessage) {
        if (amqpMessage == null) {
            return 0;
        }

        int payloadSize = getPayloadSize(amqpMessage);

        final MessageAnnotations messageAnnotations = amqpMessage.getMessageAnnotations();
        final ApplicationProperties applicationProperties = amqpMessage.getApplicationProperties();

        int annotationsSize = 0;
        int applicationPropertiesSize = 0;

        if (messageAnnotations != null) {
            final Map<Symbol, Object> map = messageAnnotations.getValue();

            for (Map.Entry<Symbol, Object> entry : map.entrySet()) {
                final int size = sizeof(entry.getKey()) + sizeof(entry.getValue());
                annotationsSize += size;
            }
        }

        if (applicationProperties != null) {
            final Map<String, Object> map = applicationProperties.getValue();

            for (Map.Entry<String, Object> entry : map.entrySet()) {
                final int size = sizeof(entry.getKey()) + sizeof(entry.getValue());
                applicationPropertiesSize += size;
            }
        }

        return annotationsSize + applicationPropertiesSize + payloadSize;
    }

    @Override
    public <T> Message serialize(T object) {
        Objects.requireNonNull(object, "'object' to serialize cannot be null.");

        if (object instanceof AmqpAnnotatedMessage) {
            return MessageUtils.toProtonJMessage((AmqpAnnotatedMessage) object);
        } else {
            throw logger.logExceptionAsError(new IllegalArgumentException(
                "Cannot serialize object that is not AmqpAnnotatedMessage. Clazz: " + object.getClass()));
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T deserialize(Message message, Class<T> clazz) {
        Objects.requireNonNull(message, "'message' cannot be null.");
        Objects.requireNonNull(clazz, "'clazz' cannot be null.");

        if (clazz == AmqpAnnotatedMessage.class) {
            return (T) MessageUtils.toAmqpAnnotatedMessage(message);
        } else {
            throw logger.logExceptionAsError(
                new IllegalArgumentException("Deserialization only supports AmqpAnnotatedMessage."));
        }
    }

    @Override
    public <T> List<T> deserializeList(Message message, Class<T> clazz) {
        return Collections.singletonList(deserialize(message, clazz));
    }

    private static int getPayloadSize(Message msg) {
        if (msg == null || msg.getBody() == null) {
            return 0;
        }

        final Section bodySection = msg.getBody();
        if (bodySection instanceof AmqpValue) {
            return sizeof(((AmqpValue) bodySection).getValue());
        } else if (bodySection instanceof AmqpSequence) {
            return sizeof(((AmqpSequence) bodySection).getValue());
        } else if (bodySection instanceof Data) {
            final Data payloadSection = (Data) bodySection;
            final Binary payloadBytes = payloadSection.getValue();
            return sizeof(payloadBytes);
        } else {
            return 0;
        }
    }

    @SuppressWarnings("rawtypes")
    private static int sizeof(Object obj) {
        if (obj == null) {
            return 0;
        }

        if (obj instanceof String) {
            return obj.toString().length() << 1;
        }

        if (obj instanceof Symbol) {
            return ((Symbol) obj).length() << 1;
        }

        if (obj instanceof Byte || obj instanceof UnsignedByte) {
            return Byte.BYTES;
        }

        if (obj instanceof Integer || obj instanceof UnsignedInteger) {
            return Integer.BYTES;
        }

        if (obj instanceof Long || obj instanceof UnsignedLong || obj instanceof Date) {
            return Long.BYTES;
        }

        if (obj instanceof Short || obj instanceof UnsignedShort) {
            return Short.BYTES;
        }

        if (obj instanceof Boolean) {
            return 1;
        }

        if (obj instanceof Character) {
            return 4;
        }

        if (obj instanceof Float) {
            return Float.BYTES;
        }

        if (obj instanceof Double) {
            return Double.BYTES;
        }

        if (obj instanceof UUID) {
            // UUID is internally represented as 16 bytes. But how does ProtonJ encode it? To be safe..
            // we can treat it as a string of 36 chars = 72 bytes. return 72;
            return 16;
        }

        if (obj instanceof Decimal32) {
            return 4;
        }

        if (obj instanceof Decimal64) {
            return 8;
        }

        if (obj instanceof Decimal128) {
            return 16;
        }

        if (obj instanceof Binary) {
            return ((Binary) obj).getLength();
        }

        if (obj instanceof Declare) {
            // Empty declare command takes up 7 bytes.
            return 7;
        }

        if (obj instanceof Discharge) {
            Discharge discharge = (Discharge) obj;
            return 12 + discharge.getTxnId().getLength();
        }

        if (obj instanceof Map) {
            // Size and Count each take a max of 4 bytes
            int size = 8;
            Map map = (Map) obj;
            for (Object value : map.keySet()) {
                size += sizeof(value);
            }

            for (Object value : map.values()) {
                size += sizeof(value);
            }

            return size;
        }

        if (obj instanceof Iterable) {
            // Size and Count each take a max of 4 bytes
            int size = 8;
            for (Object innerObject : (Iterable) obj) {
                size += sizeof(innerObject);
            }

            return size;
        }

        if (obj.getClass().isArray()) {
            // Size and Count each take a max of 4 bytes
            int size = 8;
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                size += sizeof(Array.get(obj, i));
            }

            return size;
        }

        throw new IllegalArgumentException(String.format(Locale.US,
            "Encoding Type: %s is not supported", obj.getClass()));
    }
}
