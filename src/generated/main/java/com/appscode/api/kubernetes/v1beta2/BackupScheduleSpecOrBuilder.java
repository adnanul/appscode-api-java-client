// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface BackupScheduleSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.BackupScheduleSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string cron_expression = 1;</code>
   */
  java.lang.String getCronExpression();
  /**
   * <code>optional string cron_expression = 1;</code>
   */
  com.google.protobuf.ByteString
      getCronExpressionBytes();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.SnapshotSpec snapshot_spec = 2;</code>
   */
  boolean hasSnapshotSpec();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.SnapshotSpec snapshot_spec = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.SnapshotSpec getSnapshotSpec();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.SnapshotSpec snapshot_spec = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.SnapshotSpecOrBuilder getSnapshotSpecOrBuilder();
}
