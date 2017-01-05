// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/ci/v1beta1/build.proto

package com.appscode.api.ci.v1beta1;

/**
 * Protobuf type {@code appscode.ci.v1beta1.BuildDescribeRequest}
 */
public  final class BuildDescribeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.ci.v1beta1.BuildDescribeRequest)
    BuildDescribeRequestOrBuilder {
  // Use BuildDescribeRequest.newBuilder() to construct.
  private BuildDescribeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildDescribeRequest() {
    jobName_ = "";
    parents_ = "";
    number_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private BuildDescribeRequest(
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

            jobName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            parents_ = s;
            break;
          }
          case 24: {

            number_ = input.readInt64();
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
    return com.appscode.api.ci.v1beta1.BuildProto.internal_static_appscode_ci_v1beta1_BuildDescribeRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.ci.v1beta1.BuildProto.internal_static_appscode_ci_v1beta1_BuildDescribeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.ci.v1beta1.BuildDescribeRequest.class, com.appscode.api.ci.v1beta1.BuildDescribeRequest.Builder.class);
  }

  public static final int JOB_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object jobName_;
  /**
   * <code>optional string job_name = 1;</code>
   */
  public java.lang.String getJobName() {
    java.lang.Object ref = jobName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string job_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getJobNameBytes() {
    java.lang.Object ref = jobName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jobName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENTS_FIELD_NUMBER = 2;
  private volatile java.lang.Object parents_;
  /**
   * <code>optional string parents = 2;</code>
   */
  public java.lang.String getParents() {
    java.lang.Object ref = parents_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parents_ = s;
      return s;
    }
  }
  /**
   * <code>optional string parents = 2;</code>
   */
  public com.google.protobuf.ByteString
      getParentsBytes() {
    java.lang.Object ref = parents_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parents_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUMBER_FIELD_NUMBER = 3;
  private long number_;
  /**
   * <code>optional int64 number = 3;</code>
   */
  public long getNumber() {
    return number_;
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
    if (!getJobNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, jobName_);
    }
    if (!getParentsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, parents_);
    }
    if (number_ != 0L) {
      output.writeInt64(3, number_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getJobNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, jobName_);
    }
    if (!getParentsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, parents_);
    }
    if (number_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, number_);
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
    if (!(obj instanceof com.appscode.api.ci.v1beta1.BuildDescribeRequest)) {
      return super.equals(obj);
    }
    com.appscode.api.ci.v1beta1.BuildDescribeRequest other = (com.appscode.api.ci.v1beta1.BuildDescribeRequest) obj;

    boolean result = true;
    result = result && getJobName()
        .equals(other.getJobName());
    result = result && getParents()
        .equals(other.getParents());
    result = result && (getNumber()
        == other.getNumber());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + JOB_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getJobName().hashCode();
    hash = (37 * hash) + PARENTS_FIELD_NUMBER;
    hash = (53 * hash) + getParents().hashCode();
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumber());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.ci.v1beta1.BuildDescribeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.ci.v1beta1.BuildDescribeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.BuildDescribeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.ci.v1beta1.BuildDescribeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.BuildDescribeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.ci.v1beta1.BuildDescribeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.BuildDescribeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.ci.v1beta1.BuildDescribeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.BuildDescribeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.ci.v1beta1.BuildDescribeRequest parseFrom(
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
  public static Builder newBuilder(com.appscode.api.ci.v1beta1.BuildDescribeRequest prototype) {
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
   * Protobuf type {@code appscode.ci.v1beta1.BuildDescribeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.ci.v1beta1.BuildDescribeRequest)
      com.appscode.api.ci.v1beta1.BuildDescribeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.ci.v1beta1.BuildProto.internal_static_appscode_ci_v1beta1_BuildDescribeRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.ci.v1beta1.BuildProto.internal_static_appscode_ci_v1beta1_BuildDescribeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.ci.v1beta1.BuildDescribeRequest.class, com.appscode.api.ci.v1beta1.BuildDescribeRequest.Builder.class);
    }

    // Construct using com.appscode.api.ci.v1beta1.BuildDescribeRequest.newBuilder()
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
      jobName_ = "";

      parents_ = "";

      number_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.ci.v1beta1.BuildProto.internal_static_appscode_ci_v1beta1_BuildDescribeRequest_descriptor;
    }

    public com.appscode.api.ci.v1beta1.BuildDescribeRequest getDefaultInstanceForType() {
      return com.appscode.api.ci.v1beta1.BuildDescribeRequest.getDefaultInstance();
    }

    public com.appscode.api.ci.v1beta1.BuildDescribeRequest build() {
      com.appscode.api.ci.v1beta1.BuildDescribeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.ci.v1beta1.BuildDescribeRequest buildPartial() {
      com.appscode.api.ci.v1beta1.BuildDescribeRequest result = new com.appscode.api.ci.v1beta1.BuildDescribeRequest(this);
      result.jobName_ = jobName_;
      result.parents_ = parents_;
      result.number_ = number_;
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
      if (other instanceof com.appscode.api.ci.v1beta1.BuildDescribeRequest) {
        return mergeFrom((com.appscode.api.ci.v1beta1.BuildDescribeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.ci.v1beta1.BuildDescribeRequest other) {
      if (other == com.appscode.api.ci.v1beta1.BuildDescribeRequest.getDefaultInstance()) return this;
      if (!other.getJobName().isEmpty()) {
        jobName_ = other.jobName_;
        onChanged();
      }
      if (!other.getParents().isEmpty()) {
        parents_ = other.parents_;
        onChanged();
      }
      if (other.getNumber() != 0L) {
        setNumber(other.getNumber());
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
      com.appscode.api.ci.v1beta1.BuildDescribeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.ci.v1beta1.BuildDescribeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object jobName_ = "";
    /**
     * <code>optional string job_name = 1;</code>
     */
    public java.lang.String getJobName() {
      java.lang.Object ref = jobName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string job_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getJobNameBytes() {
      java.lang.Object ref = jobName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jobName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string job_name = 1;</code>
     */
    public Builder setJobName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jobName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string job_name = 1;</code>
     */
    public Builder clearJobName() {
      
      jobName_ = getDefaultInstance().getJobName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string job_name = 1;</code>
     */
    public Builder setJobNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jobName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object parents_ = "";
    /**
     * <code>optional string parents = 2;</code>
     */
    public java.lang.String getParents() {
      java.lang.Object ref = parents_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parents_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string parents = 2;</code>
     */
    public com.google.protobuf.ByteString
        getParentsBytes() {
      java.lang.Object ref = parents_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parents_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string parents = 2;</code>
     */
    public Builder setParents(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parents_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string parents = 2;</code>
     */
    public Builder clearParents() {
      
      parents_ = getDefaultInstance().getParents();
      onChanged();
      return this;
    }
    /**
     * <code>optional string parents = 2;</code>
     */
    public Builder setParentsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parents_ = value;
      onChanged();
      return this;
    }

    private long number_ ;
    /**
     * <code>optional int64 number = 3;</code>
     */
    public long getNumber() {
      return number_;
    }
    /**
     * <code>optional int64 number = 3;</code>
     */
    public Builder setNumber(long value) {
      
      number_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 number = 3;</code>
     */
    public Builder clearNumber() {
      
      number_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:appscode.ci.v1beta1.BuildDescribeRequest)
  }

  // @@protoc_insertion_point(class_scope:appscode.ci.v1beta1.BuildDescribeRequest)
  private static final com.appscode.api.ci.v1beta1.BuildDescribeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.ci.v1beta1.BuildDescribeRequest();
  }

  public static com.appscode.api.ci.v1beta1.BuildDescribeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildDescribeRequest>
      PARSER = new com.google.protobuf.AbstractParser<BuildDescribeRequest>() {
    public BuildDescribeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BuildDescribeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuildDescribeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildDescribeRequest> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.ci.v1beta1.BuildDescribeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

