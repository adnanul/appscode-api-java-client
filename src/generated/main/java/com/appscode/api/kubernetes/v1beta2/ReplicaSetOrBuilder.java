// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface ReplicaSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.ReplicaSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.appscode.kubernetes.v1beta2.Meta meta = 1;</code>
   */
  boolean hasMeta();
  /**
   * <code>.appscode.kubernetes.v1beta2.Meta meta = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.Meta getMeta();
  /**
   * <code>.appscode.kubernetes.v1beta2.Meta meta = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.MetaOrBuilder getMetaOrBuilder();

  /**
   * <code>string app = 2;</code>
   */
  java.lang.String getApp();
  /**
   * <code>string app = 2;</code>
   */
  com.google.protobuf.ByteString
      getAppBytes();

  /**
   * <code>.appscode.kubernetes.v1beta2.ReplicaSet.Spec spec = 3;</code>
   */
  boolean hasSpec();
  /**
   * <code>.appscode.kubernetes.v1beta2.ReplicaSet.Spec spec = 3;</code>
   */
  com.appscode.api.kubernetes.v1beta2.ReplicaSet.Spec getSpec();
  /**
   * <code>.appscode.kubernetes.v1beta2.ReplicaSet.Spec spec = 3;</code>
   */
  com.appscode.api.kubernetes.v1beta2.ReplicaSet.SpecOrBuilder getSpecOrBuilder();

  /**
   * <code>.appscode.kubernetes.v1beta2.ReplicaSet.Status status = 4;</code>
   */
  boolean hasStatus();
  /**
   * <code>.appscode.kubernetes.v1beta2.ReplicaSet.Status status = 4;</code>
   */
  com.appscode.api.kubernetes.v1beta2.ReplicaSet.Status getStatus();
  /**
   * <code>.appscode.kubernetes.v1beta2.ReplicaSet.Status status = 4;</code>
   */
  com.appscode.api.kubernetes.v1beta2.ReplicaSet.StatusOrBuilder getStatusOrBuilder();
}
