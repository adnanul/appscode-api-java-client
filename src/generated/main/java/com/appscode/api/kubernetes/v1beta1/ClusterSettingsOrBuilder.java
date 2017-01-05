// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/cluster.proto

package com.appscode.api.kubernetes.v1beta1;

public interface ClusterSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.ClusterSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string log_index_prefix = 1;</code>
   */
  java.lang.String getLogIndexPrefix();
  /**
   * <code>optional string log_index_prefix = 1;</code>
   */
  com.google.protobuf.ByteString
      getLogIndexPrefixBytes();

  /**
   * <pre>
   * Number of secs logs will be stored in ElasticSearch
   * </pre>
   *
   * <code>optional int64 log_storage_lifetime = 2;</code>
   */
  long getLogStorageLifetime();

  /**
   * <pre>
   * Number of secs logs will be stored in InfluxDB
   * </pre>
   *
   * <code>optional int64 monitoring_storage_lifetime = 3;</code>
   */
  long getMonitoringStorageLifetime();
}
