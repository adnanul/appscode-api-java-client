// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/loadbalancer.proto

package com.appscode.api.loadbalancer.v1beta1;

/**
 * Protobuf type {@code appscode.kubernetes.v1beta1.Spec}
 */
public  final class Spec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta1.Spec)
    SpecOrBuilder {
  // Use Spec.newBuilder() to construct.
  private Spec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Spec() {
    rules_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Spec(
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
            com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule.Builder subBuilder = null;
            if (backend_ != null) {
              subBuilder = backend_.toBuilder();
            }
            backend_ = input.readMessage(com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(backend_);
              backend_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              rules_ = new java.util.ArrayList<com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule>();
              mutable_bitField0_ |= 0x00000002;
            }
            rules_.add(
                input.readMessage(com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        rules_ = java.util.Collections.unmodifiableList(rules_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.appscode.api.loadbalancer.v1beta1.LoadBalancerProto.internal_static_appscode_kubernetes_v1beta1_Spec_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.loadbalancer.v1beta1.LoadBalancerProto.internal_static_appscode_kubernetes_v1beta1_Spec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.loadbalancer.v1beta1.Spec.class, com.appscode.api.loadbalancer.v1beta1.Spec.Builder.class);
  }

  private int bitField0_;
  public static final int BACKEND_FIELD_NUMBER = 1;
  private com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule backend_;
  /**
   * <code>.appscode.kubernetes.v1beta1.HTTPLoadBalancerRule backend = 1;</code>
   */
  public boolean hasBackend() {
    return backend_ != null;
  }
  /**
   * <code>.appscode.kubernetes.v1beta1.HTTPLoadBalancerRule backend = 1;</code>
   */
  public com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule getBackend() {
    return backend_ == null ? com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule.getDefaultInstance() : backend_;
  }
  /**
   * <code>.appscode.kubernetes.v1beta1.HTTPLoadBalancerRule backend = 1;</code>
   */
  public com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRuleOrBuilder getBackendOrBuilder() {
    return getBackend();
  }

  public static final int RULES_FIELD_NUMBER = 2;
  private java.util.List<com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule> rules_;
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
   */
  public java.util.List<com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule> getRulesList() {
    return rules_;
  }
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
   */
  public java.util.List<? extends com.appscode.api.loadbalancer.v1beta1.LoadBalancerRuleOrBuilder> 
      getRulesOrBuilderList() {
    return rules_;
  }
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
   */
  public int getRulesCount() {
    return rules_.size();
  }
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
   */
  public com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule getRules(int index) {
    return rules_.get(index);
  }
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
   */
  public com.appscode.api.loadbalancer.v1beta1.LoadBalancerRuleOrBuilder getRulesOrBuilder(
      int index) {
    return rules_.get(index);
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
    if (backend_ != null) {
      output.writeMessage(1, getBackend());
    }
    for (int i = 0; i < rules_.size(); i++) {
      output.writeMessage(2, rules_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (backend_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBackend());
    }
    for (int i = 0; i < rules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, rules_.get(i));
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
    if (!(obj instanceof com.appscode.api.loadbalancer.v1beta1.Spec)) {
      return super.equals(obj);
    }
    com.appscode.api.loadbalancer.v1beta1.Spec other = (com.appscode.api.loadbalancer.v1beta1.Spec) obj;

    boolean result = true;
    result = result && (hasBackend() == other.hasBackend());
    if (hasBackend()) {
      result = result && getBackend()
          .equals(other.getBackend());
    }
    result = result && getRulesList()
        .equals(other.getRulesList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasBackend()) {
      hash = (37 * hash) + BACKEND_FIELD_NUMBER;
      hash = (53 * hash) + getBackend().hashCode();
    }
    if (getRulesCount() > 0) {
      hash = (37 * hash) + RULES_FIELD_NUMBER;
      hash = (53 * hash) + getRulesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.loadbalancer.v1beta1.Spec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Spec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Spec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Spec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Spec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Spec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Spec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Spec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Spec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.loadbalancer.v1beta1.Spec parseFrom(
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
  public static Builder newBuilder(com.appscode.api.loadbalancer.v1beta1.Spec prototype) {
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
   * Protobuf type {@code appscode.kubernetes.v1beta1.Spec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta1.Spec)
      com.appscode.api.loadbalancer.v1beta1.SpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.loadbalancer.v1beta1.LoadBalancerProto.internal_static_appscode_kubernetes_v1beta1_Spec_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.loadbalancer.v1beta1.LoadBalancerProto.internal_static_appscode_kubernetes_v1beta1_Spec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.loadbalancer.v1beta1.Spec.class, com.appscode.api.loadbalancer.v1beta1.Spec.Builder.class);
    }

    // Construct using com.appscode.api.loadbalancer.v1beta1.Spec.newBuilder()
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
        getRulesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (backendBuilder_ == null) {
        backend_ = null;
      } else {
        backend_ = null;
        backendBuilder_ = null;
      }
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.loadbalancer.v1beta1.LoadBalancerProto.internal_static_appscode_kubernetes_v1beta1_Spec_descriptor;
    }

    public com.appscode.api.loadbalancer.v1beta1.Spec getDefaultInstanceForType() {
      return com.appscode.api.loadbalancer.v1beta1.Spec.getDefaultInstance();
    }

    public com.appscode.api.loadbalancer.v1beta1.Spec build() {
      com.appscode.api.loadbalancer.v1beta1.Spec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.loadbalancer.v1beta1.Spec buildPartial() {
      com.appscode.api.loadbalancer.v1beta1.Spec result = new com.appscode.api.loadbalancer.v1beta1.Spec(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (backendBuilder_ == null) {
        result.backend_ = backend_;
      } else {
        result.backend_ = backendBuilder_.build();
      }
      if (rulesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          rules_ = java.util.Collections.unmodifiableList(rules_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.rules_ = rules_;
      } else {
        result.rules_ = rulesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.appscode.api.loadbalancer.v1beta1.Spec) {
        return mergeFrom((com.appscode.api.loadbalancer.v1beta1.Spec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.loadbalancer.v1beta1.Spec other) {
      if (other == com.appscode.api.loadbalancer.v1beta1.Spec.getDefaultInstance()) return this;
      if (other.hasBackend()) {
        mergeBackend(other.getBackend());
      }
      if (rulesBuilder_ == null) {
        if (!other.rules_.isEmpty()) {
          if (rules_.isEmpty()) {
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRulesIsMutable();
            rules_.addAll(other.rules_);
          }
          onChanged();
        }
      } else {
        if (!other.rules_.isEmpty()) {
          if (rulesBuilder_.isEmpty()) {
            rulesBuilder_.dispose();
            rulesBuilder_ = null;
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000002);
            rulesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRulesFieldBuilder() : null;
          } else {
            rulesBuilder_.addAllMessages(other.rules_);
          }
        }
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
      com.appscode.api.loadbalancer.v1beta1.Spec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.loadbalancer.v1beta1.Spec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule backend_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule, com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule.Builder, com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRuleOrBuilder> backendBuilder_;
    /**
     * <code>.appscode.kubernetes.v1beta1.HTTPLoadBalancerRule backend = 1;</code>
     */
    public boolean hasBackend() {
      return backendBuilder_ != null || backend_ != null;
    }
    /**
     * <code>.appscode.kubernetes.v1beta1.HTTPLoadBalancerRule backend = 1;</code>
     */
    public com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule getBackend() {
      if (backendBuilder_ == null) {
        return backend_ == null ? com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule.getDefaultInstance() : backend_;
      } else {
        return backendBuilder_.getMessage();
      }
    }
    /**
     * <code>.appscode.kubernetes.v1beta1.HTTPLoadBalancerRule backend = 1;</code>
     */
    public Builder setBackend(com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule value) {
      if (backendBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        backend_ = value;
        onChanged();
      } else {
        backendBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta1.HTTPLoadBalancerRule backend = 1;</code>
     */
    public Builder setBackend(
        com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule.Builder builderForValue) {
      if (backendBuilder_ == null) {
        backend_ = builderForValue.build();
        onChanged();
      } else {
        backendBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta1.HTTPLoadBalancerRule backend = 1;</code>
     */
    public Builder mergeBackend(com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule value) {
      if (backendBuilder_ == null) {
        if (backend_ != null) {
          backend_ =
            com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule.newBuilder(backend_).mergeFrom(value).buildPartial();
        } else {
          backend_ = value;
        }
        onChanged();
      } else {
        backendBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta1.HTTPLoadBalancerRule backend = 1;</code>
     */
    public Builder clearBackend() {
      if (backendBuilder_ == null) {
        backend_ = null;
        onChanged();
      } else {
        backend_ = null;
        backendBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta1.HTTPLoadBalancerRule backend = 1;</code>
     */
    public com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule.Builder getBackendBuilder() {
      
      onChanged();
      return getBackendFieldBuilder().getBuilder();
    }
    /**
     * <code>.appscode.kubernetes.v1beta1.HTTPLoadBalancerRule backend = 1;</code>
     */
    public com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRuleOrBuilder getBackendOrBuilder() {
      if (backendBuilder_ != null) {
        return backendBuilder_.getMessageOrBuilder();
      } else {
        return backend_ == null ?
            com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule.getDefaultInstance() : backend_;
      }
    }
    /**
     * <code>.appscode.kubernetes.v1beta1.HTTPLoadBalancerRule backend = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule, com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule.Builder, com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRuleOrBuilder> 
        getBackendFieldBuilder() {
      if (backendBuilder_ == null) {
        backendBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule, com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRule.Builder, com.appscode.api.loadbalancer.v1beta1.HTTPLoadBalancerRuleOrBuilder>(
                getBackend(),
                getParentForChildren(),
                isClean());
        backend_ = null;
      }
      return backendBuilder_;
    }

    private java.util.List<com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule> rules_ =
      java.util.Collections.emptyList();
    private void ensureRulesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        rules_ = new java.util.ArrayList<com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule>(rules_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule, com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule.Builder, com.appscode.api.loadbalancer.v1beta1.LoadBalancerRuleOrBuilder> rulesBuilder_;

    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public java.util.List<com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule> getRulesList() {
      if (rulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rules_);
      } else {
        return rulesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public int getRulesCount() {
      if (rulesBuilder_ == null) {
        return rules_.size();
      } else {
        return rulesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule getRules(int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);
      } else {
        return rulesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public Builder setRules(
        int index, com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.set(index, value);
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public Builder setRules(
        int index, com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.set(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public Builder addRules(com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public Builder addRules(
        int index, com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(index, value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public Builder addRules(
        com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public Builder addRules(
        int index, com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public Builder addAllRules(
        java.lang.Iterable<? extends com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule> values) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rules_);
        onChanged();
      } else {
        rulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public Builder clearRules() {
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public Builder removeRules(int index) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.remove(index);
        onChanged();
      } else {
        rulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule.Builder getRulesBuilder(
        int index) {
      return getRulesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public com.appscode.api.loadbalancer.v1beta1.LoadBalancerRuleOrBuilder getRulesOrBuilder(
        int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);  } else {
        return rulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public java.util.List<? extends com.appscode.api.loadbalancer.v1beta1.LoadBalancerRuleOrBuilder> 
         getRulesOrBuilderList() {
      if (rulesBuilder_ != null) {
        return rulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rules_);
      }
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule.Builder addRulesBuilder() {
      return getRulesFieldBuilder().addBuilder(
          com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule.getDefaultInstance());
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule.Builder addRulesBuilder(
        int index) {
      return getRulesFieldBuilder().addBuilder(
          index, com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule.getDefaultInstance());
    }
    /**
     * <code>repeated .appscode.kubernetes.v1beta1.LoadBalancerRule rules = 2;</code>
     */
    public java.util.List<com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule.Builder> 
         getRulesBuilderList() {
      return getRulesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule, com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule.Builder, com.appscode.api.loadbalancer.v1beta1.LoadBalancerRuleOrBuilder> 
        getRulesFieldBuilder() {
      if (rulesBuilder_ == null) {
        rulesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule, com.appscode.api.loadbalancer.v1beta1.LoadBalancerRule.Builder, com.appscode.api.loadbalancer.v1beta1.LoadBalancerRuleOrBuilder>(
                rules_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        rules_ = null;
      }
      return rulesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta1.Spec)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta1.Spec)
  private static final com.appscode.api.loadbalancer.v1beta1.Spec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.loadbalancer.v1beta1.Spec();
  }

  public static com.appscode.api.loadbalancer.v1beta1.Spec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Spec>
      PARSER = new com.google.protobuf.AbstractParser<Spec>() {
    public Spec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Spec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Spec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Spec> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.loadbalancer.v1beta1.Spec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

