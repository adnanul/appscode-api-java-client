// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/auth/v1beta1/authentication.proto

package com.appscode.api.auth.v1beta1;

/**
 * Protobuf type {@code appscode.auth.v1beta1.CSRFTokenResponse}
 */
public  final class CSRFTokenResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.auth.v1beta1.CSRFTokenResponse)
    CSRFTokenResponseOrBuilder {
  // Use CSRFTokenResponse.newBuilder() to construct.
  private CSRFTokenResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CSRFTokenResponse() {
    csrfToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CSRFTokenResponse(
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

            csrfToken_ = s;
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
    return com.appscode.api.auth.v1beta1.AuthenticationProto.internal_static_appscode_auth_v1beta1_CSRFTokenResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.auth.v1beta1.AuthenticationProto.internal_static_appscode_auth_v1beta1_CSRFTokenResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.auth.v1beta1.CSRFTokenResponse.class, com.appscode.api.auth.v1beta1.CSRFTokenResponse.Builder.class);
  }

  public static final int CSRF_TOKEN_FIELD_NUMBER = 1;
  private volatile java.lang.Object csrfToken_;
  /**
   * <code>string csrf_token = 1;</code>
   */
  public java.lang.String getCsrfToken() {
    java.lang.Object ref = csrfToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      csrfToken_ = s;
      return s;
    }
  }
  /**
   * <code>string csrf_token = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCsrfTokenBytes() {
    java.lang.Object ref = csrfToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      csrfToken_ = b;
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
    if (!getCsrfTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, csrfToken_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCsrfTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, csrfToken_);
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
    if (!(obj instanceof com.appscode.api.auth.v1beta1.CSRFTokenResponse)) {
      return super.equals(obj);
    }
    com.appscode.api.auth.v1beta1.CSRFTokenResponse other = (com.appscode.api.auth.v1beta1.CSRFTokenResponse) obj;

    boolean result = true;
    result = result && getCsrfToken()
        .equals(other.getCsrfToken());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CSRF_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getCsrfToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.auth.v1beta1.CSRFTokenResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.auth.v1beta1.CSRFTokenResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.auth.v1beta1.CSRFTokenResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.auth.v1beta1.CSRFTokenResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.auth.v1beta1.CSRFTokenResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.auth.v1beta1.CSRFTokenResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.auth.v1beta1.CSRFTokenResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.auth.v1beta1.CSRFTokenResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.auth.v1beta1.CSRFTokenResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.auth.v1beta1.CSRFTokenResponse parseFrom(
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
  public static Builder newBuilder(com.appscode.api.auth.v1beta1.CSRFTokenResponse prototype) {
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
   * Protobuf type {@code appscode.auth.v1beta1.CSRFTokenResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.auth.v1beta1.CSRFTokenResponse)
      com.appscode.api.auth.v1beta1.CSRFTokenResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.auth.v1beta1.AuthenticationProto.internal_static_appscode_auth_v1beta1_CSRFTokenResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.auth.v1beta1.AuthenticationProto.internal_static_appscode_auth_v1beta1_CSRFTokenResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.auth.v1beta1.CSRFTokenResponse.class, com.appscode.api.auth.v1beta1.CSRFTokenResponse.Builder.class);
    }

    // Construct using com.appscode.api.auth.v1beta1.CSRFTokenResponse.newBuilder()
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
      csrfToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.auth.v1beta1.AuthenticationProto.internal_static_appscode_auth_v1beta1_CSRFTokenResponse_descriptor;
    }

    public com.appscode.api.auth.v1beta1.CSRFTokenResponse getDefaultInstanceForType() {
      return com.appscode.api.auth.v1beta1.CSRFTokenResponse.getDefaultInstance();
    }

    public com.appscode.api.auth.v1beta1.CSRFTokenResponse build() {
      com.appscode.api.auth.v1beta1.CSRFTokenResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.auth.v1beta1.CSRFTokenResponse buildPartial() {
      com.appscode.api.auth.v1beta1.CSRFTokenResponse result = new com.appscode.api.auth.v1beta1.CSRFTokenResponse(this);
      result.csrfToken_ = csrfToken_;
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
      if (other instanceof com.appscode.api.auth.v1beta1.CSRFTokenResponse) {
        return mergeFrom((com.appscode.api.auth.v1beta1.CSRFTokenResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.auth.v1beta1.CSRFTokenResponse other) {
      if (other == com.appscode.api.auth.v1beta1.CSRFTokenResponse.getDefaultInstance()) return this;
      if (!other.getCsrfToken().isEmpty()) {
        csrfToken_ = other.csrfToken_;
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
      com.appscode.api.auth.v1beta1.CSRFTokenResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.auth.v1beta1.CSRFTokenResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object csrfToken_ = "";
    /**
     * <code>string csrf_token = 1;</code>
     */
    public java.lang.String getCsrfToken() {
      java.lang.Object ref = csrfToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        csrfToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string csrf_token = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCsrfTokenBytes() {
      java.lang.Object ref = csrfToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        csrfToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string csrf_token = 1;</code>
     */
    public Builder setCsrfToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      csrfToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string csrf_token = 1;</code>
     */
    public Builder clearCsrfToken() {
      
      csrfToken_ = getDefaultInstance().getCsrfToken();
      onChanged();
      return this;
    }
    /**
     * <code>string csrf_token = 1;</code>
     */
    public Builder setCsrfTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      csrfToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:appscode.auth.v1beta1.CSRFTokenResponse)
  }

  // @@protoc_insertion_point(class_scope:appscode.auth.v1beta1.CSRFTokenResponse)
  private static final com.appscode.api.auth.v1beta1.CSRFTokenResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.auth.v1beta1.CSRFTokenResponse();
  }

  public static com.appscode.api.auth.v1beta1.CSRFTokenResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CSRFTokenResponse>
      PARSER = new com.google.protobuf.AbstractParser<CSRFTokenResponse>() {
    public CSRFTokenResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CSRFTokenResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CSRFTokenResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CSRFTokenResponse> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.auth.v1beta1.CSRFTokenResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

