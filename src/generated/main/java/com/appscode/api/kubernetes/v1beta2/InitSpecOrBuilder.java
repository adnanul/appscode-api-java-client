// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface InitSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.InitSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.appscode.kubernetes.v1beta2.ScriptSourceSpec script_source = 1;</code>
   */
  boolean hasScriptSource();
  /**
   * <code>.appscode.kubernetes.v1beta2.ScriptSourceSpec script_source = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec getScriptSource();
  /**
   * <code>.appscode.kubernetes.v1beta2.ScriptSourceSpec script_source = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.ScriptSourceSpecOrBuilder getScriptSourceOrBuilder();

  /**
   * <code>.appscode.kubernetes.v1beta2.SnapshotSourceSpec snapshot_source = 2;</code>
   */
  boolean hasSnapshotSource();
  /**
   * <code>.appscode.kubernetes.v1beta2.SnapshotSourceSpec snapshot_source = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec getSnapshotSource();
  /**
   * <code>.appscode.kubernetes.v1beta2.SnapshotSourceSpec snapshot_source = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpecOrBuilder getSnapshotSourceOrBuilder();
}
