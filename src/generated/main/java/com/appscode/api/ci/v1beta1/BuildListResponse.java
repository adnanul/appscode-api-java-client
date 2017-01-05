// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/ci/v1beta1/build.proto

package com.appscode.api.ci.v1beta1;

/**
 * Protobuf type {@code appscode.ci.v1beta1.BuildListResponse}
 */
public  final class BuildListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.ci.v1beta1.BuildListResponse)
    BuildListResponseOrBuilder {
  // Use BuildListResponse.newBuilder() to construct.
  private BuildListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildListResponse() {
    jobName_ = "";
    parents_ = "";
    builds_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private BuildListResponse(
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
            com.appscode.api.dtypes.Status.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(com.appscode.api.dtypes.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            jobName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            parents_ = s;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              builds_ = new java.util.ArrayList<com.appscode.api.ci.v1beta1.Build>();
              mutable_bitField0_ |= 0x00000008;
            }
            builds_.add(
                input.readMessage(com.appscode.api.ci.v1beta1.Build.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        builds_ = java.util.Collections.unmodifiableList(builds_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.appscode.api.ci.v1beta1.BuildProto.internal_static_appscode_ci_v1beta1_BuildListResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.ci.v1beta1.BuildProto.internal_static_appscode_ci_v1beta1_BuildListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.ci.v1beta1.BuildListResponse.class, com.appscode.api.ci.v1beta1.BuildListResponse.Builder.class);
  }

  private int bitField0_;
  public static final int STATUS_FIELD_NUMBER = 1;
  private com.appscode.api.dtypes.Status status_;
  /**
   * <code>optional .appscode.dtypes.Status status = 1;</code>
   */
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <code>optional .appscode.dtypes.Status status = 1;</code>
   */
  public com.appscode.api.dtypes.Status getStatus() {
    return status_ == null ? com.appscode.api.dtypes.Status.getDefaultInstance() : status_;
  }
  /**
   * <code>optional .appscode.dtypes.Status status = 1;</code>
   */
  public com.appscode.api.dtypes.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int JOB_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object jobName_;
  /**
   * <code>optional string job_name = 2;</code>
   */
  public java.lang.String getJobName() {
    java.lang.Object ref = jobName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string job_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getJobNameBytes() {
    java.lang.Object ref = jobName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jobName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENTS_FIELD_NUMBER = 3;
  private volatile java.lang.Object parents_;
  /**
   * <code>optional string parents = 3;</code>
   */
  public java.lang.String getParents() {
    java.lang.Object ref = parents_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parents_ = s;
      return s;
    }
  }
  /**
   * <code>optional string parents = 3;</code>
   */
  public com.google.protobuf.ByteString
      getParentsBytes() {
    java.lang.Object ref = parents_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parents_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUILDS_FIELD_NUMBER = 4;
  private java.util.List<com.appscode.api.ci.v1beta1.Build> builds_;
  /**
   * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
   */
  public java.util.List<com.appscode.api.ci.v1beta1.Build> getBuildsList() {
    return builds_;
  }
  /**
   * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
   */
  public java.util.List<? extends com.appscode.api.ci.v1beta1.BuildOrBuilder> 
      getBuildsOrBuilderList() {
    return builds_;
  }
  /**
   * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
   */
  public int getBuildsCount() {
    return builds_.size();
  }
  /**
   * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
   */
  public com.appscode.api.ci.v1beta1.Build getBuilds(int index) {
    return builds_.get(index);
  }
  /**
   * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
   */
  public com.appscode.api.ci.v1beta1.BuildOrBuilder getBuildsOrBuilder(
      int index) {
    return builds_.get(index);
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
    if (status_ != null) {
      output.writeMessage(1, getStatus());
    }
    if (!getJobNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, jobName_);
    }
    if (!getParentsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, parents_);
    }
    for (int i = 0; i < builds_.size(); i++) {
      output.writeMessage(4, builds_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStatus());
    }
    if (!getJobNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, jobName_);
    }
    if (!getParentsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, parents_);
    }
    for (int i = 0; i < builds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, builds_.get(i));
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
    if (!(obj instanceof com.appscode.api.ci.v1beta1.BuildListResponse)) {
      return super.equals(obj);
    }
    com.appscode.api.ci.v1beta1.BuildListResponse other = (com.appscode.api.ci.v1beta1.BuildListResponse) obj;

    boolean result = true;
    result = result && (hasStatus() == other.hasStatus());
    if (hasStatus()) {
      result = result && getStatus()
          .equals(other.getStatus());
    }
    result = result && getJobName()
        .equals(other.getJobName());
    result = result && getParents()
        .equals(other.getParents());
    result = result && getBuildsList()
        .equals(other.getBuildsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (37 * hash) + JOB_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getJobName().hashCode();
    hash = (37 * hash) + PARENTS_FIELD_NUMBER;
    hash = (53 * hash) + getParents().hashCode();
    if (getBuildsCount() > 0) {
      hash = (37 * hash) + BUILDS_FIELD_NUMBER;
      hash = (53 * hash) + getBuildsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.ci.v1beta1.BuildListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.ci.v1beta1.BuildListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.BuildListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.ci.v1beta1.BuildListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.BuildListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.ci.v1beta1.BuildListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.BuildListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.ci.v1beta1.BuildListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.BuildListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.ci.v1beta1.BuildListResponse parseFrom(
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
  public static Builder newBuilder(com.appscode.api.ci.v1beta1.BuildListResponse prototype) {
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
   * Protobuf type {@code appscode.ci.v1beta1.BuildListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.ci.v1beta1.BuildListResponse)
      com.appscode.api.ci.v1beta1.BuildListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.ci.v1beta1.BuildProto.internal_static_appscode_ci_v1beta1_BuildListResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.ci.v1beta1.BuildProto.internal_static_appscode_ci_v1beta1_BuildListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.ci.v1beta1.BuildListResponse.class, com.appscode.api.ci.v1beta1.BuildListResponse.Builder.class);
    }

    // Construct using com.appscode.api.ci.v1beta1.BuildListResponse.newBuilder()
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
        getBuildsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      jobName_ = "";

      parents_ = "";

      if (buildsBuilder_ == null) {
        builds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        buildsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.ci.v1beta1.BuildProto.internal_static_appscode_ci_v1beta1_BuildListResponse_descriptor;
    }

    public com.appscode.api.ci.v1beta1.BuildListResponse getDefaultInstanceForType() {
      return com.appscode.api.ci.v1beta1.BuildListResponse.getDefaultInstance();
    }

    public com.appscode.api.ci.v1beta1.BuildListResponse build() {
      com.appscode.api.ci.v1beta1.BuildListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.ci.v1beta1.BuildListResponse buildPartial() {
      com.appscode.api.ci.v1beta1.BuildListResponse result = new com.appscode.api.ci.v1beta1.BuildListResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      result.jobName_ = jobName_;
      result.parents_ = parents_;
      if (buildsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          builds_ = java.util.Collections.unmodifiableList(builds_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.builds_ = builds_;
      } else {
        result.builds_ = buildsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.appscode.api.ci.v1beta1.BuildListResponse) {
        return mergeFrom((com.appscode.api.ci.v1beta1.BuildListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.ci.v1beta1.BuildListResponse other) {
      if (other == com.appscode.api.ci.v1beta1.BuildListResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (!other.getJobName().isEmpty()) {
        jobName_ = other.jobName_;
        onChanged();
      }
      if (!other.getParents().isEmpty()) {
        parents_ = other.parents_;
        onChanged();
      }
      if (buildsBuilder_ == null) {
        if (!other.builds_.isEmpty()) {
          if (builds_.isEmpty()) {
            builds_ = other.builds_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureBuildsIsMutable();
            builds_.addAll(other.builds_);
          }
          onChanged();
        }
      } else {
        if (!other.builds_.isEmpty()) {
          if (buildsBuilder_.isEmpty()) {
            buildsBuilder_.dispose();
            buildsBuilder_ = null;
            builds_ = other.builds_;
            bitField0_ = (bitField0_ & ~0x00000008);
            buildsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBuildsFieldBuilder() : null;
          } else {
            buildsBuilder_.addAllMessages(other.builds_);
          }
        }
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
      com.appscode.api.ci.v1beta1.BuildListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.ci.v1beta1.BuildListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.appscode.api.dtypes.Status status_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.dtypes.Status, com.appscode.api.dtypes.Status.Builder, com.appscode.api.dtypes.StatusOrBuilder> statusBuilder_;
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    public com.appscode.api.dtypes.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.appscode.api.dtypes.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    public Builder setStatus(com.appscode.api.dtypes.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    public Builder setStatus(
        com.appscode.api.dtypes.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    public Builder mergeStatus(com.appscode.api.dtypes.Status value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            com.appscode.api.dtypes.Status.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    public com.appscode.api.dtypes.Status.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    public com.appscode.api.dtypes.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            com.appscode.api.dtypes.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.dtypes.Status, com.appscode.api.dtypes.Status.Builder, com.appscode.api.dtypes.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.dtypes.Status, com.appscode.api.dtypes.Status.Builder, com.appscode.api.dtypes.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    private java.lang.Object jobName_ = "";
    /**
     * <code>optional string job_name = 2;</code>
     */
    public java.lang.String getJobName() {
      java.lang.Object ref = jobName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string job_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getJobNameBytes() {
      java.lang.Object ref = jobName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jobName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string job_name = 2;</code>
     */
    public Builder setJobName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jobName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string job_name = 2;</code>
     */
    public Builder clearJobName() {
      
      jobName_ = getDefaultInstance().getJobName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string job_name = 2;</code>
     */
    public Builder setJobNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jobName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object parents_ = "";
    /**
     * <code>optional string parents = 3;</code>
     */
    public java.lang.String getParents() {
      java.lang.Object ref = parents_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parents_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string parents = 3;</code>
     */
    public com.google.protobuf.ByteString
        getParentsBytes() {
      java.lang.Object ref = parents_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parents_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string parents = 3;</code>
     */
    public Builder setParents(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parents_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string parents = 3;</code>
     */
    public Builder clearParents() {
      
      parents_ = getDefaultInstance().getParents();
      onChanged();
      return this;
    }
    /**
     * <code>optional string parents = 3;</code>
     */
    public Builder setParentsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parents_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.appscode.api.ci.v1beta1.Build> builds_ =
      java.util.Collections.emptyList();
    private void ensureBuildsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        builds_ = new java.util.ArrayList<com.appscode.api.ci.v1beta1.Build>(builds_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appscode.api.ci.v1beta1.Build, com.appscode.api.ci.v1beta1.Build.Builder, com.appscode.api.ci.v1beta1.BuildOrBuilder> buildsBuilder_;

    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public java.util.List<com.appscode.api.ci.v1beta1.Build> getBuildsList() {
      if (buildsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(builds_);
      } else {
        return buildsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public int getBuildsCount() {
      if (buildsBuilder_ == null) {
        return builds_.size();
      } else {
        return buildsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public com.appscode.api.ci.v1beta1.Build getBuilds(int index) {
      if (buildsBuilder_ == null) {
        return builds_.get(index);
      } else {
        return buildsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public Builder setBuilds(
        int index, com.appscode.api.ci.v1beta1.Build value) {
      if (buildsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBuildsIsMutable();
        builds_.set(index, value);
        onChanged();
      } else {
        buildsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public Builder setBuilds(
        int index, com.appscode.api.ci.v1beta1.Build.Builder builderForValue) {
      if (buildsBuilder_ == null) {
        ensureBuildsIsMutable();
        builds_.set(index, builderForValue.build());
        onChanged();
      } else {
        buildsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public Builder addBuilds(com.appscode.api.ci.v1beta1.Build value) {
      if (buildsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBuildsIsMutable();
        builds_.add(value);
        onChanged();
      } else {
        buildsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public Builder addBuilds(
        int index, com.appscode.api.ci.v1beta1.Build value) {
      if (buildsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBuildsIsMutable();
        builds_.add(index, value);
        onChanged();
      } else {
        buildsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public Builder addBuilds(
        com.appscode.api.ci.v1beta1.Build.Builder builderForValue) {
      if (buildsBuilder_ == null) {
        ensureBuildsIsMutable();
        builds_.add(builderForValue.build());
        onChanged();
      } else {
        buildsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public Builder addBuilds(
        int index, com.appscode.api.ci.v1beta1.Build.Builder builderForValue) {
      if (buildsBuilder_ == null) {
        ensureBuildsIsMutable();
        builds_.add(index, builderForValue.build());
        onChanged();
      } else {
        buildsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public Builder addAllBuilds(
        java.lang.Iterable<? extends com.appscode.api.ci.v1beta1.Build> values) {
      if (buildsBuilder_ == null) {
        ensureBuildsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, builds_);
        onChanged();
      } else {
        buildsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public Builder clearBuilds() {
      if (buildsBuilder_ == null) {
        builds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        buildsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public Builder removeBuilds(int index) {
      if (buildsBuilder_ == null) {
        ensureBuildsIsMutable();
        builds_.remove(index);
        onChanged();
      } else {
        buildsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public com.appscode.api.ci.v1beta1.Build.Builder getBuildsBuilder(
        int index) {
      return getBuildsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public com.appscode.api.ci.v1beta1.BuildOrBuilder getBuildsOrBuilder(
        int index) {
      if (buildsBuilder_ == null) {
        return builds_.get(index);  } else {
        return buildsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public java.util.List<? extends com.appscode.api.ci.v1beta1.BuildOrBuilder> 
         getBuildsOrBuilderList() {
      if (buildsBuilder_ != null) {
        return buildsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(builds_);
      }
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public com.appscode.api.ci.v1beta1.Build.Builder addBuildsBuilder() {
      return getBuildsFieldBuilder().addBuilder(
          com.appscode.api.ci.v1beta1.Build.getDefaultInstance());
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public com.appscode.api.ci.v1beta1.Build.Builder addBuildsBuilder(
        int index) {
      return getBuildsFieldBuilder().addBuilder(
          index, com.appscode.api.ci.v1beta1.Build.getDefaultInstance());
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Build builds = 4;</code>
     */
    public java.util.List<com.appscode.api.ci.v1beta1.Build.Builder> 
         getBuildsBuilderList() {
      return getBuildsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appscode.api.ci.v1beta1.Build, com.appscode.api.ci.v1beta1.Build.Builder, com.appscode.api.ci.v1beta1.BuildOrBuilder> 
        getBuildsFieldBuilder() {
      if (buildsBuilder_ == null) {
        buildsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.appscode.api.ci.v1beta1.Build, com.appscode.api.ci.v1beta1.Build.Builder, com.appscode.api.ci.v1beta1.BuildOrBuilder>(
                builds_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        builds_ = null;
      }
      return buildsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.ci.v1beta1.BuildListResponse)
  }

  // @@protoc_insertion_point(class_scope:appscode.ci.v1beta1.BuildListResponse)
  private static final com.appscode.api.ci.v1beta1.BuildListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.ci.v1beta1.BuildListResponse();
  }

  public static com.appscode.api.ci.v1beta1.BuildListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildListResponse>
      PARSER = new com.google.protobuf.AbstractParser<BuildListResponse>() {
    public BuildListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BuildListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuildListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildListResponse> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.ci.v1beta1.BuildListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

