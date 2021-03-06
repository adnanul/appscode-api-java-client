// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/dtypes/types.proto

package com.appscode.api.dtypes;

/**
 * <pre>
 * Types for long running operation. usually called as jobs.
 * Next Id = 3
 * </pre>
 *
 * Protobuf type {@code appscode.dtypes.LongRunningResponse}
 */
public  final class LongRunningResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.dtypes.LongRunningResponse)
    LongRunningResponseOrBuilder {
  // Use LongRunningResponse.newBuilder() to construct.
  private LongRunningResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LongRunningResponse() {
    operationPhid_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LongRunningResponse(
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

            operationPhid_ = s;
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
    return com.appscode.api.dtypes.TypeProto.internal_static_appscode_dtypes_LongRunningResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.dtypes.TypeProto.internal_static_appscode_dtypes_LongRunningResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.dtypes.LongRunningResponse.class, com.appscode.api.dtypes.LongRunningResponse.Builder.class);
  }

  public static final int OPERATION_PHID_FIELD_NUMBER = 1;
  private volatile java.lang.Object operationPhid_;
  /**
   * <code>string operation_phid = 1;</code>
   */
  public java.lang.String getOperationPhid() {
    java.lang.Object ref = operationPhid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operationPhid_ = s;
      return s;
    }
  }
  /**
   * <code>string operation_phid = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOperationPhidBytes() {
    java.lang.Object ref = operationPhid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      operationPhid_ = b;
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
    if (!getOperationPhidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, operationPhid_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOperationPhidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, operationPhid_);
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
    if (!(obj instanceof com.appscode.api.dtypes.LongRunningResponse)) {
      return super.equals(obj);
    }
    com.appscode.api.dtypes.LongRunningResponse other = (com.appscode.api.dtypes.LongRunningResponse) obj;

    boolean result = true;
    result = result && getOperationPhid()
        .equals(other.getOperationPhid());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OPERATION_PHID_FIELD_NUMBER;
    hash = (53 * hash) + getOperationPhid().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.dtypes.LongRunningResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.dtypes.LongRunningResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.dtypes.LongRunningResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.dtypes.LongRunningResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.dtypes.LongRunningResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.dtypes.LongRunningResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.dtypes.LongRunningResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.dtypes.LongRunningResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.dtypes.LongRunningResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.dtypes.LongRunningResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.dtypes.LongRunningResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.dtypes.LongRunningResponse parseFrom(
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
  public static Builder newBuilder(com.appscode.api.dtypes.LongRunningResponse prototype) {
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
   * Types for long running operation. usually called as jobs.
   * Next Id = 3
   * </pre>
   *
   * Protobuf type {@code appscode.dtypes.LongRunningResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.dtypes.LongRunningResponse)
      com.appscode.api.dtypes.LongRunningResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.dtypes.TypeProto.internal_static_appscode_dtypes_LongRunningResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.dtypes.TypeProto.internal_static_appscode_dtypes_LongRunningResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.dtypes.LongRunningResponse.class, com.appscode.api.dtypes.LongRunningResponse.Builder.class);
    }

    // Construct using com.appscode.api.dtypes.LongRunningResponse.newBuilder()
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
      operationPhid_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.dtypes.TypeProto.internal_static_appscode_dtypes_LongRunningResponse_descriptor;
    }

    public com.appscode.api.dtypes.LongRunningResponse getDefaultInstanceForType() {
      return com.appscode.api.dtypes.LongRunningResponse.getDefaultInstance();
    }

    public com.appscode.api.dtypes.LongRunningResponse build() {
      com.appscode.api.dtypes.LongRunningResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.dtypes.LongRunningResponse buildPartial() {
      com.appscode.api.dtypes.LongRunningResponse result = new com.appscode.api.dtypes.LongRunningResponse(this);
      result.operationPhid_ = operationPhid_;
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
      if (other instanceof com.appscode.api.dtypes.LongRunningResponse) {
        return mergeFrom((com.appscode.api.dtypes.LongRunningResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.dtypes.LongRunningResponse other) {
      if (other == com.appscode.api.dtypes.LongRunningResponse.getDefaultInstance()) return this;
      if (!other.getOperationPhid().isEmpty()) {
        operationPhid_ = other.operationPhid_;
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
      com.appscode.api.dtypes.LongRunningResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.dtypes.LongRunningResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object operationPhid_ = "";
    /**
     * <code>string operation_phid = 1;</code>
     */
    public java.lang.String getOperationPhid() {
      java.lang.Object ref = operationPhid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operationPhid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string operation_phid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOperationPhidBytes() {
      java.lang.Object ref = operationPhid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operationPhid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string operation_phid = 1;</code>
     */
    public Builder setOperationPhid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      operationPhid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string operation_phid = 1;</code>
     */
    public Builder clearOperationPhid() {
      
      operationPhid_ = getDefaultInstance().getOperationPhid();
      onChanged();
      return this;
    }
    /**
     * <code>string operation_phid = 1;</code>
     */
    public Builder setOperationPhidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      operationPhid_ = value;
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


    // @@protoc_insertion_point(builder_scope:appscode.dtypes.LongRunningResponse)
  }

  // @@protoc_insertion_point(class_scope:appscode.dtypes.LongRunningResponse)
  private static final com.appscode.api.dtypes.LongRunningResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.dtypes.LongRunningResponse();
  }

  public static com.appscode.api.dtypes.LongRunningResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LongRunningResponse>
      PARSER = new com.google.protobuf.AbstractParser<LongRunningResponse>() {
    public LongRunningResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new LongRunningResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LongRunningResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LongRunningResponse> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.dtypes.LongRunningResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

