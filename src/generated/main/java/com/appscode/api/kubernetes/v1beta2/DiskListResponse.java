// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

/**
 * Protobuf type {@code appscode.kubernetes.v1beta2.DiskListResponse}
 */
public  final class DiskListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta2.DiskListResponse)
    DiskListResponseOrBuilder {
  // Use DiskListResponse.newBuilder() to construct.
  private DiskListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DiskListResponse() {
    disks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DiskListResponse(
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
              disks_ = new java.util.ArrayList<com.appscode.api.kubernetes.v1beta2.Disk>();
              mutable_bitField0_ |= 0x00000001;
            }
            disks_.add(
                input.readMessage(com.appscode.api.kubernetes.v1beta2.Disk.parser(), extensionRegistry));
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
        disks_ = java.util.Collections.unmodifiableList(disks_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_DiskListResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_DiskListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta2.DiskListResponse.class, com.appscode.api.kubernetes.v1beta2.DiskListResponse.Builder.class);
  }

  public static final int DISKS_FIELD_NUMBER = 1;
  private java.util.List<com.appscode.api.kubernetes.v1beta2.Disk> disks_;
  /**
   * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
   */
  public java.util.List<com.appscode.api.kubernetes.v1beta2.Disk> getDisksList() {
    return disks_;
  }
  /**
   * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
   */
  public java.util.List<? extends com.appscode.api.kubernetes.v1beta2.DiskOrBuilder> 
      getDisksOrBuilderList() {
    return disks_;
  }
  /**
   * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
   */
  public int getDisksCount() {
    return disks_.size();
  }
  /**
   * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.Disk getDisks(int index) {
    return disks_.get(index);
  }
  /**
   * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.DiskOrBuilder getDisksOrBuilder(
      int index) {
    return disks_.get(index);
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
    for (int i = 0; i < disks_.size(); i++) {
      output.writeMessage(1, disks_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < disks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, disks_.get(i));
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta2.DiskListResponse)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta2.DiskListResponse other = (com.appscode.api.kubernetes.v1beta2.DiskListResponse) obj;

    boolean result = true;
    result = result && getDisksList()
        .equals(other.getDisksList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getDisksCount() > 0) {
      hash = (37 * hash) + DISKS_FIELD_NUMBER;
      hash = (53 * hash) + getDisksList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta2.DiskListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.DiskListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.DiskListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.DiskListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.DiskListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.DiskListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.DiskListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.DiskListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.DiskListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.DiskListResponse parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta2.DiskListResponse prototype) {
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
   * Protobuf type {@code appscode.kubernetes.v1beta2.DiskListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta2.DiskListResponse)
      com.appscode.api.kubernetes.v1beta2.DiskListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_DiskListResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_DiskListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta2.DiskListResponse.class, com.appscode.api.kubernetes.v1beta2.DiskListResponse.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta2.DiskListResponse.newBuilder()
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
        getDisksFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (disksBuilder_ == null) {
        disks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        disksBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_DiskListResponse_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta2.DiskListResponse getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta2.DiskListResponse.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta2.DiskListResponse build() {
      com.appscode.api.kubernetes.v1beta2.DiskListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta2.DiskListResponse buildPartial() {
      com.appscode.api.kubernetes.v1beta2.DiskListResponse result = new com.appscode.api.kubernetes.v1beta2.DiskListResponse(this);
      int from_bitField0_ = bitField0_;
      if (disksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          disks_ = java.util.Collections.unmodifiableList(disks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.disks_ = disks_;
      } else {
        result.disks_ = disksBuilder_.build();
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
      if (other instanceof com.appscode.api.kubernetes.v1beta2.DiskListResponse) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta2.DiskListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta2.DiskListResponse other) {
      if (other == com.appscode.api.kubernetes.v1beta2.DiskListResponse.getDefaultInstance()) return this;
      if (disksBuilder_ == null) {
        if (!other.disks_.isEmpty()) {
          if (disks_.isEmpty()) {
            disks_ = other.disks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDisksIsMutable();
            disks_.addAll(other.disks_);
          }
          onChanged();
        }
      } else {
        if (!other.disks_.isEmpty()) {
          if (disksBuilder_.isEmpty()) {
            disksBuilder_.dispose();
            disksBuilder_ = null;
            disks_ = other.disks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            disksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDisksFieldBuilder() : null;
          } else {
            disksBuilder_.addAllMessages(other.disks_);
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
      com.appscode.api.kubernetes.v1beta2.DiskListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta2.DiskListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.appscode.api.kubernetes.v1beta2.Disk> disks_ =
      java.util.Collections.emptyList();
    private void ensureDisksIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        disks_ = new java.util.ArrayList<com.appscode.api.kubernetes.v1beta2.Disk>(disks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.Disk, com.appscode.api.kubernetes.v1beta2.Disk.Builder, com.appscode.api.kubernetes.v1beta2.DiskOrBuilder> disksBuilder_;

    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public java.util.List<com.appscode.api.kubernetes.v1beta2.Disk> getDisksList() {
      if (disksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(disks_);
      } else {
        return disksBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public int getDisksCount() {
      if (disksBuilder_ == null) {
        return disks_.size();
      } else {
        return disksBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.Disk getDisks(int index) {
      if (disksBuilder_ == null) {
        return disks_.get(index);
      } else {
        return disksBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public Builder setDisks(
        int index, com.appscode.api.kubernetes.v1beta2.Disk value) {
      if (disksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDisksIsMutable();
        disks_.set(index, value);
        onChanged();
      } else {
        disksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public Builder setDisks(
        int index, com.appscode.api.kubernetes.v1beta2.Disk.Builder builderForValue) {
      if (disksBuilder_ == null) {
        ensureDisksIsMutable();
        disks_.set(index, builderForValue.build());
        onChanged();
      } else {
        disksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public Builder addDisks(com.appscode.api.kubernetes.v1beta2.Disk value) {
      if (disksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDisksIsMutable();
        disks_.add(value);
        onChanged();
      } else {
        disksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public Builder addDisks(
        int index, com.appscode.api.kubernetes.v1beta2.Disk value) {
      if (disksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDisksIsMutable();
        disks_.add(index, value);
        onChanged();
      } else {
        disksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public Builder addDisks(
        com.appscode.api.kubernetes.v1beta2.Disk.Builder builderForValue) {
      if (disksBuilder_ == null) {
        ensureDisksIsMutable();
        disks_.add(builderForValue.build());
        onChanged();
      } else {
        disksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public Builder addDisks(
        int index, com.appscode.api.kubernetes.v1beta2.Disk.Builder builderForValue) {
      if (disksBuilder_ == null) {
        ensureDisksIsMutable();
        disks_.add(index, builderForValue.build());
        onChanged();
      } else {
        disksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public Builder addAllDisks(
        java.lang.Iterable<? extends com.appscode.api.kubernetes.v1beta2.Disk> values) {
      if (disksBuilder_ == null) {
        ensureDisksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, disks_);
        onChanged();
      } else {
        disksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public Builder clearDisks() {
      if (disksBuilder_ == null) {
        disks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        disksBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public Builder removeDisks(int index) {
      if (disksBuilder_ == null) {
        ensureDisksIsMutable();
        disks_.remove(index);
        onChanged();
      } else {
        disksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.Disk.Builder getDisksBuilder(
        int index) {
      return getDisksFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.DiskOrBuilder getDisksOrBuilder(
        int index) {
      if (disksBuilder_ == null) {
        return disks_.get(index);  } else {
        return disksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public java.util.List<? extends com.appscode.api.kubernetes.v1beta2.DiskOrBuilder> 
         getDisksOrBuilderList() {
      if (disksBuilder_ != null) {
        return disksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(disks_);
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.Disk.Builder addDisksBuilder() {
      return getDisksFieldBuilder().addBuilder(
          com.appscode.api.kubernetes.v1beta2.Disk.getDefaultInstance());
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.Disk.Builder addDisksBuilder(
        int index) {
      return getDisksFieldBuilder().addBuilder(
          index, com.appscode.api.kubernetes.v1beta2.Disk.getDefaultInstance());
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta2.Disk disks = 1;</code>
     */
    public java.util.List<com.appscode.api.kubernetes.v1beta2.Disk.Builder> 
         getDisksBuilderList() {
      return getDisksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.Disk, com.appscode.api.kubernetes.v1beta2.Disk.Builder, com.appscode.api.kubernetes.v1beta2.DiskOrBuilder> 
        getDisksFieldBuilder() {
      if (disksBuilder_ == null) {
        disksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.appscode.api.kubernetes.v1beta2.Disk, com.appscode.api.kubernetes.v1beta2.Disk.Builder, com.appscode.api.kubernetes.v1beta2.DiskOrBuilder>(
                disks_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        disks_ = null;
      }
      return disksBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta2.DiskListResponse)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta2.DiskListResponse)
  private static final com.appscode.api.kubernetes.v1beta2.DiskListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta2.DiskListResponse();
  }

  public static com.appscode.api.kubernetes.v1beta2.DiskListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiskListResponse>
      PARSER = new com.google.protobuf.AbstractParser<DiskListResponse>() {
    public DiskListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DiskListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DiskListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiskListResponse> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta2.DiskListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

