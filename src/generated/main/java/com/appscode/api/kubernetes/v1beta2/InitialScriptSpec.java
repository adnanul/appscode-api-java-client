// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

/**
 * Protobuf type {@code appscode.kubernetes.v1beta2.InitialScriptSpec}
 */
public  final class InitialScriptSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta2.InitialScriptSpec)
    InitialScriptSpecOrBuilder {
  // Use InitialScriptSpec.newBuilder() to construct.
  private InitialScriptSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InitialScriptSpec() {
    scriptPath_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private InitialScriptSpec(
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

            scriptPath_ = s;
            break;
          }
          case 18: {
            com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource.Builder subBuilder = null;
            if (volumeSource_ != null) {
              subBuilder = volumeSource_.toBuilder();
            }
            volumeSource_ = input.readMessage(com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(volumeSource_);
              volumeSource_ = subBuilder.buildPartial();
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
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_InitialScriptSpec_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_InitialScriptSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta2.InitialScriptSpec.class, com.appscode.api.kubernetes.v1beta2.InitialScriptSpec.Builder.class);
  }

  public static final int SCRIPT_PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object scriptPath_;
  /**
   * <code>optional string script_path = 1;</code>
   */
  public java.lang.String getScriptPath() {
    java.lang.Object ref = scriptPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scriptPath_ = s;
      return s;
    }
  }
  /**
   * <code>optional string script_path = 1;</code>
   */
  public com.google.protobuf.ByteString
      getScriptPathBytes() {
    java.lang.Object ref = scriptPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scriptPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VOLUME_SOURCE_FIELD_NUMBER = 2;
  private com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource volumeSource_;
  /**
   * <code>optional .appscode.kubernetes.v1beta2.PersistentVolumeSource volume_source = 2;</code>
   */
  public boolean hasVolumeSource() {
    return volumeSource_ != null;
  }
  /**
   * <code>optional .appscode.kubernetes.v1beta2.PersistentVolumeSource volume_source = 2;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource getVolumeSource() {
    return volumeSource_ == null ? com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource.getDefaultInstance() : volumeSource_;
  }
  /**
   * <code>optional .appscode.kubernetes.v1beta2.PersistentVolumeSource volume_source = 2;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.PersistentVolumeSourceOrBuilder getVolumeSourceOrBuilder() {
    return getVolumeSource();
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
    if (!getScriptPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, scriptPath_);
    }
    if (volumeSource_ != null) {
      output.writeMessage(2, getVolumeSource());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getScriptPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, scriptPath_);
    }
    if (volumeSource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVolumeSource());
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta2.InitialScriptSpec)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta2.InitialScriptSpec other = (com.appscode.api.kubernetes.v1beta2.InitialScriptSpec) obj;

    boolean result = true;
    result = result && getScriptPath()
        .equals(other.getScriptPath());
    result = result && (hasVolumeSource() == other.hasVolumeSource());
    if (hasVolumeSource()) {
      result = result && getVolumeSource()
          .equals(other.getVolumeSource());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + SCRIPT_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getScriptPath().hashCode();
    if (hasVolumeSource()) {
      hash = (37 * hash) + VOLUME_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getVolumeSource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta2.InitialScriptSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitialScriptSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitialScriptSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitialScriptSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitialScriptSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitialScriptSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitialScriptSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitialScriptSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitialScriptSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitialScriptSpec parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta2.InitialScriptSpec prototype) {
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
   * Protobuf type {@code appscode.kubernetes.v1beta2.InitialScriptSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta2.InitialScriptSpec)
      com.appscode.api.kubernetes.v1beta2.InitialScriptSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_InitialScriptSpec_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_InitialScriptSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta2.InitialScriptSpec.class, com.appscode.api.kubernetes.v1beta2.InitialScriptSpec.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta2.InitialScriptSpec.newBuilder()
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
      scriptPath_ = "";

      if (volumeSourceBuilder_ == null) {
        volumeSource_ = null;
      } else {
        volumeSource_ = null;
        volumeSourceBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_InitialScriptSpec_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta2.InitialScriptSpec getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta2.InitialScriptSpec.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta2.InitialScriptSpec build() {
      com.appscode.api.kubernetes.v1beta2.InitialScriptSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta2.InitialScriptSpec buildPartial() {
      com.appscode.api.kubernetes.v1beta2.InitialScriptSpec result = new com.appscode.api.kubernetes.v1beta2.InitialScriptSpec(this);
      result.scriptPath_ = scriptPath_;
      if (volumeSourceBuilder_ == null) {
        result.volumeSource_ = volumeSource_;
      } else {
        result.volumeSource_ = volumeSourceBuilder_.build();
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
      if (other instanceof com.appscode.api.kubernetes.v1beta2.InitialScriptSpec) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta2.InitialScriptSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta2.InitialScriptSpec other) {
      if (other == com.appscode.api.kubernetes.v1beta2.InitialScriptSpec.getDefaultInstance()) return this;
      if (!other.getScriptPath().isEmpty()) {
        scriptPath_ = other.scriptPath_;
        onChanged();
      }
      if (other.hasVolumeSource()) {
        mergeVolumeSource(other.getVolumeSource());
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
      com.appscode.api.kubernetes.v1beta2.InitialScriptSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta2.InitialScriptSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object scriptPath_ = "";
    /**
     * <code>optional string script_path = 1;</code>
     */
    public java.lang.String getScriptPath() {
      java.lang.Object ref = scriptPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scriptPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string script_path = 1;</code>
     */
    public com.google.protobuf.ByteString
        getScriptPathBytes() {
      java.lang.Object ref = scriptPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scriptPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string script_path = 1;</code>
     */
    public Builder setScriptPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scriptPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string script_path = 1;</code>
     */
    public Builder clearScriptPath() {
      
      scriptPath_ = getDefaultInstance().getScriptPath();
      onChanged();
      return this;
    }
    /**
     * <code>optional string script_path = 1;</code>
     */
    public Builder setScriptPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      scriptPath_ = value;
      onChanged();
      return this;
    }

    private com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource volumeSource_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource, com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource.Builder, com.appscode.api.kubernetes.v1beta2.PersistentVolumeSourceOrBuilder> volumeSourceBuilder_;
    /**
     * <code>optional .appscode.kubernetes.v1beta2.PersistentVolumeSource volume_source = 2;</code>
     */
    public boolean hasVolumeSource() {
      return volumeSourceBuilder_ != null || volumeSource_ != null;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.PersistentVolumeSource volume_source = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource getVolumeSource() {
      if (volumeSourceBuilder_ == null) {
        return volumeSource_ == null ? com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource.getDefaultInstance() : volumeSource_;
      } else {
        return volumeSourceBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.PersistentVolumeSource volume_source = 2;</code>
     */
    public Builder setVolumeSource(com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource value) {
      if (volumeSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        volumeSource_ = value;
        onChanged();
      } else {
        volumeSourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.PersistentVolumeSource volume_source = 2;</code>
     */
    public Builder setVolumeSource(
        com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource.Builder builderForValue) {
      if (volumeSourceBuilder_ == null) {
        volumeSource_ = builderForValue.build();
        onChanged();
      } else {
        volumeSourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.PersistentVolumeSource volume_source = 2;</code>
     */
    public Builder mergeVolumeSource(com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource value) {
      if (volumeSourceBuilder_ == null) {
        if (volumeSource_ != null) {
          volumeSource_ =
            com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource.newBuilder(volumeSource_).mergeFrom(value).buildPartial();
        } else {
          volumeSource_ = value;
        }
        onChanged();
      } else {
        volumeSourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.PersistentVolumeSource volume_source = 2;</code>
     */
    public Builder clearVolumeSource() {
      if (volumeSourceBuilder_ == null) {
        volumeSource_ = null;
        onChanged();
      } else {
        volumeSource_ = null;
        volumeSourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.PersistentVolumeSource volume_source = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource.Builder getVolumeSourceBuilder() {
      
      onChanged();
      return getVolumeSourceFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.PersistentVolumeSource volume_source = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.PersistentVolumeSourceOrBuilder getVolumeSourceOrBuilder() {
      if (volumeSourceBuilder_ != null) {
        return volumeSourceBuilder_.getMessageOrBuilder();
      } else {
        return volumeSource_ == null ?
            com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource.getDefaultInstance() : volumeSource_;
      }
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.PersistentVolumeSource volume_source = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource, com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource.Builder, com.appscode.api.kubernetes.v1beta2.PersistentVolumeSourceOrBuilder> 
        getVolumeSourceFieldBuilder() {
      if (volumeSourceBuilder_ == null) {
        volumeSourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource, com.appscode.api.kubernetes.v1beta2.PersistentVolumeSource.Builder, com.appscode.api.kubernetes.v1beta2.PersistentVolumeSourceOrBuilder>(
                getVolumeSource(),
                getParentForChildren(),
                isClean());
        volumeSource_ = null;
      }
      return volumeSourceBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta2.InitialScriptSpec)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta2.InitialScriptSpec)
  private static final com.appscode.api.kubernetes.v1beta2.InitialScriptSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta2.InitialScriptSpec();
  }

  public static com.appscode.api.kubernetes.v1beta2.InitialScriptSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InitialScriptSpec>
      PARSER = new com.google.protobuf.AbstractParser<InitialScriptSpec>() {
    public InitialScriptSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new InitialScriptSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InitialScriptSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InitialScriptSpec> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta2.InitialScriptSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
