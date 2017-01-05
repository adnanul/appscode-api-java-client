// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/loadbalancer.proto

package com.appscode.api.loadbalancer.v1beta1;

/**
 * Protobuf type {@code appscode.kubernetes.v1beta1.Status}
 */
public  final class Status extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta1.Status)
    StatusOrBuilder {
  // Use Status.newBuilder() to construct.
  private Status(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Status() {
    status_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Status(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              status_ = new java.util.ArrayList<com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus>();
              mutable_bitField0_ |= 0x00000001;
            }
            status_.add(
                input.readMessage(com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        status_ = java.util.Collections.unmodifiableList(status_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.appscode.api.loadbalancer.v1beta1.LoadBalancerProto.internal_static_appscode_kubernetes_v1beta1_Status_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.loadbalancer.v1beta1.LoadBalancerProto.internal_static_appscode_kubernetes_v1beta1_Status_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.loadbalancer.v1beta1.Status.class, com.appscode.api.loadbalancer.v1beta1.Status.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private java.util.List<com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus> status_;
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
   */
  public java.util.List<com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus> getStatusList() {
    return status_;
  }
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
   */
  public java.util.List<? extends com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatusOrBuilder> 
      getStatusOrBuilderList() {
    return status_;
  }
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
   */
  public int getStatusCount() {
    return status_.size();
  }
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
   */
  public com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus getStatus(int index) {
    return status_.get(index);
  }
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
   */
  public com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatusOrBuilder getStatusOrBuilder(
      int index) {
    return status_.get(index);
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
    for (int i = 0; i < status_.size(); i++) {
      output.writeMessage(1, status_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < status_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, status_.get(i));
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
    if (!(obj instanceof com.appscode.api.loadbalancer.v1beta1.Status)) {
      return super.equals(obj);
    }
    com.appscode.api.loadbalancer.v1beta1.Status other = (com.appscode.api.loadbalancer.v1beta1.Status) obj;

    boolean result = true;
    result = result && getStatusList()
        .equals(other.getStatusList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getStatusCount() > 0) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatusList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.loadbalancer.v1beta1.Status parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Status parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Status parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Status parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Status parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Status parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Status parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Status parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Status parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Status parseFrom(
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
  public static Builder newBuilder(com.appscode.api.loadbalancer.v1beta1.Status prototype) {
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
   * Protobuf type {@code appscode.kubernetes.v1beta1.Status}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta1.Status)
      com.appscode.api.loadbalancer.v1beta1.StatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.loadbalancer.v1beta1.LoadBalancerProto.internal_static_appscode_kubernetes_v1beta1_Status_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.loadbalancer.v1beta1.LoadBalancerProto.internal_static_appscode_kubernetes_v1beta1_Status_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.loadbalancer.v1beta1.Status.class, com.appscode.api.loadbalancer.v1beta1.Status.Builder.class);
    }

    // Construct using com.appscode.api.loadbalancer.v1beta1.Status.newBuilder()
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
        getStatusFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (statusBuilder_ == null) {
        status_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        statusBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.loadbalancer.v1beta1.LoadBalancerProto.internal_static_appscode_kubernetes_v1beta1_Status_descriptor;
    }

    public com.appscode.api.loadbalancer.v1beta1.Status getDefaultInstanceForType() {
      return com.appscode.api.loadbalancer.v1beta1.Status.getDefaultInstance();
    }

    public com.appscode.api.loadbalancer.v1beta1.Status build() {
      com.appscode.api.loadbalancer.v1beta1.Status result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.loadbalancer.v1beta1.Status buildPartial() {
      com.appscode.api.loadbalancer.v1beta1.Status result = new com.appscode.api.loadbalancer.v1beta1.Status(this);
      int from_bitField0_ = bitField0_;
      if (statusBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          status_ = java.util.Collections.unmodifiableList(status_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
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
      if (other instanceof com.appscode.api.loadbalancer.v1beta1.Status) {
        return mergeFrom((com.appscode.api.loadbalancer.v1beta1.Status)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.loadbalancer.v1beta1.Status other) {
      if (other == com.appscode.api.loadbalancer.v1beta1.Status.getDefaultInstance()) return this;
      if (statusBuilder_ == null) {
        if (!other.status_.isEmpty()) {
          if (status_.isEmpty()) {
            status_ = other.status_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStatusIsMutable();
            status_.addAll(other.status_);
          }
          onChanged();
        }
      } else {
        if (!other.status_.isEmpty()) {
          if (statusBuilder_.isEmpty()) {
            statusBuilder_.dispose();
            statusBuilder_ = null;
            status_ = other.status_;
            bitField0_ = (bitField0_ & ~0x00000001);
            statusBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStatusFieldBuilder() : null;
          } else {
            statusBuilder_.addAllMessages(other.status_);
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
      com.appscode.api.loadbalancer.v1beta1.Status parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.loadbalancer.v1beta1.Status) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus> status_ =
      java.util.Collections.emptyList();
    private void ensureStatusIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        status_ = new java.util.ArrayList<com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus>(status_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus, com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus.Builder, com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatusOrBuilder> statusBuilder_;

    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public java.util.List<com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus> getStatusList() {
      if (statusBuilder_ == null) {
        return java.util.Collections.unmodifiableList(status_);
      } else {
        return statusBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public int getStatusCount() {
      if (statusBuilder_ == null) {
        return status_.size();
      } else {
        return statusBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus getStatus(int index) {
      if (statusBuilder_ == null) {
        return status_.get(index);
      } else {
        return statusBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public Builder setStatus(
        int index, com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatusIsMutable();
        status_.set(index, value);
        onChanged();
      } else {
        statusBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public Builder setStatus(
        int index, com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus.Builder builderForValue) {
      if (statusBuilder_ == null) {
        ensureStatusIsMutable();
        status_.set(index, builderForValue.build());
        onChanged();
      } else {
        statusBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public Builder addStatus(com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatusIsMutable();
        status_.add(value);
        onChanged();
      } else {
        statusBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public Builder addStatus(
        int index, com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatusIsMutable();
        status_.add(index, value);
        onChanged();
      } else {
        statusBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public Builder addStatus(
        com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus.Builder builderForValue) {
      if (statusBuilder_ == null) {
        ensureStatusIsMutable();
        status_.add(builderForValue.build());
        onChanged();
      } else {
        statusBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public Builder addStatus(
        int index, com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus.Builder builderForValue) {
      if (statusBuilder_ == null) {
        ensureStatusIsMutable();
        status_.add(index, builderForValue.build());
        onChanged();
      } else {
        statusBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public Builder addAllStatus(
        java.lang.Iterable<? extends com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus> values) {
      if (statusBuilder_ == null) {
        ensureStatusIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, status_);
        onChanged();
      } else {
        statusBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        statusBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public Builder removeStatus(int index) {
      if (statusBuilder_ == null) {
        ensureStatusIsMutable();
        status_.remove(index);
        onChanged();
      } else {
        statusBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus.Builder getStatusBuilder(
        int index) {
      return getStatusFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatusOrBuilder getStatusOrBuilder(
        int index) {
      if (statusBuilder_ == null) {
        return status_.get(index);  } else {
        return statusBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public java.util.List<? extends com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatusOrBuilder> 
         getStatusOrBuilderList() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(status_);
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus.Builder addStatusBuilder() {
      return getStatusFieldBuilder().addBuilder(
          com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus.getDefaultInstance());
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus.Builder addStatusBuilder(
        int index) {
      return getStatusFieldBuilder().addBuilder(
          index, com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus.getDefaultInstance());
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerStatus status = 1;</code>
     */
    public java.util.List<com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus.Builder> 
         getStatusBuilderList() {
      return getStatusFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus, com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus.Builder, com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus, com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatus.Builder, com.appscode.api.loadbalancer.v1beta1.LoadBalancerStatusOrBuilder>(
                status_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta1.Status)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta1.Status)
  private static final com.appscode.api.loadbalancer.v1beta1.Status DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.loadbalancer.v1beta1.Status();
  }

  public static com.appscode.api.loadbalancer.v1beta1.Status getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Status>
      PARSER = new com.google.protobuf.AbstractParser<Status>() {
    public Status parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Status(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Status> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Status> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.loadbalancer.v1beta1.Status getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

