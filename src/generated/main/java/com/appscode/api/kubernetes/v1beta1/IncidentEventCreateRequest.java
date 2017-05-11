// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/incident.proto

package com.appscode.api.kubernetes.v1beta1;

/**
 * <pre>
 * Next Id: 4
 * </pre>
 *
 * Protobuf type {@code appscode.kubernetes.v1beta1.IncidentEventCreateRequest}
 */
public  final class IncidentEventCreateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta1.IncidentEventCreateRequest)
    IncidentEventCreateRequestOrBuilder {
  // Use IncidentEventCreateRequest.newBuilder() to construct.
  private IncidentEventCreateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IncidentEventCreateRequest() {
    phid_ = "";
    comment_ = "";
    acknowledge_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private IncidentEventCreateRequest(
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

            phid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            comment_ = s;
            break;
          }
          case 24: {

            acknowledge_ = input.readBool();
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
    return com.appscode.api.kubernetes.v1beta1.IncidentProto.internal_static_appscode_kubernetes_v1beta1_IncidentEventCreateRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta1.IncidentProto.internal_static_appscode_kubernetes_v1beta1_IncidentEventCreateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest.class, com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest.Builder.class);
  }

  public static final int PHID_FIELD_NUMBER = 1;
  private volatile java.lang.Object phid_;
  /**
   * <pre>
   * Incident PHID
   * </pre>
   *
   * <code>string phid = 1;</code>
   */
  public java.lang.String getPhid() {
    java.lang.Object ref = phid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Incident PHID
   * </pre>
   *
   * <code>string phid = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPhidBytes() {
    java.lang.Object ref = phid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMMENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object comment_;
  /**
   * <code>string comment = 2;</code>
   */
  public java.lang.String getComment() {
    java.lang.Object ref = comment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      comment_ = s;
      return s;
    }
  }
  /**
   * <code>string comment = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCommentBytes() {
    java.lang.Object ref = comment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      comment_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACKNOWLEDGE_FIELD_NUMBER = 3;
  private boolean acknowledge_;
  /**
   * <code>bool acknowledge = 3;</code>
   */
  public boolean getAcknowledge() {
    return acknowledge_;
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
    if (!getPhidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, phid_);
    }
    if (!getCommentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, comment_);
    }
    if (acknowledge_ != false) {
      output.writeBool(3, acknowledge_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPhidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, phid_);
    }
    if (!getCommentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, comment_);
    }
    if (acknowledge_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, acknowledge_);
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest other = (com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest) obj;

    boolean result = true;
    result = result && getPhid()
        .equals(other.getPhid());
    result = result && getComment()
        .equals(other.getComment());
    result = result && (getAcknowledge()
        == other.getAcknowledge());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PHID_FIELD_NUMBER;
    hash = (53 * hash) + getPhid().hashCode();
    hash = (37 * hash) + COMMENT_FIELD_NUMBER;
    hash = (53 * hash) + getComment().hashCode();
    hash = (37 * hash) + ACKNOWLEDGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAcknowledge());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest prototype) {
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
   * Protobuf type {@code appscode.kubernetes.v1beta1.IncidentEventCreateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta1.IncidentEventCreateRequest)
      com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta1.IncidentProto.internal_static_appscode_kubernetes_v1beta1_IncidentEventCreateRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta1.IncidentProto.internal_static_appscode_kubernetes_v1beta1_IncidentEventCreateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest.class, com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest.newBuilder()
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
      phid_ = "";

      comment_ = "";

      acknowledge_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta1.IncidentProto.internal_static_appscode_kubernetes_v1beta1_IncidentEventCreateRequest_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest build() {
      com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest buildPartial() {
      com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest result = new com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest(this);
      result.phid_ = phid_;
      result.comment_ = comment_;
      result.acknowledge_ = acknowledge_;
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
      if (other instanceof com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest other) {
      if (other == com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest.getDefaultInstance()) return this;
      if (!other.getPhid().isEmpty()) {
        phid_ = other.phid_;
        onChanged();
      }
      if (!other.getComment().isEmpty()) {
        comment_ = other.comment_;
        onChanged();
      }
      if (other.getAcknowledge() != false) {
        setAcknowledge(other.getAcknowledge());
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
      com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object phid_ = "";
    /**
     * <pre>
     * Incident PHID
     * </pre>
     *
     * <code>string phid = 1;</code>
     */
    public java.lang.String getPhid() {
      java.lang.Object ref = phid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Incident PHID
     * </pre>
     *
     * <code>string phid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPhidBytes() {
      java.lang.Object ref = phid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Incident PHID
     * </pre>
     *
     * <code>string phid = 1;</code>
     */
    public Builder setPhid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Incident PHID
     * </pre>
     *
     * <code>string phid = 1;</code>
     */
    public Builder clearPhid() {
      
      phid_ = getDefaultInstance().getPhid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Incident PHID
     * </pre>
     *
     * <code>string phid = 1;</code>
     */
    public Builder setPhidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      phid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object comment_ = "";
    /**
     * <code>string comment = 2;</code>
     */
    public java.lang.String getComment() {
      java.lang.Object ref = comment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        comment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string comment = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCommentBytes() {
      java.lang.Object ref = comment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        comment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string comment = 2;</code>
     */
    public Builder setComment(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      comment_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string comment = 2;</code>
     */
    public Builder clearComment() {
      
      comment_ = getDefaultInstance().getComment();
      onChanged();
      return this;
    }
    /**
     * <code>string comment = 2;</code>
     */
    public Builder setCommentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      comment_ = value;
      onChanged();
      return this;
    }

    private boolean acknowledge_ ;
    /**
     * <code>bool acknowledge = 3;</code>
     */
    public boolean getAcknowledge() {
      return acknowledge_;
    }
    /**
     * <code>bool acknowledge = 3;</code>
     */
    public Builder setAcknowledge(boolean value) {
      
      acknowledge_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool acknowledge = 3;</code>
     */
    public Builder clearAcknowledge() {
      
      acknowledge_ = false;
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


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta1.IncidentEventCreateRequest)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta1.IncidentEventCreateRequest)
  private static final com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest();
  }

  public static com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IncidentEventCreateRequest>
      PARSER = new com.google.protobuf.AbstractParser<IncidentEventCreateRequest>() {
    public IncidentEventCreateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new IncidentEventCreateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IncidentEventCreateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IncidentEventCreateRequest> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

