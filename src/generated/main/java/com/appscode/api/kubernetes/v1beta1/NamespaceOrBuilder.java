// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/client.proto

package com.appscode.api.kubernetes.v1beta1;

public interface NamespaceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.Namespace)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional int64 created_at = 2;</code>
   */
  long getCreatedAt();

  /**
   * <code>optional string phase = 3;</code>
   */
  java.lang.String getPhase();
  /**
   * <code>optional string phase = 3;</code>
   */
  com.google.protobuf.ByteString
      getPhaseBytes();
}