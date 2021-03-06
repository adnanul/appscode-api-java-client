// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface ObjectFieldSelectorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.ObjectFieldSelector)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Version of the schema the FieldPath is written in terms of, defaults to "v1".
   * +optional
   * </pre>
   *
   * <code>string api_version = 1;</code>
   */
  java.lang.String getApiVersion();
  /**
   * <pre>
   * Version of the schema the FieldPath is written in terms of, defaults to "v1".
   * +optional
   * </pre>
   *
   * <code>string api_version = 1;</code>
   */
  com.google.protobuf.ByteString
      getApiVersionBytes();

  /**
   * <pre>
   * Path of the field to select in the specified API version.
   * </pre>
   *
   * <code>string field_path = 2;</code>
   */
  java.lang.String getFieldPath();
  /**
   * <pre>
   * Path of the field to select in the specified API version.
   * </pre>
   *
   * <code>string field_path = 2;</code>
   */
  com.google.protobuf.ByteString
      getFieldPathBytes();
}
