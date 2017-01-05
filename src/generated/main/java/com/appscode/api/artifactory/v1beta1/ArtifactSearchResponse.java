// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/artifactory/v1beta1/artifact.proto

package com.appscode.api.artifactory.v1beta1;

/**
 * Protobuf type {@code appscode.artifactory.v1beta1.ArtifactSearchResponse}
 */
public  final class ArtifactSearchResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.artifactory.v1beta1.ArtifactSearchResponse)
    ArtifactSearchResponseOrBuilder {
  // Use ArtifactSearchResponse.newBuilder() to construct.
  private ArtifactSearchResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ArtifactSearchResponse() {
    artifacts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ArtifactSearchResponse(
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
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              artifacts_ = new java.util.ArrayList<com.appscode.api.artifactory.v1beta1.Artifact>();
              mutable_bitField0_ |= 0x00000002;
            }
            artifacts_.add(
                input.readMessage(com.appscode.api.artifactory.v1beta1.Artifact.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        artifacts_ = java.util.Collections.unmodifiableList(artifacts_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.appscode.api.artifactory.v1beta1.ArtifactProto.internal_static_appscode_artifactory_v1beta1_ArtifactSearchResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.artifactory.v1beta1.ArtifactProto.internal_static_appscode_artifactory_v1beta1_ArtifactSearchResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse.class, com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse.Builder.class);
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

  public static final int ARTIFACTS_FIELD_NUMBER = 2;
  private java.util.List<com.appscode.api.artifactory.v1beta1.Artifact> artifacts_;
  /**
   * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
   */
  public java.util.List<com.appscode.api.artifactory.v1beta1.Artifact> getArtifactsList() {
    return artifacts_;
  }
  /**
   * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
   */
  public java.util.List<? extends com.appscode.api.artifactory.v1beta1.ArtifactOrBuilder> 
      getArtifactsOrBuilderList() {
    return artifacts_;
  }
  /**
   * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
   */
  public int getArtifactsCount() {
    return artifacts_.size();
  }
  /**
   * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
   */
  public com.appscode.api.artifactory.v1beta1.Artifact getArtifacts(int index) {
    return artifacts_.get(index);
  }
  /**
   * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
   */
  public com.appscode.api.artifactory.v1beta1.ArtifactOrBuilder getArtifactsOrBuilder(
      int index) {
    return artifacts_.get(index);
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
    for (int i = 0; i < artifacts_.size(); i++) {
      output.writeMessage(2, artifacts_.get(i));
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
    for (int i = 0; i < artifacts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, artifacts_.get(i));
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
    if (!(obj instanceof com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse)) {
      return super.equals(obj);
    }
    com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse other = (com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse) obj;

    boolean result = true;
    result = result && (hasStatus() == other.hasStatus());
    if (hasStatus()) {
      result = result && getStatus()
          .equals(other.getStatus());
    }
    result = result && getArtifactsList()
        .equals(other.getArtifactsList());
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
    if (getArtifactsCount() > 0) {
      hash = (37 * hash) + ARTIFACTS_FIELD_NUMBER;
      hash = (53 * hash) + getArtifactsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse parseFrom(
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
  public static Builder newBuilder(com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse prototype) {
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
   * Protobuf type {@code appscode.artifactory.v1beta1.ArtifactSearchResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.artifactory.v1beta1.ArtifactSearchResponse)
      com.appscode.api.artifactory.v1beta1.ArtifactSearchResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.artifactory.v1beta1.ArtifactProto.internal_static_appscode_artifactory_v1beta1_ArtifactSearchResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.artifactory.v1beta1.ArtifactProto.internal_static_appscode_artifactory_v1beta1_ArtifactSearchResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse.class, com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse.Builder.class);
    }

    // Construct using com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse.newBuilder()
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
        getArtifactsFieldBuilder();
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
      if (artifactsBuilder_ == null) {
        artifacts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        artifactsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.artifactory.v1beta1.ArtifactProto.internal_static_appscode_artifactory_v1beta1_ArtifactSearchResponse_descriptor;
    }

    public com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse getDefaultInstanceForType() {
      return com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse.getDefaultInstance();
    }

    public com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse build() {
      com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse buildPartial() {
      com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse result = new com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (artifactsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          artifacts_ = java.util.Collections.unmodifiableList(artifacts_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.artifacts_ = artifacts_;
      } else {
        result.artifacts_ = artifactsBuilder_.build();
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
      if (other instanceof com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse) {
        return mergeFrom((com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse other) {
      if (other == com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (artifactsBuilder_ == null) {
        if (!other.artifacts_.isEmpty()) {
          if (artifacts_.isEmpty()) {
            artifacts_ = other.artifacts_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureArtifactsIsMutable();
            artifacts_.addAll(other.artifacts_);
          }
          onChanged();
        }
      } else {
        if (!other.artifacts_.isEmpty()) {
          if (artifactsBuilder_.isEmpty()) {
            artifactsBuilder_.dispose();
            artifactsBuilder_ = null;
            artifacts_ = other.artifacts_;
            bitField0_ = (bitField0_ & ~0x00000002);
            artifactsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getArtifactsFieldBuilder() : null;
          } else {
            artifactsBuilder_.addAllMessages(other.artifacts_);
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
      com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse) e.getUnfinishedMessage();
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

    private java.util.List<com.appscode.api.artifactory.v1beta1.Artifact> artifacts_ =
      java.util.Collections.emptyList();
    private void ensureArtifactsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        artifacts_ = new java.util.ArrayList<com.appscode.api.artifactory.v1beta1.Artifact>(artifacts_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appscode.api.artifactory.v1beta1.Artifact, com.appscode.api.artifactory.v1beta1.Artifact.Builder, com.appscode.api.artifactory.v1beta1.ArtifactOrBuilder> artifactsBuilder_;

    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public java.util.List<com.appscode.api.artifactory.v1beta1.Artifact> getArtifactsList() {
      if (artifactsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(artifacts_);
      } else {
        return artifactsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public int getArtifactsCount() {
      if (artifactsBuilder_ == null) {
        return artifacts_.size();
      } else {
        return artifactsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public com.appscode.api.artifactory.v1beta1.Artifact getArtifacts(int index) {
      if (artifactsBuilder_ == null) {
        return artifacts_.get(index);
      } else {
        return artifactsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public Builder setArtifacts(
        int index, com.appscode.api.artifactory.v1beta1.Artifact value) {
      if (artifactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArtifactsIsMutable();
        artifacts_.set(index, value);
        onChanged();
      } else {
        artifactsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public Builder setArtifacts(
        int index, com.appscode.api.artifactory.v1beta1.Artifact.Builder builderForValue) {
      if (artifactsBuilder_ == null) {
        ensureArtifactsIsMutable();
        artifacts_.set(index, builderForValue.build());
        onChanged();
      } else {
        artifactsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public Builder addArtifacts(com.appscode.api.artifactory.v1beta1.Artifact value) {
      if (artifactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArtifactsIsMutable();
        artifacts_.add(value);
        onChanged();
      } else {
        artifactsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public Builder addArtifacts(
        int index, com.appscode.api.artifactory.v1beta1.Artifact value) {
      if (artifactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArtifactsIsMutable();
        artifacts_.add(index, value);
        onChanged();
      } else {
        artifactsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public Builder addArtifacts(
        com.appscode.api.artifactory.v1beta1.Artifact.Builder builderForValue) {
      if (artifactsBuilder_ == null) {
        ensureArtifactsIsMutable();
        artifacts_.add(builderForValue.build());
        onChanged();
      } else {
        artifactsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public Builder addArtifacts(
        int index, com.appscode.api.artifactory.v1beta1.Artifact.Builder builderForValue) {
      if (artifactsBuilder_ == null) {
        ensureArtifactsIsMutable();
        artifacts_.add(index, builderForValue.build());
        onChanged();
      } else {
        artifactsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public Builder addAllArtifacts(
        java.lang.Iterable<? extends com.appscode.api.artifactory.v1beta1.Artifact> values) {
      if (artifactsBuilder_ == null) {
        ensureArtifactsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, artifacts_);
        onChanged();
      } else {
        artifactsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public Builder clearArtifacts() {
      if (artifactsBuilder_ == null) {
        artifacts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        artifactsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public Builder removeArtifacts(int index) {
      if (artifactsBuilder_ == null) {
        ensureArtifactsIsMutable();
        artifacts_.remove(index);
        onChanged();
      } else {
        artifactsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public com.appscode.api.artifactory.v1beta1.Artifact.Builder getArtifactsBuilder(
        int index) {
      return getArtifactsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public com.appscode.api.artifactory.v1beta1.ArtifactOrBuilder getArtifactsOrBuilder(
        int index) {
      if (artifactsBuilder_ == null) {
        return artifacts_.get(index);  } else {
        return artifactsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public java.util.List<? extends com.appscode.api.artifactory.v1beta1.ArtifactOrBuilder> 
         getArtifactsOrBuilderList() {
      if (artifactsBuilder_ != null) {
        return artifactsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(artifacts_);
      }
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public com.appscode.api.artifactory.v1beta1.Artifact.Builder addArtifactsBuilder() {
      return getArtifactsFieldBuilder().addBuilder(
          com.appscode.api.artifactory.v1beta1.Artifact.getDefaultInstance());
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public com.appscode.api.artifactory.v1beta1.Artifact.Builder addArtifactsBuilder(
        int index) {
      return getArtifactsFieldBuilder().addBuilder(
          index, com.appscode.api.artifactory.v1beta1.Artifact.getDefaultInstance());
    }
    /**
     * <code>repeated .appscode.artifactory.v1beta1.Artifact artifacts = 2;</code>
     */
    public java.util.List<com.appscode.api.artifactory.v1beta1.Artifact.Builder> 
         getArtifactsBuilderList() {
      return getArtifactsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appscode.api.artifactory.v1beta1.Artifact, com.appscode.api.artifactory.v1beta1.Artifact.Builder, com.appscode.api.artifactory.v1beta1.ArtifactOrBuilder> 
        getArtifactsFieldBuilder() {
      if (artifactsBuilder_ == null) {
        artifactsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.appscode.api.artifactory.v1beta1.Artifact, com.appscode.api.artifactory.v1beta1.Artifact.Builder, com.appscode.api.artifactory.v1beta1.ArtifactOrBuilder>(
                artifacts_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        artifacts_ = null;
      }
      return artifactsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.artifactory.v1beta1.ArtifactSearchResponse)
  }

  // @@protoc_insertion_point(class_scope:appscode.artifactory.v1beta1.ArtifactSearchResponse)
  private static final com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse();
  }

  public static com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ArtifactSearchResponse>
      PARSER = new com.google.protobuf.AbstractParser<ArtifactSearchResponse>() {
    public ArtifactSearchResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ArtifactSearchResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ArtifactSearchResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ArtifactSearchResponse> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.artifactory.v1beta1.ArtifactSearchResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

