// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface EnvVarOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.EnvVar)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the environment variable. Must be a C_IDENTIFIER.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the environment variable. Must be a C_IDENTIFIER.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Variable references $(VAR_NAME) are expanded
   * using the previous defined environment variables in the container and
   * any service environment variables. If a variable cannot be resolved,
   * the reference in the input string will be unchanged. The $(VAR_NAME)
   * syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped
   * references will never be expanded, regardless of whether the variable
   * exists or not.
   * Defaults to "".
   * +optional
   * </pre>
   *
   * <code>optional string value = 2;</code>
   */
  java.lang.String getValue();
  /**
   * <pre>
   * Variable references $(VAR_NAME) are expanded
   * using the previous defined environment variables in the container and
   * any service environment variables. If a variable cannot be resolved,
   * the reference in the input string will be unchanged. The $(VAR_NAME)
   * syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped
   * references will never be expanded, regardless of whether the variable
   * exists or not.
   * Defaults to "".
   * +optional
   * </pre>
   *
   * <code>optional string value = 2;</code>
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * Source for the environment variable's value. Cannot be used if value is not empty.
   * +optional
   * </pre>
   *
   * <code>optional .appscode.kubernetes.v1beta2.EnvVarSource value_from = 3;</code>
   */
  boolean hasValueFrom();
  /**
   * <pre>
   * Source for the environment variable's value. Cannot be used if value is not empty.
   * +optional
   * </pre>
   *
   * <code>optional .appscode.kubernetes.v1beta2.EnvVarSource value_from = 3;</code>
   */
  com.appscode.api.kubernetes.v1beta2.EnvVarSource getValueFrom();
  /**
   * <pre>
   * Source for the environment variable's value. Cannot be used if value is not empty.
   * +optional
   * </pre>
   *
   * <code>optional .appscode.kubernetes.v1beta2.EnvVarSource value_from = 3;</code>
   */
  com.appscode.api.kubernetes.v1beta2.EnvVarSourceOrBuilder getValueFromOrBuilder();
}