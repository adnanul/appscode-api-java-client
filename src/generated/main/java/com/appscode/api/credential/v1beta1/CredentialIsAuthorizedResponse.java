// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/credential/v1beta1/credential.proto

package com.appscode.api.credential.v1beta1;

/**
 * Protobuf type {@code appscode.credential.v1beta1.CredentialIsAuthorizedResponse}
 */
public  final class CredentialIsAuthorizedResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.credential.v1beta1.CredentialIsAuthorizedResponse)
    CredentialIsAuthorizedResponseOrBuilder {
  // Use CredentialIsAuthorizedResponse.newBuilder() to construct.
  private CredentialIsAuthorizedResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CredentialIsAuthorizedResponse() {
    unauthorized_ = false;
    message_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CredentialIsAuthorizedResponse(
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
          case 8: {

            unauthorized_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
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
    return com.appscode.api.credential.v1beta1.CredentialProto.internal_static_appscode_credential_v1beta1_CredentialIsAuthorizedResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.credential.v1beta1.CredentialProto.internal_static_appscode_credential_v1beta1_CredentialIsAuthorizedResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse.class, com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse.Builder.class);
  }

  public static final int UNAUTHORIZED_FIELD_NUMBER = 1;
  private boolean unauthorized_;
  /**
   * <code>bool unauthorized = 1;</code>
   */
  public boolean getUnauthorized() {
    return unauthorized_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
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
    if (unauthorized_ != false) {
      output.writeBool(1, unauthorized_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (unauthorized_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, unauthorized_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
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
    if (!(obj instanceof com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse)) {
      return super.equals(obj);
    }
    com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse other = (com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse) obj;

    boolean result = true;
    result = result && (getUnauthorized()
        == other.getUnauthorized());
    result = result && getMessage()
        .equals(other.getMessage());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + UNAUTHORIZED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUnauthorized());
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse parseFrom(
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
  public static Builder newBuilder(com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse prototype) {
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
   * Protobuf type {@code appscode.credential.v1beta1.CredentialIsAuthorizedResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.credential.v1beta1.CredentialIsAuthorizedResponse)
      com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.credential.v1beta1.CredentialProto.internal_static_appscode_credential_v1beta1_CredentialIsAuthorizedResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.credential.v1beta1.CredentialProto.internal_static_appscode_credential_v1beta1_CredentialIsAuthorizedResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse.class, com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse.Builder.class);
    }

    // Construct using com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse.newBuilder()
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
      unauthorized_ = false;

      message_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.credential.v1beta1.CredentialProto.internal_static_appscode_credential_v1beta1_CredentialIsAuthorizedResponse_descriptor;
    }

    public com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse getDefaultInstanceForType() {
      return com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse.getDefaultInstance();
    }

    public com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse build() {
      com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse buildPartial() {
      com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse result = new com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse(this);
      result.unauthorized_ = unauthorized_;
      result.message_ = message_;
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
      if (other instanceof com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse) {
        return mergeFrom((com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse other) {
      if (other == com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse.getDefaultInstance()) return this;
      if (other.getUnauthorized() != false) {
        setUnauthorized(other.getUnauthorized());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
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
      com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean unauthorized_ ;
    /**
     * <code>bool unauthorized = 1;</code>
     */
    public boolean getUnauthorized() {
      return unauthorized_;
    }
    /**
     * <code>bool unauthorized = 1;</code>
     */
    public Builder setUnauthorized(boolean value) {
      
      unauthorized_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool unauthorized = 1;</code>
     */
    public Builder clearUnauthorized() {
      
      unauthorized_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
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


    // @@protoc_insertion_point(builder_scope:appscode.credential.v1beta1.CredentialIsAuthorizedResponse)
  }

  // @@protoc_insertion_point(class_scope:appscode.credential.v1beta1.CredentialIsAuthorizedResponse)
  private static final com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse();
  }

  public static com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CredentialIsAuthorizedResponse>
      PARSER = new com.google.protobuf.AbstractParser<CredentialIsAuthorizedResponse>() {
    public CredentialIsAuthorizedResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CredentialIsAuthorizedResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CredentialIsAuthorizedResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CredentialIsAuthorizedResponse> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

