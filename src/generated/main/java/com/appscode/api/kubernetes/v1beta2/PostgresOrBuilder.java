// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface PostgresOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.Postgres)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .appscode.kubernetes.v1beta2.Meta meta = 1;</code>
   */
  boolean hasMeta();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.Meta meta = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.Meta getMeta();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.Meta meta = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.MetaOrBuilder getMetaOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.Postgres.Spec spec = 2;</code>
   */
  boolean hasSpec();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.Postgres.Spec spec = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.Postgres.Spec getSpec();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.Postgres.Spec spec = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.Postgres.SpecOrBuilder getSpecOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.Postgres.Status status = 3;</code>
   */
  boolean hasStatus();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.Postgres.Status status = 3;</code>
   */
  com.appscode.api.kubernetes.v1beta2.Postgres.Status getStatus();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.Postgres.Status status = 3;</code>
   */
  com.appscode.api.kubernetes.v1beta2.Postgres.StatusOrBuilder getStatusOrBuilder();
}
