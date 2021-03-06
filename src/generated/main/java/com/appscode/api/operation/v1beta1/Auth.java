// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/operation/v1beta1/operation.proto

package com.appscode.api.operation.v1beta1;

/**
 * Protobuf type {@code appscode.operation.v1beta1.Auth}
 */
public  final class Auth extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.operation.v1beta1.Auth)
    AuthOrBuilder {
  // Use Auth.newBuilder() to construct.
  private Auth(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Auth() {
    namespace_ = "";
    username_ = "";
    secret_ = "";
    authType_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Auth(
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

            namespace_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            username_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            secret_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            authType_ = s;
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
    return com.appscode.api.operation.v1beta1.OperationProto.internal_static_appscode_operation_v1beta1_Auth_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.operation.v1beta1.OperationProto.internal_static_appscode_operation_v1beta1_Auth_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.operation.v1beta1.Auth.class, com.appscode.api.operation.v1beta1.Auth.Builder.class);
  }

  public static final int NAMESPACE_FIELD_NUMBER = 1;
  private volatile java.lang.Object namespace_;
  /**
   * <code>string namespace = 1;</code>
   */
  public java.lang.String getNamespace() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespace_ = s;
      return s;
    }
  }
  /**
   * <code>string namespace = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNamespaceBytes() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      namespace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object username_;
  /**
   * <code>string username = 2;</code>
   */
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>string username = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECRET_FIELD_NUMBER = 3;
  private volatile java.lang.Object secret_;
  /**
   * <code>string secret = 3;</code>
   */
  public java.lang.String getSecret() {
    java.lang.Object ref = secret_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      secret_ = s;
      return s;
    }
  }
  /**
   * <code>string secret = 3;</code>
   */
  public com.google.protobuf.ByteString
      getSecretBytes() {
    java.lang.Object ref = secret_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      secret_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTH_TYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object authType_;
  /**
   * <code>string auth_type = 4;</code>
   */
  public java.lang.String getAuthType() {
    java.lang.Object ref = authType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      authType_ = s;
      return s;
    }
  }
  /**
   * <code>string auth_type = 4;</code>
   */
  public com.google.protobuf.ByteString
      getAuthTypeBytes() {
    java.lang.Object ref = authType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      authType_ = b;
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
    if (!getNamespaceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, namespace_);
    }
    if (!getUsernameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
    }
    if (!getSecretBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, secret_);
    }
    if (!getAuthTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, authType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNamespaceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, namespace_);
    }
    if (!getUsernameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
    }
    if (!getSecretBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, secret_);
    }
    if (!getAuthTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, authType_);
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
    if (!(obj instanceof com.appscode.api.operation.v1beta1.Auth)) {
      return super.equals(obj);
    }
    com.appscode.api.operation.v1beta1.Auth other = (com.appscode.api.operation.v1beta1.Auth) obj;

    boolean result = true;
    result = result && getNamespace()
        .equals(other.getNamespace());
    result = result && getUsername()
        .equals(other.getUsername());
    result = result && getSecret()
        .equals(other.getSecret());
    result = result && getAuthType()
        .equals(other.getAuthType());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
    hash = (53 * hash) + getNamespace().hashCode();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (37 * hash) + SECRET_FIELD_NUMBER;
    hash = (53 * hash) + getSecret().hashCode();
    hash = (37 * hash) + AUTH_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getAuthType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.operation.v1beta1.Auth parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.operation.v1beta1.Auth parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.operation.v1beta1.Auth parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.operation.v1beta1.Auth parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.operation.v1beta1.Auth parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.operation.v1beta1.Auth parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.operation.v1beta1.Auth parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.operation.v1beta1.Auth parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.operation.v1beta1.Auth parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.operation.v1beta1.Auth parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.operation.v1beta1.Auth parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.operation.v1beta1.Auth parseFrom(
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
  public static Builder newBuilder(com.appscode.api.operation.v1beta1.Auth prototype) {
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
   * Protobuf type {@code appscode.operation.v1beta1.Auth}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.operation.v1beta1.Auth)
      com.appscode.api.operation.v1beta1.AuthOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.operation.v1beta1.OperationProto.internal_static_appscode_operation_v1beta1_Auth_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.operation.v1beta1.OperationProto.internal_static_appscode_operation_v1beta1_Auth_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.operation.v1beta1.Auth.class, com.appscode.api.operation.v1beta1.Auth.Builder.class);
    }

    // Construct using com.appscode.api.operation.v1beta1.Auth.newBuilder()
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
      namespace_ = "";

      username_ = "";

      secret_ = "";

      authType_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.operation.v1beta1.OperationProto.internal_static_appscode_operation_v1beta1_Auth_descriptor;
    }

    public com.appscode.api.operation.v1beta1.Auth getDefaultInstanceForType() {
      return com.appscode.api.operation.v1beta1.Auth.getDefaultInstance();
    }

    public com.appscode.api.operation.v1beta1.Auth build() {
      com.appscode.api.operation.v1beta1.Auth result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.operation.v1beta1.Auth buildPartial() {
      com.appscode.api.operation.v1beta1.Auth result = new com.appscode.api.operation.v1beta1.Auth(this);
      result.namespace_ = namespace_;
      result.username_ = username_;
      result.secret_ = secret_;
      result.authType_ = authType_;
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
      if (other instanceof com.appscode.api.operation.v1beta1.Auth) {
        return mergeFrom((com.appscode.api.operation.v1beta1.Auth)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.operation.v1beta1.Auth other) {
      if (other == com.appscode.api.operation.v1beta1.Auth.getDefaultInstance()) return this;
      if (!other.getNamespace().isEmpty()) {
        namespace_ = other.namespace_;
        onChanged();
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      if (!other.getSecret().isEmpty()) {
        secret_ = other.secret_;
        onChanged();
      }
      if (!other.getAuthType().isEmpty()) {
        authType_ = other.authType_;
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
      com.appscode.api.operation.v1beta1.Auth parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.operation.v1beta1.Auth) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object namespace_ = "";
    /**
     * <code>string namespace = 1;</code>
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string namespace = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string namespace = 1;</code>
     */
    public Builder setNamespace(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      namespace_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string namespace = 1;</code>
     */
    public Builder clearNamespace() {
      
      namespace_ = getDefaultInstance().getNamespace();
      onChanged();
      return this;
    }
    /**
     * <code>string namespace = 1;</code>
     */
    public Builder setNamespaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      namespace_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object username_ = "";
    /**
     * <code>string username = 2;</code>
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string username = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username = 2;</code>
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string username = 2;</code>
     */
    public Builder clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <code>string username = 2;</code>
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object secret_ = "";
    /**
     * <code>string secret = 3;</code>
     */
    public java.lang.String getSecret() {
      java.lang.Object ref = secret_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        secret_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string secret = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSecretBytes() {
      java.lang.Object ref = secret_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        secret_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string secret = 3;</code>
     */
    public Builder setSecret(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      secret_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string secret = 3;</code>
     */
    public Builder clearSecret() {
      
      secret_ = getDefaultInstance().getSecret();
      onChanged();
      return this;
    }
    /**
     * <code>string secret = 3;</code>
     */
    public Builder setSecretBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      secret_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object authType_ = "";
    /**
     * <code>string auth_type = 4;</code>
     */
    public java.lang.String getAuthType() {
      java.lang.Object ref = authType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string auth_type = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAuthTypeBytes() {
      java.lang.Object ref = authType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string auth_type = 4;</code>
     */
    public Builder setAuthType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      authType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string auth_type = 4;</code>
     */
    public Builder clearAuthType() {
      
      authType_ = getDefaultInstance().getAuthType();
      onChanged();
      return this;
    }
    /**
     * <code>string auth_type = 4;</code>
     */
    public Builder setAuthTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      authType_ = value;
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


    // @@protoc_insertion_point(builder_scope:appscode.operation.v1beta1.Auth)
  }

  // @@protoc_insertion_point(class_scope:appscode.operation.v1beta1.Auth)
  private static final com.appscode.api.operation.v1beta1.Auth DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.operation.v1beta1.Auth();
  }

  public static com.appscode.api.operation.v1beta1.Auth getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Auth>
      PARSER = new com.google.protobuf.AbstractParser<Auth>() {
    public Auth parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Auth(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Auth> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Auth> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.operation.v1beta1.Auth getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

