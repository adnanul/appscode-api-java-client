// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/auth/v1beta1/project.proto

package com.appscode.api.auth.v1beta1;

/**
 * Protobuf type {@code appscode.auth.v1beta1.ProjectMemberListResponse}
 */
public  final class ProjectMemberListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.auth.v1beta1.ProjectMemberListResponse)
    ProjectMemberListResponseOrBuilder {
  // Use ProjectMemberListResponse.newBuilder() to construct.
  private ProjectMemberListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProjectMemberListResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ProjectMemberListResponse(
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
            com.appscode.api.auth.v1beta1.Project.Builder subBuilder = null;
            if (projet_ != null) {
              subBuilder = projet_.toBuilder();
            }
            projet_ = input.readMessage(com.appscode.api.auth.v1beta1.Project.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(projet_);
              projet_ = subBuilder.buildPartial();
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
    return com.appscode.api.auth.v1beta1.ProjectProto.internal_static_appscode_auth_v1beta1_ProjectMemberListResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.auth.v1beta1.ProjectProto.internal_static_appscode_auth_v1beta1_ProjectMemberListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.auth.v1beta1.ProjectMemberListResponse.class, com.appscode.api.auth.v1beta1.ProjectMemberListResponse.Builder.class);
  }

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

  public static final int PROJET_FIELD_NUMBER = 2;
  private com.appscode.api.auth.v1beta1.Project projet_;
  /**
   * <code>optional .appscode.auth.v1beta1.Project projet = 2;</code>
   */
  public boolean hasProjet() {
    return projet_ != null;
  }
  /**
   * <code>optional .appscode.auth.v1beta1.Project projet = 2;</code>
   */
  public com.appscode.api.auth.v1beta1.Project getProjet() {
    return projet_ == null ? com.appscode.api.auth.v1beta1.Project.getDefaultInstance() : projet_;
  }
  /**
   * <code>optional .appscode.auth.v1beta1.Project projet = 2;</code>
   */
  public com.appscode.api.auth.v1beta1.ProjectOrBuilder getProjetOrBuilder() {
    return getProjet();
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
    if (projet_ != null) {
      output.writeMessage(2, getProjet());
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
    if (projet_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getProjet());
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
    if (!(obj instanceof com.appscode.api.auth.v1beta1.ProjectMemberListResponse)) {
      return super.equals(obj);
    }
    com.appscode.api.auth.v1beta1.ProjectMemberListResponse other = (com.appscode.api.auth.v1beta1.ProjectMemberListResponse) obj;

    boolean result = true;
    result = result && (hasStatus() == other.hasStatus());
    if (hasStatus()) {
      result = result && getStatus()
          .equals(other.getStatus());
    }
    result = result && (hasProjet() == other.hasProjet());
    if (hasProjet()) {
      result = result && getProjet()
          .equals(other.getProjet());
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
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    if (hasProjet()) {
      hash = (37 * hash) + PROJET_FIELD_NUMBER;
      hash = (53 * hash) + getProjet().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.auth.v1beta1.ProjectMemberListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.auth.v1beta1.ProjectMemberListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.auth.v1beta1.ProjectMemberListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.auth.v1beta1.ProjectMemberListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.auth.v1beta1.ProjectMemberListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.auth.v1beta1.ProjectMemberListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.auth.v1beta1.ProjectMemberListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.auth.v1beta1.ProjectMemberListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.auth.v1beta1.ProjectMemberListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.auth.v1beta1.ProjectMemberListResponse parseFrom(
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
  public static Builder newBuilder(com.appscode.api.auth.v1beta1.ProjectMemberListResponse prototype) {
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
   * Protobuf type {@code appscode.auth.v1beta1.ProjectMemberListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.auth.v1beta1.ProjectMemberListResponse)
      com.appscode.api.auth.v1beta1.ProjectMemberListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.auth.v1beta1.ProjectProto.internal_static_appscode_auth_v1beta1_ProjectMemberListResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.auth.v1beta1.ProjectProto.internal_static_appscode_auth_v1beta1_ProjectMemberListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.auth.v1beta1.ProjectMemberListResponse.class, com.appscode.api.auth.v1beta1.ProjectMemberListResponse.Builder.class);
    }

    // Construct using com.appscode.api.auth.v1beta1.ProjectMemberListResponse.newBuilder()
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
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      if (projetBuilder_ == null) {
        projet_ = null;
      } else {
        projet_ = null;
        projetBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.auth.v1beta1.ProjectProto.internal_static_appscode_auth_v1beta1_ProjectMemberListResponse_descriptor;
    }

    public com.appscode.api.auth.v1beta1.ProjectMemberListResponse getDefaultInstanceForType() {
      return com.appscode.api.auth.v1beta1.ProjectMemberListResponse.getDefaultInstance();
    }

    public com.appscode.api.auth.v1beta1.ProjectMemberListResponse build() {
      com.appscode.api.auth.v1beta1.ProjectMemberListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.auth.v1beta1.ProjectMemberListResponse buildPartial() {
      com.appscode.api.auth.v1beta1.ProjectMemberListResponse result = new com.appscode.api.auth.v1beta1.ProjectMemberListResponse(this);
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (projetBuilder_ == null) {
        result.projet_ = projet_;
      } else {
        result.projet_ = projetBuilder_.build();
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
      if (other instanceof com.appscode.api.auth.v1beta1.ProjectMemberListResponse) {
        return mergeFrom((com.appscode.api.auth.v1beta1.ProjectMemberListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.auth.v1beta1.ProjectMemberListResponse other) {
      if (other == com.appscode.api.auth.v1beta1.ProjectMemberListResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (other.hasProjet()) {
        mergeProjet(other.getProjet());
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
      com.appscode.api.auth.v1beta1.ProjectMemberListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.auth.v1beta1.ProjectMemberListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private com.appscode.api.auth.v1beta1.Project projet_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.auth.v1beta1.Project, com.appscode.api.auth.v1beta1.Project.Builder, com.appscode.api.auth.v1beta1.ProjectOrBuilder> projetBuilder_;
    /**
     * <code>optional .appscode.auth.v1beta1.Project projet = 2;</code>
     */
    public boolean hasProjet() {
      return projetBuilder_ != null || projet_ != null;
    }
    /**
     * <code>optional .appscode.auth.v1beta1.Project projet = 2;</code>
     */
    public com.appscode.api.auth.v1beta1.Project getProjet() {
      if (projetBuilder_ == null) {
        return projet_ == null ? com.appscode.api.auth.v1beta1.Project.getDefaultInstance() : projet_;
      } else {
        return projetBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .appscode.auth.v1beta1.Project projet = 2;</code>
     */
    public Builder setProjet(com.appscode.api.auth.v1beta1.Project value) {
      if (projetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        projet_ = value;
        onChanged();
      } else {
        projetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.auth.v1beta1.Project projet = 2;</code>
     */
    public Builder setProjet(
        com.appscode.api.auth.v1beta1.Project.Builder builderForValue) {
      if (projetBuilder_ == null) {
        projet_ = builderForValue.build();
        onChanged();
      } else {
        projetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .appscode.auth.v1beta1.Project projet = 2;</code>
     */
    public Builder mergeProjet(com.appscode.api.auth.v1beta1.Project value) {
      if (projetBuilder_ == null) {
        if (projet_ != null) {
          projet_ =
            com.appscode.api.auth.v1beta1.Project.newBuilder(projet_).mergeFrom(value).buildPartial();
        } else {
          projet_ = value;
        }
        onChanged();
      } else {
        projetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.auth.v1beta1.Project projet = 2;</code>
     */
    public Builder clearProjet() {
      if (projetBuilder_ == null) {
        projet_ = null;
        onChanged();
      } else {
        projet_ = null;
        projetBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .appscode.auth.v1beta1.Project projet = 2;</code>
     */
    public com.appscode.api.auth.v1beta1.Project.Builder getProjetBuilder() {
      
      onChanged();
      return getProjetFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .appscode.auth.v1beta1.Project projet = 2;</code>
     */
    public com.appscode.api.auth.v1beta1.ProjectOrBuilder getProjetOrBuilder() {
      if (projetBuilder_ != null) {
        return projetBuilder_.getMessageOrBuilder();
      } else {
        return projet_ == null ?
            com.appscode.api.auth.v1beta1.Project.getDefaultInstance() : projet_;
      }
    }
    /**
     * <code>optional .appscode.auth.v1beta1.Project projet = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.auth.v1beta1.Project, com.appscode.api.auth.v1beta1.Project.Builder, com.appscode.api.auth.v1beta1.ProjectOrBuilder> 
        getProjetFieldBuilder() {
      if (projetBuilder_ == null) {
        projetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.auth.v1beta1.Project, com.appscode.api.auth.v1beta1.Project.Builder, com.appscode.api.auth.v1beta1.ProjectOrBuilder>(
                getProjet(),
                getParentForChildren(),
                isClean());
        projet_ = null;
      }
      return projetBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.auth.v1beta1.ProjectMemberListResponse)
  }

  // @@protoc_insertion_point(class_scope:appscode.auth.v1beta1.ProjectMemberListResponse)
  private static final com.appscode.api.auth.v1beta1.ProjectMemberListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.auth.v1beta1.ProjectMemberListResponse();
  }

  public static com.appscode.api.auth.v1beta1.ProjectMemberListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProjectMemberListResponse>
      PARSER = new com.google.protobuf.AbstractParser<ProjectMemberListResponse>() {
    public ProjectMemberListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProjectMemberListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProjectMemberListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProjectMemberListResponse> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.auth.v1beta1.ProjectMemberListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
