// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import java.io.IOException;

/**
 * MariaDB server linked service properties.
 */
@Fluent
public final class MariaDBLinkedServiceTypeProperties implements JsonSerializable<MariaDBLinkedServiceTypeProperties> {
    /*
     * The version of the MariaDB driver. Type: string. V1 or empty for legacy driver, V2 for new driver. V1 can support
     * connection string and property bag, V2 can only support connection string. The legacy driver is scheduled for
     * deprecation by October 2024.
     */
    private Object driverVersion;

    /*
     * An ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    private Object connectionString;

    /*
     * Server name for connection. Type: string.
     */
    private Object server;

    /*
     * The port for the connection. Type: integer.
     */
    private Object port;

    /*
     * Username for authentication. Type: string.
     */
    private Object username;

    /*
     * Database name for connection. Type: string.
     */
    private Object database;

    /*
     * This option specifies whether the driver uses TLS encryption and verification when connecting to MariaDB. E.g.,
     * SSLMode=<0/1/2/3/4>. Options: DISABLED (0) / PREFERRED (1) (Default) / REQUIRED (2) / VERIFY_CA (3) /
     * VERIFY_IDENTITY (4), REQUIRED (2) is recommended to only allow connections encrypted with SSL/TLS.
     */
    private Object sslMode;

    /*
     * This option specifies whether to use a CA certificate from the system trust store, or from a specified PEM file.
     * E.g. UseSystemTrustStore=<0/1>; Options: Enabled (1) / Disabled (0) (Default)
     */
    private Object useSystemTrustStore;

    /*
     * The Azure key vault secret reference of password in connection string.
     */
    private AzureKeyVaultSecretReference password;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /**
     * Creates an instance of MariaDBLinkedServiceTypeProperties class.
     */
    public MariaDBLinkedServiceTypeProperties() {
    }

    /**
     * Get the driverVersion property: The version of the MariaDB driver. Type: string. V1 or empty for legacy driver,
     * V2 for new driver. V1 can support connection string and property bag, V2 can only support connection string. The
     * legacy driver is scheduled for deprecation by October 2024.
     * 
     * @return the driverVersion value.
     */
    public Object driverVersion() {
        return this.driverVersion;
    }

    /**
     * Set the driverVersion property: The version of the MariaDB driver. Type: string. V1 or empty for legacy driver,
     * V2 for new driver. V1 can support connection string and property bag, V2 can only support connection string. The
     * legacy driver is scheduled for deprecation by October 2024.
     * 
     * @param driverVersion the driverVersion value to set.
     * @return the MariaDBLinkedServiceTypeProperties object itself.
     */
    public MariaDBLinkedServiceTypeProperties withDriverVersion(Object driverVersion) {
        this.driverVersion = driverVersion;
        return this;
    }

    /**
     * Get the connectionString property: An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @param connectionString the connectionString value to set.
     * @return the MariaDBLinkedServiceTypeProperties object itself.
     */
    public MariaDBLinkedServiceTypeProperties withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the server property: Server name for connection. Type: string.
     * 
     * @return the server value.
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set the server property: Server name for connection. Type: string.
     * 
     * @param server the server value to set.
     * @return the MariaDBLinkedServiceTypeProperties object itself.
     */
    public MariaDBLinkedServiceTypeProperties withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the port property: The port for the connection. Type: integer.
     * 
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The port for the connection. Type: integer.
     * 
     * @param port the port value to set.
     * @return the MariaDBLinkedServiceTypeProperties object itself.
     */
    public MariaDBLinkedServiceTypeProperties withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the username property: Username for authentication. Type: string.
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: Username for authentication. Type: string.
     * 
     * @param username the username value to set.
     * @return the MariaDBLinkedServiceTypeProperties object itself.
     */
    public MariaDBLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the database property: Database name for connection. Type: string.
     * 
     * @return the database value.
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database property: Database name for connection. Type: string.
     * 
     * @param database the database value to set.
     * @return the MariaDBLinkedServiceTypeProperties object itself.
     */
    public MariaDBLinkedServiceTypeProperties withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the sslMode property: This option specifies whether the driver uses TLS encryption and verification when
     * connecting to MariaDB. E.g., SSLMode=&lt;0/1/2/3/4&gt;. Options: DISABLED (0) / PREFERRED (1) (Default) /
     * REQUIRED (2) / VERIFY_CA (3) / VERIFY_IDENTITY (4), REQUIRED (2) is recommended to only allow connections
     * encrypted with SSL/TLS.
     * 
     * @return the sslMode value.
     */
    public Object sslMode() {
        return this.sslMode;
    }

