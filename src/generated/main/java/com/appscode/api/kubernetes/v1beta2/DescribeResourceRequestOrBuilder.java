// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface DescribeResourceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.DescribeResourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string cluster = 1;</code>
   */
  java.lang.String getCluster();
  /**
   * <code>string cluster = 1;</code>
   */
  com.google.protobuf.ByteString
      getClusterBytes();

  /**
   * <code>string type = 2;</code>
   */
  java.lang.String getType();
  /**
   * <code>string type = 2;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string namespace = 3;</code>
   */
  java.lang.String getNamespace();
  /**
   * <code>string namespace = 3;</code>
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <code>string name = 4;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 4;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string raw = 5;</code>
   */
  java.lang.String getRaw();
  /**
   * <code>string raw = 5;</code>
   */
  com.google.protobuf.ByteString
      getRawBytes();

  /**
   * <code>bool include_metrics = 6;</code>
   */
  boolean getIncludeMetrics();
}
