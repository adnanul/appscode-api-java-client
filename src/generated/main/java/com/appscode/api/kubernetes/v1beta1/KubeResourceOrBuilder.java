// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/client.proto

package com.appscode.api.kubernetes.v1beta1;

public interface KubeResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.KubeResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string type = 1;</code>
   */
  java.lang.String getType();
  /**
   * <code>optional string type = 1;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>optional string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string namespace = 3;</code>
   */
  java.lang.String getNamespace();
  /**
   * <code>optional string namespace = 3;</code>
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <code>optional string cluster = 4;</code>
   */
  java.lang.String getCluster();
  /**
   * <code>optional string cluster = 4;</code>
   */
  com.google.protobuf.ByteString
      getClusterBytes();
}