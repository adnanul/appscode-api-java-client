// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/ci/v1beta1/master.proto

package com.appscode.api.ci.v1beta1;

public interface MasterCreateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.ci.v1beta1.MasterCreateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string cluster_name = 1;</code>
   */
  java.lang.String getClusterName();
  /**
   * <code>optional string cluster_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getClusterNameBytes();

  /**
   * <code>optional string volume_id = 2;</code>
   */
  java.lang.String getVolumeId();
  /**
   * <code>optional string volume_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getVolumeIdBytes();

  /**
   * <code>optional string namespace = 3;</code>
   */
  java.lang.String getNamespace();
  /**
   * <code>optional string namespace = 3;</code>
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();
}