// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

/**
 * Protobuf type {@code appscode.kubernetes.v1beta2.JobSpec}
 */
public  final class JobSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta2.JobSpec)
    JobSpecOrBuilder {
  // Use JobSpec.newBuilder() to construct.
  private JobSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobSpec() {
    parallelism_ = 0;
    completions_ = 0;
    activeDeadlineSeconds_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private JobSpec(
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
          case 8: {

            parallelism_ = input.readInt32();
            break;
          }
          case 16: {

            completions_ = input.readInt32();
            break;
          }
          case 26: {
            com.appscode.api.kubernetes.v1beta2.PodSpec.Builder subBuilder = null;
            if (template_ != null) {
              subBuilder = template_.toBuilder();
            }
            template_ = input.readMessage(com.appscode.api.kubernetes.v1beta2.PodSpec.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(template_);
              template_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            activeDeadlineSeconds_ = input.readInt64();
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
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_JobSpec_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_JobSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta2.JobSpec.class, com.appscode.api.kubernetes.v1beta2.JobSpec.Builder.class);
  }

  public static final int PARALLELISM_FIELD_NUMBER = 1;
  private int parallelism_;
  /**
   * <code>int32 parallelism = 1;</code>
   */
  public int getParallelism() {
    return parallelism_;
  }

  public static final int COMPLETIONS_FIELD_NUMBER = 2;
  private int completions_;
  /**
   * <code>int32 completions = 2;</code>
   */
  public int getCompletions() {
    return completions_;
  }

  public static final int TEMPLATE_FIELD_NUMBER = 3;
  private com.appscode.api.kubernetes.v1beta2.PodSpec template_;
  /**
   * <code>.appscode.kubernetes.v1beta2.PodSpec template = 3;</code>
   */
  public boolean hasTemplate() {
    return template_ != null;
  }
  /**
   * <code>.appscode.kubernetes.v1beta2.PodSpec template = 3;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.PodSpec getTemplate() {
    return template_ == null ? com.appscode.api.kubernetes.v1beta2.PodSpec.getDefaultInstance() : template_;
  }
  /**
   * <code>.appscode.kubernetes.v1beta2.PodSpec template = 3;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.PodSpecOrBuilder getTemplateOrBuilder() {
    return getTemplate();
  }

  public static final int ACTIVE_DEADLINE_SECONDS_FIELD_NUMBER = 4;
  private long activeDeadlineSeconds_;
  /**
   * <code>int64 active_deadline_seconds = 4;</code>
   */
  public long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds_;
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
    if (parallelism_ != 0) {
      output.writeInt32(1, parallelism_);
    }
    if (completions_ != 0) {
      output.writeInt32(2, completions_);
    }
    if (template_ != null) {
      output.writeMessage(3, getTemplate());
    }
    if (activeDeadlineSeconds_ != 0L) {
      output.writeInt64(4, activeDeadlineSeconds_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (parallelism_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, parallelism_);
    }
    if (completions_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, completions_);
    }
    if (template_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTemplate());
    }
    if (activeDeadlineSeconds_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, activeDeadlineSeconds_);
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta2.JobSpec)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta2.JobSpec other = (com.appscode.api.kubernetes.v1beta2.JobSpec) obj;

    boolean result = true;
    result = result && (getParallelism()
        == other.getParallelism());
    result = result && (getCompletions()
        == other.getCompletions());
    result = result && (hasTemplate() == other.hasTemplate());
    if (hasTemplate()) {
      result = result && getTemplate()
          .equals(other.getTemplate());
    }
    result = result && (getActiveDeadlineSeconds()
        == other.getActiveDeadlineSeconds());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARALLELISM_FIELD_NUMBER;
    hash = (53 * hash) + getParallelism();
    hash = (37 * hash) + COMPLETIONS_FIELD_NUMBER;
    hash = (53 * hash) + getCompletions();
    if (hasTemplate()) {
      hash = (37 * hash) + TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getTemplate().hashCode();
    }
    hash = (37 * hash) + ACTIVE_DEADLINE_SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getActiveDeadlineSeconds());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta2.JobSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.JobSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.JobSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.JobSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.JobSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.JobSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.JobSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.JobSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.JobSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.JobSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.JobSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.JobSpec parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta2.JobSpec prototype) {
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
   * Protobuf type {@code appscode.kubernetes.v1beta2.JobSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta2.JobSpec)
      com.appscode.api.kubernetes.v1beta2.JobSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_JobSpec_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_JobSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta2.JobSpec.class, com.appscode.api.kubernetes.v1beta2.JobSpec.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta2.JobSpec.newBuilder()
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
      parallelism_ = 0;

      completions_ = 0;

      if (templateBuilder_ == null) {
        template_ = null;
      } else {
        template_ = null;
        templateBuilder_ = null;
      }
      activeDeadlineSeconds_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_JobSpec_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta2.JobSpec getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta2.JobSpec.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta2.JobSpec build() {
      com.appscode.api.kubernetes.v1beta2.JobSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta2.JobSpec buildPartial() {
      com.appscode.api.kubernetes.v1beta2.JobSpec result = new com.appscode.api.kubernetes.v1beta2.JobSpec(this);
      result.parallelism_ = parallelism_;
      result.completions_ = completions_;
      if (templateBuilder_ == null) {
        result.template_ = template_;
      } else {
        result.template_ = templateBuilder_.build();
      }
      result.activeDeadlineSeconds_ = activeDeadlineSeconds_;
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
      if (other instanceof com.appscode.api.kubernetes.v1beta2.JobSpec) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta2.JobSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta2.JobSpec other) {
      if (other == com.appscode.api.kubernetes.v1beta2.JobSpec.getDefaultInstance()) return this;
      if (other.getParallelism() != 0) {
        setParallelism(other.getParallelism());
      }
      if (other.getCompletions() != 0) {
        setCompletions(other.getCompletions());
      }
      if (other.hasTemplate()) {
        mergeTemplate(other.getTemplate());
      }
      if (other.getActiveDeadlineSeconds() != 0L) {
        setActiveDeadlineSeconds(other.getActiveDeadlineSeconds());
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
      com.appscode.api.kubernetes.v1beta2.JobSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta2.JobSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int parallelism_ ;
    /**
     * <code>int32 parallelism = 1;</code>
     */
    public int getParallelism() {
      return parallelism_;
    }
    /**
     * <code>int32 parallelism = 1;</code>
     */
    public Builder setParallelism(int value) {
      
      parallelism_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 parallelism = 1;</code>
     */
    public Builder clearParallelism() {
      
      parallelism_ = 0;
      onChanged();
      return this;
    }

    private int completions_ ;
    /**
     * <code>int32 completions = 2;</code>
     */
    public int getCompletions() {
      return completions_;
    }
    /**
     * <code>int32 completions = 2;</code>
     */
    public Builder setCompletions(int value) {
      
      completions_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 completions = 2;</code>
     */
    public Builder clearCompletions() {
      
      completions_ = 0;
      onChanged();
      return this;
    }

    private com.appscode.api.kubernetes.v1beta2.PodSpec template_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.PodSpec, com.appscode.api.kubernetes.v1beta2.PodSpec.Builder, com.appscode.api.kubernetes.v1beta2.PodSpecOrBuilder> templateBuilder_;
    /**
     * <code>.appscode.kubernetes.v1beta2.PodSpec template = 3;</code>
     */
    public boolean hasTemplate() {
      return templateBuilder_ != null || template_ != null;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.PodSpec template = 3;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.PodSpec getTemplate() {
      if (templateBuilder_ == null) {
        return template_ == null ? com.appscode.api.kubernetes.v1beta2.PodSpec.getDefaultInstance() : template_;
      } else {
        return templateBuilder_.getMessage();
      }
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.PodSpec template = 3;</code>
     */
    public Builder setTemplate(com.appscode.api.kubernetes.v1beta2.PodSpec value) {
      if (templateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        template_ = value;
        onChanged();
      } else {
        templateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.PodSpec template = 3;</code>
     */
    public Builder setTemplate(
        com.appscode.api.kubernetes.v1beta2.PodSpec.Builder builderForValue) {
      if (templateBuilder_ == null) {
        template_ = builderForValue.build();
        onChanged();
      } else {
        templateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.PodSpec template = 3;</code>
     */
    public Builder mergeTemplate(com.appscode.api.kubernetes.v1beta2.PodSpec value) {
      if (templateBuilder_ == null) {
        if (template_ != null) {
          template_ =
            com.appscode.api.kubernetes.v1beta2.PodSpec.newBuilder(template_).mergeFrom(value).buildPartial();
        } else {
          template_ = value;
        }
        onChanged();
      } else {
        templateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.PodSpec template = 3;</code>
     */
    public Builder clearTemplate() {
      if (templateBuilder_ == null) {
        template_ = null;
        onChanged();
      } else {
        template_ = null;
        templateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.PodSpec template = 3;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.PodSpec.Builder getTemplateBuilder() {
      
      onChanged();
      return getTemplateFieldBuilder().getBuilder();
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.PodSpec template = 3;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.PodSpecOrBuilder getTemplateOrBuilder() {
      if (templateBuilder_ != null) {
        return templateBuilder_.getMessageOrBuilder();
      } else {
        return template_ == null ?
            com.appscode.api.kubernetes.v1beta2.PodSpec.getDefaultInstance() : template_;
      }
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.PodSpec template = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.PodSpec, com.appscode.api.kubernetes.v1beta2.PodSpec.Builder, com.appscode.api.kubernetes.v1beta2.PodSpecOrBuilder> 
        getTemplateFieldBuilder() {
      if (templateBuilder_ == null) {
        templateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.kubernetes.v1beta2.PodSpec, com.appscode.api.kubernetes.v1beta2.PodSpec.Builder, com.appscode.api.kubernetes.v1beta2.PodSpecOrBuilder>(
                getTemplate(),
                getParentForChildren(),
                isClean());
        template_ = null;
      }
      return templateBuilder_;
    }

    private long activeDeadlineSeconds_ ;
    /**
     * <code>int64 active_deadline_seconds = 4;</code>
     */
    public long getActiveDeadlineSeconds() {
      return activeDeadlineSeconds_;
    }
    /**
     * <code>int64 active_deadline_seconds = 4;</code>
     */
    public Builder setActiveDeadlineSeconds(long value) {
      
      activeDeadlineSeconds_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 active_deadline_seconds = 4;</code>
     */
    public Builder clearActiveDeadlineSeconds() {
      
      activeDeadlineSeconds_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta2.JobSpec)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta2.JobSpec)
  private static final com.appscode.api.kubernetes.v1beta2.JobSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta2.JobSpec();
  }

  public static com.appscode.api.kubernetes.v1beta2.JobSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobSpec>
      PARSER = new com.google.protobuf.AbstractParser<JobSpec>() {
    public JobSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new JobSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobSpec> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta2.JobSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

