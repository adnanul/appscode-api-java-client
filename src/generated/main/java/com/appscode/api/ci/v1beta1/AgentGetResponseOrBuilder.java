// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/ci/v1beta1/agent.proto

package com.appscode.api.ci.v1beta1;

public interface AgentGetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.ci.v1beta1.AgentGetResponse)
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
   * <code>optional .appscode.ci.v1beta1.Agent agent = 2;</code>
   */
  boolean hasAgent();
  /**
   * <code>optional .appscode.ci.v1beta1.Agent agent = 2;</code>
   */
  com.appscode.api.ci.v1beta1.Agent getAgent();
  /**
   * <code>optional .appscode.ci.v1beta1.Agent agent = 2;</code>
   */
  com.appscode.api.ci.v1beta1.AgentOrBuilder getAgentOrBuilder();
}
