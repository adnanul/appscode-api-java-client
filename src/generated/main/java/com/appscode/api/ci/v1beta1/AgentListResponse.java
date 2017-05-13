// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/ci/v1beta1/agent.proto

package com.appscode.api.ci.v1beta1;

/**
 * Protobuf type {@code appscode.ci.v1beta1.AgentListResponse}
 */
public  final class AgentListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.ci.v1beta1.AgentListResponse)
    AgentListResponseOrBuilder {
  // Use AgentListResponse.newBuilder() to construct.
  private AgentListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgentListResponse() {
    agents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AgentListResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              agents_ = new java.util.ArrayList<com.appscode.api.ci.v1beta1.Agent>();
              mutable_bitField0_ |= 0x00000001;
            }
            agents_.add(
                input.readMessage(com.appscode.api.ci.v1beta1.Agent.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        agents_ = java.util.Collections.unmodifiableList(agents_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.appscode.api.ci.v1beta1.AgentProto.internal_static_appscode_ci_v1beta1_AgentListResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.ci.v1beta1.AgentProto.internal_static_appscode_ci_v1beta1_AgentListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.ci.v1beta1.AgentListResponse.class, com.appscode.api.ci.v1beta1.AgentListResponse.Builder.class);
  }

  public static final int AGENTS_FIELD_NUMBER = 1;
  private java.util.List<com.appscode.api.ci.v1beta1.Agent> agents_;
  /**
   * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
   */
  public java.util.List<com.appscode.api.ci.v1beta1.Agent> getAgentsList() {
    return agents_;
  }
  /**
   * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
   */
  public java.util.List<? extends com.appscode.api.ci.v1beta1.AgentOrBuilder> 
      getAgentsOrBuilderList() {
    return agents_;
  }
  /**
   * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
   */
  public int getAgentsCount() {
    return agents_.size();
  }
  /**
   * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
   */
  public com.appscode.api.ci.v1beta1.Agent getAgents(int index) {
    return agents_.get(index);
  }
  /**
   * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
   */
  public com.appscode.api.ci.v1beta1.AgentOrBuilder getAgentsOrBuilder(
      int index) {
    return agents_.get(index);
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
    for (int i = 0; i < agents_.size(); i++) {
      output.writeMessage(1, agents_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < agents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, agents_.get(i));
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
    if (!(obj instanceof com.appscode.api.ci.v1beta1.AgentListResponse)) {
      return super.equals(obj);
    }
    com.appscode.api.ci.v1beta1.AgentListResponse other = (com.appscode.api.ci.v1beta1.AgentListResponse) obj;

    boolean result = true;
    result = result && getAgentsList()
        .equals(other.getAgentsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getAgentsCount() > 0) {
      hash = (37 * hash) + AGENTS_FIELD_NUMBER;
      hash = (53 * hash) + getAgentsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.ci.v1beta1.AgentListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.ci.v1beta1.AgentListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.AgentListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.ci.v1beta1.AgentListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.AgentListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.ci.v1beta1.AgentListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.AgentListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.ci.v1beta1.AgentListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.AgentListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.ci.v1beta1.AgentListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.AgentListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.ci.v1beta1.AgentListResponse parseFrom(
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
  public static Builder newBuilder(com.appscode.api.ci.v1beta1.AgentListResponse prototype) {
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
   * Protobuf type {@code appscode.ci.v1beta1.AgentListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.ci.v1beta1.AgentListResponse)
      com.appscode.api.ci.v1beta1.AgentListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.ci.v1beta1.AgentProto.internal_static_appscode_ci_v1beta1_AgentListResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.ci.v1beta1.AgentProto.internal_static_appscode_ci_v1beta1_AgentListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.ci.v1beta1.AgentListResponse.class, com.appscode.api.ci.v1beta1.AgentListResponse.Builder.class);
    }

    // Construct using com.appscode.api.ci.v1beta1.AgentListResponse.newBuilder()
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
        getAgentsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (agentsBuilder_ == null) {
        agents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        agentsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.ci.v1beta1.AgentProto.internal_static_appscode_ci_v1beta1_AgentListResponse_descriptor;
    }

    public com.appscode.api.ci.v1beta1.AgentListResponse getDefaultInstanceForType() {
      return com.appscode.api.ci.v1beta1.AgentListResponse.getDefaultInstance();
    }

    public com.appscode.api.ci.v1beta1.AgentListResponse build() {
      com.appscode.api.ci.v1beta1.AgentListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.ci.v1beta1.AgentListResponse buildPartial() {
      com.appscode.api.ci.v1beta1.AgentListResponse result = new com.appscode.api.ci.v1beta1.AgentListResponse(this);
      int from_bitField0_ = bitField0_;
      if (agentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          agents_ = java.util.Collections.unmodifiableList(agents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.agents_ = agents_;
      } else {
        result.agents_ = agentsBuilder_.build();
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
      if (other instanceof com.appscode.api.ci.v1beta1.AgentListResponse) {
        return mergeFrom((com.appscode.api.ci.v1beta1.AgentListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.ci.v1beta1.AgentListResponse other) {
      if (other == com.appscode.api.ci.v1beta1.AgentListResponse.getDefaultInstance()) return this;
      if (agentsBuilder_ == null) {
        if (!other.agents_.isEmpty()) {
          if (agents_.isEmpty()) {
            agents_ = other.agents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAgentsIsMutable();
            agents_.addAll(other.agents_);
          }
          onChanged();
        }
      } else {
        if (!other.agents_.isEmpty()) {
          if (agentsBuilder_.isEmpty()) {
            agentsBuilder_.dispose();
            agentsBuilder_ = null;
            agents_ = other.agents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            agentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAgentsFieldBuilder() : null;
          } else {
            agentsBuilder_.addAllMessages(other.agents_);
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
      com.appscode.api.ci.v1beta1.AgentListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.ci.v1beta1.AgentListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.appscode.api.ci.v1beta1.Agent> agents_ =
      java.util.Collections.emptyList();
    private void ensureAgentsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        agents_ = new java.util.ArrayList<com.appscode.api.ci.v1beta1.Agent>(agents_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appscode.api.ci.v1beta1.Agent, com.appscode.api.ci.v1beta1.Agent.Builder, com.appscode.api.ci.v1beta1.AgentOrBuilder> agentsBuilder_;

    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public java.util.List<com.appscode.api.ci.v1beta1.Agent> getAgentsList() {
      if (agentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(agents_);
      } else {
        return agentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public int getAgentsCount() {
      if (agentsBuilder_ == null) {
        return agents_.size();
      } else {
        return agentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public com.appscode.api.ci.v1beta1.Agent getAgents(int index) {
      if (agentsBuilder_ == null) {
        return agents_.get(index);
      } else {
        return agentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public Builder setAgents(
        int index, com.appscode.api.ci.v1beta1.Agent value) {
      if (agentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentsIsMutable();
        agents_.set(index, value);
        onChanged();
      } else {
        agentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public Builder setAgents(
        int index, com.appscode.api.ci.v1beta1.Agent.Builder builderForValue) {
      if (agentsBuilder_ == null) {
        ensureAgentsIsMutable();
        agents_.set(index, builderForValue.build());
        onChanged();
      } else {
        agentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public Builder addAgents(com.appscode.api.ci.v1beta1.Agent value) {
      if (agentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentsIsMutable();
        agents_.add(value);
        onChanged();
      } else {
        agentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public Builder addAgents(
        int index, com.appscode.api.ci.v1beta1.Agent value) {
      if (agentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgentsIsMutable();
        agents_.add(index, value);
        onChanged();
      } else {
        agentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public Builder addAgents(
        com.appscode.api.ci.v1beta1.Agent.Builder builderForValue) {
      if (agentsBuilder_ == null) {
        ensureAgentsIsMutable();
        agents_.add(builderForValue.build());
        onChanged();
      } else {
        agentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public Builder addAgents(
        int index, com.appscode.api.ci.v1beta1.Agent.Builder builderForValue) {
      if (agentsBuilder_ == null) {
        ensureAgentsIsMutable();
        agents_.add(index, builderForValue.build());
        onChanged();
      } else {
        agentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public Builder addAllAgents(
        java.lang.Iterable<? extends com.appscode.api.ci.v1beta1.Agent> values) {
      if (agentsBuilder_ == null) {
        ensureAgentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, agents_);
        onChanged();
      } else {
        agentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public Builder clearAgents() {
      if (agentsBuilder_ == null) {
        agents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        agentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public Builder removeAgents(int index) {
      if (agentsBuilder_ == null) {
        ensureAgentsIsMutable();
        agents_.remove(index);
        onChanged();
      } else {
        agentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public com.appscode.api.ci.v1beta1.Agent.Builder getAgentsBuilder(
        int index) {
      return getAgentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public com.appscode.api.ci.v1beta1.AgentOrBuilder getAgentsOrBuilder(
        int index) {
      if (agentsBuilder_ == null) {
        return agents_.get(index);  } else {
        return agentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public java.util.List<? extends com.appscode.api.ci.v1beta1.AgentOrBuilder> 
         getAgentsOrBuilderList() {
      if (agentsBuilder_ != null) {
        return agentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(agents_);
      }
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public com.appscode.api.ci.v1beta1.Agent.Builder addAgentsBuilder() {
      return getAgentsFieldBuilder().addBuilder(
          com.appscode.api.ci.v1beta1.Agent.getDefaultInstance());
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public com.appscode.api.ci.v1beta1.Agent.Builder addAgentsBuilder(
        int index) {
      return getAgentsFieldBuilder().addBuilder(
          index, com.appscode.api.ci.v1beta1.Agent.getDefaultInstance());
    }
    /**
     * <code>repeated .appscode.ci.v1beta1.Agent agents = 1;</code>
     */
    public java.util.List<com.appscode.api.ci.v1beta1.Agent.Builder> 
         getAgentsBuilderList() {
      return getAgentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appscode.api.ci.v1beta1.Agent, com.appscode.api.ci.v1beta1.Agent.Builder, com.appscode.api.ci.v1beta1.AgentOrBuilder> 
        getAgentsFieldBuilder() {
      if (agentsBuilder_ == null) {
        agentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.appscode.api.ci.v1beta1.Agent, com.appscode.api.ci.v1beta1.Agent.Builder, com.appscode.api.ci.v1beta1.AgentOrBuilder>(
                agents_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        agents_ = null;
      }
      return agentsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.ci.v1beta1.AgentListResponse)
  }

  // @@protoc_insertion_point(class_scope:appscode.ci.v1beta1.AgentListResponse)
  private static final com.appscode.api.ci.v1beta1.AgentListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.ci.v1beta1.AgentListResponse();
  }

  public static com.appscode.api.ci.v1beta1.AgentListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgentListResponse>
      PARSER = new com.google.protobuf.AbstractParser<AgentListResponse>() {
    public AgentListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AgentListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AgentListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgentListResponse> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.ci.v1beta1.AgentListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

