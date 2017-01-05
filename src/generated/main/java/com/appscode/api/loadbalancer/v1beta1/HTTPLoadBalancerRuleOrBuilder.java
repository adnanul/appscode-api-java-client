// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/loadbalancer.proto

package com.appscode.api.loadbalancer.v1beta1;

public interface HTTPLoadBalancerRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.HTTPLoadBalancerRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string path = 1;</code>
   */
  java.lang.String getPath();
  /**
   * <code>optional string path = 1;</code>
   */
  com.google.protobuf.ByteString
      getPathBytes();

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
   * <code>repeated string header_rules = 3;</code>
   */
  java.util.List<java.lang.String>
      getHeaderRulesList();
  /**
   * <code>repeated string header_rules = 3;</code>
   */
  int getHeaderRulesCount();
  /**
   * <code>repeated string header_rules = 3;</code>
   */
  java.lang.String getHeaderRules(int index);
  /**
   * <code>repeated string header_rules = 3;</code>
   */
  com.google.protobuf.ByteString
      getHeaderRulesBytes(int index);

  /**
   * <code>repeated string rewrite_rules = 4;</code>
   */
  java.util.List<java.lang.String>
      getRewriteRulesList();
  /**
   * <code>repeated string rewrite_rules = 4;</code>
   */
  int getRewriteRulesCount();
  /**
   * <code>repeated string rewrite_rules = 4;</code>
   */
  java.lang.String getRewriteRules(int index);
  /**
   * <code>repeated string rewrite_rules = 4;</code>
   */
  com.google.protobuf.ByteString
      getRewriteRulesBytes(int index);
}
