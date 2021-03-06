// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

/**
 * <pre>
 * Represents an empty directory for a pod.
 * Empty directory volumes support ownership management and SELinux relabeling.
 * </pre>
 *
 * Protobuf type {@code appscode.kubernetes.v1beta2.EmptyDirVolumeSource}
 */
public  final class EmptyDirVolumeSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta2.EmptyDirVolumeSource)
    EmptyDirVolumeSourceOrBuilder {
  // Use EmptyDirVolumeSource.newBuilder() to construct.
  private EmptyDirVolumeSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmptyDirVolumeSource() {
    medium_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EmptyDirVolumeSource(
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

            medium_ = s;
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
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_EmptyDirVolumeSource_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_EmptyDirVolumeSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource.class, com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource.Builder.class);
  }

  public static final int MEDIUM_FIELD_NUMBER = 1;
  private volatile java.lang.Object medium_;
  /**
   * <pre>
   * What type of storage medium should back this directory.
   * The default is "" which means to use the node's default medium.
   * Must be an empty string (default) or Memory.
   * More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
   * </pre>
   *
   * <code>string medium = 1;</code>
   */
  public java.lang.String getMedium() {
    java.lang.Object ref = medium_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      medium_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * What type of storage medium should back this directory.
   * The default is "" which means to use the node's default medium.
   * Must be an empty string (default) or Memory.
   * More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
   * </pre>
   *
   * <code>string medium = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMediumBytes() {
    java.lang.Object ref = medium_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      medium_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getMediumBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, medium_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMediumBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, medium_);
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource other = (com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource) obj;

    boolean result = true;
    result = result && getMedium()
        .equals(other.getMedium());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MEDIUM_FIELD_NUMBER;
    hash = (53 * hash) + getMedium().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource prototype) {
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
   * Represents an empty directory for a pod.
   * Empty directory volumes support ownership management and SELinux relabeling.
   * </pre>
   *
   * Protobuf type {@code appscode.kubernetes.v1beta2.EmptyDirVolumeSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta2.EmptyDirVolumeSource)
      com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_EmptyDirVolumeSource_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_EmptyDirVolumeSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource.class, com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource.newBuilder()
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
      medium_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_EmptyDirVolumeSource_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource build() {
      com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource buildPartial() {
      com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource result = new com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource(this);
      result.medium_ = medium_;
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
      if (other instanceof com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource other) {
      if (other == com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource.getDefaultInstance()) return this;
      if (!other.getMedium().isEmpty()) {
        medium_ = other.medium_;
        onChanged();
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
      com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object medium_ = "";
    /**
     * <pre>
     * What type of storage medium should back this directory.
     * The default is "" which means to use the node's default medium.
     * Must be an empty string (default) or Memory.
     * More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
     * </pre>
     *
     * <code>string medium = 1;</code>
     */
    public java.lang.String getMedium() {
      java.lang.Object ref = medium_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        medium_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * What type of storage medium should back this directory.
     * The default is "" which means to use the node's default medium.
     * Must be an empty string (default) or Memory.
     * More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
     * </pre>
     *
     * <code>string medium = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMediumBytes() {
      java.lang.Object ref = medium_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        medium_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * What type of storage medium should back this directory.
     * The default is "" which means to use the node's default medium.
     * Must be an empty string (default) or Memory.
     * More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
     * </pre>
     *
     * <code>string medium = 1;</code>
     */
    public Builder setMedium(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      medium_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * What type of storage medium should back this directory.
     * The default is "" which means to use the node's default medium.
     * Must be an empty string (default) or Memory.
     * More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
     * </pre>
     *
     * <code>string medium = 1;</code>
     */
    public Builder clearMedium() {
      
      medium_ = getDefaultInstance().getMedium();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * What type of storage medium should back this directory.
     * The default is "" which means to use the node's default medium.
     * Must be an empty string (default) or Memory.
     * More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
     * </pre>
     *
     * <code>string medium = 1;</code>
     */
    public Builder setMediumBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      medium_ = value;
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


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta2.EmptyDirVolumeSource)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta2.EmptyDirVolumeSource)
  private static final com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource();
  }

  public static com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmptyDirVolumeSource>
      PARSER = new com.google.protobuf.AbstractParser<EmptyDirVolumeSource>() {
    public EmptyDirVolumeSource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EmptyDirVolumeSource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EmptyDirVolumeSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmptyDirVolumeSource> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta2.EmptyDirVolumeSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

