// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A class represent the control.
 */
@Immutable
public final class Control implements JsonSerializable<Control> {
    /*
     * The Id of the control. e.g. "Operational_Security_10"
     */
    private String controlId;

    /*
     * The name of the control. e.g. "Unsupported OS and Software."
     */
    private String controlName;

    /*
     * The full name of the control. e.g.
     * "Validate that unsupported operating systems and software components are not in use."
     */
    private String controlFullName;

    /*
     * The control's description
     */
    private String controlDescription;

    /*
     * The hyper link to the control's description'.
     */
    private String controlDescriptionHyperLink;

    /*
     * Control status.
     */
    private ControlStatus controlStatus;

    /*
     * List of customer responsibility.
     */
    private List<Responsibility> responsibilities;

    /**
     * Creates an instance of Control class.
     */
    public Control() {
    }

    /**
     * Get the controlId property: The Id of the control. e.g. "Operational_Security_10".
     * 
     * @return the controlId value.
     */
    public String controlId() {
        return this.controlId;
    }

    /**
     * Get the controlName property: The name of the control. e.g. "Unsupported OS and Software.".
     * 
     * @return the controlName value.
     */
    public String controlName() {
        return this.controlName;
    }

    /**
     * Get the controlFullName property: The full name of the control. e.g. "Validate that unsupported operating systems
     * and software components are not in use.".
     * 
     * @return the controlFullName value.
     */
    public String controlFullName() {
        return this.controlFullName;
    }

    /**
     * Get the controlDescription property: The control's description.
     * 
     * @return the controlDescription value.
     */
    public String controlDescription() {
        return this.controlDescription;
    }

    /**
     * Get the controlDescriptionHyperLink property: The hyper link to the control's description'.
     * 
     * @return the controlDescriptionHyperLink value.
     */
    public String controlDescriptionHyperLink() {
        return this.controlDescriptionHyperLink;
    }

    /**
     * Get the controlStatus property: Control status.
     * 
     * @return the controlStatus value.
     */
    public ControlStatus controlStatus() {
        return this.controlStatus;
    }

    /**
     * Get the responsibilities property: List of customer responsibility.
     * 
     * @return the responsibilities value.
     */
    public List<Responsibility> responsibilities() {
        return this.responsibilities;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (responsibilities() != null) {
            responsibilities().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Control from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Control if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Control.
     */
    public static Control fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Control deserializedControl = new Control();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("controlId".equals(fieldName)) {
                    deserializedControl.controlId = reader.getString();
                } else if ("controlName".equals(fieldName)) {
                    deserializedControl.controlName = reader.getString();
                } else if ("controlFullName".equals(fieldName)) {
                    deserializedControl.controlFullName = reader.getString();
                } else if ("controlDescription".equals(fieldName)) {
                    deserializedControl.controlDescription = reader.getString();
                } else if ("controlDescriptionHyperLink".equals(fieldName)) {
                    deserializedControl.controlDescriptionHyperLink = reader.getString();
                } else if ("controlStatus".equals(fieldName)) {
                    deserializedControl.controlStatus = ControlStatus.fromString(reader.getString());
                } else if ("responsibilities".equals(fieldName)) {
                    List<Responsibility> responsibilities
                        = reader.readArray(reader1 -> Responsibility.fromJson(reader1));
                    deserializedControl.responsibilities = responsibilities;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedControl;
        });
    }
}
