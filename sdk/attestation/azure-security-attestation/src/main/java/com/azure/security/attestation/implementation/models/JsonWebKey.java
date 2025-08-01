// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The JsonWebKey model.
 */
@Fluent
public final class JsonWebKey implements JsonSerializable<JsonWebKey> {
    /*
     * The "alg" (algorithm) parameter identifies the algorithm intended for
     * use with the key. The values used should either be registered in the
     * IANA "JSON Web Signature and Encryption Algorithms" registry
     * established by [JWA] or be a value that contains a Collision-
     * Resistant Name.
     */
    @Generated
    private String alg;

    /*
     * The "crv" (curve) parameter identifies the curve type
     */
    @Generated
    private String crv;

    /*
     * RSA private exponent or ECC private key
     */
    @Generated
    private String d;

    /*
     * RSA Private Key Parameter
     */
    @Generated
    private String dp;

    /*
     * RSA Private Key Parameter
     */
    @Generated
    private String dq;

    /*
     * RSA public exponent, in Base64
     */
    @Generated
    private String e;

    /*
     * Symmetric key
     */
    @Generated
    private String k;

    /*
     * The "kid" (key ID) parameter is used to match a specific key. This
     * is used, for instance, to choose among a set of keys within a JWK Set
     * during key rollover. The structure of the "kid" value is
     * unspecified. When "kid" values are used within a JWK Set, different
     * keys within the JWK Set SHOULD use distinct "kid" values. (One
     * example in which different keys might use the same "kid" value is if
     * they have different "kty" (key type) values but are considered to be
     * equivalent alternatives by the application using them.) The "kid"
     * value is a case-sensitive string.
     */
    @Generated
    private String kid;

    /*
     * The "kty" (key type) parameter identifies the cryptographic algorithm
     * family used with the key, such as "RSA" or "EC". "kty" values should
     * either be registered in the IANA "JSON Web Key Types" registry
     * established by [JWA] or be a value that contains a Collision-
     * Resistant Name. The "kty" value is a case-sensitive string.
     */
    @Generated
    private final String kty;

    /*
     * RSA modulus, in Base64
     */
    @Generated
    private String n;

    /*
     * RSA secret prime
     */
    @Generated
    private String p;

    /*
     * RSA secret prime, with p < q
     */
    @Generated
    private String q;

    /*
     * RSA Private Key Parameter
     */
    @Generated
    private String qi;

    /*
     * Use ("public key use") identifies the intended use of
     * the public key. The "use" parameter is employed to indicate whether
     * a public key is used for encrypting data or verifying the signature
     * on data. Values are commonly "sig" (signature) or "enc" (encryption).
     */
    @Generated
    private String use;

    /*
     * X coordinate for the Elliptic Curve point
     */
    @Generated
    private String x;

    /*
     * The "x5c" (X.509 certificate chain) parameter contains a chain of one
     * or more PKIX certificates [RFC5280]. The certificate chain is
     * represented as a JSON array of certificate value strings. Each
     * string in the array is a base64-encoded (Section 4 of [RFC4648] --
     * not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value.
     * The PKIX certificate containing the key value MUST be the first
     * certificate.
     */
    @Generated
    private List<String> x5C;

    /*
     * Y coordinate for the Elliptic Curve point
     */
    @Generated
    private String y;

    /**
     * Creates an instance of JsonWebKey class.
     * 
     * @param kty the kty value to set.
     */
    @Generated
    public JsonWebKey(String kty) {
        this.kty = kty;
    }

    /**
     * Get the alg property: The "alg" (algorithm) parameter identifies the algorithm intended for
     * use with the key. The values used should either be registered in the
     * IANA "JSON Web Signature and Encryption Algorithms" registry
     * established by [JWA] or be a value that contains a Collision-
     * Resistant Name.
     * 
     * @return the alg value.
     */
    @Generated
    public String getAlg() {
        return this.alg;
    }

    /**
     * Set the alg property: The "alg" (algorithm) parameter identifies the algorithm intended for
     * use with the key. The values used should either be registered in the
     * IANA "JSON Web Signature and Encryption Algorithms" registry
     * established by [JWA] or be a value that contains a Collision-
     * Resistant Name.
     * 
     * @param alg the alg value to set.
     * @return the JsonWebKey object itself.
     */
    @Generated
    public JsonWebKey setAlg(String alg) {
        this.alg = alg;
        return this;
    }

