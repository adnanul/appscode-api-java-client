// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/incident.proto

package com.appscode.api.kubernetes.v1beta1;

public interface IncidentListRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.IncidentListRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string kubernetes_cluster = 1;</code>
   */
  java.lang.String getKubernetesCluster();
  /**
   * <code>optional string kubernetes_cluster = 1;</code>
   */
  com.google.protobuf.ByteString
      getKubernetesClusterBytes();

  /**
   * <code>optional string kubernetes_namespace = 2;</code>
   */
  java.lang.String getKubernetesNamespace();
  /**
   * <code>optional string kubernetes_namespace = 2;</code>
   */
  com.google.protobuf.ByteString
      getKubernetesNamespaceBytes();

  /**
   * <code>optional string kubernetes_object_type = 3;</code>
   */
  java.lang.String getKubernetesObjectType();
  /**
   * <code>optional string kubernetes_object_type = 3;</code>
   */
  com.google.protobuf.ByteString
      getKubernetesObjectTypeBytes();

  /**
   * <code>optional string kubernetes_object_name = 4;</code>
   */
  java.lang.String getKubernetesObjectName();
  /**
   * <code>optional string kubernetes_object_name = 4;</code>
   */
  com.google.protobuf.ByteString
      getKubernetesObjectNameBytes();

  /**
   * <code>repeated string states = 5;</code>
   */
  java.util.List<java.lang.String>
      getStatesList();
  /**
   * <code>repeated string states = 5;</code>
   */
  int getStatesCount();
  /**
   * <code>repeated string states = 5;</code>
   */
  java.lang.String getStates(int index);
  /**
   * <code>repeated string states = 5;</code>
   */
  com.google.protobuf.ByteString
      getStatesBytes(int index);
}
