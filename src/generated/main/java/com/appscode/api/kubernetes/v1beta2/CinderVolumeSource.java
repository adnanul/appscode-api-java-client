// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

/**
 * <pre>
 * Represents a cinder volume resource in Openstack.
 * A Cinder volume must exist before mounting to a container.
 * The volume must also be in the same region as the kubelet.
 * Cinder volumes support ownership management and SELinux relabeling.
 * </pre>
 *
 * Protobuf type {@code appscode.kubernetes.v1beta2.CinderVolumeSource}
 */
public  final class CinderVolumeSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta2.CinderVolumeSource)
    CinderVolumeSourceOrBuilder {
  // Use CinderVolumeSource.newBuilder() to construct.
  private CinderVolumeSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CinderVolumeSource() {
    volumeID_ = "";
    fsType_ = "";
    readOnly_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CinderVolumeSource(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            volumeID_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fsType_ = s;
            break;
          }
          case 24: {

            readOnly_ = input.readBool();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_CinderVolumeSource_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_CinderVolumeSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta2.CinderVolumeSource.class, com.appscode.api.kubernetes.v1beta2.CinderVolumeSource.Builder.class);
  }

  public static final int VOLUMEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object volumeID_;
  /**
   * <pre>
   * volume id used to identify the volume in cinder
   * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
   * </pre>
   *
   * <code>string volumeID = 1;</code>
   */
  public java.lang.String getVolumeID() {
    java.lang.Object ref = volumeID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      volumeID_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * volume id used to identify the volume in cinder
   * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
   * </pre>
   *
   * <code>string volumeID = 1;</code>
   */
  public com.google.protobuf.ByteString
      getVolumeIDBytes() {
    java.lang.Object ref = volumeID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      volumeID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FSTYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object fsType_;
  /**
   * <pre>
   * Filesystem type to mount.
   * Must be a filesystem type supported by the host operating system.
   * Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
   * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
   * </pre>
   *
   * <code>string fsType = 2;</code>
   */
  public java.lang.String getFsType() {
    java.lang.Object ref = fsType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fsType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Filesystem type to mount.
   * Must be a filesystem type supported by the host operating system.
   * Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
   * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
   * </pre>
   *
   * <code>string fsType = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFsTypeBytes() {
    java.lang.Object ref = fsType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fsType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int READONLY_FIELD_NUMBER = 3;
  private boolean readOnly_;
  /**
   * <pre>
   * Optional: Defaults to false (read/write). ReadOnly here will force
   * the ReadOnly setting in VolumeMounts.
   * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
   * </pre>
   *
   * <code>bool readOnly = 3;</code>
   */
  public boolean getReadOnly() {
    return readOnly_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getVolumeIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, volumeID_);
    }
    if (!getFsTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fsType_);
    }
    if (readOnly_ != false) {
      output.writeBool(3, readOnly_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVolumeIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, volumeID_);
    }
    if (!getFsTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fsType_);
    }
    if (readOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, readOnly_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta2.CinderVolumeSource)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta2.CinderVolumeSource other = (com.appscode.api.kubernetes.v1beta2.CinderVolumeSource) obj;

    boolean result = true;
    result = result && getVolumeID()
        .equals(other.getVolumeID());
    result = result && getFsType()
        .equals(other.getFsType());
    result = result && (getReadOnly()
        == other.getReadOnly());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VOLUMEID_FIELD_NUMBER;
    hash = (53 * hash) + getVolumeID().hashCode();
    hash = (37 * hash) + FSTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getFsType().hashCode();
    hash = (37 * hash) + READONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReadOnly());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta2.CinderVolumeSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.CinderVolumeSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.CinderVolumeSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.CinderVolumeSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.CinderVolumeSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.CinderVolumeSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.CinderVolumeSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.CinderVolumeSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.CinderVolumeSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.CinderVolumeSource parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta2.CinderVolumeSource prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Represents a cinder volume resource in Openstack.
   * A Cinder volume must exist before mounting to a container.
   * The volume must also be in the same region as the kubelet.
   * Cinder volumes support ownership management and SELinux relabeling.
   * </pre>
   *
   * Protobuf type {@code appscode.kubernetes.v1beta2.CinderVolumeSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta2.CinderVolumeSource)
      com.appscode.api.kubernetes.v1beta2.CinderVolumeSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_CinderVolumeSource_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_CinderVolumeSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta2.CinderVolumeSource.class, com.appscode.api.kubernetes.v1beta2.CinderVolumeSource.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta2.CinderVolumeSource.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      volumeID_ = "";

      fsType_ = "";

      readOnly_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_CinderVolumeSource_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta2.CinderVolumeSource getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta2.CinderVolumeSource.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta2.CinderVolumeSource build() {
      com.appscode.api.kubernetes.v1beta2.CinderVolumeSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta2.CinderVolumeSource buildPartial() {
      com.appscode.api.kubernetes.v1beta2.CinderVolumeSource result = new com.appscode.api.kubernetes.v1beta2.CinderVolumeSource(this);
      result.volumeID_ = volumeID_;
      result.fsType_ = fsType_;
      result.readOnly_ = readOnly_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.appscode.api.kubernetes.v1beta2.CinderVolumeSource) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta2.CinderVolumeSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta2.CinderVolumeSource other) {
      if (other == com.appscode.api.kubernetes.v1beta2.CinderVolumeSource.getDefaultInstance()) return this;
      if (!other.getVolumeID().isEmpty()) {
        volumeID_ = other.volumeID_;
        onChanged();
      }
      if (!other.getFsType().isEmpty()) {
        fsType_ = other.fsType_;
        onChanged();
      }
      if (other.getReadOnly() != false) {
        setReadOnly(other.getReadOnly());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.appscode.api.kubernetes.v1beta2.CinderVolumeSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta2.CinderVolumeSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object volumeID_ = "";
    /**
     * <pre>
     * volume id used to identify the volume in cinder
     * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
     * </pre>
     *
     * <code>string volumeID = 1;</code>
     */
    public java.lang.String getVolumeID() {
      java.lang.Object ref = volumeID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        volumeID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * volume id used to identify the volume in cinder
     * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
     * </pre>
     *
     * <code>string volumeID = 1;</code>
     */
    public com.google.protobuf.ByteString
        getVolumeIDBytes() {
      java.lang.Object ref = volumeID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        volumeID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * volume id used to identify the volume in cinder
     * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
     * </pre>
     *
     * <code>string volumeID = 1;</code>
     */
    public Builder setVolumeID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      volumeID_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * volume id used to identify the volume in cinder
     * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
     * </pre>
     *
     * <code>string volumeID = 1;</code>
     */
    public Builder clearVolumeID() {
      
      volumeID_ = getDefaultInstance().getVolumeID();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * volume id used to identify the volume in cinder
     * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
     * </pre>
     *
     * <code>string volumeID = 1;</code>
     */
    public Builder setVolumeIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      volumeID_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fsType_ = "";
    /**
     * <pre>
     * Filesystem type to mount.
     * Must be a filesystem type supported by the host operating system.
     * Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
     * </pre>
     *
     * <code>string fsType = 2;</code>
     */
    public java.lang.String getFsType() {
      java.lang.Object ref = fsType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fsType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Filesystem type to mount.
     * Must be a filesystem type supported by the host operating system.
     * Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
     * </pre>
     *
     * <code>string fsType = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFsTypeBytes() {
      java.lang.Object ref = fsType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fsType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Filesystem type to mount.
     * Must be a filesystem type supported by the host operating system.
     * Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
     * </pre>
     *
     * <code>string fsType = 2;</code>
     */
    public Builder setFsType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fsType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Filesystem type to mount.
     * Must be a filesystem type supported by the host operating system.
     * Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
     * </pre>
     *
     * <code>string fsType = 2;</code>
     */
    public Builder clearFsType() {
      
      fsType_ = getDefaultInstance().getFsType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Filesystem type to mount.
     * Must be a filesystem type supported by the host operating system.
     * Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
     * </pre>
     *
     * <code>string fsType = 2;</code>
     */
    public Builder setFsTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fsType_ = value;
      onChanged();
      return this;
    }

    private boolean readOnly_ ;
    /**
     * <pre>
     * Optional: Defaults to false (read/write). ReadOnly here will force
     * the ReadOnly setting in VolumeMounts.
     * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
     * </pre>
     *
     * <code>bool readOnly = 3;</code>
     */
    public boolean getReadOnly() {
      return readOnly_;
    }
    /**
     * <pre>
     * Optional: Defaults to false (read/write). ReadOnly here will force
     * the ReadOnly setting in VolumeMounts.
     * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
     * </pre>
     *
     * <code>bool readOnly = 3;</code>
     */
    public Builder setReadOnly(boolean value) {
      
      readOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional: Defaults to false (read/write). ReadOnly here will force
     * the ReadOnly setting in VolumeMounts.
     * More info: http://releases.k8s.io/release-1.4/examples/mysql-cinder-pd/README.md
     * </pre>
     *
     * <code>bool readOnly = 3;</code>
     */
    public Builder clearReadOnly() {
      
      readOnly_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta2.CinderVolumeSource)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta2.CinderVolumeSource)
  private static final com.appscode.api.kubernetes.v1beta2.CinderVolumeSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta2.CinderVolumeSource();
  }

  public static com.appscode.api.kubernetes.v1beta2.CinderVolumeSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CinderVolumeSource>
      PARSER = new com.google.protobuf.AbstractParser<CinderVolumeSource>() {
    public CinderVolumeSource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CinderVolumeSource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CinderVolumeSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CinderVolumeSource> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta2.CinderVolumeSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

