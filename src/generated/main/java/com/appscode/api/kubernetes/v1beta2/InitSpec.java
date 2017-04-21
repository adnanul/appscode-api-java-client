// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

/**
 * Protobuf type {@code appscode.kubernetes.v1beta2.InitSpec}
 */
public  final class InitSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta2.InitSpec)
    InitSpecOrBuilder {
  // Use InitSpec.newBuilder() to construct.
  private InitSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InitSpec() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private InitSpec(
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
            com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec.Builder subBuilder = null;
            if (scriptSource_ != null) {
              subBuilder = scriptSource_.toBuilder();
            }
            scriptSource_ = input.readMessage(com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(scriptSource_);
              scriptSource_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec.Builder subBuilder = null;
            if (snapshotSource_ != null) {
              subBuilder = snapshotSource_.toBuilder();
            }
            snapshotSource_ = input.readMessage(com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(snapshotSource_);
              snapshotSource_ = subBuilder.buildPartial();
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
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_InitSpec_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_InitSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta2.InitSpec.class, com.appscode.api.kubernetes.v1beta2.InitSpec.Builder.class);
  }

  public static final int SCRIPT_SOURCE_FIELD_NUMBER = 1;
  private com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec scriptSource_;
  /**
   * <code>optional .appscode.kubernetes.v1beta2.ScriptSourceSpec script_source = 1;</code>
   */
  public boolean hasScriptSource() {
    return scriptSource_ != null;
  }
  /**
   * <code>optional .appscode.kubernetes.v1beta2.ScriptSourceSpec script_source = 1;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec getScriptSource() {
    return scriptSource_ == null ? com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec.getDefaultInstance() : scriptSource_;
  }
  /**
   * <code>optional .appscode.kubernetes.v1beta2.ScriptSourceSpec script_source = 1;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.ScriptSourceSpecOrBuilder getScriptSourceOrBuilder() {
    return getScriptSource();
  }

  public static final int SNAPSHOT_SOURCE_FIELD_NUMBER = 2;
  private com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec snapshotSource_;
  /**
   * <code>optional .appscode.kubernetes.v1beta2.SnapshotSourceSpec snapshot_source = 2;</code>
   */
  public boolean hasSnapshotSource() {
    return snapshotSource_ != null;
  }
  /**
   * <code>optional .appscode.kubernetes.v1beta2.SnapshotSourceSpec snapshot_source = 2;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec getSnapshotSource() {
    return snapshotSource_ == null ? com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec.getDefaultInstance() : snapshotSource_;
  }
  /**
   * <code>optional .appscode.kubernetes.v1beta2.SnapshotSourceSpec snapshot_source = 2;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpecOrBuilder getSnapshotSourceOrBuilder() {
    return getSnapshotSource();
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
    if (scriptSource_ != null) {
      output.writeMessage(1, getScriptSource());
    }
    if (snapshotSource_ != null) {
      output.writeMessage(2, getSnapshotSource());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scriptSource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getScriptSource());
    }
    if (snapshotSource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSnapshotSource());
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta2.InitSpec)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta2.InitSpec other = (com.appscode.api.kubernetes.v1beta2.InitSpec) obj;

    boolean result = true;
    result = result && (hasScriptSource() == other.hasScriptSource());
    if (hasScriptSource()) {
      result = result && getScriptSource()
          .equals(other.getScriptSource());
    }
    result = result && (hasSnapshotSource() == other.hasSnapshotSource());
    if (hasSnapshotSource()) {
      result = result && getSnapshotSource()
          .equals(other.getSnapshotSource());
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
    if (hasScriptSource()) {
      hash = (37 * hash) + SCRIPT_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getScriptSource().hashCode();
    }
    if (hasSnapshotSource()) {
      hash = (37 * hash) + SNAPSHOT_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getSnapshotSource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta2.InitSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.InitSpec parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta2.InitSpec prototype) {
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
   * Protobuf type {@code appscode.kubernetes.v1beta2.InitSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta2.InitSpec)
      com.appscode.api.kubernetes.v1beta2.InitSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_InitSpec_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_InitSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta2.InitSpec.class, com.appscode.api.kubernetes.v1beta2.InitSpec.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta2.InitSpec.newBuilder()
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
      if (scriptSourceBuilder_ == null) {
        scriptSource_ = null;
      } else {
        scriptSource_ = null;
        scriptSourceBuilder_ = null;
      }
      if (snapshotSourceBuilder_ == null) {
        snapshotSource_ = null;
      } else {
        snapshotSource_ = null;
        snapshotSourceBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_InitSpec_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta2.InitSpec getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta2.InitSpec.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta2.InitSpec build() {
      com.appscode.api.kubernetes.v1beta2.InitSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta2.InitSpec buildPartial() {
      com.appscode.api.kubernetes.v1beta2.InitSpec result = new com.appscode.api.kubernetes.v1beta2.InitSpec(this);
      if (scriptSourceBuilder_ == null) {
        result.scriptSource_ = scriptSource_;
      } else {
        result.scriptSource_ = scriptSourceBuilder_.build();
      }
      if (snapshotSourceBuilder_ == null) {
        result.snapshotSource_ = snapshotSource_;
      } else {
        result.snapshotSource_ = snapshotSourceBuilder_.build();
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
      if (other instanceof com.appscode.api.kubernetes.v1beta2.InitSpec) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta2.InitSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta2.InitSpec other) {
      if (other == com.appscode.api.kubernetes.v1beta2.InitSpec.getDefaultInstance()) return this;
      if (other.hasScriptSource()) {
        mergeScriptSource(other.getScriptSource());
      }
      if (other.hasSnapshotSource()) {
        mergeSnapshotSource(other.getSnapshotSource());
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
      com.appscode.api.kubernetes.v1beta2.InitSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta2.InitSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec scriptSource_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec, com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec.Builder, com.appscode.api.kubernetes.v1beta2.ScriptSourceSpecOrBuilder> scriptSourceBuilder_;
    /**
     * <code>optional .appscode.kubernetes.v1beta2.ScriptSourceSpec script_source = 1;</code>
     */
    public boolean hasScriptSource() {
      return scriptSourceBuilder_ != null || scriptSource_ != null;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.ScriptSourceSpec script_source = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec getScriptSource() {
      if (scriptSourceBuilder_ == null) {
        return scriptSource_ == null ? com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec.getDefaultInstance() : scriptSource_;
      } else {
        return scriptSourceBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.ScriptSourceSpec script_source = 1;</code>
     */
    public Builder setScriptSource(com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec value) {
      if (scriptSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scriptSource_ = value;
        onChanged();
      } else {
        scriptSourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.ScriptSourceSpec script_source = 1;</code>
     */
    public Builder setScriptSource(
        com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec.Builder builderForValue) {
      if (scriptSourceBuilder_ == null) {
        scriptSource_ = builderForValue.build();
        onChanged();
      } else {
        scriptSourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.ScriptSourceSpec script_source = 1;</code>
     */
    public Builder mergeScriptSource(com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec value) {
      if (scriptSourceBuilder_ == null) {
        if (scriptSource_ != null) {
          scriptSource_ =
            com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec.newBuilder(scriptSource_).mergeFrom(value).buildPartial();
        } else {
          scriptSource_ = value;
        }
        onChanged();
      } else {
        scriptSourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.ScriptSourceSpec script_source = 1;</code>
     */
    public Builder clearScriptSource() {
      if (scriptSourceBuilder_ == null) {
        scriptSource_ = null;
        onChanged();
      } else {
        scriptSource_ = null;
        scriptSourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.ScriptSourceSpec script_source = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec.Builder getScriptSourceBuilder() {
      
      onChanged();
      return getScriptSourceFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.ScriptSourceSpec script_source = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.ScriptSourceSpecOrBuilder getScriptSourceOrBuilder() {
      if (scriptSourceBuilder_ != null) {
        return scriptSourceBuilder_.getMessageOrBuilder();
      } else {
        return scriptSource_ == null ?
            com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec.getDefaultInstance() : scriptSource_;
      }
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.ScriptSourceSpec script_source = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec, com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec.Builder, com.appscode.api.kubernetes.v1beta2.ScriptSourceSpecOrBuilder> 
        getScriptSourceFieldBuilder() {
      if (scriptSourceBuilder_ == null) {
        scriptSourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec, com.appscode.api.kubernetes.v1beta2.ScriptSourceSpec.Builder, com.appscode.api.kubernetes.v1beta2.ScriptSourceSpecOrBuilder>(
                getScriptSource(),
                getParentForChildren(),
                isClean());
        scriptSource_ = null;
      }
      return scriptSourceBuilder_;
    }

    private com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec snapshotSource_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec, com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec.Builder, com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpecOrBuilder> snapshotSourceBuilder_;
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSourceSpec snapshot_source = 2;</code>
     */
    public boolean hasSnapshotSource() {
      return snapshotSourceBuilder_ != null || snapshotSource_ != null;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSourceSpec snapshot_source = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec getSnapshotSource() {
      if (snapshotSourceBuilder_ == null) {
        return snapshotSource_ == null ? com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec.getDefaultInstance() : snapshotSource_;
      } else {
        return snapshotSourceBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSourceSpec snapshot_source = 2;</code>
     */
    public Builder setSnapshotSource(com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec value) {
      if (snapshotSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        snapshotSource_ = value;
        onChanged();
      } else {
        snapshotSourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSourceSpec snapshot_source = 2;</code>
     */
    public Builder setSnapshotSource(
        com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec.Builder builderForValue) {
      if (snapshotSourceBuilder_ == null) {
        snapshotSource_ = builderForValue.build();
        onChanged();
      } else {
        snapshotSourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSourceSpec snapshot_source = 2;</code>
     */
    public Builder mergeSnapshotSource(com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec value) {
      if (snapshotSourceBuilder_ == null) {
        if (snapshotSource_ != null) {
          snapshotSource_ =
            com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec.newBuilder(snapshotSource_).mergeFrom(value).buildPartial();
        } else {
          snapshotSource_ = value;
        }
        onChanged();
      } else {
        snapshotSourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSourceSpec snapshot_source = 2;</code>
     */
    public Builder clearSnapshotSource() {
      if (snapshotSourceBuilder_ == null) {
        snapshotSource_ = null;
        onChanged();
      } else {
        snapshotSource_ = null;
        snapshotSourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSourceSpec snapshot_source = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec.Builder getSnapshotSourceBuilder() {
      
      onChanged();
      return getSnapshotSourceFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSourceSpec snapshot_source = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpecOrBuilder getSnapshotSourceOrBuilder() {
      if (snapshotSourceBuilder_ != null) {
        return snapshotSourceBuilder_.getMessageOrBuilder();
      } else {
        return snapshotSource_ == null ?
            com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec.getDefaultInstance() : snapshotSource_;
      }
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSourceSpec snapshot_source = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec, com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec.Builder, com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpecOrBuilder> 
        getSnapshotSourceFieldBuilder() {
      if (snapshotSourceBuilder_ == null) {
        snapshotSourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec, com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpec.Builder, com.appscode.api.kubernetes.v1beta2.SnapshotSourceSpecOrBuilder>(
                getSnapshotSource(),
                getParentForChildren(),
                isClean());
        snapshotSource_ = null;
      }
      return snapshotSourceBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta2.InitSpec)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta2.InitSpec)
  private static final com.appscode.api.kubernetes.v1beta2.InitSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta2.InitSpec();
  }

  public static com.appscode.api.kubernetes.v1beta2.InitSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InitSpec>
      PARSER = new com.google.protobuf.AbstractParser<InitSpec>() {
    public InitSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new InitSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InitSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InitSpec> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta2.InitSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
