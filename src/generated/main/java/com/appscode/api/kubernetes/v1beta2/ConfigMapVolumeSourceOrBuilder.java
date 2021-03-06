// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface ConfigMapVolumeSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.ConfigMapVolumeSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.appscode.kubernetes.v1beta2.LocalObjectReference localObjectReference = 1;</code>
   */
  boolean hasLocalObjectReference();
  /**
   * <code>.appscode.kubernetes.v1beta2.LocalObjectReference localObjectReference = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.LocalObjectReference getLocalObjectReference();
  /**
   * <code>.appscode.kubernetes.v1beta2.LocalObjectReference localObjectReference = 1;</code>
   */
  com.appscode.api.kubernetes.v1beta2.LocalObjectReferenceOrBuilder getLocalObjectReferenceOrBuilder();

  /**
   * <pre>
   * If unspecified, each key-value pair in the Data field of the referenced
   * ConfigMap will be projected into the volume as a file whose name is the
   * key and content is the value. If specified, the listed keys will be
   * projected into the specified paths, and unlisted keys will not be
   * present. If a key is specified which is not present in the ConfigMap,
   * the volume setup will error unless it is marked optional. Paths must be
   * relative and may not contain the '..' path or start with '..'.
   * +optional
   * </pre>
   *
   * <code>.appscode.kubernetes.v1beta2.KeyToPath items = 2;</code>
   */
  boolean hasItems();
  /**
   * <pre>
   * If unspecified, each key-value pair in the Data field of the referenced
   * ConfigMap will be projected into the volume as a file whose name is the
   * key and content is the value. If specified, the listed keys will be
   * projected into the specified paths, and unlisted keys will not be
   * present. If a key is specified which is not present in the ConfigMap,
   * the volume setup will error unless it is marked optional. Paths must be
   * relative and may not contain the '..' path or start with '..'.
   * +optional
   * </pre>
   *
   * <code>.appscode.kubernetes.v1beta2.KeyToPath items = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KeyToPath getItems();
  /**
   * <pre>
   * If unspecified, each key-value pair in the Data field of the referenced
   * ConfigMap will be projected into the volume as a file whose name is the
   * key and content is the value. If specified, the listed keys will be
   * projected into the specified paths, and unlisted keys will not be
   * present. If a key is specified which is not present in the ConfigMap,
   * the volume setup will error unless it is marked optional. Paths must be
   * relative and may not contain the '..' path or start with '..'.
   * +optional
   * </pre>
   *
   * <code>.appscode.kubernetes.v1beta2.KeyToPath items = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KeyToPathOrBuilder getItemsOrBuilder();

  /**
   * <pre>
   * Optional: mode bits to use on created files by default. Must be a
   * value between 0 and 0777. Defaults to 0644.
   * Directories within the path are not affected by this setting.
   * This might be in conflict with other options that affect the file
   * mode, like fsGroup, and the result can be other mode bits set.
   * +optional
   * </pre>
   *
   * <code>int32 defaultMode = 3;</code>
   */
  int getDefaultMode();

  /**
   * <pre>
   * Specify whether the ConfigMap or it's keys must be defined
   * +optional
   * </pre>
   *
   * <code>bool optional = 4;</code>
   */
  boolean getOptional();
}
