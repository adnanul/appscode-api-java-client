// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/metadata.proto

package com.appscode.api.kubernetes.v1beta1;

public interface BucketListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.BucketListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .appscode.dtypes.Status status = 1;</code>
   */
  boolean hasStatus();
  /**
   * <code>optional .appscode.dtypes.Status status = 1;</code>
   */
  com.appscode.api.dtypes.Status getStatus();
  /**
   * <code>optional .appscode.dtypes.Status status = 1;</code>
   */
  com.appscode.api.dtypes.StatusOrBuilder getStatusOrBuilder();

  /**
   * <code>repeated string names = 2;</code>
   */
  java.util.List<java.lang.String>
      getNamesList();
  /**
   * <code>repeated string names = 2;</code>
   */
  int getNamesCount();
  /**
   * <code>repeated string names = 2;</code>
   */
  java.lang.String getNames(int index);
  /**
   * <code>repeated string names = 2;</code>
   */
  com.google.protobuf.ByteString
      getNamesBytes(int index);
}
