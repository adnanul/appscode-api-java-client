// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/ci/v1beta1/agent.proto

package com.appscode.api.ci.v1beta1;

public interface AgentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.ci.v1beta1.Agent)
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
   * <code>optional string role = 2;</code>
   */
  java.lang.String getRole();
  /**
   * <code>optional string role = 2;</code>
   */
  com.google.protobuf.ByteString
      getRoleBytes();

  /**
   * <code>optional string external_ip = 3;</code>
   */
  java.lang.String getExternalIp();
  /**
   * <code>optional string external_ip = 3;</code>
   */
  com.google.protobuf.ByteString
      getExternalIpBytes();

  /**
   * <code>optional string internal_ip = 4;</code>
   */
  java.lang.String getInternalIp();
  /**
   * <code>optional string internal_ip = 4;</code>
   */
  com.google.protobuf.ByteString
      getInternalIpBytes();

  /**
   * <code>optional bool isDeleted = 5;</code>
   */
  boolean getIsDeleted();

  /**
   * <code>optional int64 created_at = 6;</code>
   */
  long getCreatedAt();

  /**
   * <code>optional int64 updated_at = 7;</code>
   */
  long getUpdatedAt();
}