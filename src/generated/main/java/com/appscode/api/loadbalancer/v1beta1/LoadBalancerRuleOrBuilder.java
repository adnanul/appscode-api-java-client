// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/loadbalancer.proto

package com.appscode.api.loadbalancer.v1beta1;

public interface LoadBalancerRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.LoadBalancerRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string host = 1;</code>
   */
  java.lang.String getHost();
  /**
   * <code>optional string host = 1;</code>
   */
  com.google.protobuf.ByteString
      getHostBytes();

  /**
   * <pre>
   * ssl secret name to enable https on the host.
   * ssl secret must contain data with the certs pem file.
   * </pre>
   *
   * <code>optional string SSL_secret_name = 5;</code>
   */
  java.lang.String getSSLSecretName();
  /**
   * <pre>
   * ssl secret name to enable https on the host.
   * ssl secret must contain data with the certs pem file.
   * </pre>
   *
   * <code>optional string SSL_secret_name = 5;</code>
   */
  com.google.protobuf.ByteString
      getSSLSecretNameBytes();

  /**
   * <code>repeated .appscode.kubernetes.v1beta1.HTTPLoadBalancerRule http = 2;</code>
   */
  java.util.List<com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule> 
      getHttpList();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.HTTPLoadBalancerRule http = 2;</code>
   */
  com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule getHttp(int index);
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.HTTPLoadBalancerRule http = 2;</code>
   */
  int getHttpCount();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.HTTPLoadBalancerRule http = 2;</code>
   */
  java.util.List<? extends com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRuleOrBuilder> 
      getHttpOrBuilderList();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.HTTPLoadBalancerRule http = 2;</code>
   */
  com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRuleOrBuilder getHttpOrBuilder(
      int index);

  /**
   * <code>repeated .appscode.kubernetes.v1beta1.TCPLoadBalancerRule tcp = 3;</code>
   */
  java.util.List<com.appscode.api.loadbalancer.v1beta1.TCPLoadBalancerRule> 
      getTcpList();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.TCPLoadBalancerRule tcp = 3;</code>
   */
  com.appscode.api.loadbalancer.v1beta1.TCPLoadBalancerRule getTcp(int index);
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.TCPLoadBalancerRule tcp = 3;</code>
   */
  int getTcpCount();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.TCPLoadBalancerRule tcp = 3;</code>
   */
  java.util.List<? extends com.appscode.api.loadbalancer.v1beta1.TCPLoadBalancerRuleOrBuilder> 
      getTcpOrBuilderList();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.TCPLoadBalancerRule tcp = 3;</code>
   */
  com.appscode.api.loadbalancer.v1beta1.TCPLoadBalancerRuleOrBuilder getTcpOrBuilder(
      int index);
}
