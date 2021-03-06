// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface PersistentVolumeClaimVolumeSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.PersistentVolumeClaimVolumeSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume.
   * More info: http://kubernetes.io/docs/user-guide/persistent-volumes#persistentvolumeclaims
   * </pre>
   *
   * <code>string claimName = 1;</code>
   */
  java.lang.String getClaimName();
  /**
   * <pre>
   * ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume.
   * More info: http://kubernetes.io/docs/user-guide/persistent-volumes#persistentvolumeclaims
   * </pre>
   *
   * <code>string claimName = 1;</code>
   */
  com.google.protobuf.ByteString
      getClaimNameBytes();

  /**
   * <pre>
   * Will force the ReadOnly setting in VolumeMounts.
   * Default false.
   * +optional
   * </pre>
   *
   * <code>bool readOnly = 2;</code>
   */
  boolean getReadOnly();
}
