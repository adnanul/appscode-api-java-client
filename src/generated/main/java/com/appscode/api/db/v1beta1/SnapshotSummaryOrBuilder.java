// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/db/v1beta1/database.proto

package com.appscode.api.db.v1beta1;

public interface SnapshotSummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.db.v1beta1.SnapshotSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 backup_attempt = 3;</code>
   */
  int getBackupAttempt();

  /**
   * <code>optional int32 backup_success = 4;</code>
   */
  int getBackupSuccess();

  /**
   * <code>optional int32 restore_attempt = 5;</code>
   */
  int getRestoreAttempt();

  /**
   * <code>optional int32 restore_success = 6;</code>
   */
  int getRestoreSuccess();
}
