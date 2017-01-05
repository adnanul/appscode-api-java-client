// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/db/v1beta1/database.proto

package com.appscode.api.db.v1beta1;

public interface DatabaseListRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.db.v1beta1.DatabaseListRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string cluster = 1;</code>
   */
  java.lang.String getCluster();
  /**
   * <code>optional string cluster = 1;</code>
   */
  com.google.protobuf.ByteString
      getClusterBytes();

  /**
   * <code>optional string type = 2;</code>
   */
  java.lang.String getType();
  /**
   * <code>optional string type = 2;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * List of status to get the agent filterd on the status
   * values in
   *   PENDING
   *   FAILED
   *   READY
   *   DELETING
   *   DELETED
   *   DESTROYED
   * </pre>
   *
   * <code>repeated string status = 3;</code>
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
   *   DELETING
   *   DELETED
   *   DESTROYED
   * </pre>
   *
   * <code>repeated string status = 3;</code>
   */
  int getStatusCount();
  /**
   * <pre>
   * List of status to get the agent filterd on the status
   * values in
   *   PENDING
   *   FAILED
   *   READY
   *   DELETING
   *   DELETED
   *   DESTROYED
   * </pre>
   *
   * <code>repeated string status = 3;</code>
   */
  java.lang.String getStatus(int index);
  /**
   * <pre>
   * List of status to get the agent filterd on the status
   * values in
   *   PENDING
   *   FAILED
   *   READY
   *   DELETING
   *   DELETED
   *   DESTROYED
   * </pre>
   *
   * <code>repeated string status = 3;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes(int index);
}
