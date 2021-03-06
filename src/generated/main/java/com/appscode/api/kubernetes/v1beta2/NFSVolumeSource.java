// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

/**
 * <pre>
 * Represents an NFS mount that lasts the lifetime of a pod.
 * NFS volumes do not support ownership management or SELinux relabeling.
 * </pre>
 *
 * Protobuf type {@code appscode.kubernetes.v1beta2.NFSVolumeSource}
 */
public  final class NFSVolumeSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta2.NFSVolumeSource)
    NFSVolumeSourceOrBuilder {
  // Use NFSVolumeSource.newBuilder() to construct.
  private NFSVolumeSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NFSVolumeSource() {
    server_ = "";
    path_ = "";
    readOnly_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private NFSVolumeSource(
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

            server_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            path_ = s;
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
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_NFSVolumeSource_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_NFSVolumeSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta2.NFSVolumeSource.class, com.appscode.api.kubernetes.v1beta2.NFSVolumeSource.Builder.class);
  }

  public static final int SERVER_FIELD_NUMBER = 1;
  private volatile java.lang.Object server_;
  /**
   * <pre>
   * Server is the hostname or IP address of the NFS server.
   * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
   * </pre>
   *
   * <code>string server = 1;</code>
   */
  public java.lang.String getServer() {
    java.lang.Object ref = server_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      server_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Server is the hostname or IP address of the NFS server.
   * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
   * </pre>
   *
   * <code>string server = 1;</code>
   */
  public com.google.protobuf.ByteString
      getServerBytes() {
    java.lang.Object ref = server_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      server_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object path_;
  /**
   * <pre>
   * Path that is exported by the NFS server.
   * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
   * </pre>
   *
   * <code>string path = 2;</code>
   */
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Path that is exported by the NFS server.
   * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
   * </pre>
   *
   * <code>string path = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int READONLY_FIELD_NUMBER = 3;
  private boolean readOnly_;
  /**
   * <pre>
   * ReadOnly here will force
   * the NFS export to be mounted with read-only permissions.
   * Defaults to false.
   * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
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
    if (!getServerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, server_);
    }
    if (!getPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
    }
    if (readOnly_ != false) {
      output.writeBool(3, readOnly_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getServerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, server_);
    }
    if (!getPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta2.NFSVolumeSource)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta2.NFSVolumeSource other = (com.appscode.api.kubernetes.v1beta2.NFSVolumeSource) obj;

    boolean result = true;
    result = result && getServer()
        .equals(other.getServer());
    result = result && getPath()
        .equals(other.getPath());
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
    hash = (37 * hash) + SERVER_FIELD_NUMBER;
    hash = (53 * hash) + getServer().hashCode();
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (37 * hash) + READONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReadOnly());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta2.NFSVolumeSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.NFSVolumeSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.NFSVolumeSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.NFSVolumeSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.NFSVolumeSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.NFSVolumeSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.NFSVolumeSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.NFSVolumeSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.NFSVolumeSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.NFSVolumeSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.NFSVolumeSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.NFSVolumeSource parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta2.NFSVolumeSource prototype) {
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
   * Represents an NFS mount that lasts the lifetime of a pod.
   * NFS volumes do not support ownership management or SELinux relabeling.
   * </pre>
   *
   * Protobuf type {@code appscode.kubernetes.v1beta2.NFSVolumeSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta2.NFSVolumeSource)
      com.appscode.api.kubernetes.v1beta2.NFSVolumeSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_NFSVolumeSource_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_NFSVolumeSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta2.NFSVolumeSource.class, com.appscode.api.kubernetes.v1beta2.NFSVolumeSource.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta2.NFSVolumeSource.newBuilder()
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
      server_ = "";

      path_ = "";

      readOnly_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_NFSVolumeSource_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta2.NFSVolumeSource getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta2.NFSVolumeSource.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta2.NFSVolumeSource build() {
      com.appscode.api.kubernetes.v1beta2.NFSVolumeSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta2.NFSVolumeSource buildPartial() {
      com.appscode.api.kubernetes.v1beta2.NFSVolumeSource result = new com.appscode.api.kubernetes.v1beta2.NFSVolumeSource(this);
      result.server_ = server_;
      result.path_ = path_;
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
      if (other instanceof com.appscode.api.kubernetes.v1beta2.NFSVolumeSource) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta2.NFSVolumeSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta2.NFSVolumeSource other) {
      if (other == com.appscode.api.kubernetes.v1beta2.NFSVolumeSource.getDefaultInstance()) return this;
      if (!other.getServer().isEmpty()) {
        server_ = other.server_;
        onChanged();
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
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
      com.appscode.api.kubernetes.v1beta2.NFSVolumeSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta2.NFSVolumeSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object server_ = "";
    /**
     * <pre>
     * Server is the hostname or IP address of the NFS server.
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
     * </pre>
     *
     * <code>string server = 1;</code>
     */
    public java.lang.String getServer() {
      java.lang.Object ref = server_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        server_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Server is the hostname or IP address of the NFS server.
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
     * </pre>
     *
     * <code>string server = 1;</code>
     */
    public com.google.protobuf.ByteString
        getServerBytes() {
      java.lang.Object ref = server_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        server_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Server is the hostname or IP address of the NFS server.
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
     * </pre>
     *
     * <code>string server = 1;</code>
     */
    public Builder setServer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      server_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Server is the hostname or IP address of the NFS server.
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
     * </pre>
     *
     * <code>string server = 1;</code>
     */
    public Builder clearServer() {
      
      server_ = getDefaultInstance().getServer();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Server is the hostname or IP address of the NFS server.
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
     * </pre>
     *
     * <code>string server = 1;</code>
     */
    public Builder setServerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      server_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <pre>
     * Path that is exported by the NFS server.
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
     * </pre>
     *
     * <code>string path = 2;</code>
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Path that is exported by the NFS server.
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
     * </pre>
     *
     * <code>string path = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Path that is exported by the NFS server.
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
     * </pre>
     *
     * <code>string path = 2;</code>
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path that is exported by the NFS server.
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
     * </pre>
     *
     * <code>string path = 2;</code>
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path that is exported by the NFS server.
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
     * </pre>
     *
     * <code>string path = 2;</code>
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      path_ = value;
      onChanged();
      return this;
    }

    private boolean readOnly_ ;
    /**
     * <pre>
     * ReadOnly here will force
     * the NFS export to be mounted with read-only permissions.
     * Defaults to false.
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
     * </pre>
     *
     * <code>bool readOnly = 3;</code>
     */
    public boolean getReadOnly() {
      return readOnly_;
    }
    /**
     * <pre>
     * ReadOnly here will force
     * the NFS export to be mounted with read-only permissions.
     * Defaults to false.
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
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
     * ReadOnly here will force
     * the NFS export to be mounted with read-only permissions.
     * Defaults to false.
     * More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs
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


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta2.NFSVolumeSource)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta2.NFSVolumeSource)
  private static final com.appscode.api.kubernetes.v1beta2.NFSVolumeSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta2.NFSVolumeSource();
  }

  public static com.appscode.api.kubernetes.v1beta2.NFSVolumeSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NFSVolumeSource>
      PARSER = new com.google.protobuf.AbstractParser<NFSVolumeSource>() {
    public NFSVolumeSource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new NFSVolumeSource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NFSVolumeSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NFSVolumeSource> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta2.NFSVolumeSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

