// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/cluster.proto

package com.appscode.api.kubernetes.v1beta1;

public interface ClusterStartupConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.ClusterStartupConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string uid = 1;</code>
   */
  java.lang.String getUid();
  /**
   * <code>string uid = 1;</code>
   */
  com.google.protobuf.ByteString
      getUidBytes();

  /**
   * <code>string role = 2;</code>
   */
  java.lang.String getRole();
  /**
   * <code>string role = 2;</code>
   */
  com.google.protobuf.ByteString
      getRoleBytes();

  /**
   * <code>int64 context_version = 3;</code>
   */
  long getContextVersion();
}
