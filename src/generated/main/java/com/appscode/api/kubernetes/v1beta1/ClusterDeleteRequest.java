// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/cluster.proto

package com.appscode.api.kubernetes.v1beta1;

/**
 * Protobuf type {@code appscode.kubernetes.v1beta1.ClusterDeleteRequest}
 */
public  final class ClusterDeleteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta1.ClusterDeleteRequest)
    ClusterDeleteRequestOrBuilder {
  // Use ClusterDeleteRequest.newBuilder() to construct.
  private ClusterDeleteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClusterDeleteRequest() {
    name_ = "";
    releaseReservedIp_ = false;
    force_ = false;
    keepLodabalancers_ = false;
    deleteDynamicVolumes_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ClusterDeleteRequest(
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

            releaseReservedIp_ = input.readBool();
            break;
          }
          case 24: {

            force_ = input.readBool();
            break;
          }
          case 32: {

            keepLodabalancers_ = input.readBool();
            break;
          }
          case 40: {

            deleteDynamicVolumes_ = input.readBool();
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
    return com.appscode.api.kubernetes.v1beta1.ClusterProto.internal_static_appscode_kubernetes_v1beta1_ClusterDeleteRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta1.ClusterProto.internal_static_appscode_kubernetes_v1beta1_ClusterDeleteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest.class, com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest.Builder.class);
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

  public static final int RELEASE_RESERVED_IP_FIELD_NUMBER = 2;
  private boolean releaseReservedIp_;
  /**
   * <code>bool release_reserved_ip = 2;</code>
   */
  public boolean getReleaseReservedIp() {
    return releaseReservedIp_;
  }

  public static final int FORCE_FIELD_NUMBER = 3;
  private boolean force_;
  /**
   * <code>bool force = 3;</code>
   */
  public boolean getForce() {
    return force_;
  }

  public static final int KEEP_LODABALANCERS_FIELD_NUMBER = 4;
  private boolean keepLodabalancers_;
  /**
   * <code>bool keep_lodabalancers = 4;</code>
   */
  public boolean getKeepLodabalancers() {
    return keepLodabalancers_;
  }

  public static final int DELETE_DYNAMIC_VOLUMES_FIELD_NUMBER = 5;
  private boolean deleteDynamicVolumes_;
  /**
   * <code>bool delete_dynamic_volumes = 5;</code>
   */
  public boolean getDeleteDynamicVolumes() {
    return deleteDynamicVolumes_;
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
    if (releaseReservedIp_ != false) {
      output.writeBool(2, releaseReservedIp_);
    }
    if (force_ != false) {
      output.writeBool(3, force_);
    }
    if (keepLodabalancers_ != false) {
      output.writeBool(4, keepLodabalancers_);
    }
    if (deleteDynamicVolumes_ != false) {
      output.writeBool(5, deleteDynamicVolumes_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (releaseReservedIp_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, releaseReservedIp_);
    }
    if (force_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, force_);
    }
    if (keepLodabalancers_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, keepLodabalancers_);
    }
    if (deleteDynamicVolumes_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, deleteDynamicVolumes_);
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest other = (com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (getReleaseReservedIp()
        == other.getReleaseReservedIp());
    result = result && (getForce()
        == other.getForce());
    result = result && (getKeepLodabalancers()
        == other.getKeepLodabalancers());
    result = result && (getDeleteDynamicVolumes()
        == other.getDeleteDynamicVolumes());
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
    hash = (37 * hash) + RELEASE_RESERVED_IP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReleaseReservedIp());
    hash = (37 * hash) + FORCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getForce());
    hash = (37 * hash) + KEEP_LODABALANCERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getKeepLodabalancers());
    hash = (37 * hash) + DELETE_DYNAMIC_VOLUMES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDeleteDynamicVolumes());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest prototype) {
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
   * Protobuf type {@code appscode.kubernetes.v1beta1.ClusterDeleteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta1.ClusterDeleteRequest)
      com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta1.ClusterProto.internal_static_appscode_kubernetes_v1beta1_ClusterDeleteRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta1.ClusterProto.internal_static_appscode_kubernetes_v1beta1_ClusterDeleteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest.class, com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest.newBuilder()
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

      releaseReservedIp_ = false;

      force_ = false;

      keepLodabalancers_ = false;

      deleteDynamicVolumes_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta1.ClusterProto.internal_static_appscode_kubernetes_v1beta1_ClusterDeleteRequest_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest build() {
      com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest buildPartial() {
      com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest result = new com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest(this);
      result.name_ = name_;
      result.releaseReservedIp_ = releaseReservedIp_;
      result.force_ = force_;
      result.keepLodabalancers_ = keepLodabalancers_;
      result.deleteDynamicVolumes_ = deleteDynamicVolumes_;
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
      if (other instanceof com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest other) {
      if (other == com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getReleaseReservedIp() != false) {
        setReleaseReservedIp(other.getReleaseReservedIp());
      }
      if (other.getForce() != false) {
        setForce(other.getForce());
      }
      if (other.getKeepLodabalancers() != false) {
        setKeepLodabalancers(other.getKeepLodabalancers());
      }
      if (other.getDeleteDynamicVolumes() != false) {
        setDeleteDynamicVolumes(other.getDeleteDynamicVolumes());
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
      com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest) e.getUnfinishedMessage();
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

    private boolean releaseReservedIp_ ;
    /**
     * <code>bool release_reserved_ip = 2;</code>
     */
    public boolean getReleaseReservedIp() {
      return releaseReservedIp_;
    }
    /**
     * <code>bool release_reserved_ip = 2;</code>
     */
    public Builder setReleaseReservedIp(boolean value) {
      
      releaseReservedIp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool release_reserved_ip = 2;</code>
     */
    public Builder clearReleaseReservedIp() {
      
      releaseReservedIp_ = false;
      onChanged();
      return this;
    }

    private boolean force_ ;
    /**
     * <code>bool force = 3;</code>
     */
    public boolean getForce() {
      return force_;
    }
    /**
     * <code>bool force = 3;</code>
     */
    public Builder setForce(boolean value) {
      
      force_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool force = 3;</code>
     */
    public Builder clearForce() {
      
      force_ = false;
      onChanged();
      return this;
    }

    private boolean keepLodabalancers_ ;
    /**
     * <code>bool keep_lodabalancers = 4;</code>
     */
    public boolean getKeepLodabalancers() {
      return keepLodabalancers_;
    }
    /**
     * <code>bool keep_lodabalancers = 4;</code>
     */
    public Builder setKeepLodabalancers(boolean value) {
      
      keepLodabalancers_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool keep_lodabalancers = 4;</code>
     */
    public Builder clearKeepLodabalancers() {
      
      keepLodabalancers_ = false;
      onChanged();
      return this;
    }

    private boolean deleteDynamicVolumes_ ;
    /**
     * <code>bool delete_dynamic_volumes = 5;</code>
     */
    public boolean getDeleteDynamicVolumes() {
      return deleteDynamicVolumes_;
    }
    /**
     * <code>bool delete_dynamic_volumes = 5;</code>
     */
    public Builder setDeleteDynamicVolumes(boolean value) {
      
      deleteDynamicVolumes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool delete_dynamic_volumes = 5;</code>
     */
    public Builder clearDeleteDynamicVolumes() {
      
      deleteDynamicVolumes_ = false;
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


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta1.ClusterDeleteRequest)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta1.ClusterDeleteRequest)
  private static final com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest();
  }

  public static com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClusterDeleteRequest>
      PARSER = new com.google.protobuf.AbstractParser<ClusterDeleteRequest>() {
    public ClusterDeleteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClusterDeleteRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClusterDeleteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClusterDeleteRequest> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

