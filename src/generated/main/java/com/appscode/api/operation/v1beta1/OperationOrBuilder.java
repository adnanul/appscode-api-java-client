// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/operation/v1beta1/operation.proto

package com.appscode.api.operation.v1beta1;

public interface OperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.operation.v1beta1.Operation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .appscode.kubernetes.v1beta1.ClusterCreateRequest cluster_create_request = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta1.ClusterCreateRequest getClusterCreateRequest();
  /**
   * <code>optional .appscode.kubernetes.v1beta1.ClusterCreateRequest cluster_create_request = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta1.ClusterCreateRequestOrBuilder getClusterCreateRequestOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta1.ClusterScaleRequest cluster_scale_request = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta1.ClusterScaleRequest getClusterScaleRequest();
  /**
   * <code>optional .appscode.kubernetes.v1beta1.ClusterScaleRequest cluster_scale_request = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta1.ClusterScaleRequestOrBuilder getClusterScaleRequestOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta1.ClusterDeleteRequest cluster_delete_request = 3;</code>
   */
  com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest getClusterDeleteRequest();
  /**
   * <code>optional .appscode.kubernetes.v1beta1.ClusterDeleteRequest cluster_delete_request = 3;</code>
   */
  com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequestOrBuilder getClusterDeleteRequestOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta1.ClusterUpgradeRequest cluster_upgrade_request = 4;</code>
   */
  com.appscode.api.kubernetes.v1beta1.ClusterUpgradeRequest getClusterUpgradeRequest();
  /**
   * <code>optional .appscode.kubernetes.v1beta1.ClusterUpgradeRequest cluster_upgrade_request = 4;</code>
   */
  com.appscode.api.kubernetes.v1beta1.ClusterUpgradeRequestOrBuilder getClusterUpgradeRequestOrBuilder();

  /**
   * <code>optional .appscode.operation.v1beta1.DataBucketDeleteRequest data_bucket_delete_request = 9;</code>
   */
  com.appscode.api.operation.v1beta1.DataBucketDeleteRequest getDataBucketDeleteRequest();
  /**
   * <code>optional .appscode.operation.v1beta1.DataBucketDeleteRequest data_bucket_delete_request = 9;</code>
   */
  com.appscode.api.operation.v1beta1.DataBucketDeleteRequestOrBuilder getDataBucketDeleteRequestOrBuilder();

  /**
   * <code>optional .appscode.db.v1beta1.BackupScheduleRequest backup_schedule_request = 10;</code>
   */
  com.appscode.api.db.v1beta1.BackupScheduleRequest getBackupScheduleRequest();
  /**
   * <code>optional .appscode.db.v1beta1.BackupScheduleRequest backup_schedule_request = 10;</code>
   */
  com.appscode.api.db.v1beta1.BackupScheduleRequestOrBuilder getBackupScheduleRequestOrBuilder();

  /**
   * <code>optional .appscode.namespace.v1beta1.CreateRequest namespace_create_request = 11;</code>
   */
  com.appscode.api.namespace.v1beta1.CreateRequest getNamespaceCreateRequest();
  /**
   * <code>optional .appscode.namespace.v1beta1.CreateRequest namespace_create_request = 11;</code>
   */
  com.appscode.api.namespace.v1beta1.CreateRequestOrBuilder getNamespaceCreateRequestOrBuilder();

  /**
   * <code>optional .appscode.operation.v1beta1.NamespaceAdminTaskRequest namespace_admin_task_request = 12;</code>
   */
  com.appscode.api.operation.v1beta1.NamespaceAdminTaskRequest getNamespaceAdminTaskRequest();
  /**
   * <code>optional .appscode.operation.v1beta1.NamespaceAdminTaskRequest namespace_admin_task_request = 12;</code>
   */
  com.appscode.api.operation.v1beta1.NamespaceAdminTaskRequestOrBuilder getNamespaceAdminTaskRequestOrBuilder();

  /**
   * <code>optional .appscode.db.v1beta1.DatabaseCheckRequest database_check_request = 19;</code>
   */
  com.appscode.api.db.v1beta1.DatabaseCheckRequest getDatabaseCheckRequest();
  /**
   * <code>optional .appscode.db.v1beta1.DatabaseCheckRequest database_check_request = 19;</code>
   */
  com.appscode.api.db.v1beta1.DatabaseCheckRequestOrBuilder getDatabaseCheckRequestOrBuilder();

  /**
   * <code>optional .appscode.db.v1beta1.SnapshotCheckRequest snapshot_check_request = 20;</code>
   */
  com.appscode.api.db.v1beta1.SnapshotCheckRequest getSnapshotCheckRequest();
  /**
   * <code>optional .appscode.db.v1beta1.SnapshotCheckRequest snapshot_check_request = 20;</code>
   */
  com.appscode.api.db.v1beta1.SnapshotCheckRequestOrBuilder getSnapshotCheckRequestOrBuilder();

  /**
   * <code>optional .appscode.db.v1beta1.DatabaseDeleteRequest database_delete_request = 21;</code>
   */
  com.appscode.api.db.v1beta1.DatabaseDeleteRequest getDatabaseDeleteRequest();
  /**
   * <code>optional .appscode.db.v1beta1.DatabaseDeleteRequest database_delete_request = 21;</code>
   */
  com.appscode.api.db.v1beta1.DatabaseDeleteRequestOrBuilder getDatabaseDeleteRequestOrBuilder();

  /**
   * <code>optional .appscode.operation.v1beta1.OperationType type = 14;</code>
   */
  int getTypeValue();
  /**
   * <code>optional .appscode.operation.v1beta1.OperationType type = 14;</code>
   */
  com.appscode.api.operation.v1beta1.OperationType getType();

  /**
   * <code>optional string phid = 15;</code>
   */
  java.lang.String getPhid();
  /**
   * <code>optional string phid = 15;</code>
   */
  com.google.protobuf.ByteString
      getPhidBytes();

  /**
   * <code>optional .appscode.operation.v1beta1.Auth auth = 16;</code>
   */
  boolean hasAuth();
  /**
   * <code>optional .appscode.operation.v1beta1.Auth auth = 16;</code>
   */
  com.appscode.api.operation.v1beta1.Auth getAuth();
  /**
   * <code>optional .appscode.operation.v1beta1.Auth auth = 16;</code>
   */
  com.appscode.api.operation.v1beta1.AuthOrBuilder getAuthOrBuilder();

  /**
   * <code>optional .appscode.operation.v1beta1.Metadata metadata = 17;</code>
   */
  boolean hasMetadata();
  /**
   * <code>optional .appscode.operation.v1beta1.Metadata metadata = 17;</code>
   */
  com.appscode.api.operation.v1beta1.Metadata getMetadata();
  /**
   * <code>optional .appscode.operation.v1beta1.Metadata metadata = 17;</code>
   */
  com.appscode.api.operation.v1beta1.MetadataOrBuilder getMetadataOrBuilder();

  public com.appscode.api.operation.v1beta1.Operation.RequestCase getRequestCase();
}
