// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface RoleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.Role)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .appscode.kubernetes.v1beta2.Meta meta = 1;</code>
   */
  boolean hasMeta();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.Meta meta = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.Meta getMeta();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.Meta meta = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.MetaOrBuilder getMetaOrBuilder();

  /**
   * <code>repeated .appscode.kubernetes.v1beta2.Rule rules = 2;</code>
   */
  java.util.List<com.appscode.api.kubernetes.v1beta2.Rule> 
      getRulesList();
  /**
   * <code>repeated .appscode.kubernetes.v1beta2.Rule rules = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.Rule getRules(int index);
  /**
   * <code>repeated .appscode.kubernetes.v1beta2.Rule rules = 2;</code>
   */
  int getRulesCount();
  /**
   * <code>repeated .appscode.kubernetes.v1beta2.Rule rules = 2;</code>
   */
  java.util.List<? extends com.appscode.api.kubernetes.v1beta2.RuleOrBuilder> 
      getRulesOrBuilderList();
  /**
   * <code>repeated .appscode.kubernetes.v1beta2.Rule rules = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.RuleOrBuilder getRulesOrBuilder(
      int index);
}
