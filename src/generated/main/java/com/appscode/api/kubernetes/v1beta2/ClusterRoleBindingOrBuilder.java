// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface ClusterRoleBindingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.ClusterRoleBinding)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.appscode.kubernetes.v1beta2.Meta meta = 1;</code>
   */
  boolean hasMeta();
  /**
   * <code>.appscode.kubernetes.v1beta2.Meta meta = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.Meta getMeta();
  /**
   * <code>.appscode.kubernetes.v1beta2.Meta meta = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.MetaOrBuilder getMetaOrBuilder();

  /**
   * <code>repeated .appscode.kubernetes.v1beta2.Subject subjects = 2;</code>
   */
  java.util.List<com.appscode.api.kubernetes.v1beta2.Subject> 
      getSubjectsList();
  /**
   * <code>repeated .appscode.kubernetes.v1beta2.Subject subjects = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.Subject getSubjects(int index);
  /**
   * <code>repeated .appscode.kubernetes.v1beta2.Subject subjects = 2;</code>
   */
  int getSubjectsCount();
  /**
   * <code>repeated .appscode.kubernetes.v1beta2.Subject subjects = 2;</code>
   */
  java.util.List<? extends com.appscode.api.kubernetes.v1beta2.SubjectOrBuilder> 
      getSubjectsOrBuilderList();
  /**
   * <code>repeated .appscode.kubernetes.v1beta2.Subject subjects = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.SubjectOrBuilder getSubjectsOrBuilder(
      int index);

  /**
   * <code>.appscode.kubernetes.v1beta2.ObjectReference role_ref = 3;</code>
   */
  boolean hasRoleRef();
  /**
   * <code>.appscode.kubernetes.v1beta2.ObjectReference role_ref = 3;</code>
   */
  com.appscode.api.kubernetes.v1beta2.ObjectReference getRoleRef();
  /**
   * <code>.appscode.kubernetes.v1beta2.ObjectReference role_ref = 3;</code>
   */
  com.appscode.api.kubernetes.v1beta2.ObjectReferenceOrBuilder getRoleRefOrBuilder();
}
