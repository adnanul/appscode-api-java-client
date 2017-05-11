// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface GCEPersistentDiskVolumeSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.GCEPersistentDiskVolumeSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique name of the PD resource in GCE. Used to identify the disk in GCE.
   * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#gcepersistentdisk
   * </pre>
   *
   * <code>string pdName = 1;</code>
   */
  java.lang.String getPdName();
  /**
   * <pre>
   * Unique name of the PD resource in GCE. Used to identify the disk in GCE.
   * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#gcepersistentdisk
   * </pre>
   *
   * <code>string pdName = 1;</code>
   */
  com.google.protobuf.ByteString
      getPdNameBytes();

  /**
   * <pre>
   * Filesystem type of the volume that you want to mount.
   * Tip: Ensure that the filesystem type is supported by the host operating system.
   * Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
   * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#gcepersistentdisk
   * TODO: how do we prevent errors in the filesystem from compromising the machine
   * </pre>
   *
   * <code>string fsType = 2;</code>
   */
  java.lang.String getFsType();
  /**
   * <pre>
   * Filesystem type of the volume that you want to mount.
   * Tip: Ensure that the filesystem type is supported by the host operating system.
   * Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
   * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#gcepersistentdisk
   * TODO: how do we prevent errors in the filesystem from compromising the machine
   * </pre>
   *
   * <code>string fsType = 2;</code>
   */
  com.google.protobuf.ByteString
      getFsTypeBytes();

  /**
   * <pre>
   * The partition in the volume that you want to mount.
   * If omitted, the default is to mount by volume name.
   * Examples: For volume /dev/sda1, you specify the partition as "1".
   * Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty).
   * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#gcepersistentdisk
   * </pre>
   *
   * <code>int32 partition = 3;</code>
   */
  int getPartition();

  /**
   * <pre>
   * ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * Defaults to false.
   * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#gcepersistentdisk
   * </pre>
   *
   * <code>bool readOnly = 4;</code>
   */
  boolean getReadOnly();
}
