// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/certificate/v1beta1/certificate.proto

package com.appscode.api.certificate.v1beta1;

public interface CertificateLoadRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.certificate.v1beta1.CertificateLoadRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string cert_data = 2;</code>
   */
  java.lang.String getCertData();
  /**
   * <code>optional string cert_data = 2;</code>
   */
  com.google.protobuf.ByteString
      getCertDataBytes();

  /**
   * <code>optional string key_data = 3;</code>
   */
  java.lang.String getKeyData();
  /**
   * <code>optional string key_data = 3;</code>
   */
  com.google.protobuf.ByteString
      getKeyDataBytes();
}