    /**
     * Get the crv property: The "crv" (curve) parameter identifies the curve type.
     * 
     * @return the crv value.
     */
    @Generated
    public String getCrv() {
        return this.crv;
    }

    /**
     * Set the crv property: The "crv" (curve) parameter identifies the curve type.
     * 
     * @param crv the crv value to set.
     * @return the JsonWebKey object itself.
     */
    @Generated
    public JsonWebKey setCrv(String crv) {
        this.crv = crv;
        return this;
    }

    /**
     * Get the d property: RSA private exponent or ECC private key.
     * 
     * @return the d value.
     */
    @Generated
    public String getD() {
        return this.d;
    }

    /**
     * Set the d property: RSA private exponent or ECC private key.
     * 
     * @param d the d value to set.
     * @return the JsonWebKey object itself.
     */
    @Generated
    public JsonWebKey setD(String d) {
        this.d = d;
        return this;
    }

    /**
     * Get the dp property: RSA Private Key Parameter.
     * 
     * @return the dp value.
     */
    @Generated
    public String getDp() {
        return this.dp;
    }

    /**
     * Set the dp property: RSA Private Key Parameter.
     * 
     * @param dp the dp value to set.
     * @return the JsonWebKey object itself.
     */
    @Generated
    public JsonWebKey setDp(String dp) {
        this.dp = dp;
        return this;
    }

    /**
     * Get the dq property: RSA Private Key Parameter.
     * 
     * @return the dq value.
     */
    @Generated
    public String getDq() {
        return this.dq;
    }

    /**
     * Set the dq property: RSA Private Key Parameter.
     * 
     * @param dq the dq value to set.
     * @return the JsonWebKey object itself.
     */
    @Generated
    public JsonWebKey setDq(String dq) {
        this.dq = dq;
        return this;
    }

    /**
     * Get the e property: RSA public exponent, in Base64.
     * 
     * @return the e value.
     */
    @Generated
    public String getE() {
        return this.e;
    }

    /**
     * Set the e property: RSA public exponent, in Base64.
     * 
     * @param e the e value to set.
     * @return the JsonWebKey object itself.
     */
    @Generated
    public JsonWebKey setE(String e) {
        this.e = e;
        return this;
    }

    /**
     * Get the k property: Symmetric key.
     * 
     * @return the k value.
     */
    @Generated
    public String getK() {
        return this.k;
    }

    /**
     * Set the k property: Symmetric key.
     * 
     * @param k the k value to set.
     * @return the JsonWebKey object itself.
     */
    @Generated
    public JsonWebKey setK(String k) {
        this.k = k;
        return this;
    }

    /**
     * Get the kid property: The "kid" (key ID) parameter is used to match a specific key. This
     * is used, for instance, to choose among a set of keys within a JWK Set
     * during key rollover. The structure of the "kid" value is
     * unspecified. When "kid" values are used within a JWK Set, different
     * keys within the JWK Set SHOULD use distinct "kid" values. (One
     * example in which different keys might use the same "kid" value is if
     * they have different "kty" (key type) values but are considered to be
     * equivalent alternatives by the application using them.) The "kid"
     * value is a case-sensitive string.
     * 
     * @return the kid value.
     */
    @Generated
    public String getKid() {
        return this.kid;
    }

    /**
     * Set the kid property: The "kid" (key ID) parameter is used to match a specific key. This
     * is used, for instance, to choose among a set of keys within a JWK Set
     * during key rollover. The structure of the "kid" value is
     * unspecified. When "kid" values are used within a JWK Set, different
     * keys within the JWK Set SHOULD use distinct "kid" values. (One
     * example in which different keys might use the same "kid" value is if
     * they have different "kty" (key type) values but are considered to be
     * equivalent alternatives by the application using them.) The "kid"
     * value is a case-sensitive string.
     * 
     * @param kid the kid value to set.
     * @return the JsonWebKey object itself.
     */
    @Generated
    public JsonWebKey setKid(String kid) {
        this.kid = kid;
        return this;
    }

