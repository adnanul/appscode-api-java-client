// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface CopyResourceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.CopyResourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeObject source = 1;</code>
   */
  boolean hasSource();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeObject source = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeObject getSource();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeObject source = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeObjectOrBuilder getSourceOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeObject destination = 2;</code>
   */
  boolean hasDestination();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeObject destination = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeObject getDestination();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeObject destination = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeObjectOrBuilder getDestinationOrBuilder();
}