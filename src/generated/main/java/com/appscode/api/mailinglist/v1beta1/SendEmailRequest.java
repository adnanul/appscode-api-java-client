// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/mailinglist/v1beta1/mailinglist.proto

package com.appscode.api.mailinglist.v1beta1;

/**
 * Protobuf type {@code appscode.mailinglist.v1beta1.SendEmailRequest}
 */
public  final class SendEmailRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.mailinglist.v1beta1.SendEmailRequest)
    SendEmailRequestOrBuilder {
  // Use SendEmailRequest.newBuilder() to construct.
  private SendEmailRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendEmailRequest() {
    senderName_ = "";
    senderEmail_ = "";
    subject_ = "";
    body_ = "";
    receiverEmail_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SendEmailRequest(
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

            senderName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            senderEmail_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            subject_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            body_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            receiverEmail_ = s;
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
    return com.appscode.api.mailinglist.v1beta1.MailingListProto.internal_static_appscode_mailinglist_v1beta1_SendEmailRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.mailinglist.v1beta1.MailingListProto.internal_static_appscode_mailinglist_v1beta1_SendEmailRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.mailinglist.v1beta1.SendEmailRequest.class, com.appscode.api.mailinglist.v1beta1.SendEmailRequest.Builder.class);
  }

  public static final int SENDER_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object senderName_;
  /**
   * <code>string sender_name = 1;</code>
   */
  public java.lang.String getSenderName() {
    java.lang.Object ref = senderName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      senderName_ = s;
      return s;
    }
  }
  /**
   * <code>string sender_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSenderNameBytes() {
    java.lang.Object ref = senderName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      senderName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SENDER_EMAIL_FIELD_NUMBER = 2;
  private volatile java.lang.Object senderEmail_;
  /**
   * <code>string sender_email = 2;</code>
   */
  public java.lang.String getSenderEmail() {
    java.lang.Object ref = senderEmail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      senderEmail_ = s;
      return s;
    }
  }
  /**
   * <code>string sender_email = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSenderEmailBytes() {
    java.lang.Object ref = senderEmail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      senderEmail_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBJECT_FIELD_NUMBER = 3;
  private volatile java.lang.Object subject_;
  /**
   * <code>string subject = 3;</code>
   */
  public java.lang.String getSubject() {
    java.lang.Object ref = subject_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subject_ = s;
      return s;
    }
  }
  /**
   * <code>string subject = 3;</code>
   */
  public com.google.protobuf.ByteString
      getSubjectBytes() {
    java.lang.Object ref = subject_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subject_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BODY_FIELD_NUMBER = 4;
  private volatile java.lang.Object body_;
  /**
   * <code>string body = 4;</code>
   */
  public java.lang.String getBody() {
    java.lang.Object ref = body_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      body_ = s;
      return s;
    }
  }
  /**
   * <code>string body = 4;</code>
   */
  public com.google.protobuf.ByteString
      getBodyBytes() {
    java.lang.Object ref = body_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      body_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECEIVER_EMAIL_FIELD_NUMBER = 5;
  private volatile java.lang.Object receiverEmail_;
  /**
   * <code>string receiver_email = 5;</code>
   */
  public java.lang.String getReceiverEmail() {
    java.lang.Object ref = receiverEmail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      receiverEmail_ = s;
      return s;
    }
  }
  /**
   * <code>string receiver_email = 5;</code>
   */
  public com.google.protobuf.ByteString
      getReceiverEmailBytes() {
    java.lang.Object ref = receiverEmail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      receiverEmail_ = b;
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
    if (!getSenderNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, senderName_);
    }
    if (!getSenderEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, senderEmail_);
    }
    if (!getSubjectBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, subject_);
    }
    if (!getBodyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, body_);
    }
    if (!getReceiverEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, receiverEmail_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSenderNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, senderName_);
    }
    if (!getSenderEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, senderEmail_);
    }
    if (!getSubjectBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, subject_);
    }
    if (!getBodyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, body_);
    }
    if (!getReceiverEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, receiverEmail_);
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
    if (!(obj instanceof com.appscode.api.mailinglist.v1beta1.SendEmailRequest)) {
      return super.equals(obj);
    }
    com.appscode.api.mailinglist.v1beta1.SendEmailRequest other = (com.appscode.api.mailinglist.v1beta1.SendEmailRequest) obj;

    boolean result = true;
    result = result && getSenderName()
        .equals(other.getSenderName());
    result = result && getSenderEmail()
        .equals(other.getSenderEmail());
    result = result && getSubject()
        .equals(other.getSubject());
    result = result && getBody()
        .equals(other.getBody());
    result = result && getReceiverEmail()
        .equals(other.getReceiverEmail());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SENDER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getSenderName().hashCode();
    hash = (37 * hash) + SENDER_EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getSenderEmail().hashCode();
    hash = (37 * hash) + SUBJECT_FIELD_NUMBER;
    hash = (53 * hash) + getSubject().hashCode();
    hash = (37 * hash) + BODY_FIELD_NUMBER;
    hash = (53 * hash) + getBody().hashCode();
    hash = (37 * hash) + RECEIVER_EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getReceiverEmail().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.mailinglist.v1beta1.SendEmailRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.mailinglist.v1beta1.SendEmailRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.mailinglist.v1beta1.SendEmailRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.mailinglist.v1beta1.SendEmailRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.mailinglist.v1beta1.SendEmailRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.mailinglist.v1beta1.SendEmailRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.mailinglist.v1beta1.SendEmailRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.mailinglist.v1beta1.SendEmailRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.mailinglist.v1beta1.SendEmailRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.mailinglist.v1beta1.SendEmailRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.mailinglist.v1beta1.SendEmailRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.mailinglist.v1beta1.SendEmailRequest parseFrom(
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
  public static Builder newBuilder(com.appscode.api.mailinglist.v1beta1.SendEmailRequest prototype) {
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
   * Protobuf type {@code appscode.mailinglist.v1beta1.SendEmailRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.mailinglist.v1beta1.SendEmailRequest)
      com.appscode.api.mailinglist.v1beta1.SendEmailRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.mailinglist.v1beta1.MailingListProto.internal_static_appscode_mailinglist_v1beta1_SendEmailRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.mailinglist.v1beta1.MailingListProto.internal_static_appscode_mailinglist_v1beta1_SendEmailRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.mailinglist.v1beta1.SendEmailRequest.class, com.appscode.api.mailinglist.v1beta1.SendEmailRequest.Builder.class);
    }

    // Construct using com.appscode.api.mailinglist.v1beta1.SendEmailRequest.newBuilder()
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
      senderName_ = "";

      senderEmail_ = "";

      subject_ = "";

      body_ = "";

      receiverEmail_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.mailinglist.v1beta1.MailingListProto.internal_static_appscode_mailinglist_v1beta1_SendEmailRequest_descriptor;
    }

    public com.appscode.api.mailinglist.v1beta1.SendEmailRequest getDefaultInstanceForType() {
      return com.appscode.api.mailinglist.v1beta1.SendEmailRequest.getDefaultInstance();
    }

    public com.appscode.api.mailinglist.v1beta1.SendEmailRequest build() {
      com.appscode.api.mailinglist.v1beta1.SendEmailRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.mailinglist.v1beta1.SendEmailRequest buildPartial() {
      com.appscode.api.mailinglist.v1beta1.SendEmailRequest result = new com.appscode.api.mailinglist.v1beta1.SendEmailRequest(this);
      result.senderName_ = senderName_;
      result.senderEmail_ = senderEmail_;
      result.subject_ = subject_;
      result.body_ = body_;
      result.receiverEmail_ = receiverEmail_;
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
      if (other instanceof com.appscode.api.mailinglist.v1beta1.SendEmailRequest) {
        return mergeFrom((com.appscode.api.mailinglist.v1beta1.SendEmailRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.mailinglist.v1beta1.SendEmailRequest other) {
      if (other == com.appscode.api.mailinglist.v1beta1.SendEmailRequest.getDefaultInstance()) return this;
      if (!other.getSenderName().isEmpty()) {
        senderName_ = other.senderName_;
        onChanged();
      }
      if (!other.getSenderEmail().isEmpty()) {
        senderEmail_ = other.senderEmail_;
        onChanged();
      }
      if (!other.getSubject().isEmpty()) {
        subject_ = other.subject_;
        onChanged();
      }
      if (!other.getBody().isEmpty()) {
        body_ = other.body_;
        onChanged();
      }
      if (!other.getReceiverEmail().isEmpty()) {
        receiverEmail_ = other.receiverEmail_;
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
      com.appscode.api.mailinglist.v1beta1.SendEmailRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.mailinglist.v1beta1.SendEmailRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object senderName_ = "";
    /**
     * <code>string sender_name = 1;</code>
     */
    public java.lang.String getSenderName() {
      java.lang.Object ref = senderName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        senderName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sender_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSenderNameBytes() {
      java.lang.Object ref = senderName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        senderName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sender_name = 1;</code>
     */
    public Builder setSenderName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      senderName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sender_name = 1;</code>
     */
    public Builder clearSenderName() {
      
      senderName_ = getDefaultInstance().getSenderName();
      onChanged();
      return this;
    }
    /**
     * <code>string sender_name = 1;</code>
     */
    public Builder setSenderNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      senderName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object senderEmail_ = "";
    /**
     * <code>string sender_email = 2;</code>
     */
    public java.lang.String getSenderEmail() {
      java.lang.Object ref = senderEmail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        senderEmail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sender_email = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSenderEmailBytes() {
      java.lang.Object ref = senderEmail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        senderEmail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sender_email = 2;</code>
     */
    public Builder setSenderEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      senderEmail_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sender_email = 2;</code>
     */
    public Builder clearSenderEmail() {
      
      senderEmail_ = getDefaultInstance().getSenderEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string sender_email = 2;</code>
     */
    public Builder setSenderEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      senderEmail_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object subject_ = "";
    /**
     * <code>string subject = 3;</code>
     */
    public java.lang.String getSubject() {
      java.lang.Object ref = subject_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subject_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string subject = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSubjectBytes() {
      java.lang.Object ref = subject_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subject_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string subject = 3;</code>
     */
    public Builder setSubject(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subject_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string subject = 3;</code>
     */
    public Builder clearSubject() {
      
      subject_ = getDefaultInstance().getSubject();
      onChanged();
      return this;
    }
    /**
     * <code>string subject = 3;</code>
     */
    public Builder setSubjectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subject_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object body_ = "";
    /**
     * <code>string body = 4;</code>
     */
    public java.lang.String getBody() {
      java.lang.Object ref = body_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        body_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string body = 4;</code>
     */
    public com.google.protobuf.ByteString
        getBodyBytes() {
      java.lang.Object ref = body_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        body_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string body = 4;</code>
     */
    public Builder setBody(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      body_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string body = 4;</code>
     */
    public Builder clearBody() {
      
      body_ = getDefaultInstance().getBody();
      onChanged();
      return this;
    }
    /**
     * <code>string body = 4;</code>
     */
    public Builder setBodyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      body_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object receiverEmail_ = "";
    /**
     * <code>string receiver_email = 5;</code>
     */
    public java.lang.String getReceiverEmail() {
      java.lang.Object ref = receiverEmail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        receiverEmail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string receiver_email = 5;</code>
     */
    public com.google.protobuf.ByteString
        getReceiverEmailBytes() {
      java.lang.Object ref = receiverEmail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        receiverEmail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string receiver_email = 5;</code>
     */
    public Builder setReceiverEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      receiverEmail_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string receiver_email = 5;</code>
     */
    public Builder clearReceiverEmail() {
      
      receiverEmail_ = getDefaultInstance().getReceiverEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string receiver_email = 5;</code>
     */
    public Builder setReceiverEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      receiverEmail_ = value;
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


    // @@protoc_insertion_point(builder_scope:appscode.mailinglist.v1beta1.SendEmailRequest)
  }

  // @@protoc_insertion_point(class_scope:appscode.mailinglist.v1beta1.SendEmailRequest)
  private static final com.appscode.api.mailinglist.v1beta1.SendEmailRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.mailinglist.v1beta1.SendEmailRequest();
  }

  public static com.appscode.api.mailinglist.v1beta1.SendEmailRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendEmailRequest>
      PARSER = new com.google.protobuf.AbstractParser<SendEmailRequest>() {
    public SendEmailRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SendEmailRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendEmailRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendEmailRequest> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.mailinglist.v1beta1.SendEmailRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

