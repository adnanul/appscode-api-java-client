// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/auth/v1beta1/project.proto

package com.appscode.api.auth.v1beta1;

/**
 * Protobuf type {@code appscode.auth.v1beta1.Member}
 */
public  final class Member extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.auth.v1beta1.Member)
    MemberOrBuilder {
  // Use Member.newBuilder() to construct.
  private Member(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Member() {
    phid_ = "";
    userName_ = "";
    realName_ = "";
    isAdmin_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Member(
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

            userName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            realName_ = s;
            break;
          }
          case 32: {

            isAdmin_ = input.readBool();
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
    return com.appscode.api.auth.v1beta1.ProjectProto.internal_static_appscode_auth_v1beta1_Member_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.auth.v1beta1.ProjectProto.internal_static_appscode_auth_v1beta1_Member_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.auth.v1beta1.Member.class, com.appscode.api.auth.v1beta1.Member.Builder.class);
  }

  public static final int PHID_FIELD_NUMBER = 1;
  private volatile java.lang.Object phid_;
  /**
   * <code>optional string phid = 1;</code>
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
   * <code>optional string phid = 1;</code>
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

  public static final int USER_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object userName_;
  /**
   * <code>optional string user_name = 2;</code>
   */
  public java.lang.String getUserName() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string user_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUserNameBytes() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REAL_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object realName_;
  /**
   * <code>optional string real_name = 3;</code>
   */
  public java.lang.String getRealName() {
    java.lang.Object ref = realName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      realName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string real_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getRealNameBytes() {
    java.lang.Object ref = realName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      realName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_ADMIN_FIELD_NUMBER = 4;
  private boolean isAdmin_;
  /**
   * <code>optional bool is_admin = 4;</code>
   */
  public boolean getIsAdmin() {
    return isAdmin_;
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
    if (!getUserNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userName_);
    }
    if (!getRealNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, realName_);
    }
    if (isAdmin_ != false) {
      output.writeBool(4, isAdmin_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPhidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, phid_);
    }
    if (!getUserNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userName_);
    }
    if (!getRealNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, realName_);
    }
    if (isAdmin_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isAdmin_);
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
    if (!(obj instanceof com.appscode.api.auth.v1beta1.Member)) {
      return super.equals(obj);
    }
    com.appscode.api.auth.v1beta1.Member other = (com.appscode.api.auth.v1beta1.Member) obj;

    boolean result = true;
    result = result && getPhid()
        .equals(other.getPhid());
    result = result && getUserName()
        .equals(other.getUserName());
    result = result && getRealName()
        .equals(other.getRealName());
    result = result && (getIsAdmin()
        == other.getIsAdmin());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + PHID_FIELD_NUMBER;
    hash = (53 * hash) + getPhid().hashCode();
    hash = (37 * hash) + USER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getUserName().hashCode();
    hash = (37 * hash) + REAL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getRealName().hashCode();
    hash = (37 * hash) + IS_ADMIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsAdmin());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.auth.v1beta1.Member parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.auth.v1beta1.Member parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.auth.v1beta1.Member parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.auth.v1beta1.Member parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.auth.v1beta1.Member parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.auth.v1beta1.Member parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.auth.v1beta1.Member parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.auth.v1beta1.Member parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.auth.v1beta1.Member parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.auth.v1beta1.Member parseFrom(
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
  public static Builder newBuilder(com.appscode.api.auth.v1beta1.Member prototype) {
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
   * Protobuf type {@code appscode.auth.v1beta1.Member}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.auth.v1beta1.Member)
      com.appscode.api.auth.v1beta1.MemberOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.auth.v1beta1.ProjectProto.internal_static_appscode_auth_v1beta1_Member_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.auth.v1beta1.ProjectProto.internal_static_appscode_auth_v1beta1_Member_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.auth.v1beta1.Member.class, com.appscode.api.auth.v1beta1.Member.Builder.class);
    }

    // Construct using com.appscode.api.auth.v1beta1.Member.newBuilder()
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

      userName_ = "";

      realName_ = "";

      isAdmin_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.auth.v1beta1.ProjectProto.internal_static_appscode_auth_v1beta1_Member_descriptor;
    }

    public com.appscode.api.auth.v1beta1.Member getDefaultInstanceForType() {
      return com.appscode.api.auth.v1beta1.Member.getDefaultInstance();
    }

    public com.appscode.api.auth.v1beta1.Member build() {
      com.appscode.api.auth.v1beta1.Member result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.auth.v1beta1.Member buildPartial() {
      com.appscode.api.auth.v1beta1.Member result = new com.appscode.api.auth.v1beta1.Member(this);
      result.phid_ = phid_;
      result.userName_ = userName_;
      result.realName_ = realName_;
      result.isAdmin_ = isAdmin_;
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
      if (other instanceof com.appscode.api.auth.v1beta1.Member) {
        return mergeFrom((com.appscode.api.auth.v1beta1.Member)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.auth.v1beta1.Member other) {
      if (other == com.appscode.api.auth.v1beta1.Member.getDefaultInstance()) return this;
      if (!other.getPhid().isEmpty()) {
        phid_ = other.phid_;
        onChanged();
      }
      if (!other.getUserName().isEmpty()) {
        userName_ = other.userName_;
        onChanged();
      }
      if (!other.getRealName().isEmpty()) {
        realName_ = other.realName_;
        onChanged();
      }
      if (other.getIsAdmin() != false) {
        setIsAdmin(other.getIsAdmin());
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
      com.appscode.api.auth.v1beta1.Member parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.auth.v1beta1.Member) e.getUnfinishedMessage();
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
     * <code>optional string phid = 1;</code>
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
     * <code>optional string phid = 1;</code>
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
     * <code>optional string phid = 1;</code>
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
     * <code>optional string phid = 1;</code>
     */
    public Builder clearPhid() {
      
      phid_ = getDefaultInstance().getPhid();
      onChanged();
      return this;
    }
    /**
     * <code>optional string phid = 1;</code>
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

    private java.lang.Object userName_ = "";
    /**
     * <code>optional string user_name = 2;</code>
     */
    public java.lang.String getUserName() {
      java.lang.Object ref = userName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string user_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      java.lang.Object ref = userName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string user_name = 2;</code>
     */
    public Builder setUserName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string user_name = 2;</code>
     */
    public Builder clearUserName() {
      
      userName_ = getDefaultInstance().getUserName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string user_name = 2;</code>
     */
    public Builder setUserNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object realName_ = "";
    /**
     * <code>optional string real_name = 3;</code>
     */
    public java.lang.String getRealName() {
      java.lang.Object ref = realName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        realName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string real_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getRealNameBytes() {
      java.lang.Object ref = realName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        realName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string real_name = 3;</code>
     */
    public Builder setRealName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      realName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string real_name = 3;</code>
     */
    public Builder clearRealName() {
      
      realName_ = getDefaultInstance().getRealName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string real_name = 3;</code>
     */
    public Builder setRealNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      realName_ = value;
      onChanged();
      return this;
    }

    private boolean isAdmin_ ;
    /**
     * <code>optional bool is_admin = 4;</code>
     */
    public boolean getIsAdmin() {
      return isAdmin_;
    }
    /**
     * <code>optional bool is_admin = 4;</code>
     */
    public Builder setIsAdmin(boolean value) {
      
      isAdmin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool is_admin = 4;</code>
     */
    public Builder clearIsAdmin() {
      
      isAdmin_ = false;
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


    // @@protoc_insertion_point(builder_scope:appscode.auth.v1beta1.Member)
  }

  // @@protoc_insertion_point(class_scope:appscode.auth.v1beta1.Member)
  private static final com.appscode.api.auth.v1beta1.Member DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.auth.v1beta1.Member();
  }

  public static com.appscode.api.auth.v1beta1.Member getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Member>
      PARSER = new com.google.protobuf.AbstractParser<Member>() {
    public Member parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Member(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Member> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Member> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.auth.v1beta1.Member getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

