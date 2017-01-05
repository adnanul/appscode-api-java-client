// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/db/v1beta1/database.proto

package com.appscode.api.db.v1beta1;

/**
 * <pre>
 * Next Id: 17
 * </pre>
 *
 * Protobuf type {@code appscode.db.v1beta1.DatabaseDescribeResponse}
 */
public  final class DatabaseDescribeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.db.v1beta1.DatabaseDescribeResponse)
    DatabaseDescribeResponseOrBuilder {
  // Use DatabaseDescribeResponse.newBuilder() to construct.
  private DatabaseDescribeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DatabaseDescribeResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DatabaseDescribeResponse(
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
          case 74: {
            com.appscode.api.db.v1beta1.SnapshotSummary.Builder subBuilder = null;
            if (snapshotSummary_ != null) {
              subBuilder = snapshotSummary_.toBuilder();
            }
            snapshotSummary_ = input.readMessage(com.appscode.api.db.v1beta1.SnapshotSummary.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(snapshotSummary_);
              snapshotSummary_ = subBuilder.buildPartial();
            }

            break;
          }
          case 130: {
            com.appscode.api.db.v1beta1.Database.Builder subBuilder = null;
            if (database_ != null) {
              subBuilder = database_.toBuilder();
            }
            database_ = input.readMessage(com.appscode.api.db.v1beta1.Database.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(database_);
              database_ = subBuilder.buildPartial();
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
    return com.appscode.api.db.v1beta1.DatabaseProto.internal_static_appscode_db_v1beta1_DatabaseDescribeResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.db.v1beta1.DatabaseProto.internal_static_appscode_db_v1beta1_DatabaseDescribeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.db.v1beta1.DatabaseDescribeResponse.class, com.appscode.api.db.v1beta1.DatabaseDescribeResponse.Builder.class);
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

  public static final int SNAPSHOT_SUMMARY_FIELD_NUMBER = 9;
  private com.appscode.api.db.v1beta1.SnapshotSummary snapshotSummary_;
  /**
   * <code>optional .appscode.db.v1beta1.SnapshotSummary snapshot_summary = 9;</code>
   */
  public boolean hasSnapshotSummary() {
    return snapshotSummary_ != null;
  }
  /**
   * <code>optional .appscode.db.v1beta1.SnapshotSummary snapshot_summary = 9;</code>
   */
  public com.appscode.api.db.v1beta1.SnapshotSummary getSnapshotSummary() {
    return snapshotSummary_ == null ? com.appscode.api.db.v1beta1.SnapshotSummary.getDefaultInstance() : snapshotSummary_;
  }
  /**
   * <code>optional .appscode.db.v1beta1.SnapshotSummary snapshot_summary = 9;</code>
   */
  public com.appscode.api.db.v1beta1.SnapshotSummaryOrBuilder getSnapshotSummaryOrBuilder() {
    return getSnapshotSummary();
  }

  public static final int DATABASE_FIELD_NUMBER = 16;
  private com.appscode.api.db.v1beta1.Database database_;
  /**
   * <code>optional .appscode.db.v1beta1.Database database = 16;</code>
   */
  public boolean hasDatabase() {
    return database_ != null;
  }
  /**
   * <code>optional .appscode.db.v1beta1.Database database = 16;</code>
   */
  public com.appscode.api.db.v1beta1.Database getDatabase() {
    return database_ == null ? com.appscode.api.db.v1beta1.Database.getDefaultInstance() : database_;
  }
  /**
   * <code>optional .appscode.db.v1beta1.Database database = 16;</code>
   */
  public com.appscode.api.db.v1beta1.DatabaseOrBuilder getDatabaseOrBuilder() {
    return getDatabase();
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
    if (snapshotSummary_ != null) {
      output.writeMessage(9, getSnapshotSummary());
    }
    if (database_ != null) {
      output.writeMessage(16, getDatabase());
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
    if (snapshotSummary_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(9, getSnapshotSummary());
    }
    if (database_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(16, getDatabase());
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
    if (!(obj instanceof com.appscode.api.db.v1beta1.DatabaseDescribeResponse)) {
      return super.equals(obj);
    }
    com.appscode.api.db.v1beta1.DatabaseDescribeResponse other = (com.appscode.api.db.v1beta1.DatabaseDescribeResponse) obj;

    boolean result = true;
    result = result && (hasStatus() == other.hasStatus());
    if (hasStatus()) {
      result = result && getStatus()
          .equals(other.getStatus());
    }
    result = result && (hasSnapshotSummary() == other.hasSnapshotSummary());
    if (hasSnapshotSummary()) {
      result = result && getSnapshotSummary()
          .equals(other.getSnapshotSummary());
    }
    result = result && (hasDatabase() == other.hasDatabase());
    if (hasDatabase()) {
      result = result && getDatabase()
          .equals(other.getDatabase());
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
    if (hasSnapshotSummary()) {
      hash = (37 * hash) + SNAPSHOT_SUMMARY_FIELD_NUMBER;
      hash = (53 * hash) + getSnapshotSummary().hashCode();
    }
    if (hasDatabase()) {
      hash = (37 * hash) + DATABASE_FIELD_NUMBER;
      hash = (53 * hash) + getDatabase().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.db.v1beta1.DatabaseDescribeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.db.v1beta1.DatabaseDescribeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.db.v1beta1.DatabaseDescribeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.db.v1beta1.DatabaseDescribeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.db.v1beta1.DatabaseDescribeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.db.v1beta1.DatabaseDescribeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.db.v1beta1.DatabaseDescribeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.db.v1beta1.DatabaseDescribeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.db.v1beta1.DatabaseDescribeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.db.v1beta1.DatabaseDescribeResponse parseFrom(
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
  public static Builder newBuilder(com.appscode.api.db.v1beta1.DatabaseDescribeResponse prototype) {
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
   * Next Id: 17
   * </pre>
   *
   * Protobuf type {@code appscode.db.v1beta1.DatabaseDescribeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.db.v1beta1.DatabaseDescribeResponse)
      com.appscode.api.db.v1beta1.DatabaseDescribeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.db.v1beta1.DatabaseProto.internal_static_appscode_db_v1beta1_DatabaseDescribeResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.db.v1beta1.DatabaseProto.internal_static_appscode_db_v1beta1_DatabaseDescribeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.db.v1beta1.DatabaseDescribeResponse.class, com.appscode.api.db.v1beta1.DatabaseDescribeResponse.Builder.class);
    }

    // Construct using com.appscode.api.db.v1beta1.DatabaseDescribeResponse.newBuilder()
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
      if (snapshotSummaryBuilder_ == null) {
        snapshotSummary_ = null;
      } else {
        snapshotSummary_ = null;
        snapshotSummaryBuilder_ = null;
      }
      if (databaseBuilder_ == null) {
        database_ = null;
      } else {
        database_ = null;
        databaseBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.db.v1beta1.DatabaseProto.internal_static_appscode_db_v1beta1_DatabaseDescribeResponse_descriptor;
    }

    public com.appscode.api.db.v1beta1.DatabaseDescribeResponse getDefaultInstanceForType() {
      return com.appscode.api.db.v1beta1.DatabaseDescribeResponse.getDefaultInstance();
    }

    public com.appscode.api.db.v1beta1.DatabaseDescribeResponse build() {
      com.appscode.api.db.v1beta1.DatabaseDescribeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.db.v1beta1.DatabaseDescribeResponse buildPartial() {
      com.appscode.api.db.v1beta1.DatabaseDescribeResponse result = new com.appscode.api.db.v1beta1.DatabaseDescribeResponse(this);
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (snapshotSummaryBuilder_ == null) {
        result.snapshotSummary_ = snapshotSummary_;
      } else {
        result.snapshotSummary_ = snapshotSummaryBuilder_.build();
      }
      if (databaseBuilder_ == null) {
        result.database_ = database_;
      } else {
        result.database_ = databaseBuilder_.build();
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
      if (other instanceof com.appscode.api.db.v1beta1.DatabaseDescribeResponse) {
        return mergeFrom((com.appscode.api.db.v1beta1.DatabaseDescribeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.db.v1beta1.DatabaseDescribeResponse other) {
      if (other == com.appscode.api.db.v1beta1.DatabaseDescribeResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (other.hasSnapshotSummary()) {
        mergeSnapshotSummary(other.getSnapshotSummary());
      }
      if (other.hasDatabase()) {
        mergeDatabase(other.getDatabase());
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
      com.appscode.api.db.v1beta1.DatabaseDescribeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.db.v1beta1.DatabaseDescribeResponse) e.getUnfinishedMessage();
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

    private com.appscode.api.db.v1beta1.SnapshotSummary snapshotSummary_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.db.v1beta1.SnapshotSummary, com.appscode.api.db.v1beta1.SnapshotSummary.Builder, com.appscode.api.db.v1beta1.SnapshotSummaryOrBuilder> snapshotSummaryBuilder_;
    /**
     * <code>optional .appscode.db.v1beta1.SnapshotSummary snapshot_summary = 9;</code>
     */
    public boolean hasSnapshotSummary() {
      return snapshotSummaryBuilder_ != null || snapshotSummary_ != null;
    }
    /**
     * <code>optional .appscode.db.v1beta1.SnapshotSummary snapshot_summary = 9;</code>
     */
    public com.appscode.api.db.v1beta1.SnapshotSummary getSnapshotSummary() {
      if (snapshotSummaryBuilder_ == null) {
        return snapshotSummary_ == null ? com.appscode.api.db.v1beta1.SnapshotSummary.getDefaultInstance() : snapshotSummary_;
      } else {
        return snapshotSummaryBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .appscode.db.v1beta1.SnapshotSummary snapshot_summary = 9;</code>
     */
    public Builder setSnapshotSummary(com.appscode.api.db.v1beta1.SnapshotSummary value) {
      if (snapshotSummaryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        snapshotSummary_ = value;
        onChanged();
      } else {
        snapshotSummaryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.db.v1beta1.SnapshotSummary snapshot_summary = 9;</code>
     */
    public Builder setSnapshotSummary(
        com.appscode.api.db.v1beta1.SnapshotSummary.Builder builderForValue) {
      if (snapshotSummaryBuilder_ == null) {
        snapshotSummary_ = builderForValue.build();
        onChanged();
      } else {
        snapshotSummaryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .appscode.db.v1beta1.SnapshotSummary snapshot_summary = 9;</code>
     */
    public Builder mergeSnapshotSummary(com.appscode.api.db.v1beta1.SnapshotSummary value) {
      if (snapshotSummaryBuilder_ == null) {
        if (snapshotSummary_ != null) {
          snapshotSummary_ =
            com.appscode.api.db.v1beta1.SnapshotSummary.newBuilder(snapshotSummary_).mergeFrom(value).buildPartial();
        } else {
          snapshotSummary_ = value;
        }
        onChanged();
      } else {
        snapshotSummaryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.db.v1beta1.SnapshotSummary snapshot_summary = 9;</code>
     */
    public Builder clearSnapshotSummary() {
      if (snapshotSummaryBuilder_ == null) {
        snapshotSummary_ = null;
        onChanged();
      } else {
        snapshotSummary_ = null;
        snapshotSummaryBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .appscode.db.v1beta1.SnapshotSummary snapshot_summary = 9;</code>
     */
    public com.appscode.api.db.v1beta1.SnapshotSummary.Builder getSnapshotSummaryBuilder() {
      
      onChanged();
      return getSnapshotSummaryFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .appscode.db.v1beta1.SnapshotSummary snapshot_summary = 9;</code>
     */
    public com.appscode.api.db.v1beta1.SnapshotSummaryOrBuilder getSnapshotSummaryOrBuilder() {
      if (snapshotSummaryBuilder_ != null) {
        return snapshotSummaryBuilder_.getMessageOrBuilder();
      } else {
        return snapshotSummary_ == null ?
            com.appscode.api.db.v1beta1.SnapshotSummary.getDefaultInstance() : snapshotSummary_;
      }
    }
    /**
     * <code>optional .appscode.db.v1beta1.SnapshotSummary snapshot_summary = 9;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.db.v1beta1.SnapshotSummary, com.appscode.api.db.v1beta1.SnapshotSummary.Builder, com.appscode.api.db.v1beta1.SnapshotSummaryOrBuilder> 
        getSnapshotSummaryFieldBuilder() {
      if (snapshotSummaryBuilder_ == null) {
        snapshotSummaryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.db.v1beta1.SnapshotSummary, com.appscode.api.db.v1beta1.SnapshotSummary.Builder, com.appscode.api.db.v1beta1.SnapshotSummaryOrBuilder>(
                getSnapshotSummary(),
                getParentForChildren(),
                isClean());
        snapshotSummary_ = null;
      }
      return snapshotSummaryBuilder_;
    }

    private com.appscode.api.db.v1beta1.Database database_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.db.v1beta1.Database, com.appscode.api.db.v1beta1.Database.Builder, com.appscode.api.db.v1beta1.DatabaseOrBuilder> databaseBuilder_;
    /**
     * <code>optional .appscode.db.v1beta1.Database database = 16;</code>
     */
    public boolean hasDatabase() {
      return databaseBuilder_ != null || database_ != null;
    }
    /**
     * <code>optional .appscode.db.v1beta1.Database database = 16;</code>
     */
    public com.appscode.api.db.v1beta1.Database getDatabase() {
      if (databaseBuilder_ == null) {
        return database_ == null ? com.appscode.api.db.v1beta1.Database.getDefaultInstance() : database_;
      } else {
        return databaseBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .appscode.db.v1beta1.Database database = 16;</code>
     */
    public Builder setDatabase(com.appscode.api.db.v1beta1.Database value) {
      if (databaseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        database_ = value;
        onChanged();
      } else {
        databaseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.db.v1beta1.Database database = 16;</code>
     */
    public Builder setDatabase(
        com.appscode.api.db.v1beta1.Database.Builder builderForValue) {
      if (databaseBuilder_ == null) {
        database_ = builderForValue.build();
        onChanged();
      } else {
        databaseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .appscode.db.v1beta1.Database database = 16;</code>
     */
    public Builder mergeDatabase(com.appscode.api.db.v1beta1.Database value) {
      if (databaseBuilder_ == null) {
        if (database_ != null) {
          database_ =
            com.appscode.api.db.v1beta1.Database.newBuilder(database_).mergeFrom(value).buildPartial();
        } else {
          database_ = value;
        }
        onChanged();
      } else {
        databaseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.db.v1beta1.Database database = 16;</code>
     */
    public Builder clearDatabase() {
      if (databaseBuilder_ == null) {
        database_ = null;
        onChanged();
      } else {
        database_ = null;
        databaseBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .appscode.db.v1beta1.Database database = 16;</code>
     */
    public com.appscode.api.db.v1beta1.Database.Builder getDatabaseBuilder() {
      
      onChanged();
      return getDatabaseFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .appscode.db.v1beta1.Database database = 16;</code>
     */
    public com.appscode.api.db.v1beta1.DatabaseOrBuilder getDatabaseOrBuilder() {
      if (databaseBuilder_ != null) {
        return databaseBuilder_.getMessageOrBuilder();
      } else {
        return database_ == null ?
            com.appscode.api.db.v1beta1.Database.getDefaultInstance() : database_;
      }
    }
    /**
     * <code>optional .appscode.db.v1beta1.Database database = 16;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.db.v1beta1.Database, com.appscode.api.db.v1beta1.Database.Builder, com.appscode.api.db.v1beta1.DatabaseOrBuilder> 
        getDatabaseFieldBuilder() {
      if (databaseBuilder_ == null) {
        databaseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.db.v1beta1.Database, com.appscode.api.db.v1beta1.Database.Builder, com.appscode.api.db.v1beta1.DatabaseOrBuilder>(
                getDatabase(),
                getParentForChildren(),
                isClean());
        database_ = null;
      }
      return databaseBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.db.v1beta1.DatabaseDescribeResponse)
  }

  // @@protoc_insertion_point(class_scope:appscode.db.v1beta1.DatabaseDescribeResponse)
  private static final com.appscode.api.db.v1beta1.DatabaseDescribeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.db.v1beta1.DatabaseDescribeResponse();
  }

  public static com.appscode.api.db.v1beta1.DatabaseDescribeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DatabaseDescribeResponse>
      PARSER = new com.google.protobuf.AbstractParser<DatabaseDescribeResponse>() {
    public DatabaseDescribeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DatabaseDescribeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DatabaseDescribeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DatabaseDescribeResponse> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.db.v1beta1.DatabaseDescribeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

