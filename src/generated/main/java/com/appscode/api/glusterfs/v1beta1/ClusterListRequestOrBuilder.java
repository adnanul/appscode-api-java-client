// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/glusterfs/v1beta1/cluster.proto

package com.appscode.api.glusterfs.v1beta1;

public interface ClusterListRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.glusterfs.v1beta1.ClusterListRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string kube_cluster = 1;</code>
   */
  java.lang.String getKubeCluster();
  /**
   * <code>optional string kube_cluster = 1;</code>
   */
  com.google.protobuf.ByteString
      getKubeClusterBytes();

  /**
   * <pre>
   * List of status to get the agent filterd on the status
   * values in
   *   PENDING
   *   FAILED
   *   READY
   *   DELETED
   * </pre>
   *
   * <code>repeated string status = 2;</code>
   */
  java.util.List<java.lang.String>
      getStatusList();
  /**
   * <pre>
   * List of status to get the agent filterd on the status
   * values in
   *   PENDING
   *   FAILED
   *   READY
   *   DELETED
   * </pre>
   *
   * <code>repeated string status = 2;</code>
   */
  int getStatusCount();
  /**
   * <pre>
   * List of status to get the agent filterd on the status
   * values in
   *   PENDING
   *   FAILED
   *   READY
   *   DELETED
   * </pre>
   *
   * <code>repeated string status = 2;</code>
   */
  java.lang.String getStatus(int index);
  /**
   * <pre>
   * List of status to get the agent filterd on the status
   * values in
   *   PENDING
   *   FAILED
   *   READY
   *   DELETED
   * </pre>
   *
   * <code>repeated string status = 2;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes(int index);
}