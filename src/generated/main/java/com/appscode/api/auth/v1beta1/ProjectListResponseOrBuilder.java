// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/auth/v1beta1/project.proto

package com.appscode.api.auth.v1beta1;

public interface ProjectListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.auth.v1beta1.ProjectListResponse)
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
   * <code>repeated .appscode.auth.v1beta1.Project projets = 2;</code>
   */
  java.util.List<com.appscode.api.auth.v1beta1.Project> 
      getProjetsList();
  /**
   * <code>repeated .appscode.auth.v1beta1.Project projets = 2;</code>
   */
  com.appscode.api.auth.v1beta1.Project getProjets(int index);
  /**
   * <code>repeated .appscode.auth.v1beta1.Project projets = 2;</code>
   */
  int getProjetsCount();
  /**
   * <code>repeated .appscode.auth.v1beta1.Project projets = 2;</code>
   */
  java.util.List<? extends com.appscode.api.auth.v1beta1.ProjectOrBuilder> 
      getProjetsOrBuilderList();
  /**
   * <code>repeated .appscode.auth.v1beta1.Project projets = 2;</code>
   */
  com.appscode.api.auth.v1beta1.ProjectOrBuilder getProjetsOrBuilder(
      int index);
}
