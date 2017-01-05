// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/namespace/v1beta1/billing.proto

package com.appscode.api.namespace.v1beta1;

/**
 * Protobuf type {@code appscode.namespace.v1beta1.GetQuotaResponse}
 */
public  final class GetQuotaResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.namespace.v1beta1.GetQuotaResponse)
    GetQuotaResponseOrBuilder {
  // Use GetQuotaResponse.newBuilder() to construct.
  private GetQuotaResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetQuotaResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetQuotaResponse(
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
              assigned_ = com.google.protobuf.MapField.newMapField(
                  AssignedDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
            assigned__ = input.readMessage(
                AssignedDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            assigned_.getMutableMap().put(
                assigned__.getKey(), assigned__.getValue());
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              used_ = com.google.protobuf.MapField.newMapField(
                  UsedDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000004;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
            used__ = input.readMessage(
                UsedDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            used_.getMutableMap().put(
                used__.getKey(), used__.getValue());
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
    return com.appscode.api.namespace.v1beta1.BillingProto.internal_static_appscode_namespace_v1beta1_GetQuotaResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetAssigned();
      case 3:
        return internalGetUsed();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.namespace.v1beta1.BillingProto.internal_static_appscode_namespace_v1beta1_GetQuotaResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.namespace.v1beta1.GetQuotaResponse.class, com.appscode.api.namespace.v1beta1.GetQuotaResponse.Builder.class);
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

  public static final int ASSIGNED_FIELD_NUMBER = 2;
  private static final class AssignedDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Long> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Long>newDefaultInstance(
                com.appscode.api.namespace.v1beta1.BillingProto.internal_static_appscode_namespace_v1beta1_GetQuotaResponse_AssignedEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L);
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Long> assigned_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
  internalGetAssigned() {
    if (assigned_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          AssignedDefaultEntryHolder.defaultEntry);
    }
    return assigned_;
  }

  public int getAssignedCount() {
    return internalGetAssigned().getMap().size();
  }
  /**
   * <code>map&lt;string, int64&gt; assigned = 2;</code>
   */

  public boolean containsAssigned(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetAssigned().getMap().containsKey(key);
  }
  /**
   * Use {@link #getAssignedMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Long> getAssigned() {
    return getAssignedMap();
  }
  /**
   * <code>map&lt;string, int64&gt; assigned = 2;</code>
   */

  public java.util.Map<java.lang.String, java.lang.Long> getAssignedMap() {
    return internalGetAssigned().getMap();
  }
  /**
   * <code>map&lt;string, int64&gt; assigned = 2;</code>
   */

  public long getAssignedOrDefault(
      java.lang.String key,
      long defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetAssigned().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, int64&gt; assigned = 2;</code>
   */

  public long getAssignedOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetAssigned().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int USED_FIELD_NUMBER = 3;
  private static final class UsedDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Long> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Long>newDefaultInstance(
                com.appscode.api.namespace.v1beta1.BillingProto.internal_static_appscode_namespace_v1beta1_GetQuotaResponse_UsedEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L);
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Long> used_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
  internalGetUsed() {
    if (used_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          UsedDefaultEntryHolder.defaultEntry);
    }
    return used_;
  }

  public int getUsedCount() {
    return internalGetUsed().getMap().size();
  }
  /**
   * <code>map&lt;string, int64&gt; used = 3;</code>
   */

  public boolean containsUsed(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetUsed().getMap().containsKey(key);
  }
  /**
   * Use {@link #getUsedMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Long> getUsed() {
    return getUsedMap();
  }
  /**
   * <code>map&lt;string, int64&gt; used = 3;</code>
   */

  public java.util.Map<java.lang.String, java.lang.Long> getUsedMap() {
    return internalGetUsed().getMap();
  }
  /**
   * <code>map&lt;string, int64&gt; used = 3;</code>
   */

  public long getUsedOrDefault(
      java.lang.String key,
      long defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetUsed().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, int64&gt; used = 3;</code>
   */

  public long getUsedOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetUsed().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetAssigned(),
        AssignedDefaultEntryHolder.defaultEntry,
        2);
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetUsed(),
        UsedDefaultEntryHolder.defaultEntry,
        3);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStatus());
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry
         : internalGetAssigned().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
      assigned__ = AssignedDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, assigned__);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry
         : internalGetUsed().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
      used__ = UsedDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, used__);
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
    if (!(obj instanceof com.appscode.api.namespace.v1beta1.GetQuotaResponse)) {
      return super.equals(obj);
    }
    com.appscode.api.namespace.v1beta1.GetQuotaResponse other = (com.appscode.api.namespace.v1beta1.GetQuotaResponse) obj;

    boolean result = true;
    result = result && (hasStatus() == other.hasStatus());
    if (hasStatus()) {
      result = result && getStatus()
          .equals(other.getStatus());
    }
    result = result && internalGetAssigned().equals(
        other.internalGetAssigned());
    result = result && internalGetUsed().equals(
        other.internalGetUsed());
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
    if (!internalGetAssigned().getMap().isEmpty()) {
      hash = (37 * hash) + ASSIGNED_FIELD_NUMBER;
      hash = (53 * hash) + internalGetAssigned().hashCode();
    }
    if (!internalGetUsed().getMap().isEmpty()) {
      hash = (37 * hash) + USED_FIELD_NUMBER;
      hash = (53 * hash) + internalGetUsed().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.namespace.v1beta1.GetQuotaResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.namespace.v1beta1.GetQuotaResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.namespace.v1beta1.GetQuotaResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.namespace.v1beta1.GetQuotaResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.namespace.v1beta1.GetQuotaResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.namespace.v1beta1.GetQuotaResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.namespace.v1beta1.GetQuotaResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.namespace.v1beta1.GetQuotaResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.namespace.v1beta1.GetQuotaResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.namespace.v1beta1.GetQuotaResponse parseFrom(
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
  public static Builder newBuilder(com.appscode.api.namespace.v1beta1.GetQuotaResponse prototype) {
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
   * Protobuf type {@code appscode.namespace.v1beta1.GetQuotaResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.namespace.v1beta1.GetQuotaResponse)
      com.appscode.api.namespace.v1beta1.GetQuotaResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.namespace.v1beta1.BillingProto.internal_static_appscode_namespace_v1beta1_GetQuotaResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetAssigned();
        case 3:
          return internalGetUsed();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableAssigned();
        case 3:
          return internalGetMutableUsed();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.namespace.v1beta1.BillingProto.internal_static_appscode_namespace_v1beta1_GetQuotaResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.namespace.v1beta1.GetQuotaResponse.class, com.appscode.api.namespace.v1beta1.GetQuotaResponse.Builder.class);
    }

    // Construct using com.appscode.api.namespace.v1beta1.GetQuotaResponse.newBuilder()
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
      internalGetMutableAssigned().clear();
      internalGetMutableUsed().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.namespace.v1beta1.BillingProto.internal_static_appscode_namespace_v1beta1_GetQuotaResponse_descriptor;
    }

    public com.appscode.api.namespace.v1beta1.GetQuotaResponse getDefaultInstanceForType() {
      return com.appscode.api.namespace.v1beta1.GetQuotaResponse.getDefaultInstance();
    }

    public com.appscode.api.namespace.v1beta1.GetQuotaResponse build() {
      com.appscode.api.namespace.v1beta1.GetQuotaResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.namespace.v1beta1.GetQuotaResponse buildPartial() {
      com.appscode.api.namespace.v1beta1.GetQuotaResponse result = new com.appscode.api.namespace.v1beta1.GetQuotaResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      result.assigned_ = internalGetAssigned();
      result.assigned_.makeImmutable();
      result.used_ = internalGetUsed();
      result.used_.makeImmutable();
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
      if (other instanceof com.appscode.api.namespace.v1beta1.GetQuotaResponse) {
        return mergeFrom((com.appscode.api.namespace.v1beta1.GetQuotaResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.namespace.v1beta1.GetQuotaResponse other) {
      if (other == com.appscode.api.namespace.v1beta1.GetQuotaResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      internalGetMutableAssigned().mergeFrom(
          other.internalGetAssigned());
      internalGetMutableUsed().mergeFrom(
          other.internalGetUsed());
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
      com.appscode.api.namespace.v1beta1.GetQuotaResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.namespace.v1beta1.GetQuotaResponse) e.getUnfinishedMessage();
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

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Long> assigned_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
    internalGetAssigned() {
      if (assigned_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AssignedDefaultEntryHolder.defaultEntry);
      }
      return assigned_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
    internalGetMutableAssigned() {
      onChanged();;
      if (assigned_ == null) {
        assigned_ = com.google.protobuf.MapField.newMapField(
            AssignedDefaultEntryHolder.defaultEntry);
      }
      if (!assigned_.isMutable()) {
        assigned_ = assigned_.copy();
      }
      return assigned_;
    }

    public int getAssignedCount() {
      return internalGetAssigned().getMap().size();
    }
    /**
     * <code>map&lt;string, int64&gt; assigned = 2;</code>
     */

    public boolean containsAssigned(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetAssigned().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAssignedMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getAssigned() {
      return getAssignedMap();
    }
    /**
     * <code>map&lt;string, int64&gt; assigned = 2;</code>
     */

    public java.util.Map<java.lang.String, java.lang.Long> getAssignedMap() {
      return internalGetAssigned().getMap();
    }
    /**
     * <code>map&lt;string, int64&gt; assigned = 2;</code>
     */

    public long getAssignedOrDefault(
        java.lang.String key,
        long defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetAssigned().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, int64&gt; assigned = 2;</code>
     */

    public long getAssignedOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetAssigned().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearAssigned() {
      getMutableAssigned().clear();
      return this;
    }
    /**
     * <code>map&lt;string, int64&gt; assigned = 2;</code>
     */

    public Builder removeAssigned(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      getMutableAssigned().remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long>
    getMutableAssigned() {
      return internalGetMutableAssigned().getMutableMap();
    }
    /**
     * <code>map&lt;string, int64&gt; assigned = 2;</code>
     */
    public Builder putAssigned(
        java.lang.String key,
        long value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      
      getMutableAssigned().put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, int64&gt; assigned = 2;</code>
     */

    public Builder putAllAssigned(
        java.util.Map<java.lang.String, java.lang.Long> values) {
      getMutableAssigned().putAll(values);
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Long> used_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
    internalGetUsed() {
      if (used_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            UsedDefaultEntryHolder.defaultEntry);
      }
      return used_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
    internalGetMutableUsed() {
      onChanged();;
      if (used_ == null) {
        used_ = com.google.protobuf.MapField.newMapField(
            UsedDefaultEntryHolder.defaultEntry);
      }
      if (!used_.isMutable()) {
        used_ = used_.copy();
      }
      return used_;
    }

    public int getUsedCount() {
      return internalGetUsed().getMap().size();
    }
    /**
     * <code>map&lt;string, int64&gt; used = 3;</code>
     */

    public boolean containsUsed(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetUsed().getMap().containsKey(key);
    }
    /**
     * Use {@link #getUsedMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getUsed() {
      return getUsedMap();
    }
    /**
     * <code>map&lt;string, int64&gt; used = 3;</code>
     */

    public java.util.Map<java.lang.String, java.lang.Long> getUsedMap() {
      return internalGetUsed().getMap();
    }
    /**
     * <code>map&lt;string, int64&gt; used = 3;</code>
     */

    public long getUsedOrDefault(
        java.lang.String key,
        long defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetUsed().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, int64&gt; used = 3;</code>
     */

    public long getUsedOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetUsed().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearUsed() {
      getMutableUsed().clear();
      return this;
    }
    /**
     * <code>map&lt;string, int64&gt; used = 3;</code>
     */

    public Builder removeUsed(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      getMutableUsed().remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long>
    getMutableUsed() {
      return internalGetMutableUsed().getMutableMap();
    }
    /**
     * <code>map&lt;string, int64&gt; used = 3;</code>
     */
    public Builder putUsed(
        java.lang.String key,
        long value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      
      getMutableUsed().put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, int64&gt; used = 3;</code>
     */

    public Builder putAllUsed(
        java.util.Map<java.lang.String, java.lang.Long> values) {
      getMutableUsed().putAll(values);
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


    // @@protoc_insertion_point(builder_scope:appscode.namespace.v1beta1.GetQuotaResponse)
  }

  // @@protoc_insertion_point(class_scope:appscode.namespace.v1beta1.GetQuotaResponse)
  private static final com.appscode.api.namespace.v1beta1.GetQuotaResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.namespace.v1beta1.GetQuotaResponse();
  }

  public static com.appscode.api.namespace.v1beta1.GetQuotaResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetQuotaResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetQuotaResponse>() {
    public GetQuotaResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetQuotaResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetQuotaResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetQuotaResponse> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.namespace.v1beta1.GetQuotaResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