    /**
     * Get the kty property: The "kty" (key type) parameter identifies the cryptographic algorithm
     * family used with the key, such as "RSA" or "EC". "kty" values should
     * either be registered in the IANA "JSON Web Key Types" registry
     * established by [JWA] or be a value that contains a Collision-
     * Resistant Name. The "kty" value is a case-sensitive string.
     * 
     * @return the kty value.
     */
    @Generated
    public String getKty() {
        return this.kty;
    }

    /**
     * Get the n property: RSA modulus, in Base64.
     * 
     * @return the n value.
     */
    @Generated
    public String getN() {
        return this.n;
    }

    /**
     * Set the n property: RSA modulus, in Base64.
     * 
     * @param n the n value to set.
     * @return the JsonWebKey object itself.
     */
    @Generated
    public JsonWebKey setN(String n) {
        this.n = n;
        return this;
    }

    /**
     * Get the p property: RSA secret prime.
     * 
     * @return the p value.
     */
    @Generated
    public String getP() {
        return this.p;
    }

    /**
     * Set the p property: RSA secret prime.
     * 
     * @param p the p value to set.
     * @return the JsonWebKey object itself.
     */
    @Generated
    public JsonWebKey setP(String p) {
        this.p = p;
        return this;
    }

    /**
     * Get the q property: RSA secret prime, with p &lt; q.
     * 
     * @return the q value.
     */
    @Generated
    public String getQ() {
        return this.q;
    }

    /**
     * Set the q property: RSA secret prime, with p &lt; q.
     * 
     * @param q the q value to set.
     * @return the JsonWebKey object itself.
     */
    @Generated
    public JsonWebKey setQ(String q) {
        this.q = q;
        return this;
    }

    /**
     * Get the qi property: RSA Private Key Parameter.
     * 
     * @return the qi value.
     */
    @Generated
    public String getQi() {
        return this.qi;
    }

    /**
     * Set the qi property: RSA Private Key Parameter.
     * 
     * @param qi the qi value to set.
     * @return the JsonWebKey object itself.
     */
    @Generated
    public JsonWebKey setQi(String qi) {
        this.qi = qi;
        return this;
    }

    /**
     * Get the use property: Use ("public key use") identifies the intended use of
     * the public key. The "use" parameter is employed to indicate whether
     * a public key is used for encrypting data or verifying the signature
     * on data. Values are commonly "sig" (signature) or "enc" (encryption).
     * 
     * @return the use value.
     */
    @Generated
    public String getUse() {
        return this.use;
    }

    /**
     * Set the use property: Use ("public key use") identifies the intended use of
     * the public key. The "use" parameter is employed to indicate whether
     * a public key is used for encrypting data or verifying the signature
     * on data. Values are commonly "sig" (signature) or "enc" (encryption).
     * 
     * @param use the use value to set.
     * @return the JsonWebKey object itself.
     */
    @Generated
    public JsonWebKey setUse(String use) {
        this.use = use;
        return this;
    }

    /**
     * Get the x property: X coordinate for the Elliptic Curve point.
     * 
     * @return the x value.
     */
    @Generated
    public String getX() {
        return this.x;
    }

    /**
     * Set the x property: X coordinate for the Elliptic Curve point.
     * 
     * @param x the x value to set.
     * @return the JsonWebKey object itself.
     */
    @Generated
    public JsonWebKey setX(String x) {
        this.x = x;
        return this;
    }

    /**
     * Get the x5C property: The "x5c" (X.509 certificate chain) parameter contains a chain of one
     * or more PKIX certificates [RFC5280]. The certificate chain is
     * represented as a JSON array of certificate value strings. Each
     * string in the array is a base64-encoded (Section 4 of [RFC4648] --
     * not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value.
     * The PKIX certificate containing the key value MUST be the first
     * certificate.
     * 
     * @return the x5C value.
     */
    @Generated
    public List<String> getX5C() {
        return this.x5C;
    }

    /**
     * Set the x5C property: The "x5c" (X.509 certificate chain) parameter contains a chain of one
     * or more PKIX certificates [RFC5280]. The certificate chain is
     * represented as a JSON array of certificate value strings. Each
     * string in the array is a base64-encoded (Section 4 of [RFC4648] --
     * not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value.
     * The PKIX certificate containing the key value MUST be the first
     * certificate.
     * 
     * @param x5C the x5C value to set.
     * @return the JsonWebKey object itself.
     */
    @Generated
    public JsonWebKey setX5C(List<String> x5C) {
        this.x5C = x5C;
        return this;
    }

