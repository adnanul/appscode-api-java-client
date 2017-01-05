// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/credential/v1beta1/credential.proto

package com.appscode.api.credential.v1beta1;

/**
 * Protobuf type {@code appscode.credential.v1beta1.Credential}
 */
public  final class Credential extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.credential.v1beta1.Credential)
    CredentialOrBuilder {
  // Use Credential.newBuilder() to construct.
  private Credential(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Credential() {
    name_ = "";
    provider_ = "";
    information_ = "";
    modifiedAt_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Credential(
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

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            provider_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            information_ = s;
            break;
          }
          case 32: {

            modifiedAt_ = input.readInt64();
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
    return com.appscode.api.credential.v1beta1.CredentialProto.internal_static_appscode_credential_v1beta1_Credential_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.credential.v1beta1.CredentialProto.internal_static_appscode_credential_v1beta1_Credential_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.credential.v1beta1.Credential.class, com.appscode.api.credential.v1beta1.Credential.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>optional string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROVIDER_FIELD_NUMBER = 2;
  private volatile java.lang.Object provider_;
  /**
   * <code>optional string provider = 2;</code>
   */
  public java.lang.String getProvider() {
    java.lang.Object ref = provider_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      provider_ = s;
      return s;
    }
  }
  /**
   * <code>optional string provider = 2;</code>
   */
  public com.google.protobuf.ByteString
      getProviderBytes() {
    java.lang.Object ref = provider_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      provider_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INFORMATION_FIELD_NUMBER = 3;
  private volatile java.lang.Object information_;
  /**
   * <code>optional string information = 3;</code>
   */
  public java.lang.String getInformation() {
    java.lang.Object ref = information_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      information_ = s;
      return s;
    }
  }
  /**
   * <code>optional string information = 3;</code>
   */
  public com.google.protobuf.ByteString
      getInformationBytes() {
    java.lang.Object ref = information_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      information_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODIFIED_AT_FIELD_NUMBER = 4;
  private long modifiedAt_;
  /**
   * <code>optional int64 modified_at = 4;</code>
   */
  public long getModifiedAt() {
    return modifiedAt_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getProviderBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, provider_);
    }
    if (!getInformationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, information_);
    }
    if (modifiedAt_ != 0L) {
      output.writeInt64(4, modifiedAt_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getProviderBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, provider_);
    }
    if (!getInformationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, information_);
    }
    if (modifiedAt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, modifiedAt_);
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
    if (!(obj instanceof com.appscode.api.credential.v1beta1.Credential)) {
      return super.equals(obj);
    }
    com.appscode.api.credential.v1beta1.Credential other = (com.appscode.api.credential.v1beta1.Credential) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getProvider()
        .equals(other.getProvider());
    result = result && getInformation()
        .equals(other.getInformation());
    result = result && (getModifiedAt()
        == other.getModifiedAt());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + getProvider().hashCode();
    hash = (37 * hash) + INFORMATION_FIELD_NUMBER;
    hash = (53 * hash) + getInformation().hashCode();
    hash = (37 * hash) + MODIFIED_AT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getModifiedAt());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.credential.v1beta1.Credential parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.credential.v1beta1.Credential parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.credential.v1beta1.Credential parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.credential.v1beta1.Credential parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.credential.v1beta1.Credential parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.credential.v1beta1.Credential parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.credential.v1beta1.Credential parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.credential.v1beta1.Credential parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.credential.v1beta1.Credential parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.credential.v1beta1.Credential parseFrom(
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
  public static Builder newBuilder(com.appscode.api.credential.v1beta1.Credential prototype) {
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
   * Protobuf type {@code appscode.credential.v1beta1.Credential}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.credential.v1beta1.Credential)
      com.appscode.api.credential.v1beta1.CredentialOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.credential.v1beta1.CredentialProto.internal_static_appscode_credential_v1beta1_Credential_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.credential.v1beta1.CredentialProto.internal_static_appscode_credential_v1beta1_Credential_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.credential.v1beta1.Credential.class, com.appscode.api.credential.v1beta1.Credential.Builder.class);
    }

    // Construct using com.appscode.api.credential.v1beta1.Credential.newBuilder()
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
      name_ = "";

      provider_ = "";

      information_ = "";

      modifiedAt_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.credential.v1beta1.CredentialProto.internal_static_appscode_credential_v1beta1_Credential_descriptor;
    }

    public com.appscode.api.credential.v1beta1.Credential getDefaultInstanceForType() {
      return com.appscode.api.credential.v1beta1.Credential.getDefaultInstance();
    }

    public com.appscode.api.credential.v1beta1.Credential build() {
      com.appscode.api.credential.v1beta1.Credential result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.credential.v1beta1.Credential buildPartial() {
      com.appscode.api.credential.v1beta1.Credential result = new com.appscode.api.credential.v1beta1.Credential(this);
      result.name_ = name_;
      result.provider_ = provider_;
      result.information_ = information_;
      result.modifiedAt_ = modifiedAt_;
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
      if (other instanceof com.appscode.api.credential.v1beta1.Credential) {
        return mergeFrom((com.appscode.api.credential.v1beta1.Credential)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.credential.v1beta1.Credential other) {
      if (other == com.appscode.api.credential.v1beta1.Credential.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getProvider().isEmpty()) {
        provider_ = other.provider_;
        onChanged();
      }
      if (!other.getInformation().isEmpty()) {
        information_ = other.information_;
        onChanged();
      }
      if (other.getModifiedAt() != 0L) {
        setModifiedAt(other.getModifiedAt());
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
      com.appscode.api.credential.v1beta1.Credential parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.credential.v1beta1.Credential) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object provider_ = "";
    /**
     * <code>optional string provider = 2;</code>
     */
    public java.lang.String getProvider() {
      java.lang.Object ref = provider_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        provider_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string provider = 2;</code>
     */
    public com.google.protobuf.ByteString
        getProviderBytes() {
      java.lang.Object ref = provider_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        provider_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string provider = 2;</code>
     */
    public Builder setProvider(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      provider_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string provider = 2;</code>
     */
    public Builder clearProvider() {
      
      provider_ = getDefaultInstance().getProvider();
      onChanged();
      return this;
    }
    /**
     * <code>optional string provider = 2;</code>
     */
    public Builder setProviderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      provider_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object information_ = "";
    /**
     * <code>optional string information = 3;</code>
     */
    public java.lang.String getInformation() {
      java.lang.Object ref = information_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        information_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string information = 3;</code>
     */
    public com.google.protobuf.ByteString
        getInformationBytes() {
      java.lang.Object ref = information_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        information_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string information = 3;</code>
     */
    public Builder setInformation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      information_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string information = 3;</code>
     */
    public Builder clearInformation() {
      
      information_ = getDefaultInstance().getInformation();
      onChanged();
      return this;
    }
    /**
     * <code>optional string information = 3;</code>
     */
    public Builder setInformationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      information_ = value;
      onChanged();
      return this;
    }

    private long modifiedAt_ ;
    /**
     * <code>optional int64 modified_at = 4;</code>
     */
    public long getModifiedAt() {
      return modifiedAt_;
    }
    /**
     * <code>optional int64 modified_at = 4;</code>
     */
    public Builder setModifiedAt(long value) {
      
      modifiedAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 modified_at = 4;</code>
     */
    public Builder clearModifiedAt() {
      
      modifiedAt_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:appscode.credential.v1beta1.Credential)
  }

  // @@protoc_insertion_point(class_scope:appscode.credential.v1beta1.Credential)
  private static final com.appscode.api.credential.v1beta1.Credential DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.credential.v1beta1.Credential();
  }

  public static com.appscode.api.credential.v1beta1.Credential getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Credential>
      PARSER = new com.google.protobuf.AbstractParser<Credential>() {
    public Credential parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Credential(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Credential> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Credential> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.credential.v1beta1.Credential getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

