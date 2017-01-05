// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/ci/v1beta1/agent.proto

package com.appscode.api.ci.v1beta1;

public interface AgentListRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.ci.v1beta1.AgentListRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of status to get the agent filterd on the status
   * values in
   *   PENDING
   *   FAILED
   *   ONLINE
   *   OFFLINE
   *   DELETED
   * </pre>
   *
   * <code>repeated string status = 1;</code>
   */
  java.util.List<java.lang.String>
      getStatusList();
  /**
   * <pre>
   * List of status to get the agent filterd on the status
   * values in
   *   PENDING
   *   FAILED
   *   ONLINE
   *   OFFLINE
   *   DELETED
   * </pre>
   *
   * <code>repeated string status = 1;</code>
   */
  int getStatusCount();
  /**
   * <pre>
   * List of status to get the agent filterd on the status
   * values in
   *   PENDING
   *   FAILED
   *   ONLINE
   *   OFFLINE
   *   DELETED
   * </pre>
   *
   * <code>repeated string status = 1;</code>
   */
  java.lang.String getStatus(int index);
  /**
   * <pre>
   * List of status to get the agent filterd on the status
   * values in
   *   PENDING
   *   FAILED
   *   ONLINE
   *   OFFLINE
   *   DELETED
   * </pre>
   *
   * <code>repeated string status = 1;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes(int index);
}
