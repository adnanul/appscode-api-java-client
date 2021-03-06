// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/ci/v1beta1/agent.proto

package com.appscode.api.ci.v1beta1;

public interface AgentCreateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.ci.v1beta1.AgentCreateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string role = 2;</code>
   */
  java.lang.String getRole();
  /**
   * <code>string role = 2;</code>
   */
  com.google.protobuf.ByteString
      getRoleBytes();

  /**
   * <code>string external_ip = 3;</code>
   */
  java.lang.String getExternalIp();
  /**
   * <code>string external_ip = 3;</code>
   */
  com.google.protobuf.ByteString
      getExternalIpBytes();

  /**
   * <code>string internal_ip = 4;</code>
   */
  java.lang.String getInternalIp();
  /**
   * <code>string internal_ip = 4;</code>
   */
  com.google.protobuf.ByteString
      getInternalIpBytes();

  /**
   * <code>string ssh_user = 5;</code>
   */
  java.lang.String getSshUser();
  /**
   * <code>string ssh_user = 5;</code>
   */
  com.google.protobuf.ByteString
      getSshUserBytes();

  /**
   * <code>int32 ssh_port = 6;</code>
   */
  int getSshPort();

  /**
   * <code>int32 jenkins_jnlp_port = 7;</code>
   */
  int getJenkinsJnlpPort();

  /**
   * <code>string git_ssh_public_key = 8;</code>
   */
  java.lang.String getGitSshPublicKey();
  /**
   * <code>string git_ssh_public_key = 8;</code>
   */
  com.google.protobuf.ByteString
      getGitSshPublicKeyBytes();

  /**
   * <code>string jenkins_url = 9;</code>
   */
  java.lang.String getJenkinsUrl();
  /**
   * <code>string jenkins_url = 9;</code>
   */
  com.google.protobuf.ByteString
      getJenkinsUrlBytes();

  /**
   * <code>string ca_cert = 10;</code>
   */
  java.lang.String getCaCert();
  /**
   * <code>string ca_cert = 10;</code>
   */
  com.google.protobuf.ByteString
      getCaCertBytes();
}
