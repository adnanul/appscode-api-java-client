// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/attic/v1beta1/version.proto

package com.appscode.api.attic.v1beta1;

public interface NpmSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.attic.v1beta1.NpmSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string description = 1;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 1;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string artifact_id = 2;</code>
   */
  java.lang.String getArtifactId();
  /**
   * <code>string artifact_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getArtifactIdBytes();

  /**
   * <code>string shasum = 3;</code>
   */
  java.lang.String getShasum();
  /**
   * <code>string shasum = 3;</code>
   */
  com.google.protobuf.ByteString
      getShasumBytes();

  /**
   * <code>repeated string keywords = 4;</code>
   */
  java.util.List<java.lang.String>
      getKeywordsList();
  /**
   * <code>repeated string keywords = 4;</code>
   */
  int getKeywordsCount();
  /**
   * <code>repeated string keywords = 4;</code>
   */
  java.lang.String getKeywords(int index);
  /**
   * <code>repeated string keywords = 4;</code>
   */
  com.google.protobuf.ByteString
      getKeywordsBytes(int index);

  /**
   * <code>string artifact_url = 5;</code>
   */
  java.lang.String getArtifactUrl();
  /**
   * <code>string artifact_url = 5;</code>
   */
  com.google.protobuf.ByteString
      getArtifactUrlBytes();
}