    /**
     * Set the sslMode property: This option specifies whether the driver uses TLS encryption and verification when
     * connecting to MariaDB. E.g., SSLMode=&lt;0/1/2/3/4&gt;. Options: DISABLED (0) / PREFERRED (1) (Default) /
     * REQUIRED (2) / VERIFY_CA (3) / VERIFY_IDENTITY (4), REQUIRED (2) is recommended to only allow connections
     * encrypted with SSL/TLS.
     * 
     * @param sslMode the sslMode value to set.
     * @return the MariaDBLinkedServiceTypeProperties object itself.
     */
    public MariaDBLinkedServiceTypeProperties withSslMode(Object sslMode) {
        this.sslMode = sslMode;
        return this;
    }

    /**
     * Get the useSystemTrustStore property: This option specifies whether to use a CA certificate from the system trust
     * store, or from a specified PEM file. E.g. UseSystemTrustStore=&lt;0/1&gt;; Options: Enabled (1) / Disabled (0)
     * (Default).
     * 
     * @return the useSystemTrustStore value.
     */
    public Object useSystemTrustStore() {
        return this.useSystemTrustStore;
    }

    /**
     * Set the useSystemTrustStore property: This option specifies whether to use a CA certificate from the system trust
     * store, or from a specified PEM file. E.g. UseSystemTrustStore=&lt;0/1&gt;; Options: Enabled (1) / Disabled (0)
     * (Default).
     * 
     * @param useSystemTrustStore the useSystemTrustStore value to set.
     * @return the MariaDBLinkedServiceTypeProperties object itself.
     */
    public MariaDBLinkedServiceTypeProperties withUseSystemTrustStore(Object useSystemTrustStore) {
        this.useSystemTrustStore = useSystemTrustStore;
        return this;
    }

    /**
     * Get the password property: The Azure key vault secret reference of password in connection string.
     * 
     * @return the password value.
     */
    public AzureKeyVaultSecretReference password() {
        return this.password;
    }

    /**
     * Set the password property: The Azure key vault secret reference of password in connection string.
     * 
     * @param password the password value to set.
     * @return the MariaDBLinkedServiceTypeProperties object itself.
     */
    public MariaDBLinkedServiceTypeProperties withPassword(AzureKeyVaultSecretReference password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the MariaDBLinkedServiceTypeProperties object itself.
     */
    public MariaDBLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (password() != null) {
            password().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (this.driverVersion != null) {
            jsonWriter.writeUntypedField("driverVersion", this.driverVersion);
        }
        if (this.connectionString != null) {
            jsonWriter.writeUntypedField("connectionString", this.connectionString);
        }
        if (this.server != null) {
            jsonWriter.writeUntypedField("server", this.server);
        }
        if (this.port != null) {
            jsonWriter.writeUntypedField("port", this.port);
        }
        if (this.username != null) {
            jsonWriter.writeUntypedField("username", this.username);
        }
        if (this.database != null) {
            jsonWriter.writeUntypedField("database", this.database);
        }
        if (this.sslMode != null) {
            jsonWriter.writeUntypedField("sslMode", this.sslMode);
        }
        if (this.useSystemTrustStore != null) {
            jsonWriter.writeUntypedField("useSystemTrustStore", this.useSystemTrustStore);
        }
        jsonWriter.writeJsonField("password", this.password);
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MariaDBLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MariaDBLinkedServiceTypeProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MariaDBLinkedServiceTypeProperties.
     */
    public static MariaDBLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MariaDBLinkedServiceTypeProperties deserializedMariaDBLinkedServiceTypeProperties
                = new MariaDBLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("driverVersion".equals(fieldName)) {
                    deserializedMariaDBLinkedServiceTypeProperties.driverVersion = reader.readUntyped();
                } else if ("connectionString".equals(fieldName)) {
                    deserializedMariaDBLinkedServiceTypeProperties.connectionString = reader.readUntyped();
                } else if ("server".equals(fieldName)) {
                    deserializedMariaDBLinkedServiceTypeProperties.server = reader.readUntyped();
                } else if ("port".equals(fieldName)) {
                    deserializedMariaDBLinkedServiceTypeProperties.port = reader.readUntyped();
                } else if ("username".equals(fieldName)) {
                    deserializedMariaDBLinkedServiceTypeProperties.username = reader.readUntyped();
                } else if ("database".equals(fieldName)) {
                    deserializedMariaDBLinkedServiceTypeProperties.database = reader.readUntyped();
                } else if ("sslMode".equals(fieldName)) {
                    deserializedMariaDBLinkedServiceTypeProperties.sslMode = reader.readUntyped();
                } else if ("useSystemTrustStore".equals(fieldName)) {
                    deserializedMariaDBLinkedServiceTypeProperties.useSystemTrustStore = reader.readUntyped();
                } else if ("password".equals(fieldName)) {
                    deserializedMariaDBLinkedServiceTypeProperties.password
                        = AzureKeyVaultSecretReference.fromJson(reader);
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedMariaDBLinkedServiceTypeProperties.encryptedCredential = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMariaDBLinkedServiceTypeProperties;
        });
    }
}
