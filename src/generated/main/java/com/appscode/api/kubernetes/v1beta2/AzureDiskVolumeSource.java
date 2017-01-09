// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

/**
 * <pre>
 * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
 * </pre>
 *
 * Protobuf type {@code appscode.kubernetes.v1beta2.AzureDiskVolumeSource}
 */
public  final class AzureDiskVolumeSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta2.AzureDiskVolumeSource)
    AzureDiskVolumeSourceOrBuilder {
  // Use AzureDiskVolumeSource.newBuilder() to construct.
  private AzureDiskVolumeSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AzureDiskVolumeSource() {
    diskName_ = "";
    diskURI_ = "";
    cachingMode_ = "";
    fsType_ = "";
    readOnly_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AzureDiskVolumeSource(
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

            diskName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            diskURI_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            cachingMode_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            fsType_ = s;
            break;
          }
          case 40: {

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
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_AzureDiskVolumeSource_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_AzureDiskVolumeSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource.class, com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource.Builder.class);
  }

  public static final int DISKNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object diskName_;
  /**
   * <pre>
   * The Name of the data disk in the blob storage
   * </pre>
   *
   * <code>optional string diskName = 1;</code>
   */
  public java.lang.String getDiskName() {
    java.lang.Object ref = diskName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      diskName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Name of the data disk in the blob storage
   * </pre>
   *
   * <code>optional string diskName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDiskNameBytes() {
    java.lang.Object ref = diskName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      diskName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISKURI_FIELD_NUMBER = 2;
  private volatile java.lang.Object diskURI_;
  /**
   * <pre>
   * The URI the data disk in the blob storage
   * </pre>
   *
   * <code>optional string diskURI = 2;</code>
   */
  public java.lang.String getDiskURI() {
    java.lang.Object ref = diskURI_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      diskURI_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The URI the data disk in the blob storage
   * </pre>
   *
   * <code>optional string diskURI = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDiskURIBytes() {
    java.lang.Object ref = diskURI_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      diskURI_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CACHINGMODE_FIELD_NUMBER = 3;
  private volatile java.lang.Object cachingMode_;
  /**
   * <pre>
   * Host Caching mode: None, Read Only, Read Write.
   * </pre>
   *
   * <code>optional string cachingMode = 3;</code>
   */
  public java.lang.String getCachingMode() {
    java.lang.Object ref = cachingMode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cachingMode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Host Caching mode: None, Read Only, Read Write.
   * </pre>
   *
   * <code>optional string cachingMode = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCachingModeBytes() {
    java.lang.Object ref = cachingMode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cachingMode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FSTYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object fsType_;
  /**
   * <pre>
   * Filesystem type to mount.
   * Must be a filesystem type supported by the host operating system.
   * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
   * </pre>
   *
   * <code>optional string fsType = 4;</code>
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
   * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
   * </pre>
   *
   * <code>optional string fsType = 4;</code>
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

  public static final int READONLY_FIELD_NUMBER = 5;
  private boolean readOnly_;
  /**
   * <pre>
   * Defaults to false (read/write). ReadOnly here will force
   * the ReadOnly setting in VolumeMounts.
   * </pre>
   *
   * <code>optional bool readOnly = 5;</code>
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
    if (!getDiskNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, diskName_);
    }
    if (!getDiskURIBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, diskURI_);
    }
    if (!getCachingModeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, cachingMode_);
    }
    if (!getFsTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, fsType_);
    }
    if (readOnly_ != false) {
      output.writeBool(5, readOnly_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDiskNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, diskName_);
    }
    if (!getDiskURIBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, diskURI_);
    }
    if (!getCachingModeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, cachingMode_);
    }
    if (!getFsTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, fsType_);
    }
    if (readOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, readOnly_);
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource other = (com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource) obj;

    boolean result = true;
    result = result && getDiskName()
        .equals(other.getDiskName());
    result = result && getDiskURI()
        .equals(other.getDiskURI());
    result = result && getCachingMode()
        .equals(other.getCachingMode());
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
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + DISKNAME_FIELD_NUMBER;
    hash = (53 * hash) + getDiskName().hashCode();
    hash = (37 * hash) + DISKURI_FIELD_NUMBER;
    hash = (53 * hash) + getDiskURI().hashCode();
    hash = (37 * hash) + CACHINGMODE_FIELD_NUMBER;
    hash = (53 * hash) + getCachingMode().hashCode();
    hash = (37 * hash) + FSTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getFsType().hashCode();
    hash = (37 * hash) + READONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReadOnly());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource prototype) {
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
   * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
   * </pre>
   *
   * Protobuf type {@code appscode.kubernetes.v1beta2.AzureDiskVolumeSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta2.AzureDiskVolumeSource)
      com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_AzureDiskVolumeSource_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_AzureDiskVolumeSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource.class, com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource.newBuilder()
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
      diskName_ = "";

      diskURI_ = "";

      cachingMode_ = "";

      fsType_ = "";

      readOnly_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_AzureDiskVolumeSource_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource build() {
      com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource buildPartial() {
      com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource result = new com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource(this);
      result.diskName_ = diskName_;
      result.diskURI_ = diskURI_;
      result.cachingMode_ = cachingMode_;
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
      if (other instanceof com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource other) {
      if (other == com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource.getDefaultInstance()) return this;
      if (!other.getDiskName().isEmpty()) {
        diskName_ = other.diskName_;
        onChanged();
      }
      if (!other.getDiskURI().isEmpty()) {
        diskURI_ = other.diskURI_;
        onChanged();
      }
      if (!other.getCachingMode().isEmpty()) {
        cachingMode_ = other.cachingMode_;
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
      com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object diskName_ = "";
    /**
     * <pre>
     * The Name of the data disk in the blob storage
     * </pre>
     *
     * <code>optional string diskName = 1;</code>
     */
    public java.lang.String getDiskName() {
      java.lang.Object ref = diskName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        diskName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Name of the data disk in the blob storage
     * </pre>
     *
     * <code>optional string diskName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDiskNameBytes() {
      java.lang.Object ref = diskName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        diskName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Name of the data disk in the blob storage
     * </pre>
     *
     * <code>optional string diskName = 1;</code>
     */
    public Builder setDiskName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      diskName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Name of the data disk in the blob storage
     * </pre>
     *
     * <code>optional string diskName = 1;</code>
     */
    public Builder clearDiskName() {
      
      diskName_ = getDefaultInstance().getDiskName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Name of the data disk in the blob storage
     * </pre>
     *
     * <code>optional string diskName = 1;</code>
     */
    public Builder setDiskNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      diskName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object diskURI_ = "";
    /**
     * <pre>
     * The URI the data disk in the blob storage
     * </pre>
     *
     * <code>optional string diskURI = 2;</code>
     */
    public java.lang.String getDiskURI() {
      java.lang.Object ref = diskURI_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        diskURI_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The URI the data disk in the blob storage
     * </pre>
     *
     * <code>optional string diskURI = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDiskURIBytes() {
      java.lang.Object ref = diskURI_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        diskURI_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The URI the data disk in the blob storage
     * </pre>
     *
     * <code>optional string diskURI = 2;</code>
     */
    public Builder setDiskURI(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      diskURI_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URI the data disk in the blob storage
     * </pre>
     *
     * <code>optional string diskURI = 2;</code>
     */
    public Builder clearDiskURI() {
      
      diskURI_ = getDefaultInstance().getDiskURI();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URI the data disk in the blob storage
     * </pre>
     *
     * <code>optional string diskURI = 2;</code>
     */
    public Builder setDiskURIBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      diskURI_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cachingMode_ = "";
    /**
     * <pre>
     * Host Caching mode: None, Read Only, Read Write.
     * </pre>
     *
     * <code>optional string cachingMode = 3;</code>
     */
    public java.lang.String getCachingMode() {
      java.lang.Object ref = cachingMode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cachingMode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Host Caching mode: None, Read Only, Read Write.
     * </pre>
     *
     * <code>optional string cachingMode = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCachingModeBytes() {
      java.lang.Object ref = cachingMode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cachingMode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Host Caching mode: None, Read Only, Read Write.
     * </pre>
     *
     * <code>optional string cachingMode = 3;</code>
     */
    public Builder setCachingMode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cachingMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Host Caching mode: None, Read Only, Read Write.
     * </pre>
     *
     * <code>optional string cachingMode = 3;</code>
     */
    public Builder clearCachingMode() {
      
      cachingMode_ = getDefaultInstance().getCachingMode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Host Caching mode: None, Read Only, Read Write.
     * </pre>
     *
     * <code>optional string cachingMode = 3;</code>
     */
    public Builder setCachingModeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cachingMode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fsType_ = "";
    /**
     * <pre>
     * Filesystem type to mount.
     * Must be a filesystem type supported by the host operating system.
     * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * </pre>
     *
     * <code>optional string fsType = 4;</code>
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
     * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * </pre>
     *
     * <code>optional string fsType = 4;</code>
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
     * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * </pre>
     *
     * <code>optional string fsType = 4;</code>
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
     * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * </pre>
     *
     * <code>optional string fsType = 4;</code>
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
     * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * </pre>
     *
     * <code>optional string fsType = 4;</code>
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
     * Defaults to false (read/write). ReadOnly here will force
     * the ReadOnly setting in VolumeMounts.
     * </pre>
     *
     * <code>optional bool readOnly = 5;</code>
     */
    public boolean getReadOnly() {
      return readOnly_;
    }
    /**
     * <pre>
     * Defaults to false (read/write). ReadOnly here will force
     * the ReadOnly setting in VolumeMounts.
     * </pre>
     *
     * <code>optional bool readOnly = 5;</code>
     */
    public Builder setReadOnly(boolean value) {
      
      readOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Defaults to false (read/write). ReadOnly here will force
     * the ReadOnly setting in VolumeMounts.
     * </pre>
     *
     * <code>optional bool readOnly = 5;</code>
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


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta2.AzureDiskVolumeSource)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta2.AzureDiskVolumeSource)
  private static final com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource();
  }

  public static com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AzureDiskVolumeSource>
      PARSER = new com.google.protobuf.AbstractParser<AzureDiskVolumeSource>() {
    public AzureDiskVolumeSource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AzureDiskVolumeSource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AzureDiskVolumeSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AzureDiskVolumeSource> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta2.AzureDiskVolumeSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
