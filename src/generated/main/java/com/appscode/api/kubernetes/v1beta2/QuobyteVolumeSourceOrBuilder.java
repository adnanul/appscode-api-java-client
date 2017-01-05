// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface QuobyteVolumeSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.QuobyteVolumeSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Registry represents a single or multiple Quobyte Registry services
   * specified as a string as host:port pair (multiple entries are separated with commas)
   * which acts as the central registry for volumes
   * </pre>
   *
   * <code>optional string registry = 1;</code>
   */
  java.lang.String getRegistry();
  /**
   * <pre>
   * Registry represents a single or multiple Quobyte Registry services
   * specified as a string as host:port pair (multiple entries are separated with commas)
   * which acts as the central registry for volumes
   * </pre>
   *
   * <code>optional string registry = 1;</code>
   */
  com.google.protobuf.ByteString
      getRegistryBytes();

  /**
   * <pre>
   * Volume is a string that references an already created Quobyte volume by name.
   * </pre>
   *
   * <code>optional string volume = 2;</code>
   */
  java.lang.String getVolume();
  /**
   * <pre>
   * Volume is a string that references an already created Quobyte volume by name.
   * </pre>
   *
   * <code>optional string volume = 2;</code>
   */
  com.google.protobuf.ByteString
      getVolumeBytes();

  /**
   * <pre>
   * ReadOnly here will force the Quobyte volume to be mounted with read-only permissions.
   * Defaults to false.
   * </pre>
   *
   * <code>optional bool readOnly = 3;</code>
   */
  boolean getReadOnly();

  /**
   * <pre>
   * User to map volume access to
   * Defaults to serivceaccount user
   * </pre>
   *
   * <code>optional string user = 4;</code>
   */
  java.lang.String getUser();
  /**
   * <pre>
   * User to map volume access to
   * Defaults to serivceaccount user
   * </pre>
   *
   * <code>optional string user = 4;</code>
   */
  com.google.protobuf.ByteString
      getUserBytes();

  /**
   * <pre>
   * Group to map volume access to
   * Default is no group
   * </pre>
   *
   * <code>optional string group = 5;</code>
   */
  java.lang.String getGroup();
  /**
   * <pre>
   * Group to map volume access to
   * Default is no group
   * </pre>
   *
   * <code>optional string group = 5;</code>
   */
  com.google.protobuf.ByteString
      getGroupBytes();
}
