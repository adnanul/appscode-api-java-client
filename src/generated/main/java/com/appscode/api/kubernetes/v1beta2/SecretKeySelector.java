// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

/**
 * <pre>
 * SecretKeySelector selects a key of a Secret.
 * </pre>
 *
 * Protobuf type {@code appscode.kubernetes.v1beta2.SecretKeySelector}
 */
public  final class SecretKeySelector extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta2.SecretKeySelector)
    SecretKeySelectorOrBuilder {
  // Use SecretKeySelector.newBuilder() to construct.
  private SecretKeySelector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SecretKeySelector() {
    key_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SecretKeySelector(
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
            com.appscode.api.kubernetes.v1beta2.ObjectReference.Builder subBuilder = null;
            if (localObjectReference_ != null) {
              subBuilder = localObjectReference_.toBuilder();
            }
            localObjectReference_ = input.readMessage(com.appscode.api.kubernetes.v1beta2.ObjectReference.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(localObjectReference_);
              localObjectReference_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            key_ = s;
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
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_SecretKeySelector_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_SecretKeySelector_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta2.SecretKeySelector.class, com.appscode.api.kubernetes.v1beta2.SecretKeySelector.Builder.class);
  }

  public static final int LOCAL_OBJECT_REFERENCE_FIELD_NUMBER = 1;
  private com.appscode.api.kubernetes.v1beta2.ObjectReference localObjectReference_;
  /**
   * <pre>
   * The name of the secret in the pod's namespace to select from.
   * </pre>
   *
   * <code>optional .appscode.kubernetes.v1beta2.ObjectReference local_object_reference = 1;</code>
   */
  public boolean hasLocalObjectReference() {
    return localObjectReference_ != null;
  }
  /**
   * <pre>
   * The name of the secret in the pod's namespace to select from.
   * </pre>
   *
   * <code>optional .appscode.kubernetes.v1beta2.ObjectReference local_object_reference = 1;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.ObjectReference getLocalObjectReference() {
    return localObjectReference_ == null ? com.appscode.api.kubernetes.v1beta2.ObjectReference.getDefaultInstance() : localObjectReference_;
  }
  /**
   * <pre>
   * The name of the secret in the pod's namespace to select from.
   * </pre>
   *
   * <code>optional .appscode.kubernetes.v1beta2.ObjectReference local_object_reference = 1;</code>
   */
  public com.appscode.api.kubernetes.v1beta2.ObjectReferenceOrBuilder getLocalObjectReferenceOrBuilder() {
    return getLocalObjectReference();
  }

  public static final int KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object key_;
  /**
   * <pre>
   * The key of the secret to select from.  Must be a valid secret key.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The key of the secret to select from.  Must be a valid secret key.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
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
    if (localObjectReference_ != null) {
      output.writeMessage(1, getLocalObjectReference());
    }
    if (!getKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, key_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (localObjectReference_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLocalObjectReference());
    }
    if (!getKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, key_);
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta2.SecretKeySelector)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta2.SecretKeySelector other = (com.appscode.api.kubernetes.v1beta2.SecretKeySelector) obj;

    boolean result = true;
    result = result && (hasLocalObjectReference() == other.hasLocalObjectReference());
    if (hasLocalObjectReference()) {
      result = result && getLocalObjectReference()
          .equals(other.getLocalObjectReference());
    }
    result = result && getKey()
        .equals(other.getKey());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasLocalObjectReference()) {
      hash = (37 * hash) + LOCAL_OBJECT_REFERENCE_FIELD_NUMBER;
      hash = (53 * hash) + getLocalObjectReference().hashCode();
    }
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta2.SecretKeySelector parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.SecretKeySelector parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.SecretKeySelector parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.SecretKeySelector parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.SecretKeySelector parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.SecretKeySelector parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.SecretKeySelector parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.SecretKeySelector parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.SecretKeySelector parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.SecretKeySelector parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta2.SecretKeySelector prototype) {
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
   * SecretKeySelector selects a key of a Secret.
   * </pre>
   *
   * Protobuf type {@code appscode.kubernetes.v1beta2.SecretKeySelector}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta2.SecretKeySelector)
      com.appscode.api.kubernetes.v1beta2.SecretKeySelectorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_SecretKeySelector_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_SecretKeySelector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta2.SecretKeySelector.class, com.appscode.api.kubernetes.v1beta2.SecretKeySelector.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta2.SecretKeySelector.newBuilder()
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
      if (localObjectReferenceBuilder_ == null) {
        localObjectReference_ = null;
      } else {
        localObjectReference_ = null;
        localObjectReferenceBuilder_ = null;
      }
      key_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_SecretKeySelector_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta2.SecretKeySelector getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta2.SecretKeySelector.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta2.SecretKeySelector build() {
      com.appscode.api.kubernetes.v1beta2.SecretKeySelector result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta2.SecretKeySelector buildPartial() {
      com.appscode.api.kubernetes.v1beta2.SecretKeySelector result = new com.appscode.api.kubernetes.v1beta2.SecretKeySelector(this);
      if (localObjectReferenceBuilder_ == null) {
        result.localObjectReference_ = localObjectReference_;
      } else {
        result.localObjectReference_ = localObjectReferenceBuilder_.build();
      }
      result.key_ = key_;
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
      if (other instanceof com.appscode.api.kubernetes.v1beta2.SecretKeySelector) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta2.SecretKeySelector)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta2.SecretKeySelector other) {
      if (other == com.appscode.api.kubernetes.v1beta2.SecretKeySelector.getDefaultInstance()) return this;
      if (other.hasLocalObjectReference()) {
        mergeLocalObjectReference(other.getLocalObjectReference());
      }
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
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
      com.appscode.api.kubernetes.v1beta2.SecretKeySelector parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta2.SecretKeySelector) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appscode.api.kubernetes.v1beta2.ObjectReference localObjectReference_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.ObjectReference, com.appscode.api.kubernetes.v1beta2.ObjectReference.Builder, com.appscode.api.kubernetes.v1beta2.ObjectReferenceOrBuilder> localObjectReferenceBuilder_;
    /**
     * <pre>
     * The name of the secret in the pod's namespace to select from.
     * </pre>
     *
     * <code>optional .appscode.kubernetes.v1beta2.ObjectReference local_object_reference = 1;</code>
     */
    public boolean hasLocalObjectReference() {
      return localObjectReferenceBuilder_ != null || localObjectReference_ != null;
    }
    /**
     * <pre>
     * The name of the secret in the pod's namespace to select from.
     * </pre>
     *
     * <code>optional .appscode.kubernetes.v1beta2.ObjectReference local_object_reference = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.ObjectReference getLocalObjectReference() {
      if (localObjectReferenceBuilder_ == null) {
        return localObjectReference_ == null ? com.appscode.api.kubernetes.v1beta2.ObjectReference.getDefaultInstance() : localObjectReference_;
      } else {
        return localObjectReferenceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The name of the secret in the pod's namespace to select from.
     * </pre>
     *
     * <code>optional .appscode.kubernetes.v1beta2.ObjectReference local_object_reference = 1;</code>
     */
    public Builder setLocalObjectReference(com.appscode.api.kubernetes.v1beta2.ObjectReference value) {
      if (localObjectReferenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        localObjectReference_ = value;
        onChanged();
      } else {
        localObjectReferenceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The name of the secret in the pod's namespace to select from.
     * </pre>
     *
     * <code>optional .appscode.kubernetes.v1beta2.ObjectReference local_object_reference = 1;</code>
     */
    public Builder setLocalObjectReference(
        com.appscode.api.kubernetes.v1beta2.ObjectReference.Builder builderForValue) {
      if (localObjectReferenceBuilder_ == null) {
        localObjectReference_ = builderForValue.build();
        onChanged();
      } else {
        localObjectReferenceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The name of the secret in the pod's namespace to select from.
     * </pre>
     *
     * <code>optional .appscode.kubernetes.v1beta2.ObjectReference local_object_reference = 1;</code>
     */
    public Builder mergeLocalObjectReference(com.appscode.api.kubernetes.v1beta2.ObjectReference value) {
      if (localObjectReferenceBuilder_ == null) {
        if (localObjectReference_ != null) {
          localObjectReference_ =
            com.appscode.api.kubernetes.v1beta2.ObjectReference.newBuilder(localObjectReference_).mergeFrom(value).buildPartial();
        } else {
          localObjectReference_ = value;
        }
        onChanged();
      } else {
        localObjectReferenceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The name of the secret in the pod's namespace to select from.
     * </pre>
     *
     * <code>optional .appscode.kubernetes.v1beta2.ObjectReference local_object_reference = 1;</code>
     */
    public Builder clearLocalObjectReference() {
      if (localObjectReferenceBuilder_ == null) {
        localObjectReference_ = null;
        onChanged();
      } else {
        localObjectReference_ = null;
        localObjectReferenceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The name of the secret in the pod's namespace to select from.
     * </pre>
     *
     * <code>optional .appscode.kubernetes.v1beta2.ObjectReference local_object_reference = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.ObjectReference.Builder getLocalObjectReferenceBuilder() {
      
      onChanged();
      return getLocalObjectReferenceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The name of the secret in the pod's namespace to select from.
     * </pre>
     *
     * <code>optional .appscode.kubernetes.v1beta2.ObjectReference local_object_reference = 1;</code>
     */
    public com.appscode.api.kubernetes.v1beta2.ObjectReferenceOrBuilder getLocalObjectReferenceOrBuilder() {
      if (localObjectReferenceBuilder_ != null) {
        return localObjectReferenceBuilder_.getMessageOrBuilder();
      } else {
        return localObjectReference_ == null ?
            com.appscode.api.kubernetes.v1beta2.ObjectReference.getDefaultInstance() : localObjectReference_;
      }
    }
    /**
     * <pre>
     * The name of the secret in the pod's namespace to select from.
     * </pre>
     *
     * <code>optional .appscode.kubernetes.v1beta2.ObjectReference local_object_reference = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta2.ObjectReference, com.appscode.api.kubernetes.v1beta2.ObjectReference.Builder, com.appscode.api.kubernetes.v1beta2.ObjectReferenceOrBuilder> 
        getLocalObjectReferenceFieldBuilder() {
      if (localObjectReferenceBuilder_ == null) {
        localObjectReferenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.kubernetes.v1beta2.ObjectReference, com.appscode.api.kubernetes.v1beta2.ObjectReference.Builder, com.appscode.api.kubernetes.v1beta2.ObjectReferenceOrBuilder>(
                getLocalObjectReference(),
                getParentForChildren(),
                isClean());
        localObjectReference_ = null;
      }
      return localObjectReferenceBuilder_;
    }

    private java.lang.Object key_ = "";
    /**
     * <pre>
     * The key of the secret to select from.  Must be a valid secret key.
     * </pre>
     *
     * <code>optional string key = 2;</code>
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The key of the secret to select from.  Must be a valid secret key.
     * </pre>
     *
     * <code>optional string key = 2;</code>
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The key of the secret to select from.  Must be a valid secret key.
     * </pre>
     *
     * <code>optional string key = 2;</code>
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The key of the secret to select from.  Must be a valid secret key.
     * </pre>
     *
     * <code>optional string key = 2;</code>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The key of the secret to select from.  Must be a valid secret key.
     * </pre>
     *
     * <code>optional string key = 2;</code>
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      key_ = value;
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


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta2.SecretKeySelector)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta2.SecretKeySelector)
  private static final com.appscode.api.kubernetes.v1beta2.SecretKeySelector DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta2.SecretKeySelector();
  }

  public static com.appscode.api.kubernetes.v1beta2.SecretKeySelector getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecretKeySelector>
      PARSER = new com.google.protobuf.AbstractParser<SecretKeySelector>() {
    public SecretKeySelector parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SecretKeySelector(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SecretKeySelector> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecretKeySelector> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta2.SecretKeySelector getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

