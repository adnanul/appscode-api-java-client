// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

/**
 * <pre>
 * ObjectFieldSelector selects an APIVersioned field of an object.
 * </pre>
 *
 * Protobuf type {@code appscode.kubernetes.v1beta2.ObjectFieldSelector}
 */
public  final class ObjectFieldSelector extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta2.ObjectFieldSelector)
    ObjectFieldSelectorOrBuilder {
  // Use ObjectFieldSelector.newBuilder() to construct.
  private ObjectFieldSelector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ObjectFieldSelector() {
    apiVersion_ = "";
    fieldPath_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ObjectFieldSelector(
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

            apiVersion_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fieldPath_ = s;
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
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_ObjectFieldSelector_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_ObjectFieldSelector_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector.class, com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector.Builder.class);
  }

  public static final int API_VERSION_FIELD_NUMBER = 1;
  private volatile java.lang.Object apiVersion_;
  /**
   * <pre>
   * Version of the schema the FieldPath is written in terms of, defaults to "v1".
   * +optional
   * </pre>
   *
   * <code>string api_version = 1;</code>
   */
  public java.lang.String getApiVersion() {
    java.lang.Object ref = apiVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      apiVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Version of the schema the FieldPath is written in terms of, defaults to "v1".
   * +optional
   * </pre>
   *
   * <code>string api_version = 1;</code>
   */
  public com.google.protobuf.ByteString
      getApiVersionBytes() {
    java.lang.Object ref = apiVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      apiVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELD_PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object fieldPath_;
  /**
   * <pre>
   * Path of the field to select in the specified API version.
   * </pre>
   *
   * <code>string field_path = 2;</code>
   */
  public java.lang.String getFieldPath() {
    java.lang.Object ref = fieldPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fieldPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Path of the field to select in the specified API version.
   * </pre>
   *
   * <code>string field_path = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFieldPathBytes() {
    java.lang.Object ref = fieldPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fieldPath_ = b;
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
    if (!getApiVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, apiVersion_);
    }
    if (!getFieldPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fieldPath_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getApiVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, apiVersion_);
    }
    if (!getFieldPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fieldPath_);
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector other = (com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector) obj;

    boolean result = true;
    result = result && getApiVersion()
        .equals(other.getApiVersion());
    result = result && getFieldPath()
        .equals(other.getFieldPath());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + API_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getApiVersion().hashCode();
    hash = (37 * hash) + FIELD_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getFieldPath().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector prototype) {
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
   * ObjectFieldSelector selects an APIVersioned field of an object.
   * </pre>
   *
   * Protobuf type {@code appscode.kubernetes.v1beta2.ObjectFieldSelector}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta2.ObjectFieldSelector)
      com.appscode.api.kubernetes.v1beta2.ObjectFieldSelectorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_ObjectFieldSelector_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_ObjectFieldSelector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector.class, com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector.newBuilder()
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
      apiVersion_ = "";

      fieldPath_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_ObjectFieldSelector_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector build() {
      com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector buildPartial() {
      com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector result = new com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector(this);
      result.apiVersion_ = apiVersion_;
      result.fieldPath_ = fieldPath_;
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
      if (other instanceof com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector other) {
      if (other == com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector.getDefaultInstance()) return this;
      if (!other.getApiVersion().isEmpty()) {
        apiVersion_ = other.apiVersion_;
        onChanged();
      }
      if (!other.getFieldPath().isEmpty()) {
        fieldPath_ = other.fieldPath_;
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
      com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object apiVersion_ = "";
    /**
     * <pre>
     * Version of the schema the FieldPath is written in terms of, defaults to "v1".
     * +optional
     * </pre>
     *
     * <code>string api_version = 1;</code>
     */
    public java.lang.String getApiVersion() {
      java.lang.Object ref = apiVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        apiVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Version of the schema the FieldPath is written in terms of, defaults to "v1".
     * +optional
     * </pre>
     *
     * <code>string api_version = 1;</code>
     */
    public com.google.protobuf.ByteString
        getApiVersionBytes() {
      java.lang.Object ref = apiVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        apiVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Version of the schema the FieldPath is written in terms of, defaults to "v1".
     * +optional
     * </pre>
     *
     * <code>string api_version = 1;</code>
     */
    public Builder setApiVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      apiVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Version of the schema the FieldPath is written in terms of, defaults to "v1".
     * +optional
     * </pre>
     *
     * <code>string api_version = 1;</code>
     */
    public Builder clearApiVersion() {
      
      apiVersion_ = getDefaultInstance().getApiVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Version of the schema the FieldPath is written in terms of, defaults to "v1".
     * +optional
     * </pre>
     *
     * <code>string api_version = 1;</code>
     */
    public Builder setApiVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      apiVersion_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fieldPath_ = "";
    /**
     * <pre>
     * Path of the field to select in the specified API version.
     * </pre>
     *
     * <code>string field_path = 2;</code>
     */
    public java.lang.String getFieldPath() {
      java.lang.Object ref = fieldPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fieldPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Path of the field to select in the specified API version.
     * </pre>
     *
     * <code>string field_path = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFieldPathBytes() {
      java.lang.Object ref = fieldPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fieldPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Path of the field to select in the specified API version.
     * </pre>
     *
     * <code>string field_path = 2;</code>
     */
    public Builder setFieldPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fieldPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path of the field to select in the specified API version.
     * </pre>
     *
     * <code>string field_path = 2;</code>
     */
    public Builder clearFieldPath() {
      
      fieldPath_ = getDefaultInstance().getFieldPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path of the field to select in the specified API version.
     * </pre>
     *
     * <code>string field_path = 2;</code>
     */
    public Builder setFieldPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fieldPath_ = value;
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


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta2.ObjectFieldSelector)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta2.ObjectFieldSelector)
  private static final com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector();
  }

  public static com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ObjectFieldSelector>
      PARSER = new com.google.protobuf.AbstractParser<ObjectFieldSelector>() {
    public ObjectFieldSelector parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ObjectFieldSelector(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ObjectFieldSelector> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ObjectFieldSelector> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta2.ObjectFieldSelector getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

