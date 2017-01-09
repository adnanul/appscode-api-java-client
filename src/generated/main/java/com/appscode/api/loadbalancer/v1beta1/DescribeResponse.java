// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/loadbalancer.proto

package com.appscode.api.loadbalancer.v1beta1;

/**
 * Protobuf type {@code appscode.kubernetes.v1beta1.DescribeResponse}
 */
public  final class DescribeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta1.DescribeResponse)
    DescribeResponseOrBuilder {
  // Use DescribeResponse.newBuilder() to construct.
  private DescribeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DescribeResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DescribeResponse(
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
            com.appscode.api.dtypes.Status.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(com.appscode.api.dtypes.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.appscode.api.loadbalancer.v1beta1.LoadBalancer.Builder subBuilder = null;
            if (loadBalancer_ != null) {
              subBuilder = loadBalancer_.toBuilder();
            }
            loadBalancer_ = input.readMessage(com.appscode.api.loadbalancer.v1beta1.LoadBalancer.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(loadBalancer_);
              loadBalancer_ = subBuilder.buildPartial();
            }

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
    return com.appscode.api.loadbalancer.v1beta1.LoadBalancerProto.internal_static_appscode_kubernetes_v1beta1_DescribeResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.loadbalancer.v1beta1.LoadBalancerProto.internal_static_appscode_kubernetes_v1beta1_DescribeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.loadbalancer.v1beta1.DescribeResponse.class, com.appscode.api.loadbalancer.v1beta1.DescribeResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private com.appscode.api.dtypes.Status status_;
  /**
   * <code>optional .appscode.dtypes.Status status = 1;</code>
   */
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <code>optional .appscode.dtypes.Status status = 1;</code>
   */
  public com.appscode.api.dtypes.Status getStatus() {
    return status_ == null ? com.appscode.api.dtypes.Status.getDefaultInstance() : status_;
  }
  /**
   * <code>optional .appscode.dtypes.Status status = 1;</code>
   */
  public com.appscode.api.dtypes.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int LOAD_BALANCER_FIELD_NUMBER = 2;
  private com.appscode.api.loadbalancer.v1beta1.LoadBalancer loadBalancer_;
  /**
   * <code>optional .appscode.kubernetes.v1beta1.LoadBalancer load_balancer = 2;</code>
   */
  public boolean hasLoadBalancer() {
    return loadBalancer_ != null;
  }
  /**
   * <code>optional .appscode.kubernetes.v1beta1.LoadBalancer load_balancer = 2;</code>
   */
  public com.appscode.api.loadbalancer.v1beta1.LoadBalancer getLoadBalancer() {
    return loadBalancer_ == null ? com.appscode.api.loadbalancer.v1beta1.LoadBalancer.getDefaultInstance() : loadBalancer_;
  }
  /**
   * <code>optional .appscode.kubernetes.v1beta1.LoadBalancer load_balancer = 2;</code>
   */
  public com.appscode.api.loadbalancer.v1beta1.LoadBalancerOrBuilder getLoadBalancerOrBuilder() {
    return getLoadBalancer();
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
    if (status_ != null) {
      output.writeMessage(1, getStatus());
    }
    if (loadBalancer_ != null) {
      output.writeMessage(2, getLoadBalancer());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStatus());
    }
    if (loadBalancer_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLoadBalancer());
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
    if (!(obj instanceof com.appscode.api.loadbalancer.v1beta1.DescribeResponse)) {
      return super.equals(obj);
    }
    com.appscode.api.loadbalancer.v1beta1.DescribeResponse other = (com.appscode.api.loadbalancer.v1beta1.DescribeResponse) obj;

    boolean result = true;
    result = result && (hasStatus() == other.hasStatus());
    if (hasStatus()) {
      result = result && getStatus()
          .equals(other.getStatus());
    }
    result = result && (hasLoadBalancer() == other.hasLoadBalancer());
    if (hasLoadBalancer()) {
      result = result && getLoadBalancer()
          .equals(other.getLoadBalancer());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    if (hasLoadBalancer()) {
      hash = (37 * hash) + LOAD_BALANCER_FIELD_NUMBER;
      hash = (53 * hash) + getLoadBalancer().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.loadbalancer.v1beta1.DescribeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.loadbalancer.v1beta1.DescribeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.loadbalancer.v1beta1.DescribeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.loadbalancer.v1beta1.DescribeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.loadbalancer.v1beta1.DescribeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.loadbalancer.v1beta1.DescribeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.loadbalancer.v1beta1.DescribeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.loadbalancer.v1beta1.DescribeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.loadbalancer.v1beta1.DescribeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.loadbalancer.v1beta1.DescribeResponse parseFrom(
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
  public static Builder newBuilder(com.appscode.api.loadbalancer.v1beta1.DescribeResponse prototype) {
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
   * Protobuf type {@code appscode.kubernetes.v1beta1.DescribeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta1.DescribeResponse)
      com.appscode.api.loadbalancer.v1beta1.DescribeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.loadbalancer.v1beta1.LoadBalancerProto.internal_static_appscode_kubernetes_v1beta1_DescribeResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.loadbalancer.v1beta1.LoadBalancerProto.internal_static_appscode_kubernetes_v1beta1_DescribeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.loadbalancer.v1beta1.DescribeResponse.class, com.appscode.api.loadbalancer.v1beta1.DescribeResponse.Builder.class);
    }

    // Construct using com.appscode.api.loadbalancer.v1beta1.DescribeResponse.newBuilder()
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
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      if (loadBalancerBuilder_ == null) {
        loadBalancer_ = null;
      } else {
        loadBalancer_ = null;
        loadBalancerBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.loadbalancer.v1beta1.LoadBalancerProto.internal_static_appscode_kubernetes_v1beta1_DescribeResponse_descriptor;
    }

    public com.appscode.api.loadbalancer.v1beta1.DescribeResponse getDefaultInstanceForType() {
      return com.appscode.api.loadbalancer.v1beta1.DescribeResponse.getDefaultInstance();
    }

    public com.appscode.api.loadbalancer.v1beta1.DescribeResponse build() {
      com.appscode.api.loadbalancer.v1beta1.DescribeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.loadbalancer.v1beta1.DescribeResponse buildPartial() {
      com.appscode.api.loadbalancer.v1beta1.DescribeResponse result = new com.appscode.api.loadbalancer.v1beta1.DescribeResponse(this);
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (loadBalancerBuilder_ == null) {
        result.loadBalancer_ = loadBalancer_;
      } else {
        result.loadBalancer_ = loadBalancerBuilder_.build();
      }
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
      if (other instanceof com.appscode.api.loadbalancer.v1beta1.DescribeResponse) {
        return mergeFrom((com.appscode.api.loadbalancer.v1beta1.DescribeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.loadbalancer.v1beta1.DescribeResponse other) {
      if (other == com.appscode.api.loadbalancer.v1beta1.DescribeResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (other.hasLoadBalancer()) {
        mergeLoadBalancer(other.getLoadBalancer());
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
      com.appscode.api.loadbalancer.v1beta1.DescribeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.loadbalancer.v1beta1.DescribeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appscode.api.dtypes.Status status_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.dtypes.Status, com.appscode.api.dtypes.Status.Builder, com.appscode.api.dtypes.StatusOrBuilder> statusBuilder_;
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    public com.appscode.api.dtypes.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.appscode.api.dtypes.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    public Builder setStatus(com.appscode.api.dtypes.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    public Builder setStatus(
        com.appscode.api.dtypes.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    public Builder mergeStatus(com.appscode.api.dtypes.Status value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            com.appscode.api.dtypes.Status.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    public com.appscode.api.dtypes.Status.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    public com.appscode.api.dtypes.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            com.appscode.api.dtypes.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <code>optional .appscode.dtypes.Status status = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.dtypes.Status, com.appscode.api.dtypes.Status.Builder, com.appscode.api.dtypes.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.dtypes.Status, com.appscode.api.dtypes.Status.Builder, com.appscode.api.dtypes.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    private com.appscode.api.loadbalancer.v1beta1.LoadBalancer loadBalancer_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.loadbalancer.v1beta1.LoadBalancer, com.appscode.api.loadbalancer.v1beta1.LoadBalancer.Builder, com.appscode.api.loadbalancer.v1beta1.LoadBalancerOrBuilder> loadBalancerBuilder_;
    /**
     * <code>optional .appscode.kubernetes.v1beta1.LoadBalancer load_balancer = 2;</code>
     */
    public boolean hasLoadBalancer() {
      return loadBalancerBuilder_ != null || loadBalancer_ != null;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta1.LoadBalancer load_balancer = 2;</code>
     */
    public com.appscode.api.loadbalancer.v1beta1.LoadBalancer getLoadBalancer() {
      if (loadBalancerBuilder_ == null) {
        return loadBalancer_ == null ? com.appscode.api.loadbalancer.v1beta1.LoadBalancer.getDefaultInstance() : loadBalancer_;
      } else {
        return loadBalancerBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta1.LoadBalancer load_balancer = 2;</code>
     */
    public Builder setLoadBalancer(com.appscode.api.loadbalancer.v1beta1.LoadBalancer value) {
      if (loadBalancerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        loadBalancer_ = value;
        onChanged();
      } else {
        loadBalancerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta1.LoadBalancer load_balancer = 2;</code>
     */
    public Builder setLoadBalancer(
        com.appscode.api.loadbalancer.v1beta1.LoadBalancer.Builder builderForValue) {
      if (loadBalancerBuilder_ == null) {
        loadBalancer_ = builderForValue.build();
        onChanged();
      } else {
        loadBalancerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta1.LoadBalancer load_balancer = 2;</code>
     */
    public Builder mergeLoadBalancer(com.appscode.api.loadbalancer.v1beta1.LoadBalancer value) {
      if (loadBalancerBuilder_ == null) {
        if (loadBalancer_ != null) {
          loadBalancer_ =
            com.appscode.api.loadbalancer.v1beta1.LoadBalancer.newBuilder(loadBalancer_).mergeFrom(value).buildPartial();
        } else {
          loadBalancer_ = value;
        }
        onChanged();
      } else {
        loadBalancerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta1.LoadBalancer load_balancer = 2;</code>
     */
    public Builder clearLoadBalancer() {
      if (loadBalancerBuilder_ == null) {
        loadBalancer_ = null;
        onChanged();
      } else {
        loadBalancer_ = null;
        loadBalancerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta1.LoadBalancer load_balancer = 2;</code>
     */
    public com.appscode.api.loadbalancer.v1beta1.LoadBalancer.Builder getLoadBalancerBuilder() {
      
      onChanged();
      return getLoadBalancerFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta1.LoadBalancer load_balancer = 2;</code>
     */
    public com.appscode.api.loadbalancer.v1beta1.LoadBalancerOrBuilder getLoadBalancerOrBuilder() {
      if (loadBalancerBuilder_ != null) {
        return loadBalancerBuilder_.getMessageOrBuilder();
      } else {
        return loadBalancer_ == null ?
            com.appscode.api.loadbalancer.v1beta1.LoadBalancer.getDefaultInstance() : loadBalancer_;
      }
    }
    /**
     * <code>optional .appscode.kubernetes.v1beta1.LoadBalancer load_balancer = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.loadbalancer.v1beta1.LoadBalancer, com.appscode.api.loadbalancer.v1beta1.LoadBalancer.Builder, com.appscode.api.loadbalancer.v1beta1.LoadBalancerOrBuilder> 
        getLoadBalancerFieldBuilder() {
      if (loadBalancerBuilder_ == null) {
        loadBalancerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.loadbalancer.v1beta1.LoadBalancer, com.appscode.api.loadbalancer.v1beta1.LoadBalancer.Builder, com.appscode.api.loadbalancer.v1beta1.LoadBalancerOrBuilder>(
                getLoadBalancer(),
                getParentForChildren(),
                isClean());
        loadBalancer_ = null;
      }
      return loadBalancerBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta1.DescribeResponse)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta1.DescribeResponse)
  private static final com.appscode.api.loadbalancer.v1beta1.DescribeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.loadbalancer.v1beta1.DescribeResponse();
  }

  public static com.appscode.api.loadbalancer.v1beta1.DescribeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DescribeResponse>
      PARSER = new com.google.protobuf.AbstractParser<DescribeResponse>() {
    public DescribeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DescribeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DescribeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DescribeResponse> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.loadbalancer.v1beta1.DescribeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
