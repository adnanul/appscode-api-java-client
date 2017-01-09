// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/pv/v1beta1/persistentvolumeclaim.proto

package com.appscode.api.pv.v1beta1;

public interface PVCInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.pv.v1beta1.PVCInfo)
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
   * <code>optional int64 size_gb = 2;</code>
   */
  long getSizeGb();

  /**
   * <code>optional string namespace = 3;</code>
   */
  java.lang.String getNamespace();
  /**
   * <code>optional string namespace = 3;</code>
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <code>optional string status = 4;</code>
   */
  java.lang.String getStatus();
  /**
   * <code>optional string status = 4;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>optional string volume = 5;</code>
   */
  java.lang.String getVolume();
  /**
   * <code>optional string volume = 5;</code>
   */
  com.google.protobuf.ByteString
      getVolumeBytes();

  /**
   * <code>repeated string access_modes = 6;</code>
   */
  java.util.List<java.lang.String>
      getAccessModesList();
  /**
   * <code>repeated string access_modes = 6;</code>
   */
  int getAccessModesCount();
  /**
   * <code>repeated string access_modes = 6;</code>
   */
  java.lang.String getAccessModes(int index);
  /**
   * <code>repeated string access_modes = 6;</code>
   */
  com.google.protobuf.ByteString
      getAccessModesBytes(int index);
}