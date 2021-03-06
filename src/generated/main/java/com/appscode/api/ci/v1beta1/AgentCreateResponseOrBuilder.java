// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/ci/v1beta1/agent.proto

package com.appscode.api.ci.v1beta1;

public interface AgentCreateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.ci.v1beta1.AgentCreateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string namespace = 1;</code>
   */
  java.lang.String getNamespace();
  /**
   * <code>string namespace = 1;</code>
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <pre>
   * authorized to ssh
   * </pre>
   *
   * <code>string ssh_authorized_public_key = 2;</code>
   */
  java.lang.String getSshAuthorizedPublicKey();
  /**
   * <pre>
   * authorized to ssh
   * </pre>
   *
   * <code>string ssh_authorized_public_key = 2;</code>
   */
  com.google.protobuf.ByteString
      getSshAuthorizedPublicKeyBytes();

  /**
   * <code>string git_hostname = 3;</code>
   */
  java.lang.String getGitHostname();
  /**
   * <code>string git_hostname = 3;</code>
   */
  com.google.protobuf.ByteString
      getGitHostnameBytes();

  /**
   * <pre>
   * known_host
   * </pre>
   *
   * <code>string git_host_public_key = 4;</code>
   */
  java.lang.String getGitHostPublicKey();
  /**
   * <pre>
   * known_host
   * </pre>
   *
   * <code>string git_host_public_key = 4;</code>
   */
  com.google.protobuf.ByteString
      getGitHostPublicKeyBytes();

  /**
   * <code>.appscode.ci.v1beta1.AgentCreateResponse.ConduitUser git_user = 5;</code>
   */
  boolean hasGitUser();
  /**
   * <code>.appscode.ci.v1beta1.AgentCreateResponse.ConduitUser git_user = 5;</code>
   */
  com.appscode.api.ci.v1beta1.AgentCreateResponse.ConduitUser getGitUser();
  /**
   * <code>.appscode.ci.v1beta1.AgentCreateResponse.ConduitUser git_user = 5;</code>
   */
  com.appscode.api.ci.v1beta1.AgentCreateResponse.ConduitUserOrBuilder getGitUserOrBuilder();
}
