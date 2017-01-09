// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/artifactory/v1beta1/artifact.proto

package com.appscode.api.artifactory.v1beta1;

public interface ArtifactSearchResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.artifactory.v1beta1.ArtifactSearchResponse)
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
   * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
   */
  java.util.List<com.appscode.api.artifactory.v1beta1.Artifact> 
      getArtifactsList();
  /**
   * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
   */
  com.appscode.api.artifactory.v1beta1.Artifact getArtifacts(int index);
  /**
   * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
   */
  int getArtifactsCount();
  /**
   * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
   */
  java.util.List<? extends com.appscode.api.artifactory.v1beta1.ArtifactOrBuilder> 
      getArtifactsOrBuilderList();
  /**
   * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
   */
  com.appscode.api.artifactory.v1beta1.ArtifactOrBuilder getArtifactsOrBuilder(
      int index);
}