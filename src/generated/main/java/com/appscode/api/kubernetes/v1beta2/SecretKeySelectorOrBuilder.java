// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface SecretKeySelectorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.SecretKeySelector)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the secret in the pod's namespace to select from.
   * </pre>
   *
   * <code>.appscode.kubernetes.v1beta2.ObjectReference local_object_reference = 1;</code>
   */
  boolean hasLocalObjectReference();
  /**
   * <pre>
   * The name of the secret in the pod's namespace to select from.
   * </pre>
   *
   * <code>.appscode.kubernetes.v1beta2.ObjectReference local_object_reference = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.ObjectReference getLocalObjectReference();
  /**
   * <pre>
   * The name of the secret in the pod's namespace to select from.
   * </pre>
   *
   * <code>.appscode.kubernetes.v1beta2.ObjectReference local_object_reference = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.ObjectReferenceOrBuilder getLocalObjectReferenceOrBuilder();

  /**
   * <pre>
   * The key of the secret to select from.  Must be a valid secret key.
   * </pre>
   *
   * <code>string key = 2;</code>
   */
  java.lang.String getKey();
  /**
   * <pre>
   * The key of the secret to select from.  Must be a valid secret key.
   * </pre>
   *
   * <code>string key = 2;</code>
   */
  com.google.protobuf.ByteString
      getKeyBytes();
}
