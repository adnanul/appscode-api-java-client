// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface SecretOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.Secret)
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
   * <code>map&lt;string, string&gt; data = 2;</code>
   */
  int getDataCount();
  /**
   * <code>map&lt;string, string&gt; data = 2;</code>
   */
  boolean containsData(
      java.lang.String key);
  /**
   * Use {@link #getDataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getData();
  /**
   * <code>map&lt;string, string&gt; data = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getDataMap();
  /**
   * <code>map&lt;string, string&gt; data = 2;</code>
   */

  java.lang.String getDataOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; data = 2;</code>
   */

  java.lang.String getDataOrThrow(
      java.lang.String key);

  /**
   * <code>string type = 3;</code>
   */
  java.lang.String getType();
  /**
   * <code>string type = 3;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();
}
