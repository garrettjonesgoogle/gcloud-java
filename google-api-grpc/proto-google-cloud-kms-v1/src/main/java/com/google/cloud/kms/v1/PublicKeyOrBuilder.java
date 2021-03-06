// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/resources.proto

package com.google.cloud.kms.v1;

public interface PublicKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.PublicKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The public key, encoded in PEM format. For more information, see the
   * [RFC 7468](https://tools.ietf.org/html/rfc7468) sections for
   * [General Considerations](https://tools.ietf.org/html/rfc7468#section-2) and
   * [Textual Encoding of Subject Public Key Info]
   * (https://tools.ietf.org/html/rfc7468#section-13).
   * </pre>
   *
   * <code>string pem = 1;</code>
   */
  java.lang.String getPem();
  /**
   * <pre>
   * The public key, encoded in PEM format. For more information, see the
   * [RFC 7468](https://tools.ietf.org/html/rfc7468) sections for
   * [General Considerations](https://tools.ietf.org/html/rfc7468#section-2) and
   * [Textual Encoding of Subject Public Key Info]
   * (https://tools.ietf.org/html/rfc7468#section-13).
   * </pre>
   *
   * <code>string pem = 1;</code>
   */
  com.google.protobuf.ByteString
      getPemBytes();

  /**
   * <pre>
   * The [Algorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm] associated
   * with this key.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 2;</code>
   */
  int getAlgorithmValue();
  /**
   * <pre>
   * The [Algorithm][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm] associated
   * with this key.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = 2;</code>
   */
  com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm getAlgorithm();
}
