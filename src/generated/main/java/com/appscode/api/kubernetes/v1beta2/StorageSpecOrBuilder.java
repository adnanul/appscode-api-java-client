// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface StorageSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.StorageSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string class = 1;</code>
   */
  java.lang.String getClass_();
  /**
   * <code>string class = 1;</code>
   */
  com.google.protobuf.ByteString
      getClass_Bytes();

  /**
   * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaimSpec persistent_volume_claim_spec = 2;</code>
   */
  boolean hasPersistentVolumeClaimSpec();
  /**
   * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaimSpec persistent_volume_claim_spec = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec getPersistentVolumeClaimSpec();
  /**
   * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaimSpec persistent_volume_claim_spec = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpecOrBuilder getPersistentVolumeClaimSpecOrBuilder();
}
