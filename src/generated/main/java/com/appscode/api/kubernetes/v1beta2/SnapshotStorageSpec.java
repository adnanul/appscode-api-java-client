// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

/**
 * Protobuf type {@code appscode.kubernetes.v1beta2.SnapshotStorageSpec}
 */
public  final class SnapshotStorageSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta2.SnapshotStorageSpec)
    SnapshotStorageSpecOrBuilder {
  // Use SnapshotStorageSpec.newBuilder() to construct.
  private SnapshotStorageSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SnapshotStorageSpec() {
    bucketName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SnapshotStorageSpec(
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
            com.appscode.api.kubernetes.v1beta2.SecretVolumeSource.Builder subBuilder = null;
            if (storageSecret_ != null) {
              subBuilder = storageSecret_.toBuilder();
            }
            storageSecret_ = input.readMessage(com.appscode.api.kubernetes.v1beta2.SecretVolumeSource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(storageSecret_);
              storageSecret_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            bucketName_ = s;
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
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_SnapshotStorageSpec_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_SnapshotStorageSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec.class, com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec.Builder.class);
  }

  public static final int STORAGE_SECRET_FIELD_NUMBER = 1;
  private com.appscode.api.kubernetes.v1beta2.SecretVolumeSource storageSecret_;
  /**
   * <code>.appscode.kubernetes.v1beta2.SecretVolumeSource storage_secret = 1;</code>
   */
  public boolean hasStorageSecret() {
    return storageSecret_ != null;
  }
  /**
   * <code>.appscode.kubernetes.v1beta2.SecretVolumeSource storage_secret = 1;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.SecretVolumeSource getStorageSecret() {
    return storageSecret_ == null ? com.appscode.api.kubernetes.v1beta2.SecretVolumeSource.getDefaultInstance() : storageSecret_;
  }
  /**
   * <code>.appscode.kubernetes.v1beta2.SecretVolumeSource storage_secret = 1;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.SecretVolumeSourceOrBuilder getStorageSecretOrBuilder() {
    return getStorageSecret();
  }

  public static final int BUCKET_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object bucketName_;
  /**
   * <code>string bucket_name = 2;</code>
   */
  public java.lang.String getBucketName() {
    java.lang.Object ref = bucketName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bucketName_ = s;
      return s;
    }
  }
  /**
   * <code>string bucket_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getBucketNameBytes() {
    java.lang.Object ref = bucketName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bucketName_ = b;
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
    if (storageSecret_ != null) {
      output.writeMessage(1, getStorageSecret());
    }
    if (!getBucketNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, bucketName_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (storageSecret_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStorageSecret());
    }
    if (!getBucketNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, bucketName_);
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec other = (com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec) obj;

    boolean result = true;
    result = result && (hasStorageSecret() == other.hasStorageSecret());
    if (hasStorageSecret()) {
      result = result && getStorageSecret()
          .equals(other.getStorageSecret());
    }
    result = result && getBucketName()
        .equals(other.getBucketName());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasStorageSecret()) {
      hash = (37 * hash) + STORAGE_SECRET_FIELD_NUMBER;
      hash = (53 * hash) + getStorageSecret().hashCode();
    }
    hash = (37 * hash) + BUCKET_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getBucketName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec prototype) {
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
   * Protobuf type {@code appscode.kubernetes.v1beta2.SnapshotStorageSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta2.SnapshotStorageSpec)
      com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_SnapshotStorageSpec_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_SnapshotStorageSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec.class, com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec.newBuilder()
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
      if (storageSecretBuilder_ == null) {
        storageSecret_ = null;
      } else {
        storageSecret_ = null;
        storageSecretBuilder_ = null;
      }
      bucketName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_SnapshotStorageSpec_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec build() {
      com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec buildPartial() {
      com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec result = new com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec(this);
      if (storageSecretBuilder_ == null) {
        result.storageSecret_ = storageSecret_;
      } else {
        result.storageSecret_ = storageSecretBuilder_.build();
      }
      result.bucketName_ = bucketName_;
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
      if (other instanceof com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec other) {
      if (other == com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec.getDefaultInstance()) return this;
      if (other.hasStorageSecret()) {
        mergeStorageSecret(other.getStorageSecret());
      }
      if (!other.getBucketName().isEmpty()) {
        bucketName_ = other.bucketName_;
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
      com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appscode.api.kubernetes.v1beta2.SecretVolumeSource storageSecret_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.SecretVolumeSource, com.appscode.api.kubernetes.v1beta2.SecretVolumeSource.Builder, com.appscode.api.kubernetes.v1beta2.SecretVolumeSourceOrBuilder> storageSecretBuilder_;
    /**
     * <code>.appscode.kubernetes.v1beta2.SecretVolumeSource storage_secret = 1;</code>
     */
    public boolean hasStorageSecret() {
      return storageSecretBuilder_ != null || storageSecret_ != null;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.SecretVolumeSource storage_secret = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.SecretVolumeSource getStorageSecret() {
      if (storageSecretBuilder_ == null) {
        return storageSecret_ == null ? com.appscode.api.kubernetes.v1beta2.SecretVolumeSource.getDefaultInstance() : storageSecret_;
      } else {
        return storageSecretBuilder_.getMessage();
      }
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.SecretVolumeSource storage_secret = 1;</code>
     */
    public Builder setStorageSecret(com.appscode.api.kubernetes.v1beta2.SecretVolumeSource value) {
      if (storageSecretBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        storageSecret_ = value;
        onChanged();
      } else {
        storageSecretBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.SecretVolumeSource storage_secret = 1;</code>
     */
    public Builder setStorageSecret(
        com.appscode.api.kubernetes.v1beta2.SecretVolumeSource.Builder builderForValue) {
      if (storageSecretBuilder_ == null) {
        storageSecret_ = builderForValue.build();
        onChanged();
      } else {
        storageSecretBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.SecretVolumeSource storage_secret = 1;</code>
     */
    public Builder mergeStorageSecret(com.appscode.api.kubernetes.v1beta2.SecretVolumeSource value) {
      if (storageSecretBuilder_ == null) {
        if (storageSecret_ != null) {
          storageSecret_ =
            com.appscode.api.kubernetes.v1beta2.SecretVolumeSource.newBuilder(storageSecret_).mergeFrom(value).buildPartial();
        } else {
          storageSecret_ = value;
        }
        onChanged();
      } else {
        storageSecretBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.SecretVolumeSource storage_secret = 1;</code>
     */
    public Builder clearStorageSecret() {
      if (storageSecretBuilder_ == null) {
        storageSecret_ = null;
        onChanged();
      } else {
        storageSecret_ = null;
        storageSecretBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.SecretVolumeSource storage_secret = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.SecretVolumeSource.Builder getStorageSecretBuilder() {
      
      onChanged();
      return getStorageSecretFieldBuilder().getBuilder();
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.SecretVolumeSource storage_secret = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.SecretVolumeSourceOrBuilder getStorageSecretOrBuilder() {
      if (storageSecretBuilder_ != null) {
        return storageSecretBuilder_.getMessageOrBuilder();
      } else {
        return storageSecret_ == null ?
            com.appscode.api.kubernetes.v1beta2.SecretVolumeSource.getDefaultInstance() : storageSecret_;
      }
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.SecretVolumeSource storage_secret = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.SecretVolumeSource, com.appscode.api.kubernetes.v1beta2.SecretVolumeSource.Builder, com.appscode.api.kubernetes.v1beta2.SecretVolumeSourceOrBuilder> 
        getStorageSecretFieldBuilder() {
      if (storageSecretBuilder_ == null) {
        storageSecretBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.kubernetes.v1beta2.SecretVolumeSource, com.appscode.api.kubernetes.v1beta2.SecretVolumeSource.Builder, com.appscode.api.kubernetes.v1beta2.SecretVolumeSourceOrBuilder>(
                getStorageSecret(),
                getParentForChildren(),
                isClean());
        storageSecret_ = null;
      }
      return storageSecretBuilder_;
    }

    private java.lang.Object bucketName_ = "";
    /**
     * <code>string bucket_name = 2;</code>
     */
    public java.lang.String getBucketName() {
      java.lang.Object ref = bucketName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bucketName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bucket_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBucketNameBytes() {
      java.lang.Object ref = bucketName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bucketName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bucket_name = 2;</code>
     */
    public Builder setBucketName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bucketName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string bucket_name = 2;</code>
     */
    public Builder clearBucketName() {
      
      bucketName_ = getDefaultInstance().getBucketName();
      onChanged();
      return this;
    }
    /**
     * <code>string bucket_name = 2;</code>
     */
    public Builder setBucketNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bucketName_ = value;
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


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta2.SnapshotStorageSpec)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta2.SnapshotStorageSpec)
  private static final com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec();
  }

  public static com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SnapshotStorageSpec>
      PARSER = new com.google.protobuf.AbstractParser<SnapshotStorageSpec>() {
    public SnapshotStorageSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SnapshotStorageSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SnapshotStorageSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SnapshotStorageSpec> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta2.SnapshotStorageSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
