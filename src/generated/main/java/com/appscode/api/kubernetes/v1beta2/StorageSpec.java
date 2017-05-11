// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

/**
 * Protobuf type {@code appscode.kubernetes.v1beta2.StorageSpec}
 */
public  final class StorageSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta2.StorageSpec)
    StorageSpecOrBuilder {
  // Use StorageSpec.newBuilder() to construct.
  private StorageSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StorageSpec() {
    class__ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private StorageSpec(
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

            class__ = s;
            break;
          }
          case 18: {
            com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec.Builder subBuilder = null;
            if (persistentVolumeClaimSpec_ != null) {
              subBuilder = persistentVolumeClaimSpec_.toBuilder();
            }
            persistentVolumeClaimSpec_ = input.readMessage(com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(persistentVolumeClaimSpec_);
              persistentVolumeClaimSpec_ = subBuilder.buildPartial();
            }

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
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_StorageSpec_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_StorageSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta2.StorageSpec.class, com.appscode.api.kubernetes.v1beta2.StorageSpec.Builder.class);
  }

  public static final int CLASS_FIELD_NUMBER = 1;
  private volatile java.lang.Object class__;
  /**
   * <code>string class = 1;</code>
   */
  public java.lang.String getClass_() {
    java.lang.Object ref = class__;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      class__ = s;
      return s;
    }
  }
  /**
   * <code>string class = 1;</code>
   */
  public com.google.protobuf.ByteString
      getClass_Bytes() {
    java.lang.Object ref = class__;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      class__ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERSISTENT_VOLUME_CLAIM_SPEC_FIELD_NUMBER = 2;
  private com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec persistentVolumeClaimSpec_;
  /**
   * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaimSpec persistent_volume_claim_spec = 2;</code>
   */
  public boolean hasPersistentVolumeClaimSpec() {
    return persistentVolumeClaimSpec_ != null;
  }
  /**
   * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaimSpec persistent_volume_claim_spec = 2;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec getPersistentVolumeClaimSpec() {
    return persistentVolumeClaimSpec_ == null ? com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec.getDefaultInstance() : persistentVolumeClaimSpec_;
  }
  /**
   * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaimSpec persistent_volume_claim_spec = 2;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpecOrBuilder getPersistentVolumeClaimSpecOrBuilder() {
    return getPersistentVolumeClaimSpec();
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
    if (!getClass_Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, class__);
    }
    if (persistentVolumeClaimSpec_ != null) {
      output.writeMessage(2, getPersistentVolumeClaimSpec());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getClass_Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, class__);
    }
    if (persistentVolumeClaimSpec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPersistentVolumeClaimSpec());
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta2.StorageSpec)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta2.StorageSpec other = (com.appscode.api.kubernetes.v1beta2.StorageSpec) obj;

    boolean result = true;
    result = result && getClass_()
        .equals(other.getClass_());
    result = result && (hasPersistentVolumeClaimSpec() == other.hasPersistentVolumeClaimSpec());
    if (hasPersistentVolumeClaimSpec()) {
      result = result && getPersistentVolumeClaimSpec()
          .equals(other.getPersistentVolumeClaimSpec());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CLASS_FIELD_NUMBER;
    hash = (53 * hash) + getClass_().hashCode();
    if (hasPersistentVolumeClaimSpec()) {
      hash = (37 * hash) + PERSISTENT_VOLUME_CLAIM_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getPersistentVolumeClaimSpec().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta2.StorageSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.StorageSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.StorageSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.StorageSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.StorageSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.StorageSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.StorageSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.StorageSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.StorageSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.StorageSpec parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta2.StorageSpec prototype) {
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
   * Protobuf type {@code appscode.kubernetes.v1beta2.StorageSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta2.StorageSpec)
      com.appscode.api.kubernetes.v1beta2.StorageSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_StorageSpec_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_StorageSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta2.StorageSpec.class, com.appscode.api.kubernetes.v1beta2.StorageSpec.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta2.StorageSpec.newBuilder()
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
      class__ = "";

      if (persistentVolumeClaimSpecBuilder_ == null) {
        persistentVolumeClaimSpec_ = null;
      } else {
        persistentVolumeClaimSpec_ = null;
        persistentVolumeClaimSpecBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_StorageSpec_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta2.StorageSpec getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta2.StorageSpec.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta2.StorageSpec build() {
      com.appscode.api.kubernetes.v1beta2.StorageSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta2.StorageSpec buildPartial() {
      com.appscode.api.kubernetes.v1beta2.StorageSpec result = new com.appscode.api.kubernetes.v1beta2.StorageSpec(this);
      result.class__ = class__;
      if (persistentVolumeClaimSpecBuilder_ == null) {
        result.persistentVolumeClaimSpec_ = persistentVolumeClaimSpec_;
      } else {
        result.persistentVolumeClaimSpec_ = persistentVolumeClaimSpecBuilder_.build();
      }
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
      if (other instanceof com.appscode.api.kubernetes.v1beta2.StorageSpec) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta2.StorageSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta2.StorageSpec other) {
      if (other == com.appscode.api.kubernetes.v1beta2.StorageSpec.getDefaultInstance()) return this;
      if (!other.getClass_().isEmpty()) {
        class__ = other.class__;
        onChanged();
      }
      if (other.hasPersistentVolumeClaimSpec()) {
        mergePersistentVolumeClaimSpec(other.getPersistentVolumeClaimSpec());
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
      com.appscode.api.kubernetes.v1beta2.StorageSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta2.StorageSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object class__ = "";
    /**
     * <code>string class = 1;</code>
     */
    public java.lang.String getClass_() {
      java.lang.Object ref = class__;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        class__ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string class = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClass_Bytes() {
      java.lang.Object ref = class__;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        class__ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string class = 1;</code>
     */
    public Builder setClass_(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      class__ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string class = 1;</code>
     */
    public Builder clearClass_() {
      
      class__ = getDefaultInstance().getClass_();
      onChanged();
      return this;
    }
    /**
     * <code>string class = 1;</code>
     */
    public Builder setClass_Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      class__ = value;
      onChanged();
      return this;
    }

    private com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec persistentVolumeClaimSpec_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec, com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec.Builder, com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpecOrBuilder> persistentVolumeClaimSpecBuilder_;
    /**
     * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaimSpec persistent_volume_claim_spec = 2;</code>
     */
    public boolean hasPersistentVolumeClaimSpec() {
      return persistentVolumeClaimSpecBuilder_ != null || persistentVolumeClaimSpec_ != null;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaimSpec persistent_volume_claim_spec = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec getPersistentVolumeClaimSpec() {
      if (persistentVolumeClaimSpecBuilder_ == null) {
        return persistentVolumeClaimSpec_ == null ? com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec.getDefaultInstance() : persistentVolumeClaimSpec_;
      } else {
        return persistentVolumeClaimSpecBuilder_.getMessage();
      }
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaimSpec persistent_volume_claim_spec = 2;</code>
     */
    public Builder setPersistentVolumeClaimSpec(com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec value) {
      if (persistentVolumeClaimSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        persistentVolumeClaimSpec_ = value;
        onChanged();
      } else {
        persistentVolumeClaimSpecBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaimSpec persistent_volume_claim_spec = 2;</code>
     */
    public Builder setPersistentVolumeClaimSpec(
        com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec.Builder builderForValue) {
      if (persistentVolumeClaimSpecBuilder_ == null) {
        persistentVolumeClaimSpec_ = builderForValue.build();
        onChanged();
      } else {
        persistentVolumeClaimSpecBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaimSpec persistent_volume_claim_spec = 2;</code>
     */
    public Builder mergePersistentVolumeClaimSpec(com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec value) {
      if (persistentVolumeClaimSpecBuilder_ == null) {
        if (persistentVolumeClaimSpec_ != null) {
          persistentVolumeClaimSpec_ =
            com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec.newBuilder(persistentVolumeClaimSpec_).mergeFrom(value).buildPartial();
        } else {
          persistentVolumeClaimSpec_ = value;
        }
        onChanged();
      } else {
        persistentVolumeClaimSpecBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaimSpec persistent_volume_claim_spec = 2;</code>
     */
    public Builder clearPersistentVolumeClaimSpec() {
      if (persistentVolumeClaimSpecBuilder_ == null) {
        persistentVolumeClaimSpec_ = null;
        onChanged();
      } else {
        persistentVolumeClaimSpec_ = null;
        persistentVolumeClaimSpecBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaimSpec persistent_volume_claim_spec = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec.Builder getPersistentVolumeClaimSpecBuilder() {
      
      onChanged();
      return getPersistentVolumeClaimSpecFieldBuilder().getBuilder();
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaimSpec persistent_volume_claim_spec = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpecOrBuilder getPersistentVolumeClaimSpecOrBuilder() {
      if (persistentVolumeClaimSpecBuilder_ != null) {
        return persistentVolumeClaimSpecBuilder_.getMessageOrBuilder();
      } else {
        return persistentVolumeClaimSpec_ == null ?
            com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec.getDefaultInstance() : persistentVolumeClaimSpec_;
      }
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.PersistentVolumeClaimSpec persistent_volume_claim_spec = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec, com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec.Builder, com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpecOrBuilder> 
        getPersistentVolumeClaimSpecFieldBuilder() {
      if (persistentVolumeClaimSpecBuilder_ == null) {
        persistentVolumeClaimSpecBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec, com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpec.Builder, com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimSpecOrBuilder>(
                getPersistentVolumeClaimSpec(),
                getParentForChildren(),
                isClean());
        persistentVolumeClaimSpec_ = null;
      }
      return persistentVolumeClaimSpecBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta2.StorageSpec)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta2.StorageSpec)
  private static final com.appscode.api.kubernetes.v1beta2.StorageSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta2.StorageSpec();
  }

  public static com.appscode.api.kubernetes.v1beta2.StorageSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StorageSpec>
      PARSER = new com.google.protobuf.AbstractParser<StorageSpec>() {
    public StorageSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new StorageSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StorageSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StorageSpec> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta2.StorageSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

