// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/cluster.proto

package com.appscode.api.kubernetes.v1beta1;

public interface ClusterStartupConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.ClusterStartupConfigRequest)
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
   * <code>optional string role = 2;</code>
   */
  java.lang.String getRole();
  /**
   * <code>optional string role = 2;</code>
   */
  com.google.protobuf.ByteString
      getRoleBytes();

  /**
   * <code>optional int64 context_version = 3;</code>
   */
  long getContextVersion();
}
