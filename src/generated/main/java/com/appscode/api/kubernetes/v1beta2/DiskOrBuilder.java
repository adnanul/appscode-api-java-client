// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface DiskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.Disk)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string id = 2;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 2;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string provider = 3;</code>
   */
  java.lang.String getProvider();
  /**
   * <code>string provider = 3;</code>
   */
  com.google.protobuf.ByteString
      getProviderBytes();

  /**
   * <code>int64 size_gb = 4;</code>
   */
  long getSizeGb();

  /**
   * <code>string type = 5;</code>
   */
  java.lang.String getType();
  /**
   * <code>string type = 5;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string zone = 6;</code>
   */
  java.lang.String getZone();
  /**
   * <code>string zone = 6;</code>
   */
  com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <code>string status = 7;</code>
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 7;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>repeated string users = 8;</code>
   */
  java.util.List<java.lang.String>
      getUsersList();
  /**
   * <code>repeated string users = 8;</code>
   */
  int getUsersCount();
  /**
   * <code>repeated string users = 8;</code>
   */
  java.lang.String getUsers(int index);
  /**
   * <code>repeated string users = 8;</code>
   */
  com.google.protobuf.ByteString
      getUsersBytes(int index);

  /**
   * <code>string kind = 9;</code>
   */
  java.lang.String getKind();
  /**
   * <code>string kind = 9;</code>
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <code>string endpoint = 10;</code>
   */
  java.lang.String getEndpoint();
  /**
   * <code>string endpoint = 10;</code>
   */
  com.google.protobuf.ByteString
      getEndpointBytes();

  /**
   * <code>int64 iops = 11;</code>
   */
  long getIops();

  /**
   * <code>.appscode.kubernetes.v1beta2.PersistentVolume persistent_volume = 12;</code>
   */
  boolean hasPersistentVolume();
  /**
   * <code>.appscode.kubernetes.v1beta2.PersistentVolume persistent_volume = 12;</code>
   */
  com.appscode.api.kubernetes.v1beta2.PersistentVolume getPersistentVolume();
  /**
   * <code>.appscode.kubernetes.v1beta2.PersistentVolume persistent_volume = 12;</code>
   */
  com.appscode.api.kubernetes.v1beta2.PersistentVolumeOrBuilder getPersistentVolumeOrBuilder();

  /**
   * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaim persistent_volume_claim = 13;</code>
   */
  boolean hasPersistentVolumeClaim();
  /**
   * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaim persistent_volume_claim = 13;</code>
   */
  com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaim getPersistentVolumeClaim();
  /**
   * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaim persistent_volume_claim = 13;</code>
   */
  com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimOrBuilder getPersistentVolumeClaimOrBuilder();
}
