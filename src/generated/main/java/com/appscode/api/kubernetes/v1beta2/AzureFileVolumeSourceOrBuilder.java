// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface AzureFileVolumeSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.AzureFileVolumeSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the name of secret that contains Azure Storage Account Name and Key
   * </pre>
   *
   * <code>optional string secretName = 1;</code>
   */
  java.lang.String getSecretName();
  /**
   * <pre>
   * the name of secret that contains Azure Storage Account Name and Key
   * </pre>
   *
   * <code>optional string secretName = 1;</code>
   */
  com.google.protobuf.ByteString
      getSecretNameBytes();

  /**
   * <pre>
   * Share Name
   * </pre>
   *
   * <code>optional string shareName = 2;</code>
   */
  java.lang.String getShareName();
  /**
   * <pre>
   * Share Name
   * </pre>
   *
   * <code>optional string shareName = 2;</code>
   */
  com.google.protobuf.ByteString
      getShareNameBytes();

  /**
   * <pre>
   * Defaults to false (read/write). ReadOnly here will force
   * the ReadOnly setting in VolumeMounts.
   * </pre>
   *
   * <code>optional bool readOnly = 3;</code>
   */
  boolean getReadOnly();
}