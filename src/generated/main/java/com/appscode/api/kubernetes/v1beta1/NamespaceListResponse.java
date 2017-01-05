// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/client.proto

package com.appscode.api.kubernetes.v1beta1;

/**
 * Protobuf type {@code appscode.kubernetes.v1beta1.NamespaceListResponse}
 */
public  final class NamespaceListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta1.NamespaceListResponse)
    NamespaceListResponseOrBuilder {
  // Use NamespaceListResponse.newBuilder() to construct.
  private NamespaceListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NamespaceListResponse() {
    namespaces_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private NamespaceListResponse(
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
              namespaces_ = new java.util.ArrayList<com.appscode.api.kubernetes.v1beta1.Namespace>();
              mutable_bitField0_ |= 0x00000002;
            }
            namespaces_.add(
                input.readMessage(com.appscode.api.kubernetes.v1beta1.Namespace.parser(), extensionRegistry));
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
        namespaces_ = java.util.Collections.unmodifiableList(namespaces_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.appscode.api.kubernetes.v1beta1.ClientProto.internal_static_appscode_kubernetes_v1beta1_NamespaceListResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta1.ClientProto.internal_static_appscode_kubernetes_v1beta1_NamespaceListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta1.NamespaceListResponse.class, com.appscode.api.kubernetes.v1beta1.NamespaceListResponse.Builder.class);
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

  public static final int NAMESPACES_FIELD_NUMBER = 2;
  private java.util.List<com.appscode.api.kubernetes.v1beta1.Namespace> namespaces_;
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
   */
  public java.util.List<com.appscode.api.kubernetes.v1beta1.Namespace> getNamespacesList() {
    return namespaces_;
  }
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
   */
  public java.util.List<? extends com.appscode.api.kubernetes.v1beta1.NamespaceOrBuilder> 
      getNamespacesOrBuilderList() {
    return namespaces_;
  }
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
   */
  public int getNamespacesCount() {
    return namespaces_.size();
  }
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
   */
  public com.appscode.api.kubernetes.v1beta1.Namespace getNamespaces(int index) {
    return namespaces_.get(index);
  }
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
   */
  public com.appscode.api.kubernetes.v1beta1.NamespaceOrBuilder getNamespacesOrBuilder(
      int index) {
    return namespaces_.get(index);
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
    for (int i = 0; i < namespaces_.size(); i++) {
      output.writeMessage(2, namespaces_.get(i));
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
    for (int i = 0; i < namespaces_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, namespaces_.get(i));
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta1.NamespaceListResponse)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta1.NamespaceListResponse other = (com.appscode.api.kubernetes.v1beta1.NamespaceListResponse) obj;

    boolean result = true;
    result = result && (hasStatus() == other.hasStatus());
    if (hasStatus()) {
      result = result && getStatus()
          .equals(other.getStatus());
    }
    result = result && getNamespacesList()
        .equals(other.getNamespacesList());
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
    if (getNamespacesCount() > 0) {
      hash = (37 * hash) + NAMESPACES_FIELD_NUMBER;
      hash = (53 * hash) + getNamespacesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta1.NamespaceListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta1.NamespaceListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.NamespaceListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta1.NamespaceListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.NamespaceListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta1.NamespaceListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.NamespaceListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta1.NamespaceListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.NamespaceListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta1.NamespaceListResponse parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta1.NamespaceListResponse prototype) {
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
   * Protobuf type {@code appscode.kubernetes.v1beta1.NamespaceListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta1.NamespaceListResponse)
      com.appscode.api.kubernetes.v1beta1.NamespaceListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta1.ClientProto.internal_static_appscode_kubernetes_v1beta1_NamespaceListResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta1.ClientProto.internal_static_appscode_kubernetes_v1beta1_NamespaceListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta1.NamespaceListResponse.class, com.appscode.api.kubernetes.v1beta1.NamespaceListResponse.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta1.NamespaceListResponse.newBuilder()
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
        getNamespacesFieldBuilder();
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
      if (namespacesBuilder_ == null) {
        namespaces_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        namespacesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta1.ClientProto.internal_static_appscode_kubernetes_v1beta1_NamespaceListResponse_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta1.NamespaceListResponse getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta1.NamespaceListResponse.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta1.NamespaceListResponse build() {
      com.appscode.api.kubernetes.v1beta1.NamespaceListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta1.NamespaceListResponse buildPartial() {
      com.appscode.api.kubernetes.v1beta1.NamespaceListResponse result = new com.appscode.api.kubernetes.v1beta1.NamespaceListResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (namespacesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          namespaces_ = java.util.Collections.unmodifiableList(namespaces_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.namespaces_ = namespaces_;
      } else {
        result.namespaces_ = namespacesBuilder_.build();
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
      if (other instanceof com.appscode.api.kubernetes.v1beta1.NamespaceListResponse) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta1.NamespaceListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta1.NamespaceListResponse other) {
      if (other == com.appscode.api.kubernetes.v1beta1.NamespaceListResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (namespacesBuilder_ == null) {
        if (!other.namespaces_.isEmpty()) {
          if (namespaces_.isEmpty()) {
            namespaces_ = other.namespaces_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureNamespacesIsMutable();
            namespaces_.addAll(other.namespaces_);
          }
          onChanged();
        }
      } else {
        if (!other.namespaces_.isEmpty()) {
          if (namespacesBuilder_.isEmpty()) {
            namespacesBuilder_.dispose();
            namespacesBuilder_ = null;
            namespaces_ = other.namespaces_;
            bitField0_ = (bitField0_ & ~0x00000002);
            namespacesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNamespacesFieldBuilder() : null;
          } else {
            namespacesBuilder_.addAllMessages(other.namespaces_);
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
      com.appscode.api.kubernetes.v1beta1.NamespaceListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta1.NamespaceListResponse) e.getUnfinishedMessage();
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

    private java.util.List<com.appscode.api.kubernetes.v1beta1.Namespace> namespaces_ =
      java.util.Collections.emptyList();
    private void ensureNamespacesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        namespaces_ = new java.util.ArrayList<com.appscode.api.kubernetes.v1beta1.Namespace>(namespaces_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta1.Namespace, com.appscode.api.kubernetes.v1beta1.Namespace.Builder, com.appscode.api.kubernetes.v1beta1.NamespaceOrBuilder> namespacesBuilder_;

    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public java.util.List<com.appscode.api.kubernetes.v1beta1.Namespace> getNamespacesList() {
      if (namespacesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(namespaces_);
      } else {
        return namespacesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public int getNamespacesCount() {
      if (namespacesBuilder_ == null) {
        return namespaces_.size();
      } else {
        return namespacesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta1.Namespace getNamespaces(int index) {
      if (namespacesBuilder_ == null) {
        return namespaces_.get(index);
      } else {
        return namespacesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public Builder setNamespaces(
        int index, com.appscode.api.kubernetes.v1beta1.Namespace value) {
      if (namespacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamespacesIsMutable();
        namespaces_.set(index, value);
        onChanged();
      } else {
        namespacesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public Builder setNamespaces(
        int index, com.appscode.api.kubernetes.v1beta1.Namespace.Builder builderForValue) {
      if (namespacesBuilder_ == null) {
        ensureNamespacesIsMutable();
        namespaces_.set(index, builderForValue.build());
        onChanged();
      } else {
        namespacesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public Builder addNamespaces(com.appscode.api.kubernetes.v1beta1.Namespace value) {
      if (namespacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamespacesIsMutable();
        namespaces_.add(value);
        onChanged();
      } else {
        namespacesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public Builder addNamespaces(
        int index, com.appscode.api.kubernetes.v1beta1.Namespace value) {
      if (namespacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamespacesIsMutable();
        namespaces_.add(index, value);
        onChanged();
      } else {
        namespacesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public Builder addNamespaces(
        com.appscode.api.kubernetes.v1beta1.Namespace.Builder builderForValue) {
      if (namespacesBuilder_ == null) {
        ensureNamespacesIsMutable();
        namespaces_.add(builderForValue.build());
        onChanged();
      } else {
        namespacesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public Builder addNamespaces(
        int index, com.appscode.api.kubernetes.v1beta1.Namespace.Builder builderForValue) {
      if (namespacesBuilder_ == null) {
        ensureNamespacesIsMutable();
        namespaces_.add(index, builderForValue.build());
        onChanged();
      } else {
        namespacesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public Builder addAllNamespaces(
        java.lang.Iterable<? extends com.appscode.api.kubernetes.v1beta1.Namespace> values) {
      if (namespacesBuilder_ == null) {
        ensureNamespacesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, namespaces_);
        onChanged();
      } else {
        namespacesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public Builder clearNamespaces() {
      if (namespacesBuilder_ == null) {
        namespaces_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        namespacesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public Builder removeNamespaces(int index) {
      if (namespacesBuilder_ == null) {
        ensureNamespacesIsMutable();
        namespaces_.remove(index);
        onChanged();
      } else {
        namespacesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta1.Namespace.Builder getNamespacesBuilder(
        int index) {
      return getNamespacesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta1.NamespaceOrBuilder getNamespacesOrBuilder(
        int index) {
      if (namespacesBuilder_ == null) {
        return namespaces_.get(index);  } else {
        return namespacesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public java.util.List<? extends com.appscode.api.kubernetes.v1beta1.NamespaceOrBuilder> 
         getNamespacesOrBuilderList() {
      if (namespacesBuilder_ != null) {
        return namespacesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(namespaces_);
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta1.Namespace.Builder addNamespacesBuilder() {
      return getNamespacesFieldBuilder().addBuilder(
          com.appscode.api.kubernetes.v1beta1.Namespace.getDefaultInstance());
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public com.appscode.api.kubernetes.v1beta1.Namespace.Builder addNamespacesBuilder(
        int index) {
      return getNamespacesFieldBuilder().addBuilder(
          index, com.appscode.api.kubernetes.v1beta1.Namespace.getDefaultInstance());
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.Namespace namespaces = 2;</code>
     */
    public java.util.List<com.appscode.api.kubernetes.v1beta1.Namespace.Builder> 
         getNamespacesBuilderList() {
      return getNamespacesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta1.Namespace, com.appscode.api.kubernetes.v1beta1.Namespace.Builder, com.appscode.api.kubernetes.v1beta1.NamespaceOrBuilder> 
        getNamespacesFieldBuilder() {
      if (namespacesBuilder_ == null) {
        namespacesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.appscode.api.kubernetes.v1beta1.Namespace, com.appscode.api.kubernetes.v1beta1.Namespace.Builder, com.appscode.api.kubernetes.v1beta1.NamespaceOrBuilder>(
                namespaces_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        namespaces_ = null;
      }
      return namespacesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta1.NamespaceListResponse)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta1.NamespaceListResponse)
  private static final com.appscode.api.kubernetes.v1beta1.NamespaceListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta1.NamespaceListResponse();
  }

  public static com.appscode.api.kubernetes.v1beta1.NamespaceListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NamespaceListResponse>
      PARSER = new com.google.protobuf.AbstractParser<NamespaceListResponse>() {
    public NamespaceListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new NamespaceListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NamespaceListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NamespaceListResponse> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta1.NamespaceListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

