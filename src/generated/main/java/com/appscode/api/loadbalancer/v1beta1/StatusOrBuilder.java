// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/loadbalancer.proto

package com.appscode.api.loadbalancer.v1beta1;

public interface StatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.Status)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
   */
  java.util.List<com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus> 
      getStatusList();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
   */
  com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus getStatus(int index);
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
   */
  int getStatusCount();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
   */
  java.util.List<? extends com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatusOrBuilder> 
      getStatusOrBuilderList();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
   */
  com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatusOrBuilder getStatusOrBuilder(
      int index);
}
