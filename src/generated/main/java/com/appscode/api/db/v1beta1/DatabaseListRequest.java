// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/db/v1beta1/database.proto

package com.appscode.api.db.v1beta1;

/**
 * <pre>
 * Next Id: 4
 * </pre>
 *
 * Protobuf type {@code appscode.db.v1beta1.DatabaseListRequest}
 */
public  final class DatabaseListRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.db.v1beta1.DatabaseListRequest)
    DatabaseListRequestOrBuilder {
  // Use DatabaseListRequest.newBuilder() to construct.
  private DatabaseListRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DatabaseListRequest() {
    cluster_ = "";
    type_ = "";
    status_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DatabaseListRequest(
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

            cluster_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              status_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            status_.add(s);
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        status_ = status_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.appscode.api.db.v1beta1.DatabaseProto.internal_static_appscode_db_v1beta1_DatabaseListRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.db.v1beta1.DatabaseProto.internal_static_appscode_db_v1beta1_DatabaseListRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.db.v1beta1.DatabaseListRequest.class, com.appscode.api.db.v1beta1.DatabaseListRequest.Builder.class);
  }

  private int bitField0_;
  public static final int CLUSTER_FIELD_NUMBER = 1;
  private volatile java.lang.Object cluster_;
  /**
   * <code>optional string cluster = 1;</code>
   */
  public java.lang.String getCluster() {
    java.lang.Object ref = cluster_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cluster_ = s;
      return s;
    }
  }
  /**
   * <code>optional string cluster = 1;</code>
   */
  public com.google.protobuf.ByteString
      getClusterBytes() {
    java.lang.Object ref = cluster_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cluster_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object type_;
  /**
   * <code>optional string type = 2;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>optional string type = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList status_;
  /**
   * <pre>
   * List of status to get the agent filterd on the status
   * values in
   *   PENDING
   *   FAILED
   *   READY
   *   DELETING
   *   DELETED
   *   DESTROYED
   * </pre>
   *
   * <code>repeated string status = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getStatusList() {
    return status_;
  }
  /**
   * <pre>
   * List of status to get the agent filterd on the status
   * values in
   *   PENDING
   *   FAILED
   *   READY
   *   DELETING
   *   DELETED
   *   DESTROYED
   * </pre>
   *
   * <code>repeated string status = 3;</code>
   */
  public int getStatusCount() {
    return status_.size();
  }
  /**
   * <pre>
   * List of status to get the agent filterd on the status
   * values in
   *   PENDING
   *   FAILED
   *   READY
   *   DELETING
   *   DELETED
   *   DESTROYED
   * </pre>
   *
   * <code>repeated string status = 3;</code>
   */
  public java.lang.String getStatus(int index) {
    return status_.get(index);
  }
  /**
   * <pre>
   * List of status to get the agent filterd on the status
   * values in
   *   PENDING
   *   FAILED
   *   READY
   *   DELETING
   *   DELETED
   *   DESTROYED
   * </pre>
   *
   * <code>repeated string status = 3;</code>
   */
  public com.google.protobuf.ByteString
      getStatusBytes(int index) {
    return status_.getByteString(index);
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
    if (!getClusterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cluster_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    for (int i = 0; i < status_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, status_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getClusterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cluster_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < status_.size(); i++) {
        dataSize += computeStringSizeNoTag(status_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStatusList().size();
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
    if (!(obj instanceof com.appscode.api.db.v1beta1.DatabaseListRequest)) {
      return super.equals(obj);
    }
    com.appscode.api.db.v1beta1.DatabaseListRequest other = (com.appscode.api.db.v1beta1.DatabaseListRequest) obj;

    boolean result = true;
    result = result && getCluster()
        .equals(other.getCluster());
    result = result && getType()
        .equals(other.getType());
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
    hash = (37 * hash) + CLUSTER_FIELD_NUMBER;
    hash = (53 * hash) + getCluster().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    if (getStatusCount() > 0) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatusList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.db.v1beta1.DatabaseListRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.db.v1beta1.DatabaseListRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.db.v1beta1.DatabaseListRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.db.v1beta1.DatabaseListRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.db.v1beta1.DatabaseListRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.db.v1beta1.DatabaseListRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.db.v1beta1.DatabaseListRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.db.v1beta1.DatabaseListRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.db.v1beta1.DatabaseListRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.db.v1beta1.DatabaseListRequest parseFrom(
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
  public static Builder newBuilder(com.appscode.api.db.v1beta1.DatabaseListRequest prototype) {
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
   * Next Id: 4
   * </pre>
   *
   * Protobuf type {@code appscode.db.v1beta1.DatabaseListRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.db.v1beta1.DatabaseListRequest)
      com.appscode.api.db.v1beta1.DatabaseListRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.db.v1beta1.DatabaseProto.internal_static_appscode_db_v1beta1_DatabaseListRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.db.v1beta1.DatabaseProto.internal_static_appscode_db_v1beta1_DatabaseListRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.db.v1beta1.DatabaseListRequest.class, com.appscode.api.db.v1beta1.DatabaseListRequest.Builder.class);
    }

    // Construct using com.appscode.api.db.v1beta1.DatabaseListRequest.newBuilder()
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
      cluster_ = "";

      type_ = "";

      status_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.db.v1beta1.DatabaseProto.internal_static_appscode_db_v1beta1_DatabaseListRequest_descriptor;
    }

    public com.appscode.api.db.v1beta1.DatabaseListRequest getDefaultInstanceForType() {
      return com.appscode.api.db.v1beta1.DatabaseListRequest.getDefaultInstance();
    }

    public com.appscode.api.db.v1beta1.DatabaseListRequest build() {
      com.appscode.api.db.v1beta1.DatabaseListRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.db.v1beta1.DatabaseListRequest buildPartial() {
      com.appscode.api.db.v1beta1.DatabaseListRequest result = new com.appscode.api.db.v1beta1.DatabaseListRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.cluster_ = cluster_;
      result.type_ = type_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        status_ = status_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.status_ = status_;
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
      if (other instanceof com.appscode.api.db.v1beta1.DatabaseListRequest) {
        return mergeFrom((com.appscode.api.db.v1beta1.DatabaseListRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.db.v1beta1.DatabaseListRequest other) {
      if (other == com.appscode.api.db.v1beta1.DatabaseListRequest.getDefaultInstance()) return this;
      if (!other.getCluster().isEmpty()) {
        cluster_ = other.cluster_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (!other.status_.isEmpty()) {
        if (status_.isEmpty()) {
          status_ = other.status_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureStatusIsMutable();
          status_.addAll(other.status_);
        }
        onChanged();
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
      com.appscode.api.db.v1beta1.DatabaseListRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.db.v1beta1.DatabaseListRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object cluster_ = "";
    /**
     * <code>optional string cluster = 1;</code>
     */
    public java.lang.String getCluster() {
      java.lang.Object ref = cluster_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cluster_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string cluster = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClusterBytes() {
      java.lang.Object ref = cluster_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cluster_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string cluster = 1;</code>
     */
    public Builder setCluster(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cluster_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string cluster = 1;</code>
     */
    public Builder clearCluster() {
      
      cluster_ = getDefaultInstance().getCluster();
      onChanged();
      return this;
    }
    /**
     * <code>optional string cluster = 1;</code>
     */
    public Builder setClusterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cluster_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>optional string type = 2;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string type = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string type = 2;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>optional string type = 2;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList status_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureStatusIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        status_ = new com.google.protobuf.LazyStringArrayList(status_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * List of status to get the agent filterd on the status
     * values in
     *   PENDING
     *   FAILED
     *   READY
     *   DELETING
     *   DELETED
     *   DESTROYED
     * </pre>
     *
     * <code>repeated string status = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getStatusList() {
      return status_.getUnmodifiableView();
    }
    /**
     * <pre>
     * List of status to get the agent filterd on the status
     * values in
     *   PENDING
     *   FAILED
     *   READY
     *   DELETING
     *   DELETED
     *   DESTROYED
     * </pre>
     *
     * <code>repeated string status = 3;</code>
     */
    public int getStatusCount() {
      return status_.size();
    }
    /**
     * <pre>
     * List of status to get the agent filterd on the status
     * values in
     *   PENDING
     *   FAILED
     *   READY
     *   DELETING
     *   DELETED
     *   DESTROYED
     * </pre>
     *
     * <code>repeated string status = 3;</code>
     */
    public java.lang.String getStatus(int index) {
      return status_.get(index);
    }
    /**
     * <pre>
     * List of status to get the agent filterd on the status
     * values in
     *   PENDING
     *   FAILED
     *   READY
     *   DELETING
     *   DELETED
     *   DESTROYED
     * </pre>
     *
     * <code>repeated string status = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStatusBytes(int index) {
      return status_.getByteString(index);
    }
    /**
     * <pre>
     * List of status to get the agent filterd on the status
     * values in
     *   PENDING
     *   FAILED
     *   READY
     *   DELETING
     *   DELETED
     *   DESTROYED
     * </pre>
     *
     * <code>repeated string status = 3;</code>
     */
    public Builder setStatus(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStatusIsMutable();
      status_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of status to get the agent filterd on the status
     * values in
     *   PENDING
     *   FAILED
     *   READY
     *   DELETING
     *   DELETED
     *   DESTROYED
     * </pre>
     *
     * <code>repeated string status = 3;</code>
     */
    public Builder addStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStatusIsMutable();
      status_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of status to get the agent filterd on the status
     * values in
     *   PENDING
     *   FAILED
     *   READY
     *   DELETING
     *   DELETED
     *   DESTROYED
     * </pre>
     *
     * <code>repeated string status = 3;</code>
     */
    public Builder addAllStatus(
        java.lang.Iterable<java.lang.String> values) {
      ensureStatusIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, status_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of status to get the agent filterd on the status
     * values in
     *   PENDING
     *   FAILED
     *   READY
     *   DELETING
     *   DELETED
     *   DESTROYED
     * </pre>
     *
     * <code>repeated string status = 3;</code>
     */
    public Builder clearStatus() {
      status_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of status to get the agent filterd on the status
     * values in
     *   PENDING
     *   FAILED
     *   READY
     *   DELETING
     *   DELETED
     *   DESTROYED
     * </pre>
     *
     * <code>repeated string status = 3;</code>
     */
    public Builder addStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureStatusIsMutable();
      status_.add(value);
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


    // @@protoc_insertion_point(builder_scope:appscode.db.v1beta1.DatabaseListRequest)
  }

  // @@protoc_insertion_point(class_scope:appscode.db.v1beta1.DatabaseListRequest)
  private static final com.appscode.api.db.v1beta1.DatabaseListRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.db.v1beta1.DatabaseListRequest();
  }

  public static com.appscode.api.db.v1beta1.DatabaseListRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DatabaseListRequest>
      PARSER = new com.google.protobuf.AbstractParser<DatabaseListRequest>() {
    public DatabaseListRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DatabaseListRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DatabaseListRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DatabaseListRequest> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.db.v1beta1.DatabaseListRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

