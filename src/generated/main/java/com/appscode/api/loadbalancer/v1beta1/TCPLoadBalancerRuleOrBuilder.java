// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/loadbalancer.proto

package com.appscode.api.loadbalancer.v1beta1;

public interface TCPLoadBalancerRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.TCPLoadBalancerRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string port = 1;</code>
   */
  java.lang.String getPort();
  /**
   * <code>optional string port = 1;</code>
   */
  com.google.protobuf.ByteString
      getPortBytes();

  /**
   * <code>optional .appscode.kubernetes.v1beta1.LoadBalancerBackend backend = 2;</code>
   */
  boolean hasBackend();
  /**
   * <code>optional .appscode.kubernetes.v1beta1.LoadBalancerBackend backend = 2;</code>
   */
  com.appscode.api.loadbalancer.v1beta1.LoadBalancerBackend getBackend();
  /**
   * <code>optional .appscode.kubernetes.v1beta1.LoadBalancerBackend backend = 2;</code>
   */
  com.appscode.api.loadbalancer.v1beta1.LoadBalancerBackendOrBuilder getBackendOrBuilder();

  /**
   * <code>optional string SSL_secret_name = 3;</code>
   */
  java.lang.String getSSLSecretName();
  /**
   * <code>optional string SSL_secret_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getSSLSecretNameBytes();

  /**
   * <code>optional string secret_pem_name = 4;</code>
   */
  java.lang.String getSecretPemName();
  /**
   * <code>optional string secret_pem_name = 4;</code>
   */
  com.google.protobuf.ByteString
      getSecretPemNameBytes();
}