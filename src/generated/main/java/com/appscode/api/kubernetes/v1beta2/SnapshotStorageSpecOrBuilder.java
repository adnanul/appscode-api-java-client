// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface SnapshotStorageSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.SnapshotStorageSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.appscode.kubernetes.v1beta2.SecretVolumeSource storage_secret = 1;</code>
   */
  boolean hasStorageSecret();
  /**
   * <code>.appscode.kubernetes.v1beta2.SecretVolumeSource storage_secret = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.SecretVolumeSource getStorageSecret();
  /**
   * <code>.appscode.kubernetes.v1beta2.SecretVolumeSource storage_secret = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.SecretVolumeSourceOrBuilder getStorageSecretOrBuilder();

  /**
   * <code>string bucket_name = 2;</code>
   */
  java.lang.String getBucketName();
  /**
   * <code>string bucket_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getBucketNameBytes();
}
