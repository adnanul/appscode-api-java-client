// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

/**
 * <pre>
 * ResourceFieldSelector represents container resources (cpu, memory) and their output format
 * </pre>
 *
 * Protobuf type {@code appscode.kubernetes.v1beta2.ResourceFieldSelector}
 */
public  final class ResourceFieldSelector extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta2.ResourceFieldSelector)
    ResourceFieldSelectorOrBuilder {
  // Use ResourceFieldSelector.newBuilder() to construct.
  private ResourceFieldSelector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceFieldSelector() {
    containerName_ = "";
    resource_ = "";
    divisor_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ResourceFieldSelector(
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

            containerName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            resource_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            divisor_ = s;
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
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_ResourceFieldSelector_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_ResourceFieldSelector_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector.class, com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector.Builder.class);
  }

  public static final int CONTAINER_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object containerName_;
  /**
   * <pre>
   * Container name: required for volumes, optional for env vars
   * +optional
   * </pre>
   *
   * <code>optional string container_name = 1;</code>
   */
  public java.lang.String getContainerName() {
    java.lang.Object ref = containerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      containerName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Container name: required for volumes, optional for env vars
   * +optional
   * </pre>
   *
   * <code>optional string container_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getContainerNameBytes() {
    java.lang.Object ref = containerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      containerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_FIELD_NUMBER = 2;
  private volatile java.lang.Object resource_;
  /**
   * <pre>
   * Required: resource to select
   * </pre>
   *
   * <code>optional string resource = 2;</code>
   */
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required: resource to select
   * </pre>
   *
   * <code>optional string resource = 2;</code>
   */
  public com.google.protobuf.ByteString
      getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIVISOR_FIELD_NUMBER = 3;
  private volatile java.lang.Object divisor_;
  /**
   * <pre>
   * Specifies the output format of the exposed resources, defaults to "1"
   * +optional
   * </pre>
   *
   * <code>optional string divisor = 3;</code>
   */
  public java.lang.String getDivisor() {
    java.lang.Object ref = divisor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      divisor_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Specifies the output format of the exposed resources, defaults to "1"
   * +optional
   * </pre>
   *
   * <code>optional string divisor = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDivisorBytes() {
    java.lang.Object ref = divisor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      divisor_ = b;
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
    if (!getContainerNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, containerName_);
    }
    if (!getResourceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resource_);
    }
    if (!getDivisorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, divisor_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getContainerNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, containerName_);
    }
    if (!getResourceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resource_);
    }
    if (!getDivisorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, divisor_);
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector other = (com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector) obj;

    boolean result = true;
    result = result && getContainerName()
        .equals(other.getContainerName());
    result = result && getResource()
        .equals(other.getResource());
    result = result && getDivisor()
        .equals(other.getDivisor());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + CONTAINER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getContainerName().hashCode();
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    hash = (37 * hash) + DIVISOR_FIELD_NUMBER;
    hash = (53 * hash) + getDivisor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector prototype) {
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
   * ResourceFieldSelector represents container resources (cpu, memory) and their output format
   * </pre>
   *
   * Protobuf type {@code appscode.kubernetes.v1beta2.ResourceFieldSelector}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta2.ResourceFieldSelector)
      com.appscode.api.kubernetes.v1beta2.ResourceFieldSelectorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_ResourceFieldSelector_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_ResourceFieldSelector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector.class, com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector.newBuilder()
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
      containerName_ = "";

      resource_ = "";

      divisor_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta2.ClientProto.internal_static_appscode_kubernetes_v1beta2_ResourceFieldSelector_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector build() {
      com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector buildPartial() {
      com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector result = new com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector(this);
      result.containerName_ = containerName_;
      result.resource_ = resource_;
      result.divisor_ = divisor_;
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
      if (other instanceof com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector other) {
      if (other == com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector.getDefaultInstance()) return this;
      if (!other.getContainerName().isEmpty()) {
        containerName_ = other.containerName_;
        onChanged();
      }
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
        onChanged();
      }
      if (!other.getDivisor().isEmpty()) {
        divisor_ = other.divisor_;
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
      com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object containerName_ = "";
    /**
     * <pre>
     * Container name: required for volumes, optional for env vars
     * +optional
     * </pre>
     *
     * <code>optional string container_name = 1;</code>
     */
    public java.lang.String getContainerName() {
      java.lang.Object ref = containerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        containerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Container name: required for volumes, optional for env vars
     * +optional
     * </pre>
     *
     * <code>optional string container_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getContainerNameBytes() {
      java.lang.Object ref = containerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        containerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Container name: required for volumes, optional for env vars
     * +optional
     * </pre>
     *
     * <code>optional string container_name = 1;</code>
     */
    public Builder setContainerName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      containerName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Container name: required for volumes, optional for env vars
     * +optional
     * </pre>
     *
     * <code>optional string container_name = 1;</code>
     */
    public Builder clearContainerName() {
      
      containerName_ = getDefaultInstance().getContainerName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Container name: required for volumes, optional for env vars
     * +optional
     * </pre>
     *
     * <code>optional string container_name = 1;</code>
     */
    public Builder setContainerNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      containerName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resource_ = "";
    /**
     * <pre>
     * Required: resource to select
     * </pre>
     *
     * <code>optional string resource = 2;</code>
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required: resource to select
     * </pre>
     *
     * <code>optional string resource = 2;</code>
     */
    public com.google.protobuf.ByteString
        getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required: resource to select
     * </pre>
     *
     * <code>optional string resource = 2;</code>
     */
    public Builder setResource(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resource_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required: resource to select
     * </pre>
     *
     * <code>optional string resource = 2;</code>
     */
    public Builder clearResource() {
      
      resource_ = getDefaultInstance().getResource();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required: resource to select
     * </pre>
     *
     * <code>optional string resource = 2;</code>
     */
    public Builder setResourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resource_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object divisor_ = "";
    /**
     * <pre>
     * Specifies the output format of the exposed resources, defaults to "1"
     * +optional
     * </pre>
     *
     * <code>optional string divisor = 3;</code>
     */
    public java.lang.String getDivisor() {
      java.lang.Object ref = divisor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        divisor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Specifies the output format of the exposed resources, defaults to "1"
     * +optional
     * </pre>
     *
     * <code>optional string divisor = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDivisorBytes() {
      java.lang.Object ref = divisor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        divisor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specifies the output format of the exposed resources, defaults to "1"
     * +optional
     * </pre>
     *
     * <code>optional string divisor = 3;</code>
     */
    public Builder setDivisor(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      divisor_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the output format of the exposed resources, defaults to "1"
     * +optional
     * </pre>
     *
     * <code>optional string divisor = 3;</code>
     */
    public Builder clearDivisor() {
      
      divisor_ = getDefaultInstance().getDivisor();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the output format of the exposed resources, defaults to "1"
     * +optional
     * </pre>
     *
     * <code>optional string divisor = 3;</code>
     */
    public Builder setDivisorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      divisor_ = value;
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


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta2.ResourceFieldSelector)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta2.ResourceFieldSelector)
  private static final com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector();
  }

  public static com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceFieldSelector>
      PARSER = new com.google.protobuf.AbstractParser<ResourceFieldSelector>() {
    public ResourceFieldSelector parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResourceFieldSelector(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResourceFieldSelector> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceFieldSelector> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta2.ResourceFieldSelector getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

