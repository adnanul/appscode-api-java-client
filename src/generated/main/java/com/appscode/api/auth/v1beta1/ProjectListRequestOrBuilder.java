// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/auth/v1beta1/project.proto

package com.appscode.api.auth.v1beta1;

public interface ProjectListRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.auth.v1beta1.ProjectListRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool with_member = 1;</code>
   */
  boolean getWithMember();

  /**
   * <code>repeated string members = 2;</code>
   */
  java.util.List<java.lang.String>
      getMembersList();
  /**
   * <code>repeated string members = 2;</code>
   */
  int getMembersCount();
  /**
   * <code>repeated string members = 2;</code>
   */
  java.lang.String getMembers(int index);
  /**
   * <code>repeated string members = 2;</code>
   */
  com.google.protobuf.ByteString
      getMembersBytes(int index);
}
