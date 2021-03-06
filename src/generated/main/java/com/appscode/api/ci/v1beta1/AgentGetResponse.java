// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/ci/v1beta1/agent.proto

package com.appscode.api.ci.v1beta1;

/**
 * Protobuf type {@code appscode.ci.v1beta1.AgentGetResponse}
 */
public  final class AgentGetResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.ci.v1beta1.AgentGetResponse)
    AgentGetResponseOrBuilder {
  // Use AgentGetResponse.newBuilder() to construct.
  private AgentGetResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgentGetResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AgentGetResponse(
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
            com.appscode.api.ci.v1beta1.Agent.Builder subBuilder = null;
            if (agent_ != null) {
              subBuilder = agent_.toBuilder();
            }
            agent_ = input.readMessage(com.appscode.api.ci.v1beta1.Agent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(agent_);
              agent_ = subBuilder.buildPartial();
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
    return com.appscode.api.ci.v1beta1.AgentProto.internal_static_appscode_ci_v1beta1_AgentGetResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.ci.v1beta1.AgentProto.internal_static_appscode_ci_v1beta1_AgentGetResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.ci.v1beta1.AgentGetResponse.class, com.appscode.api.ci.v1beta1.AgentGetResponse.Builder.class);
  }

  public static final int AGENT_FIELD_NUMBER = 1;
  private com.appscode.api.ci.v1beta1.Agent agent_;
  /**
   * <code>.appscode.ci.v1beta1.Agent agent = 1;</code>
   */
  public boolean hasAgent() {
    return agent_ != null;
  }
  /**
   * <code>.appscode.ci.v1beta1.Agent agent = 1;</code>
   */
  public com.appscode.api.ci.v1beta1.Agent getAgent() {
    return agent_ == null ? com.appscode.api.ci.v1beta1.Agent.getDefaultInstance() : agent_;
  }
  /**
   * <code>.appscode.ci.v1beta1.Agent agent = 1;</code>
   */
  public com.appscode.api.ci.v1beta1.AgentOrBuilder getAgentOrBuilder() {
    return getAgent();
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
    if (agent_ != null) {
      output.writeMessage(1, getAgent());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (agent_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAgent());
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
    if (!(obj instanceof com.appscode.api.ci.v1beta1.AgentGetResponse)) {
      return super.equals(obj);
    }
    com.appscode.api.ci.v1beta1.AgentGetResponse other = (com.appscode.api.ci.v1beta1.AgentGetResponse) obj;

    boolean result = true;
    result = result && (hasAgent() == other.hasAgent());
    if (hasAgent()) {
      result = result && getAgent()
          .equals(other.getAgent());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAgent()) {
      hash = (37 * hash) + AGENT_FIELD_NUMBER;
      hash = (53 * hash) + getAgent().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.ci.v1beta1.AgentGetResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.ci.v1beta1.AgentGetResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.AgentGetResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.ci.v1beta1.AgentGetResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.AgentGetResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.ci.v1beta1.AgentGetResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.AgentGetResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.ci.v1beta1.AgentGetResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.AgentGetResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.ci.v1beta1.AgentGetResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.ci.v1beta1.AgentGetResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.ci.v1beta1.AgentGetResponse parseFrom(
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
  public static Builder newBuilder(com.appscode.api.ci.v1beta1.AgentGetResponse prototype) {
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
   * Protobuf type {@code appscode.ci.v1beta1.AgentGetResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.ci.v1beta1.AgentGetResponse)
      com.appscode.api.ci.v1beta1.AgentGetResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.ci.v1beta1.AgentProto.internal_static_appscode_ci_v1beta1_AgentGetResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.ci.v1beta1.AgentProto.internal_static_appscode_ci_v1beta1_AgentGetResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.ci.v1beta1.AgentGetResponse.class, com.appscode.api.ci.v1beta1.AgentGetResponse.Builder.class);
    }

    // Construct using com.appscode.api.ci.v1beta1.AgentGetResponse.newBuilder()
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
      if (agentBuilder_ == null) {
        agent_ = null;
      } else {
        agent_ = null;
        agentBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.ci.v1beta1.AgentProto.internal_static_appscode_ci_v1beta1_AgentGetResponse_descriptor;
    }

    public com.appscode.api.ci.v1beta1.AgentGetResponse getDefaultInstanceForType() {
      return com.appscode.api.ci.v1beta1.AgentGetResponse.getDefaultInstance();
    }

    public com.appscode.api.ci.v1beta1.AgentGetResponse build() {
      com.appscode.api.ci.v1beta1.AgentGetResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.ci.v1beta1.AgentGetResponse buildPartial() {
      com.appscode.api.ci.v1beta1.AgentGetResponse result = new com.appscode.api.ci.v1beta1.AgentGetResponse(this);
      if (agentBuilder_ == null) {
        result.agent_ = agent_;
      } else {
        result.agent_ = agentBuilder_.build();
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
      if (other instanceof com.appscode.api.ci.v1beta1.AgentGetResponse) {
        return mergeFrom((com.appscode.api.ci.v1beta1.AgentGetResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.ci.v1beta1.AgentGetResponse other) {
      if (other == com.appscode.api.ci.v1beta1.AgentGetResponse.getDefaultInstance()) return this;
      if (other.hasAgent()) {
        mergeAgent(other.getAgent());
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
      com.appscode.api.ci.v1beta1.AgentGetResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.ci.v1beta1.AgentGetResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appscode.api.ci.v1beta1.Agent agent_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.ci.v1beta1.Agent, com.appscode.api.ci.v1beta1.Agent.Builder, com.appscode.api.ci.v1beta1.AgentOrBuilder> agentBuilder_;
    /**
     * <code>.appscode.ci.v1beta1.Agent agent = 1;</code>
     */
    public boolean hasAgent() {
      return agentBuilder_ != null || agent_ != null;
    }
    /**
     * <code>.appscode.ci.v1beta1.Agent agent = 1;</code>
     */
    public com.appscode.api.ci.v1beta1.Agent getAgent() {
      if (agentBuilder_ == null) {
        return agent_ == null ? com.appscode.api.ci.v1beta1.Agent.getDefaultInstance() : agent_;
      } else {
        return agentBuilder_.getMessage();
      }
    }
    /**
     * <code>.appscode.ci.v1beta1.Agent agent = 1;</code>
     */
    public Builder setAgent(com.appscode.api.ci.v1beta1.Agent value) {
      if (agentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agent_ = value;
        onChanged();
      } else {
        agentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.appscode.ci.v1beta1.Agent agent = 1;</code>
     */
    public Builder setAgent(
        com.appscode.api.ci.v1beta1.Agent.Builder builderForValue) {
      if (agentBuilder_ == null) {
        agent_ = builderForValue.build();
        onChanged();
      } else {
        agentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.appscode.ci.v1beta1.Agent agent = 1;</code>
     */
    public Builder mergeAgent(com.appscode.api.ci.v1beta1.Agent value) {
      if (agentBuilder_ == null) {
        if (agent_ != null) {
          agent_ =
            com.appscode.api.ci.v1beta1.Agent.newBuilder(agent_).mergeFrom(value).buildPartial();
        } else {
          agent_ = value;
        }
        onChanged();
      } else {
        agentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.appscode.ci.v1beta1.Agent agent = 1;</code>
     */
    public Builder clearAgent() {
      if (agentBuilder_ == null) {
        agent_ = null;
        onChanged();
      } else {
        agent_ = null;
        agentBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.appscode.ci.v1beta1.Agent agent = 1;</code>
     */
    public com.appscode.api.ci.v1beta1.Agent.Builder getAgentBuilder() {
      
      onChanged();
      return getAgentFieldBuilder().getBuilder();
    }
    /**
     * <code>.appscode.ci.v1beta1.Agent agent = 1;</code>
     */
    public com.appscode.api.ci.v1beta1.AgentOrBuilder getAgentOrBuilder() {
      if (agentBuilder_ != null) {
        return agentBuilder_.getMessageOrBuilder();
      } else {
        return agent_ == null ?
            com.appscode.api.ci.v1beta1.Agent.getDefaultInstance() : agent_;
      }
    }
    /**
     * <code>.appscode.ci.v1beta1.Agent agent = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.ci.v1beta1.Agent, com.appscode.api.ci.v1beta1.Agent.Builder, com.appscode.api.ci.v1beta1.AgentOrBuilder> 
        getAgentFieldBuilder() {
      if (agentBuilder_ == null) {
        agentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.ci.v1beta1.Agent, com.appscode.api.ci.v1beta1.Agent.Builder, com.appscode.api.ci.v1beta1.AgentOrBuilder>(
                getAgent(),
                getParentForChildren(),
                isClean());
        agent_ = null;
      }
      return agentBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:appscode.ci.v1beta1.AgentGetResponse)
  }

  // @@protoc_insertion_point(class_scope:appscode.ci.v1beta1.AgentGetResponse)
  private static final com.appscode.api.ci.v1beta1.AgentGetResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.ci.v1beta1.AgentGetResponse();
  }

  public static com.appscode.api.ci.v1beta1.AgentGetResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgentGetResponse>
      PARSER = new com.google.protobuf.AbstractParser<AgentGetResponse>() {
    public AgentGetResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AgentGetResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AgentGetResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgentGetResponse> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.ci.v1beta1.AgentGetResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

