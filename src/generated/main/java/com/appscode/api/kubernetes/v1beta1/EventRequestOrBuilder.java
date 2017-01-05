// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/event.proto

package com.appscode.api.kubernetes.v1beta1;

public interface EventRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.EventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string cluster_name = 1;</code>
   */
  java.lang.String getClusterName();
  /**
   * <code>optional string cluster_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getClusterNameBytes();

  /**
   * <code>optional string kube_namespace = 2;</code>
   */
  java.lang.String getKubeNamespace();
  /**
   * <code>optional string kube_namespace = 2;</code>
   */
  com.google.protobuf.ByteString
      getKubeNamespaceBytes();

  /**
   * <code>optional string kube_object_type = 3;</code>
   */
  java.lang.String getKubeObjectType();
  /**
   * <code>optional string kube_object_type = 3;</code>
   */
  com.google.protobuf.ByteString
      getKubeObjectTypeBytes();

  /**
   * <code>optional string kube_object_name = 4;</code>
   */
  java.lang.String getKubeObjectName();
  /**
   * <code>optional string kube_object_name = 4;</code>
   */
  com.google.protobuf.ByteString
      getKubeObjectNameBytes();

  /**
   * <code>optional string event_type = 5;</code>
   */
  java.lang.String getEventType();
  /**
   * <code>optional string event_type = 5;</code>
   */
  com.google.protobuf.ByteString
      getEventTypeBytes();

  /**
   * <code>optional .appscode.kubernetes.v1beta1.EventRequest.ObjectMeta metadata = 7;</code>
   */
  boolean hasMetadata();
  /**
   * <code>optional .appscode.kubernetes.v1beta1.EventRequest.ObjectMeta metadata = 7;</code>
   */
  com.appscode.api.kubernetes.v1beta1.EventRequest.ObjectMeta getMetadata();
  /**
   * <code>optional .appscode.kubernetes.v1beta1.EventRequest.ObjectMeta metadata = 7;</code>
   */
  com.appscode.api.kubernetes.v1beta1.EventRequest.ObjectMetaOrBuilder getMetadataOrBuilder();
}
