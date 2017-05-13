// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

/**
 * Protobuf type {@code appscode.kubernetes.v1beta2.ListResourceResponse}
 */
public  final class ListResourceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta2.ListResourceResponse)
    ListResourceResponseOrBuilder {
  // Use ListResourceResponse.newBuilder() to construct.
  private ListResourceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListResourceResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListResourceResponse(
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
            com.appscode.api.kubernetes.v1beta2.KubeResourceList.Builder subBuilder = null;
            if (resources_ != null) {
              subBuilder = resources_.toBuilder();
            }
            resources_ = input.readMessage(com.appscode.api.kubernetes.v1beta2.KubeResourceList.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(resources_);
              resources_ = subBuilder.buildPartial();
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
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_ListResourceResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_ListResourceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta2.ListResourceResponse.class, com.appscode.api.kubernetes.v1beta2.ListResourceResponse.Builder.class);
  }

  public static final int RESOURCES_FIELD_NUMBER = 1;
  private com.appscode.api.kubernetes.v1beta2.KubeResourceList resources_;
  /**
   * <code>.appscode.kubernetes.v1beta2.KubeResourceList resources = 1;</code>
   */
  public boolean hasResources() {
    return resources_ != null;
  }
  /**
   * <code>.appscode.kubernetes.v1beta2.KubeResourceList resources = 1;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.KubeResourceList getResources() {
    return resources_ == null ? com.appscode.api.kubernetes.v1beta2.KubeResourceList.getDefaultInstance() : resources_;
  }
  /**
   * <code>.appscode.kubernetes.v1beta2.KubeResourceList resources = 1;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.KubeResourceListOrBuilder getResourcesOrBuilder() {
    return getResources();
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
    if (resources_ != null) {
      output.writeMessage(1, getResources());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resources_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResources());
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta2.ListResourceResponse)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta2.ListResourceResponse other = (com.appscode.api.kubernetes.v1beta2.ListResourceResponse) obj;

    boolean result = true;
    result = result && (hasResources() == other.hasResources());
    if (hasResources()) {
      result = result && getResources()
          .equals(other.getResources());
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
    if (hasResources()) {
      hash = (37 * hash) + RESOURCES_FIELD_NUMBER;
      hash = (53 * hash) + getResources().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta2.ListResourceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.ListResourceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.ListResourceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.ListResourceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.ListResourceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.ListResourceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.ListResourceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.ListResourceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.ListResourceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.ListResourceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.ListResourceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.ListResourceResponse parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta2.ListResourceResponse prototype) {
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
   * Protobuf type {@code appscode.kubernetes.v1beta2.ListResourceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta2.ListResourceResponse)
      com.appscode.api.kubernetes.v1beta2.ListResourceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_ListResourceResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_ListResourceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta2.ListResourceResponse.class, com.appscode.api.kubernetes.v1beta2.ListResourceResponse.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta2.ListResourceResponse.newBuilder()
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
      if (resourcesBuilder_ == null) {
        resources_ = null;
      } else {
        resources_ = null;
        resourcesBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_ListResourceResponse_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta2.ListResourceResponse getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta2.ListResourceResponse.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta2.ListResourceResponse build() {
      com.appscode.api.kubernetes.v1beta2.ListResourceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta2.ListResourceResponse buildPartial() {
      com.appscode.api.kubernetes.v1beta2.ListResourceResponse result = new com.appscode.api.kubernetes.v1beta2.ListResourceResponse(this);
      if (resourcesBuilder_ == null) {
        result.resources_ = resources_;
      } else {
        result.resources_ = resourcesBuilder_.build();
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
      if (other instanceof com.appscode.api.kubernetes.v1beta2.ListResourceResponse) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta2.ListResourceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta2.ListResourceResponse other) {
      if (other == com.appscode.api.kubernetes.v1beta2.ListResourceResponse.getDefaultInstance()) return this;
      if (other.hasResources()) {
        mergeResources(other.getResources());
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
      com.appscode.api.kubernetes.v1beta2.ListResourceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta2.ListResourceResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appscode.api.kubernetes.v1beta2.KubeResourceList resources_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.KubeResourceList, com.appscode.api.kubernetes.v1beta2.KubeResourceList.Builder, com.appscode.api.kubernetes.v1beta2.KubeResourceListOrBuilder> resourcesBuilder_;
    /**
     * <code>.appscode.kubernetes.v1beta2.KubeResourceList resources = 1;</code>
     */
    public boolean hasResources() {
      return resourcesBuilder_ != null || resources_ != null;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.KubeResourceList resources = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.KubeResourceList getResources() {
      if (resourcesBuilder_ == null) {
        return resources_ == null ? com.appscode.api.kubernetes.v1beta2.KubeResourceList.getDefaultInstance() : resources_;
      } else {
        return resourcesBuilder_.getMessage();
      }
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.KubeResourceList resources = 1;</code>
     */
    public Builder setResources(com.appscode.api.kubernetes.v1beta2.KubeResourceList value) {
      if (resourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resources_ = value;
        onChanged();
      } else {
        resourcesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.KubeResourceList resources = 1;</code>
     */
    public Builder setResources(
        com.appscode.api.kubernetes.v1beta2.KubeResourceList.Builder builderForValue) {
      if (resourcesBuilder_ == null) {
        resources_ = builderForValue.build();
        onChanged();
      } else {
        resourcesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.KubeResourceList resources = 1;</code>
     */
    public Builder mergeResources(com.appscode.api.kubernetes.v1beta2.KubeResourceList value) {
      if (resourcesBuilder_ == null) {
        if (resources_ != null) {
          resources_ =
            com.appscode.api.kubernetes.v1beta2.KubeResourceList.newBuilder(resources_).mergeFrom(value).buildPartial();
        } else {
          resources_ = value;
        }
        onChanged();
      } else {
        resourcesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.KubeResourceList resources = 1;</code>
     */
    public Builder clearResources() {
      if (resourcesBuilder_ == null) {
        resources_ = null;
        onChanged();
      } else {
        resources_ = null;
        resourcesBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.KubeResourceList resources = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.KubeResourceList.Builder getResourcesBuilder() {
      
      onChanged();
      return getResourcesFieldBuilder().getBuilder();
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.KubeResourceList resources = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.KubeResourceListOrBuilder getResourcesOrBuilder() {
      if (resourcesBuilder_ != null) {
        return resourcesBuilder_.getMessageOrBuilder();
      } else {
        return resources_ == null ?
            com.appscode.api.kubernetes.v1beta2.KubeResourceList.getDefaultInstance() : resources_;
      }
    }
    /**
     * <code>.appscode.kubernetes.v1beta2.KubeResourceList resources = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.KubeResourceList, com.appscode.api.kubernetes.v1beta2.KubeResourceList.Builder, com.appscode.api.kubernetes.v1beta2.KubeResourceListOrBuilder> 
        getResourcesFieldBuilder() {
      if (resourcesBuilder_ == null) {
        resourcesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.kubernetes.v1beta2.KubeResourceList, com.appscode.api.kubernetes.v1beta2.KubeResourceList.Builder, com.appscode.api.kubernetes.v1beta2.KubeResourceListOrBuilder>(
                getResources(),
                getParentForChildren(),
                isClean());
        resources_ = null;
      }
      return resourcesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta2.ListResourceResponse)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta2.ListResourceResponse)
  private static final com.appscode.api.kubernetes.v1beta2.ListResourceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta2.ListResourceResponse();
  }

  public static com.appscode.api.kubernetes.v1beta2.ListResourceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListResourceResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListResourceResponse>() {
    public ListResourceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListResourceResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListResourceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListResourceResponse> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta2.ListResourceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

