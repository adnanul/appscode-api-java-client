// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/db/v1beta1/snapshot.proto

package com.appscode.api.db.v1beta1;

/**
 * <pre>
 * Next Id: 3
 * </pre>
 *
 * Protobuf type {@code appscode.db.v1beta1.BackupUnscheduleRequest}
 */
public  final class BackupUnscheduleRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.db.v1beta1.BackupUnscheduleRequest)
    BackupUnscheduleRequestOrBuilder {
  // Use BackupUnscheduleRequest.newBuilder() to construct.
  private BackupUnscheduleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BackupUnscheduleRequest() {
    cluster_ = "";
    uid_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private BackupUnscheduleRequest(
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

            uid_ = s;
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
    return com.appscode.api.db.v1beta1.SnapshotProto.internal_static_appscode_db_v1beta1_BackupUnscheduleRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.db.v1beta1.SnapshotProto.internal_static_appscode_db_v1beta1_BackupUnscheduleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.db.v1beta1.BackupUnscheduleRequest.class, com.appscode.api.db.v1beta1.BackupUnscheduleRequest.Builder.class);
  }

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

  public static final int UID_FIELD_NUMBER = 2;
  private volatile java.lang.Object uid_;
  /**
   * <code>optional string uid = 2;</code>
   */
  public java.lang.String getUid() {
    java.lang.Object ref = uid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uid_ = s;
      return s;
    }
  }
  /**
   * <code>optional string uid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUidBytes() {
    java.lang.Object ref = uid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getUidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uid_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getClusterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cluster_);
    }
    if (!getUidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uid_);
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
    if (!(obj instanceof com.appscode.api.db.v1beta1.BackupUnscheduleRequest)) {
      return super.equals(obj);
    }
    com.appscode.api.db.v1beta1.BackupUnscheduleRequest other = (com.appscode.api.db.v1beta1.BackupUnscheduleRequest) obj;

    boolean result = true;
    result = result && getCluster()
        .equals(other.getCluster());
    result = result && getUid()
        .equals(other.getUid());
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
    hash = (37 * hash) + UID_FIELD_NUMBER;
    hash = (53 * hash) + getUid().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.db.v1beta1.BackupUnscheduleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.db.v1beta1.BackupUnscheduleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.db.v1beta1.BackupUnscheduleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.db.v1beta1.BackupUnscheduleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.db.v1beta1.BackupUnscheduleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.db.v1beta1.BackupUnscheduleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.db.v1beta1.BackupUnscheduleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.db.v1beta1.BackupUnscheduleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.db.v1beta1.BackupUnscheduleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.db.v1beta1.BackupUnscheduleRequest parseFrom(
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
  public static Builder newBuilder(com.appscode.api.db.v1beta1.BackupUnscheduleRequest prototype) {
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
   * Next Id: 3
   * </pre>
   *
   * Protobuf type {@code appscode.db.v1beta1.BackupUnscheduleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.db.v1beta1.BackupUnscheduleRequest)
      com.appscode.api.db.v1beta1.BackupUnscheduleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.db.v1beta1.SnapshotProto.internal_static_appscode_db_v1beta1_BackupUnscheduleRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.db.v1beta1.SnapshotProto.internal_static_appscode_db_v1beta1_BackupUnscheduleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.db.v1beta1.BackupUnscheduleRequest.class, com.appscode.api.db.v1beta1.BackupUnscheduleRequest.Builder.class);
    }

    // Construct using com.appscode.api.db.v1beta1.BackupUnscheduleRequest.newBuilder()
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

      uid_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.db.v1beta1.SnapshotProto.internal_static_appscode_db_v1beta1_BackupUnscheduleRequest_descriptor;
    }

    public com.appscode.api.db.v1beta1.BackupUnscheduleRequest getDefaultInstanceForType() {
      return com.appscode.api.db.v1beta1.BackupUnscheduleRequest.getDefaultInstance();
    }

    public com.appscode.api.db.v1beta1.BackupUnscheduleRequest build() {
      com.appscode.api.db.v1beta1.BackupUnscheduleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.db.v1beta1.BackupUnscheduleRequest buildPartial() {
      com.appscode.api.db.v1beta1.BackupUnscheduleRequest result = new com.appscode.api.db.v1beta1.BackupUnscheduleRequest(this);
      result.cluster_ = cluster_;
      result.uid_ = uid_;
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
      if (other instanceof com.appscode.api.db.v1beta1.BackupUnscheduleRequest) {
        return mergeFrom((com.appscode.api.db.v1beta1.BackupUnscheduleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.db.v1beta1.BackupUnscheduleRequest other) {
      if (other == com.appscode.api.db.v1beta1.BackupUnscheduleRequest.getDefaultInstance()) return this;
      if (!other.getCluster().isEmpty()) {
        cluster_ = other.cluster_;
        onChanged();
      }
      if (!other.getUid().isEmpty()) {
        uid_ = other.uid_;
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
      com.appscode.api.db.v1beta1.BackupUnscheduleRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.db.v1beta1.BackupUnscheduleRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private java.lang.Object uid_ = "";
    /**
     * <code>optional string uid = 2;</code>
     */
    public java.lang.String getUid() {
      java.lang.Object ref = uid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string uid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUidBytes() {
      java.lang.Object ref = uid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string uid = 2;</code>
     */
    public Builder setUid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string uid = 2;</code>
     */
    public Builder clearUid() {
      
      uid_ = getDefaultInstance().getUid();
      onChanged();
      return this;
    }
    /**
     * <code>optional string uid = 2;</code>
     */
    public Builder setUidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uid_ = value;
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


    // @@protoc_insertion_point(builder_scope:appscode.db.v1beta1.BackupUnscheduleRequest)
  }

  // @@protoc_insertion_point(class_scope:appscode.db.v1beta1.BackupUnscheduleRequest)
  private static final com.appscode.api.db.v1beta1.BackupUnscheduleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.db.v1beta1.BackupUnscheduleRequest();
  }

  public static com.appscode.api.db.v1beta1.BackupUnscheduleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackupUnscheduleRequest>
      PARSER = new com.google.protobuf.AbstractParser<BackupUnscheduleRequest>() {
    public BackupUnscheduleRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BackupUnscheduleRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BackupUnscheduleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackupUnscheduleRequest> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.db.v1beta1.BackupUnscheduleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
