// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/db/v1beta1/database.proto

package com.appscode.api.db.v1beta1;

public interface DatabaseListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.db.v1beta1.DatabaseListResponse)
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
   * <code>repeated .appscode.db.v1beta1.Database databases = 2;</code>
   */
  java.util.List<com.appscode.api.db.v1beta1.Database> 
      getDatabasesList();
  /**
   * <code>repeated .appscode.db.v1beta1.Database databases = 2;</code>
   */
  com.appscode.api.db.v1beta1.Database getDatabases(int index);
  /**
   * <code>repeated .appscode.db.v1beta1.Database databases = 2;</code>
   */
  int getDatabasesCount();
  /**
   * <code>repeated .appscode.db.v1beta1.Database databases = 2;</code>
   */
  java.util.List<? extends com.appscode.api.db.v1beta1.DatabaseOrBuilder> 
      getDatabasesOrBuilderList();
  /**
   * <code>repeated .appscode.db.v1beta1.Database databases = 2;</code>
   */
  com.appscode.api.db.v1beta1.DatabaseOrBuilder getDatabasesOrBuilder(
      int index);
}