// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/certificate/v1beta1/certificate.proto

package com.appscode.api.certificate.v1beta1;

public interface CertificateDeployRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.certificate.v1beta1.CertificateDeployRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string uid = 1;</code>
   */
  java.lang.String getUid();
  /**
   * <code>optional string uid = 1;</code>
   */
  com.google.protobuf.ByteString
      getUidBytes();

  /**
   * <code>optional string secret_name = 2;</code>
   */
  java.lang.String getSecretName();
  /**
   * <code>optional string secret_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getSecretNameBytes();

  /**
   * <code>optional string cluster_name = 3;</code>
   */
  java.lang.String getClusterName();
  /**
   * <code>optional string cluster_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getClusterNameBytes();

  /**
   * <code>optional string namespace = 4;</code>
   */
  java.lang.String getNamespace();
  /**
   * <code>optional string namespace = 4;</code>
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();
}