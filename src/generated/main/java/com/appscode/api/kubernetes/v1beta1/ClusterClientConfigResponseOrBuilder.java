// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/cluster.proto

package com.appscode.api.kubernetes.v1beta1;

public interface ClusterClientConfigResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.ClusterClientConfigResponse)
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
   * <code>optional string cluster_domain = 3;</code>
   */
  java.lang.String getClusterDomain();
  /**
   * <code>optional string cluster_domain = 3;</code>
   */
  com.google.protobuf.ByteString
      getClusterDomainBytes();

  /**
   * <code>optional string ca_cert = 4;</code>
   */
  java.lang.String getCaCert();
  /**
   * <code>optional string ca_cert = 4;</code>
   */
  com.google.protobuf.ByteString
      getCaCertBytes();

  /**
   * <code>optional string api_server_url = 5;</code>
   */
  java.lang.String getApiServerUrl();
  /**
   * <code>optional string api_server_url = 5;</code>
   */
  com.google.protobuf.ByteString
      getApiServerUrlBytes();

  /**
   * <code>optional string cluster_user_name = 6;</code>
   */
  java.lang.String getClusterUserName();
  /**
   * <code>optional string cluster_user_name = 6;</code>
   */
  com.google.protobuf.ByteString
      getClusterUserNameBytes();

  /**
   * <code>optional string user_cert = 7;</code>
   */
  java.lang.String getUserCert();
  /**
   * <code>optional string user_cert = 7;</code>
   */
  com.google.protobuf.ByteString
      getUserCertBytes();

  /**
   * <code>optional string user_key = 8;</code>
   */
  java.lang.String getUserKey();
  /**
   * <code>optional string user_key = 8;</code>
   */
  com.google.protobuf.ByteString
      getUserKeyBytes();

  /**
   * <code>optional string context_name = 9;</code>
   */
  java.lang.String getContextName();
  /**
   * <code>optional string context_name = 9;</code>
   */
  com.google.protobuf.ByteString
      getContextNameBytes();

  /**
   * <code>optional string user_token = 10;</code>
   */
  java.lang.String getUserToken();
  /**
   * <code>optional string user_token = 10;</code>
   */
  com.google.protobuf.ByteString
      getUserTokenBytes();

  /**
   * <code>optional string password = 11;</code>
   */
  java.lang.String getPassword();
  /**
   * <code>optional string password = 11;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}
