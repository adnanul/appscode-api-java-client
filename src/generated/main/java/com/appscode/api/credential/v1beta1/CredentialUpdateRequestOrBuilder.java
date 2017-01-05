// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/credential/v1beta1/credential.proto

package com.appscode.api.credential.v1beta1;

public interface CredentialUpdateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.credential.v1beta1.CredentialUpdateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string provider = 2;</code>
   */
  java.lang.String getProvider();
  /**
   * <code>optional string provider = 2;</code>
   */
  com.google.protobuf.ByteString
      getProviderBytes();

  /**
   * <code>map&lt;string, string&gt; data = 3;</code>
   */
  int getDataCount();
  /**
   * <code>map&lt;string, string&gt; data = 3;</code>
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
   * <code>map&lt;string, string&gt; data = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getDataMap();
  /**
   * <code>map&lt;string, string&gt; data = 3;</code>
   */

  java.lang.String getDataOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; data = 3;</code>
   */

  java.lang.String getDataOrThrow(
      java.lang.String key);
}
