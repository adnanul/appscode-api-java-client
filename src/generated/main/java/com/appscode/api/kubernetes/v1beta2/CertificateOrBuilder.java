// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface CertificateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.Certificate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.appscode.kubernetes.v1beta2.Meta meta = 1;</code>
   */
  boolean hasMeta();
  /**
   * <code>.appscode.kubernetes.v1beta2.Meta meta = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.Meta getMeta();
  /**
   * <code>.appscode.kubernetes.v1beta2.Meta meta = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.MetaOrBuilder getMetaOrBuilder();

  /**
   * <code>.appscode.kubernetes.v1beta2.Certificate.Spec spec = 2;</code>
   */
  boolean hasSpec();
  /**
   * <code>.appscode.kubernetes.v1beta2.Certificate.Spec spec = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.Certificate.Spec getSpec();
  /**
   * <code>.appscode.kubernetes.v1beta2.Certificate.Spec spec = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.Certificate.SpecOrBuilder getSpecOrBuilder();

  /**
   * <code>.appscode.kubernetes.v1beta2.Certificate.Status status = 3;</code>
   */
  boolean hasStatus();
  /**
   * <code>.appscode.kubernetes.v1beta2.Certificate.Status status = 3;</code>
   */
  com.appscode.api.kubernetes.v1beta2.Certificate.Status getStatus();
  /**
   * <code>.appscode.kubernetes.v1beta2.Certificate.Status status = 3;</code>
   */
  com.appscode.api.kubernetes.v1beta2.Certificate.StatusOrBuilder getStatusOrBuilder();
}
