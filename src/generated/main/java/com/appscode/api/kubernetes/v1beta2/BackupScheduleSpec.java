// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

/**
 * Protobuf type {@code appscode.kubernetes.v1beta2.BackupScheduleSpec}
 */
public  final class BackupScheduleSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta2.BackupScheduleSpec)
    BackupScheduleSpecOrBuilder {
  // Use BackupScheduleSpec.newBuilder() to construct.
  private BackupScheduleSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BackupScheduleSpec() {
    cronExpression_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private BackupScheduleSpec(
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

            cronExpression_ = s;
            break;
          }
          case 18: {
            com.appscode.api.kubernetes.v1beta2.SnapshotSpec.Builder subBuilder = null;
            if (snapshotSpec_ != null) {
              subBuilder = snapshotSpec_.toBuilder();
            }
            snapshotSpec_ = input.readMessage(com.appscode.api.kubernetes.v1beta2.SnapshotSpec.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(snapshotSpec_);
              snapshotSpec_ = subBuilder.buildPartial();
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
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_BackupScheduleSpec_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_BackupScheduleSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec.class, com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec.Builder.class);
  }

  public static final int CRON_EXPRESSION_FIELD_NUMBER = 1;
  private volatile java.lang.Object cronExpression_;
  /**
   * <code>optional string cron_expression = 1;</code>
   */
  public java.lang.String getCronExpression() {
    java.lang.Object ref = cronExpression_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cronExpression_ = s;
      return s;
    }
  }
  /**
   * <code>optional string cron_expression = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCronExpressionBytes() {
    java.lang.Object ref = cronExpression_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cronExpression_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SNAPSHOT_SPEC_FIELD_NUMBER = 2;
  private com.appscode.api.kubernetes.v1beta2.SnapshotSpec snapshotSpec_;
  /**
   * <code>optional .appscode.kubernetes.v1beta2.SnapshotSpec snapshot_spec = 2;</code>
   */
  public boolean hasSnapshotSpec() {
    return snapshotSpec_ != null;
  }
  /**
   * <code>optional .appscode.kubernetes.v1beta2.SnapshotSpec snapshot_spec = 2;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.SnapshotSpec getSnapshotSpec() {
    return snapshotSpec_ == null ? com.appscode.api.kubernetes.v1beta2.SnapshotSpec.getDefaultInstance() : snapshotSpec_;
  }
  /**
   * <code>optional .appscode.kubernetes.v1beta2.SnapshotSpec snapshot_spec = 2;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.SnapshotSpecOrBuilder getSnapshotSpecOrBuilder() {
    return getSnapshotSpec();
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
    if (!getCronExpressionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cronExpression_);
    }
    if (snapshotSpec_ != null) {
      output.writeMessage(2, getSnapshotSpec());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCronExpressionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cronExpression_);
    }
    if (snapshotSpec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSnapshotSpec());
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec other = (com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec) obj;

    boolean result = true;
    result = result && getCronExpression()
        .equals(other.getCronExpression());
    result = result && (hasSnapshotSpec() == other.hasSnapshotSpec());
    if (hasSnapshotSpec()) {
      result = result && getSnapshotSpec()
          .equals(other.getSnapshotSpec());
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
    hash = (37 * hash) + CRON_EXPRESSION_FIELD_NUMBER;
    hash = (53 * hash) + getCronExpression().hashCode();
    if (hasSnapshotSpec()) {
      hash = (37 * hash) + SNAPSHOT_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getSnapshotSpec().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec prototype) {
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
   * Protobuf type {@code appscode.kubernetes.v1beta2.BackupScheduleSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta2.BackupScheduleSpec)
      com.appscode.api.kubernetes.v1beta2.BackupScheduleSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_BackupScheduleSpec_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_BackupScheduleSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec.class, com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec.newBuilder()
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
      cronExpression_ = "";

      if (snapshotSpecBuilder_ == null) {
        snapshotSpec_ = null;
      } else {
        snapshotSpec_ = null;
        snapshotSpecBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_BackupScheduleSpec_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec build() {
      com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec buildPartial() {
      com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec result = new com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec(this);
      result.cronExpression_ = cronExpression_;
      if (snapshotSpecBuilder_ == null) {
        result.snapshotSpec_ = snapshotSpec_;
      } else {
        result.snapshotSpec_ = snapshotSpecBuilder_.build();
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
      if (other instanceof com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec other) {
      if (other == com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec.getDefaultInstance()) return this;
      if (!other.getCronExpression().isEmpty()) {
        cronExpression_ = other.cronExpression_;
        onChanged();
      }
      if (other.hasSnapshotSpec()) {
        mergeSnapshotSpec(other.getSnapshotSpec());
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
      com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object cronExpression_ = "";
    /**
     * <code>optional string cron_expression = 1;</code>
     */
    public java.lang.String getCronExpression() {
      java.lang.Object ref = cronExpression_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cronExpression_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string cron_expression = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCronExpressionBytes() {
      java.lang.Object ref = cronExpression_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cronExpression_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string cron_expression = 1;</code>
     */
    public Builder setCronExpression(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cronExpression_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string cron_expression = 1;</code>
     */
    public Builder clearCronExpression() {
      
      cronExpression_ = getDefaultInstance().getCronExpression();
      onChanged();
      return this;
    }
    /**
     * <code>optional string cron_expression = 1;</code>
     */
    public Builder setCronExpressionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cronExpression_ = value;
      onChanged();
      return this;
    }

    private com.appscode.api.kubernetes.v1beta2.SnapshotSpec snapshotSpec_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.SnapshotSpec, com.appscode.api.kubernetes.v1beta2.SnapshotSpec.Builder, com.appscode.api.kubernetes.v1beta2.SnapshotSpecOrBuilder> snapshotSpecBuilder_;
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSpec snapshot_spec = 2;</code>
     */
    public boolean hasSnapshotSpec() {
      return snapshotSpecBuilder_ != null || snapshotSpec_ != null;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSpec snapshot_spec = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.SnapshotSpec getSnapshotSpec() {
      if (snapshotSpecBuilder_ == null) {
        return snapshotSpec_ == null ? com.appscode.api.kubernetes.v1beta2.SnapshotSpec.getDefaultInstance() : snapshotSpec_;
      } else {
        return snapshotSpecBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSpec snapshot_spec = 2;</code>
     */
    public Builder setSnapshotSpec(com.appscode.api.kubernetes.v1beta2.SnapshotSpec value) {
      if (snapshotSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        snapshotSpec_ = value;
        onChanged();
      } else {
        snapshotSpecBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSpec snapshot_spec = 2;</code>
     */
    public Builder setSnapshotSpec(
        com.appscode.api.kubernetes.v1beta2.SnapshotSpec.Builder builderForValue) {
      if (snapshotSpecBuilder_ == null) {
        snapshotSpec_ = builderForValue.build();
        onChanged();
      } else {
        snapshotSpecBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSpec snapshot_spec = 2;</code>
     */
    public Builder mergeSnapshotSpec(com.appscode.api.kubernetes.v1beta2.SnapshotSpec value) {
      if (snapshotSpecBuilder_ == null) {
        if (snapshotSpec_ != null) {
          snapshotSpec_ =
            com.appscode.api.kubernetes.v1beta2.SnapshotSpec.newBuilder(snapshotSpec_).mergeFrom(value).buildPartial();
        } else {
          snapshotSpec_ = value;
        }
        onChanged();
      } else {
        snapshotSpecBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSpec snapshot_spec = 2;</code>
     */
    public Builder clearSnapshotSpec() {
      if (snapshotSpecBuilder_ == null) {
        snapshotSpec_ = null;
        onChanged();
      } else {
        snapshotSpec_ = null;
        snapshotSpecBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSpec snapshot_spec = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.SnapshotSpec.Builder getSnapshotSpecBuilder() {
      
      onChanged();
      return getSnapshotSpecFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSpec snapshot_spec = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.SnapshotSpecOrBuilder getSnapshotSpecOrBuilder() {
      if (snapshotSpecBuilder_ != null) {
        return snapshotSpecBuilder_.getMessageOrBuilder();
      } else {
        return snapshotSpec_ == null ?
            com.appscode.api.kubernetes.v1beta2.SnapshotSpec.getDefaultInstance() : snapshotSpec_;
      }
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta2.SnapshotSpec snapshot_spec = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.SnapshotSpec, com.appscode.api.kubernetes.v1beta2.SnapshotSpec.Builder, com.appscode.api.kubernetes.v1beta2.SnapshotSpecOrBuilder> 
        getSnapshotSpecFieldBuilder() {
      if (snapshotSpecBuilder_ == null) {
        snapshotSpecBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.kubernetes.v1beta2.SnapshotSpec, com.appscode.api.kubernetes.v1beta2.SnapshotSpec.Builder, com.appscode.api.kubernetes.v1beta2.SnapshotSpecOrBuilder>(
                getSnapshotSpec(),
                getParentForChildren(),
                isClean());
        snapshotSpec_ = null;
      }
      return snapshotSpecBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta2.BackupScheduleSpec)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta2.BackupScheduleSpec)
  private static final com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec();
  }

  public static com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackupScheduleSpec>
      PARSER = new com.google.protobuf.AbstractParser<BackupScheduleSpec>() {
    public BackupScheduleSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BackupScheduleSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BackupScheduleSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackupScheduleSpec> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta2.BackupScheduleSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

