// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/cluster.proto

package com.appscode.api.kubernetes.v1beta1;

public interface ClusterInstanceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.ClusterInstanceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .appscode.dtypes.Status status = 1;</code>
   */
  boolean hasStatus();
  /**
   * <code>optional .appscode.dtypes.Status status = 1;</code>
   */
  com.appscode.api.dtypes.Status getStatus();
  /**
   * <code>optional .appscode.dtypes.Status status = 1;</code>
   */
  com.appscode.api.dtypes.StatusOrBuilder getStatusOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta1.ClusterInstance instance = 2;</code>
   */
  boolean hasInstance();
  /**
   * <code>optional .appscode.kubernetes.v1beta1.ClusterInstance instance = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta1.ClusterInstance getInstance();
  /**
   * <code>optional .appscode.kubernetes.v1beta1.ClusterInstance instance = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta1.ClusterInstanceOrBuilder getInstanceOrBuilder();
}
