// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface GitRepoVolumeSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.GitRepoVolumeSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Repository URL
   * </pre>
   *
   * <code>string repository = 1;</code>
   */
  java.lang.String getRepository();
  /**
   * <pre>
   * Repository URL
   * </pre>
   *
   * <code>string repository = 1;</code>
   */
  com.google.protobuf.ByteString
      getRepositoryBytes();

  /**
   * <pre>
   * Commit hash for the specified revision.
   * </pre>
   *
   * <code>string revision = 2;</code>
   */
  java.lang.String getRevision();
  /**
   * <pre>
   * Commit hash for the specified revision.
   * </pre>
   *
   * <code>string revision = 2;</code>
   */
  com.google.protobuf.ByteString
      getRevisionBytes();

  /**
   * <pre>
   * Target directory name.
   * Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the
   * git repository.  Otherwise, if specified, the volume will contain the git repository in
   * the subdirectory with the given name.
   * </pre>
   *
   * <code>string directory = 3;</code>
   */
  java.lang.String getDirectory();
  /**
   * <pre>
   * Target directory name.
   * Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the
   * git repository.  Otherwise, if specified, the volume will contain the git repository in
   * the subdirectory with the given name.
   * </pre>
   *
   * <code>string directory = 3;</code>
   */
  com.google.protobuf.ByteString
      getDirectoryBytes();
}
