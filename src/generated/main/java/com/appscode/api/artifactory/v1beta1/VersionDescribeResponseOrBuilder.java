// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/artifactory/v1beta1/version.proto

package com.appscode.api.artifactory.v1beta1;

public interface VersionDescribeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.artifactory.v1beta1.VersionDescribeResponse)
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
   * <code>optional .appscode.artifactory.v1beta1.ArtifactVersion version = 2;</code>
   */
  boolean hasVersion();
  /**
   * <code>optional .appscode.artifactory.v1beta1.ArtifactVersion version = 2;</code>
   */
  com.appscode.api.artifactory.v1beta1.ArtifactVersion getVersion();
  /**
   * <code>optional .appscode.artifactory.v1beta1.ArtifactVersion version = 2;</code>
   */
  com.appscode.api.artifactory.v1beta1.ArtifactVersionOrBuilder getVersionOrBuilder();
}