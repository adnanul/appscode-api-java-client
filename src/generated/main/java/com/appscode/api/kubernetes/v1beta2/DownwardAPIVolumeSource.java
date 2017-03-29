// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

/**
 * <pre>
 * DownwardAPIVolumeSource represents a volume containing downward API info.
 * Downward API volumes support ownership management and SELinux relabeling.
 * </pre>
 *
 * Protobuf type {@code appscode.kubernetes.v1beta2.DownwardAPIVolumeSource}
 */
public  final class DownwardAPIVolumeSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta2.DownwardAPIVolumeSource)
    DownwardAPIVolumeSourceOrBuilder {
  // Use DownwardAPIVolumeSource.newBuilder() to construct.
  private DownwardAPIVolumeSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DownwardAPIVolumeSource() {
    items_ = java.util.Collections.emptyList();
    defaultMode_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DownwardAPIVolumeSource(
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
              items_ = new java.util.ArrayList<com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile>();
              mutable_bitField0_ |= 0x00000001;
            }
            items_.add(
                input.readMessage(com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile.parser(), extensionRegistry));
            break;
          }
          case 16: {

            defaultMode_ = input.readInt32();
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
        items_ = java.util.Collections.unmodifiableList(items_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_DownwardAPIVolumeSource_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_DownwardAPIVolumeSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource.class, com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource.Builder.class);
  }

  private int bitField0_;
  public static final int ITEMS_FIELD_NUMBER = 1;
  private java.util.List<com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile> items_;
  /**
   * <pre>
   * Items is a list of downward API volume file
   * +optional
   * </pre>
   *
   * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
   */
  public java.util.List<com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile> getItemsList() {
    return items_;
  }
  /**
   * <pre>
   * Items is a list of downward API volume file
   * +optional
   * </pre>
   *
   * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
   */
  public java.util.List<? extends com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFileOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <pre>
   * Items is a list of downward API volume file
   * +optional
   * </pre>
   *
   * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
   */
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <pre>
   * Items is a list of downward API volume file
   * +optional
   * </pre>
   *
   * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile getItems(int index) {
    return items_.get(index);
  }
  /**
   * <pre>
   * Items is a list of downward API volume file
   * +optional
   * </pre>
   *
   * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFileOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
  }

  public static final int DEFAULTMODE_FIELD_NUMBER = 2;
  private int defaultMode_;
  /**
   * <pre>
   * Optional: mode bits to use on created files by default. Must be a
   * value between 0 and 0777. Defaults to 0644.
   * Directories within the path are not affected by this setting.
   * This might be in conflict with other options that affect the file
   * mode, like fsGroup, and the result can be other mode bits set.
   * +optional
   * </pre>
   *
   * <code>optional int32 defaultMode = 2;</code>
   */
  public int getDefaultMode() {
    return defaultMode_;
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
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(1, items_.get(i));
    }
    if (defaultMode_ != 0) {
      output.writeInt32(2, defaultMode_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, items_.get(i));
    }
    if (defaultMode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, defaultMode_);
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource other = (com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource) obj;

    boolean result = true;
    result = result && getItemsList()
        .equals(other.getItemsList());
    result = result && (getDefaultMode()
        == other.getDefaultMode());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (37 * hash) + DEFAULTMODE_FIELD_NUMBER;
    hash = (53 * hash) + getDefaultMode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource prototype) {
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
   * <pre>
   * DownwardAPIVolumeSource represents a volume containing downward API info.
   * Downward API volumes support ownership management and SELinux relabeling.
   * </pre>
   *
   * Protobuf type {@code appscode.kubernetes.v1beta2.DownwardAPIVolumeSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta2.DownwardAPIVolumeSource)
      com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_DownwardAPIVolumeSource_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_DownwardAPIVolumeSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource.class, com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource.newBuilder()
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
        getItemsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        itemsBuilder_.clear();
      }
      defaultMode_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_DownwardAPIVolumeSource_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource build() {
      com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource buildPartial() {
      com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource result = new com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
      result.defaultMode_ = defaultMode_;
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
      if (other instanceof com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource other) {
      if (other == com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource.getDefaultInstance()) return this;
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
          }
        }
      }
      if (other.getDefaultMode() != 0) {
        setDefaultMode(other.getDefaultMode());
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
      com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        items_ = new java.util.ArrayList<com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile>(items_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile, com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile.Builder, com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFileOrBuilder> itemsBuilder_;

    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public java.util.List<com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public Builder setItems(
        int index, com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public Builder setItems(
        int index, com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public Builder addItems(com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public Builder addItems(
        int index, com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public Builder addItems(
        com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public Builder addItems(
        int index, com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFileOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public java.util.List<? extends com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFileOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile.getDefaultInstance());
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile.getDefaultInstance());
    }
    /**
     * <pre>
     * Items is a list of downward API volume file
     * +optional
     * </pre>
     *
     * <code>repeated .appscode.kubernetes.v1beta2.DownwardAPIVolumeFile items = 1;</code>
     */
    public java.util.List<com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile, com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile.Builder, com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFileOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile, com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFile.Builder, com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeFileOrBuilder>(
                items_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
    }

    private int defaultMode_ ;
    /**
     * <pre>
     * Optional: mode bits to use on created files by default. Must be a
     * value between 0 and 0777. Defaults to 0644.
     * Directories within the path are not affected by this setting.
     * This might be in conflict with other options that affect the file
     * mode, like fsGroup, and the result can be other mode bits set.
     * +optional
     * </pre>
     *
     * <code>optional int32 defaultMode = 2;</code>
     */
    public int getDefaultMode() {
      return defaultMode_;
    }
    /**
     * <pre>
     * Optional: mode bits to use on created files by default. Must be a
     * value between 0 and 0777. Defaults to 0644.
     * Directories within the path are not affected by this setting.
     * This might be in conflict with other options that affect the file
     * mode, like fsGroup, and the result can be other mode bits set.
     * +optional
     * </pre>
     *
     * <code>optional int32 defaultMode = 2;</code>
     */
    public Builder setDefaultMode(int value) {
      
      defaultMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional: mode bits to use on created files by default. Must be a
     * value between 0 and 0777. Defaults to 0644.
     * Directories within the path are not affected by this setting.
     * This might be in conflict with other options that affect the file
     * mode, like fsGroup, and the result can be other mode bits set.
     * +optional
     * </pre>
     *
     * <code>optional int32 defaultMode = 2;</code>
     */
    public Builder clearDefaultMode() {
      
      defaultMode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta2.DownwardAPIVolumeSource)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta2.DownwardAPIVolumeSource)
  private static final com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource();
  }

  public static com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DownwardAPIVolumeSource>
      PARSER = new com.google.protobuf.AbstractParser<DownwardAPIVolumeSource>() {
    public DownwardAPIVolumeSource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DownwardAPIVolumeSource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DownwardAPIVolumeSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DownwardAPIVolumeSource> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta2.DownwardAPIVolumeSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