    /**
     * Get the y property: Y coordinate for the Elliptic Curve point.
     * 
     * @return the y value.
     */
    @Generated
    public String getY() {
        return this.y;
    }

    /**
     * Set the y property: Y coordinate for the Elliptic Curve point.
     * 
     * @param y the y value to set.
     * @return the JsonWebKey object itself.
     */
    @Generated
    public JsonWebKey setY(String y) {
        this.y = y;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getKty() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property kty in model JsonWebKey"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JsonWebKey.class);

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kty", this.kty);
        jsonWriter.writeStringField("alg", this.alg);
        jsonWriter.writeStringField("crv", this.crv);
        jsonWriter.writeStringField("d", this.d);
        jsonWriter.writeStringField("dp", this.dp);
        jsonWriter.writeStringField("dq", this.dq);
        jsonWriter.writeStringField("e", this.e);
        jsonWriter.writeStringField("k", this.k);
        jsonWriter.writeStringField("kid", this.kid);
        jsonWriter.writeStringField("n", this.n);
        jsonWriter.writeStringField("p", this.p);
        jsonWriter.writeStringField("q", this.q);
        jsonWriter.writeStringField("qi", this.qi);
        jsonWriter.writeStringField("use", this.use);
        jsonWriter.writeStringField("x", this.x);
        jsonWriter.writeArrayField("x5c", this.x5C, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("y", this.y);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JsonWebKey from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JsonWebKey if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the JsonWebKey.
     */
    @Generated
    public static JsonWebKey fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean ktyFound = false;
            String kty = null;
            String alg = null;
            String crv = null;
            String d = null;
            String dp = null;
            String dq = null;
            String e = null;
            String k = null;
            String kid = null;
            String n = null;
            String p = null;
            String q = null;
            String qi = null;
            String use = null;
            String x = null;
            List<String> x5C = null;
            String y = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kty".equals(fieldName)) {
                    kty = reader.getString();
                    ktyFound = true;
                } else if ("alg".equals(fieldName)) {
                    alg = reader.getString();
                } else if ("crv".equals(fieldName)) {
                    crv = reader.getString();
                } else if ("d".equals(fieldName)) {
                    d = reader.getString();
                } else if ("dp".equals(fieldName)) {
                    dp = reader.getString();
                } else if ("dq".equals(fieldName)) {
                    dq = reader.getString();
                } else if ("e".equals(fieldName)) {
                    e = reader.getString();
                } else if ("k".equals(fieldName)) {
                    k = reader.getString();
                } else if ("kid".equals(fieldName)) {
                    kid = reader.getString();
                } else if ("n".equals(fieldName)) {
                    n = reader.getString();
                } else if ("p".equals(fieldName)) {
                    p = reader.getString();
                } else if ("q".equals(fieldName)) {
                    q = reader.getString();
                } else if ("qi".equals(fieldName)) {
                    qi = reader.getString();
                } else if ("use".equals(fieldName)) {
                    use = reader.getString();
                } else if ("x".equals(fieldName)) {
                    x = reader.getString();
                } else if ("x5c".equals(fieldName)) {
                    x5C = reader.readArray(reader1 -> reader1.getString());
                } else if ("y".equals(fieldName)) {
                    y = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (ktyFound) {
                JsonWebKey deserializedJsonWebKey = new JsonWebKey(kty);
                deserializedJsonWebKey.alg = alg;
                deserializedJsonWebKey.crv = crv;
                deserializedJsonWebKey.d = d;
                deserializedJsonWebKey.dp = dp;
                deserializedJsonWebKey.dq = dq;
                deserializedJsonWebKey.e = e;
                deserializedJsonWebKey.k = k;
                deserializedJsonWebKey.kid = kid;
                deserializedJsonWebKey.n = n;
                deserializedJsonWebKey.p = p;
                deserializedJsonWebKey.q = q;
                deserializedJsonWebKey.qi = qi;
                deserializedJsonWebKey.use = use;
                deserializedJsonWebKey.x = x;
                deserializedJsonWebKey.x5C = x5C;
                deserializedJsonWebKey.y = y;

                return deserializedJsonWebKey;
            }
            throw new IllegalStateException("Missing required property: kty");
        });
    }
}
