// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/cluster.proto

package com.appscode.api.kubernetes.v1beta1;

public interface ClusterScaleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.ClusterScaleRequest)
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
   * <pre>
   * New node configuration for the cluster
   * </pre>
   *
   * <code>map&lt;string, int64&gt; node_set = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getNodeSetCount();
  /**
   * <pre>
   * New node configuration for the cluster
   * </pre>
   *
   * <code>map&lt;string, int64&gt; node_set = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean containsNodeSet(
      java.lang.String key);
  /**
   * Use {@link #getNodeSetMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long>
  getNodeSet();
  /**
   * <pre>
   * New node configuration for the cluster
   * </pre>
   *
   * <code>map&lt;string, int64&gt; node_set = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.Map<java.lang.String, java.lang.Long>
  getNodeSetMap();
  /**
   * <pre>
   * New node configuration for the cluster
   * </pre>
   *
   * <code>map&lt;string, int64&gt; node_set = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated 
  long getNodeSetOrDefault(
      java.lang.String key,
      long defaultValue);
  /**
   * <pre>
   * New node configuration for the cluster
   * </pre>
   *
   * <code>map&lt;string, int64&gt; node_set = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated 
  long getNodeSetOrThrow(
      java.lang.String key);

  /**
   * <code>repeated .appscode.kubernetes.v1beta1.InstanceGroup node_groups = 3;</code>
   */
  java.util.List<com.appscode.api.kubernetes.v1beta1.InstanceGroup> 
      getNodeGroupsList();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.InstanceGroup node_groups = 3;</code>
   */
  com.appscode.api.kubernetes.v1beta1.InstanceGroup getNodeGroups(int index);
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.InstanceGroup node_groups = 3;</code>
   */
  int getNodeGroupsCount();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.InstanceGroup node_groups = 3;</code>
   */
  java.util.List<? extends com.appscode.api.kubernetes.v1beta1.InstanceGroupOrBuilder> 
      getNodeGroupsOrBuilderList();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.InstanceGroup node_groups = 3;</code>
   */
  com.appscode.api.kubernetes.v1beta1.InstanceGroupOrBuilder getNodeGroupsOrBuilder(
      int index);
}