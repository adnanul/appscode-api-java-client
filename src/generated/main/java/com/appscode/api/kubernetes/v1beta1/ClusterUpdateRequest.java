// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/cluster.proto

package com.appscode.api.kubernetes.v1beta1;

/**
 * Protobuf type {@code appscode.kubernetes.v1beta1.ClusterUpdateRequest}
 */
public  final class ClusterUpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta1.ClusterUpdateRequest)
    ClusterUpdateRequestOrBuilder {
  // Use ClusterUpdateRequest.newBuilder() to construct.
  private ClusterUpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClusterUpdateRequest() {
    name_ = "";
    doNotDelete_ = false;
    defaultAccessLevel_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ClusterUpdateRequest(
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
          case 16: {

            doNotDelete_ = input.readBool();
            break;
          }
          case 26: {
            com.appscode.api.kubernetes.v1beta1.ClusterSettings.Builder subBuilder = null;
            if (settings_ != null) {
              subBuilder = settings_.toBuilder();
            }
            settings_ = input.readMessage(com.appscode.api.kubernetes.v1beta1.ClusterSettings.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(settings_);
              settings_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            defaultAccessLevel_ = s;
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
    return com.appscode.api.kubernetes.v1beta1.ClusterProto.internal_static_appscode_kubernetes_v1beta1_ClusterUpdateRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta1.ClusterProto.internal_static_appscode_kubernetes_v1beta1_ClusterUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest.class, com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest.Builder.class);
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

  public static final int DO_NOT_DELETE_FIELD_NUMBER = 2;
  private boolean doNotDelete_;
  /**
   * <code>bool do_not_delete = 2;</code>
   */
  public boolean getDoNotDelete() {
    return doNotDelete_;
  }

  public static final int SETTINGS_FIELD_NUMBER = 3;
  private com.appscode.api.kubernetes.v1beta1.ClusterSettings settings_;
  /**
   * <code>.appscode.kubernetes.v1beta1.ClusterSettings settings = 3;</code>
   */
  public boolean hasSettings() {
    return settings_ != null;
  }
  /**
   * <code>.appscode.kubernetes.v1beta1.ClusterSettings settings = 3;</code>
   */
  public com.appscode.api.kubernetes.v1beta1.ClusterSettings getSettings() {
    return settings_ == null ? com.appscode.api.kubernetes.v1beta1.ClusterSettings.getDefaultInstance() : settings_;
  }
  /**
   * <code>.appscode.kubernetes.v1beta1.ClusterSettings settings = 3;</code>
   */
  public com.appscode.api.kubernetes.v1beta1.ClusterSettingsOrBuilder getSettingsOrBuilder() {
    return getSettings();
  }

  public static final int DEFAULT_ACCESS_LEVEL_FIELD_NUMBER = 4;
  private volatile java.lang.Object defaultAccessLevel_;
  /**
   * <pre>
   * Default access level is to allow permission to the cluster
   * when no Role matched for that specif user or group. This can
   * set as
   *   - kubernetes:team-admin
   *   - kubernetes:cluster-admin
   *   - kubernetes:admin
   *   - kubernetes:editor
   *   - kubernetes:viewer
   *   - deny-access
   * </pre>
   *
   * <code>string default_access_level = 4;</code>
   */
  public java.lang.String getDefaultAccessLevel() {
    java.lang.Object ref = defaultAccessLevel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      defaultAccessLevel_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Default access level is to allow permission to the cluster
   * when no Role matched for that specif user or group. This can
   * set as
   *   - kubernetes:team-admin
   *   - kubernetes:cluster-admin
   *   - kubernetes:admin
   *   - kubernetes:editor
   *   - kubernetes:viewer
   *   - deny-access
   * </pre>
   *
   * <code>string default_access_level = 4;</code>
   */
  public com.google.protobuf.ByteString
      getDefaultAccessLevelBytes() {
    java.lang.Object ref = defaultAccessLevel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      defaultAccessLevel_ = b;
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
    if (doNotDelete_ != false) {
      output.writeBool(2, doNotDelete_);
    }
    if (settings_ != null) {
      output.writeMessage(3, getSettings());
    }
    if (!getDefaultAccessLevelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, defaultAccessLevel_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (doNotDelete_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, doNotDelete_);
    }
    if (settings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSettings());
    }
    if (!getDefaultAccessLevelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, defaultAccessLevel_);
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest other = (com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (getDoNotDelete()
        == other.getDoNotDelete());
    result = result && (hasSettings() == other.hasSettings());
    if (hasSettings()) {
      result = result && getSettings()
          .equals(other.getSettings());
    }
    result = result && getDefaultAccessLevel()
        .equals(other.getDefaultAccessLevel());
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
    hash = (37 * hash) + DO_NOT_DELETE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDoNotDelete());
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    hash = (37 * hash) + DEFAULT_ACCESS_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getDefaultAccessLevel().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest prototype) {
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
   * Protobuf type {@code appscode.kubernetes.v1beta1.ClusterUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta1.ClusterUpdateRequest)
      com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta1.ClusterProto.internal_static_appscode_kubernetes_v1beta1_ClusterUpdateRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta1.ClusterProto.internal_static_appscode_kubernetes_v1beta1_ClusterUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest.class, com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest.newBuilder()
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

      doNotDelete_ = false;

      if (settingsBuilder_ == null) {
        settings_ = null;
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }
      defaultAccessLevel_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta1.ClusterProto.internal_static_appscode_kubernetes_v1beta1_ClusterUpdateRequest_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest build() {
      com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest buildPartial() {
      com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest result = new com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest(this);
      result.name_ = name_;
      result.doNotDelete_ = doNotDelete_;
      if (settingsBuilder_ == null) {
        result.settings_ = settings_;
      } else {
        result.settings_ = settingsBuilder_.build();
      }
      result.defaultAccessLevel_ = defaultAccessLevel_;
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
      if (other instanceof com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest other) {
      if (other == com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getDoNotDelete() != false) {
        setDoNotDelete(other.getDoNotDelete());
      }
      if (other.hasSettings()) {
        mergeSettings(other.getSettings());
      }
      if (!other.getDefaultAccessLevel().isEmpty()) {
        defaultAccessLevel_ = other.defaultAccessLevel_;
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
      com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest) e.getUnfinishedMessage();
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

    private boolean doNotDelete_ ;
    /**
     * <code>bool do_not_delete = 2;</code>
     */
    public boolean getDoNotDelete() {
      return doNotDelete_;
    }
    /**
     * <code>bool do_not_delete = 2;</code>
     */
    public Builder setDoNotDelete(boolean value) {
      
      doNotDelete_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool do_not_delete = 2;</code>
     */
    public Builder clearDoNotDelete() {
      
      doNotDelete_ = false;
      onChanged();
      return this;
    }

    private com.appscode.api.kubernetes.v1beta1.ClusterSettings settings_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta1.ClusterSettings, com.appscode.api.kubernetes.v1beta1.ClusterSettings.Builder, com.appscode.api.kubernetes.v1beta1.ClusterSettingsOrBuilder> settingsBuilder_;
    /**
     * <code>.appscode.kubernetes.v1beta1.ClusterSettings settings = 3;</code>
     */
    public boolean hasSettings() {
      return settingsBuilder_ != null || settings_ != null;
    }
    /**
     * <code>.appscode.kubernetes.v1beta1.ClusterSettings settings = 3;</code>
     */
    public com.appscode.api.kubernetes.v1beta1.ClusterSettings getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null ? com.appscode.api.kubernetes.v1beta1.ClusterSettings.getDefaultInstance() : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.appscode.kubernetes.v1beta1.ClusterSettings settings = 3;</code>
     */
    public Builder setSettings(com.appscode.api.kubernetes.v1beta1.ClusterSettings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        settings_ = value;
        onChanged();
      } else {
        settingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta1.ClusterSettings settings = 3;</code>
     */
    public Builder setSettings(
        com.appscode.api.kubernetes.v1beta1.ClusterSettings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
        onChanged();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta1.ClusterSettings settings = 3;</code>
     */
    public Builder mergeSettings(com.appscode.api.kubernetes.v1beta1.ClusterSettings value) {
      if (settingsBuilder_ == null) {
        if (settings_ != null) {
          settings_ =
            com.appscode.api.kubernetes.v1beta1.ClusterSettings.newBuilder(settings_).mergeFrom(value).buildPartial();
        } else {
          settings_ = value;
        }
        onChanged();
      } else {
        settingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta1.ClusterSettings settings = 3;</code>
     */
    public Builder clearSettings() {
      if (settingsBuilder_ == null) {
        settings_ = null;
        onChanged();
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.appscode.kubernetes.v1beta1.ClusterSettings settings = 3;</code>
     */
    public com.appscode.api.kubernetes.v1beta1.ClusterSettings.Builder getSettingsBuilder() {
      
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.appscode.kubernetes.v1beta1.ClusterSettings settings = 3;</code>
     */
    public com.appscode.api.kubernetes.v1beta1.ClusterSettingsOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null ?
            com.appscode.api.kubernetes.v1beta1.ClusterSettings.getDefaultInstance() : settings_;
      }
    }
    /**
     * <code>.appscode.kubernetes.v1beta1.ClusterSettings settings = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appscode.api.kubernetes.v1beta1.ClusterSettings, com.appscode.api.kubernetes.v1beta1.ClusterSettings.Builder, com.appscode.api.kubernetes.v1beta1.ClusterSettingsOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appscode.api.kubernetes.v1beta1.ClusterSettings, com.appscode.api.kubernetes.v1beta1.ClusterSettings.Builder, com.appscode.api.kubernetes.v1beta1.ClusterSettingsOrBuilder>(
                getSettings(),
                getParentForChildren(),
                isClean());
        settings_ = null;
      }
      return settingsBuilder_;
    }

    private java.lang.Object defaultAccessLevel_ = "";
    /**
     * <pre>
     * Default access level is to allow permission to the cluster
     * when no Role matched for that specif user or group. This can
     * set as
     *   - kubernetes:team-admin
     *   - kubernetes:cluster-admin
     *   - kubernetes:admin
     *   - kubernetes:editor
     *   - kubernetes:viewer
     *   - deny-access
     * </pre>
     *
     * <code>string default_access_level = 4;</code>
     */
    public java.lang.String getDefaultAccessLevel() {
      java.lang.Object ref = defaultAccessLevel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        defaultAccessLevel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Default access level is to allow permission to the cluster
     * when no Role matched for that specif user or group. This can
     * set as
     *   - kubernetes:team-admin
     *   - kubernetes:cluster-admin
     *   - kubernetes:admin
     *   - kubernetes:editor
     *   - kubernetes:viewer
     *   - deny-access
     * </pre>
     *
     * <code>string default_access_level = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDefaultAccessLevelBytes() {
      java.lang.Object ref = defaultAccessLevel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        defaultAccessLevel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Default access level is to allow permission to the cluster
     * when no Role matched for that specif user or group. This can
     * set as
     *   - kubernetes:team-admin
     *   - kubernetes:cluster-admin
     *   - kubernetes:admin
     *   - kubernetes:editor
     *   - kubernetes:viewer
     *   - deny-access
     * </pre>
     *
     * <code>string default_access_level = 4;</code>
     */
    public Builder setDefaultAccessLevel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      defaultAccessLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default access level is to allow permission to the cluster
     * when no Role matched for that specif user or group. This can
     * set as
     *   - kubernetes:team-admin
     *   - kubernetes:cluster-admin
     *   - kubernetes:admin
     *   - kubernetes:editor
     *   - kubernetes:viewer
     *   - deny-access
     * </pre>
     *
     * <code>string default_access_level = 4;</code>
     */
    public Builder clearDefaultAccessLevel() {
      
      defaultAccessLevel_ = getDefaultInstance().getDefaultAccessLevel();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default access level is to allow permission to the cluster
     * when no Role matched for that specif user or group. This can
     * set as
     *   - kubernetes:team-admin
     *   - kubernetes:cluster-admin
     *   - kubernetes:admin
     *   - kubernetes:editor
     *   - kubernetes:viewer
     *   - deny-access
     * </pre>
     *
     * <code>string default_access_level = 4;</code>
     */
    public Builder setDefaultAccessLevelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      defaultAccessLevel_ = value;
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


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta1.ClusterUpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta1.ClusterUpdateRequest)
  private static final com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest();
  }

  public static com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClusterUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<ClusterUpdateRequest>() {
    public ClusterUpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClusterUpdateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClusterUpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClusterUpdateRequest> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

