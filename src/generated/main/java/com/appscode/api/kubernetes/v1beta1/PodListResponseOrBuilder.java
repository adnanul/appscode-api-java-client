// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/client.proto

package com.appscode.api.kubernetes.v1beta1;

public interface PodListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.PodListResponse)
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
   * <code>repeated .appscode.kubernetes.v1beta1.Pod pods = 2;</code>
   */
  java.util.List<com.appscode.api.kubernetes.v1beta1.Pod> 
      getPodsList();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.Pod pods = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta1.Pod getPods(int index);
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.Pod pods = 2;</code>
   */
  int getPodsCount();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.Pod pods = 2;</code>
   */
  java.util.List<? extends com.appscode.api.kubernetes.v1beta1.PodOrBuilder> 
      getPodsOrBuilderList();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.Pod pods = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta1.PodOrBuilder getPodsOrBuilder(
      int index);
}
