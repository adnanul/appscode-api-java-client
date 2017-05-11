// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/certificate/v1beta1/certificate.proto

package com.appscode.api.certificate.v1beta1;

/**
 * Protobuf type {@code appscode.certificate.v1beta1.CertificateLoadRequest}
 */
public  final class CertificateLoadRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.certificate.v1beta1.CertificateLoadRequest)
    CertificateLoadRequestOrBuilder {
  // Use CertificateLoadRequest.newBuilder() to construct.
  private CertificateLoadRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CertificateLoadRequest() {
    name_ = "";
    certData_ = "";
    keyData_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CertificateLoadRequest(
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

            certData_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            keyData_ = s;
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
    return com.appscode.api.certificate.v1beta1.CertificateProto.internal_static_appscode_certificate_v1beta1_CertificateLoadRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.certificate.v1beta1.CertificateProto.internal_static_appscode_certificate_v1beta1_CertificateLoadRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.certificate.v1beta1.CertificateLoadRequest.class, com.appscode.api.certificate.v1beta1.CertificateLoadRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
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
   * <code>string name = 1;</code>
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

  public static final int CERT_DATA_FIELD_NUMBER = 2;
  private volatile java.lang.Object certData_;
  /**
   * <code>string cert_data = 2;</code>
   */
  public java.lang.String getCertData() {
    java.lang.Object ref = certData_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      certData_ = s;
      return s;
    }
  }
  /**
   * <code>string cert_data = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCertDataBytes() {
    java.lang.Object ref = certData_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      certData_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_DATA_FIELD_NUMBER = 3;
  private volatile java.lang.Object keyData_;
  /**
   * <code>string key_data = 3;</code>
   */
  public java.lang.String getKeyData() {
    java.lang.Object ref = keyData_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyData_ = s;
      return s;
    }
  }
  /**
   * <code>string key_data = 3;</code>
   */
  public com.google.protobuf.ByteString
      getKeyDataBytes() {
    java.lang.Object ref = keyData_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keyData_ = b;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getCertDataBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, certData_);
    }
    if (!getKeyDataBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, keyData_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getCertDataBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, certData_);
    }
    if (!getKeyDataBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, keyData_);
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
    if (!(obj instanceof com.appscode.api.certificate.v1beta1.CertificateLoadRequest)) {
      return super.equals(obj);
    }
    com.appscode.api.certificate.v1beta1.CertificateLoadRequest other = (com.appscode.api.certificate.v1beta1.CertificateLoadRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getCertData()
        .equals(other.getCertData());
    result = result && getKeyData()
        .equals(other.getKeyData());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + CERT_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getCertData().hashCode();
    hash = (37 * hash) + KEY_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getKeyData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.certificate.v1beta1.CertificateLoadRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.certificate.v1beta1.CertificateLoadRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.certificate.v1beta1.CertificateLoadRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.certificate.v1beta1.CertificateLoadRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.certificate.v1beta1.CertificateLoadRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.certificate.v1beta1.CertificateLoadRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.certificate.v1beta1.CertificateLoadRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.certificate.v1beta1.CertificateLoadRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.certificate.v1beta1.CertificateLoadRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.certificate.v1beta1.CertificateLoadRequest parseFrom(
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
  public static Builder newBuilder(com.appscode.api.certificate.v1beta1.CertificateLoadRequest prototype) {
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
   * Protobuf type {@code appscode.certificate.v1beta1.CertificateLoadRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.certificate.v1beta1.CertificateLoadRequest)
      com.appscode.api.certificate.v1beta1.CertificateLoadRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.certificate.v1beta1.CertificateProto.internal_static_appscode_certificate_v1beta1_CertificateLoadRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.certificate.v1beta1.CertificateProto.internal_static_appscode_certificate_v1beta1_CertificateLoadRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.certificate.v1beta1.CertificateLoadRequest.class, com.appscode.api.certificate.v1beta1.CertificateLoadRequest.Builder.class);
    }

    // Construct using com.appscode.api.certificate.v1beta1.CertificateLoadRequest.newBuilder()
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

      certData_ = "";

      keyData_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.certificate.v1beta1.CertificateProto.internal_static_appscode_certificate_v1beta1_CertificateLoadRequest_descriptor;
    }

    public com.appscode.api.certificate.v1beta1.CertificateLoadRequest getDefaultInstanceForType() {
      return com.appscode.api.certificate.v1beta1.CertificateLoadRequest.getDefaultInstance();
    }

    public com.appscode.api.certificate.v1beta1.CertificateLoadRequest build() {
      com.appscode.api.certificate.v1beta1.CertificateLoadRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.certificate.v1beta1.CertificateLoadRequest buildPartial() {
      com.appscode.api.certificate.v1beta1.CertificateLoadRequest result = new com.appscode.api.certificate.v1beta1.CertificateLoadRequest(this);
      result.name_ = name_;
      result.certData_ = certData_;
      result.keyData_ = keyData_;
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
      if (other instanceof com.appscode.api.certificate.v1beta1.CertificateLoadRequest) {
        return mergeFrom((com.appscode.api.certificate.v1beta1.CertificateLoadRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.certificate.v1beta1.CertificateLoadRequest other) {
      if (other == com.appscode.api.certificate.v1beta1.CertificateLoadRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getCertData().isEmpty()) {
        certData_ = other.certData_;
        onChanged();
      }
      if (!other.getKeyData().isEmpty()) {
        keyData_ = other.keyData_;
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
      com.appscode.api.certificate.v1beta1.CertificateLoadRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.certificate.v1beta1.CertificateLoadRequest) e.getUnfinishedMessage();
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
     * <code>string name = 1;</code>
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
     * <code>string name = 1;</code>
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
     * <code>string name = 1;</code>
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
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
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

    private java.lang.Object certData_ = "";
    /**
     * <code>string cert_data = 2;</code>
     */
    public java.lang.String getCertData() {
      java.lang.Object ref = certData_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        certData_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cert_data = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCertDataBytes() {
      java.lang.Object ref = certData_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        certData_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cert_data = 2;</code>
     */
    public Builder setCertData(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      certData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cert_data = 2;</code>
     */
    public Builder clearCertData() {
      
      certData_ = getDefaultInstance().getCertData();
      onChanged();
      return this;
    }
    /**
     * <code>string cert_data = 2;</code>
     */
    public Builder setCertDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      certData_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object keyData_ = "";
    /**
     * <code>string key_data = 3;</code>
     */
    public java.lang.String getKeyData() {
      java.lang.Object ref = keyData_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyData_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string key_data = 3;</code>
     */
    public com.google.protobuf.ByteString
        getKeyDataBytes() {
      java.lang.Object ref = keyData_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyData_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string key_data = 3;</code>
     */
    public Builder setKeyData(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      keyData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string key_data = 3;</code>
     */
    public Builder clearKeyData() {
      
      keyData_ = getDefaultInstance().getKeyData();
      onChanged();
      return this;
    }
    /**
     * <code>string key_data = 3;</code>
     */
    public Builder setKeyDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      keyData_ = value;
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


    // @@protoc_insertion_point(builder_scope:appscode.certificate.v1beta1.CertificateLoadRequest)
  }

  // @@protoc_insertion_point(class_scope:appscode.certificate.v1beta1.CertificateLoadRequest)
  private static final com.appscode.api.certificate.v1beta1.CertificateLoadRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.certificate.v1beta1.CertificateLoadRequest();
  }

  public static com.appscode.api.certificate.v1beta1.CertificateLoadRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CertificateLoadRequest>
      PARSER = new com.google.protobuf.AbstractParser<CertificateLoadRequest>() {
    public CertificateLoadRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CertificateLoadRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CertificateLoadRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CertificateLoadRequest> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.certificate.v1beta1.CertificateLoadRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

