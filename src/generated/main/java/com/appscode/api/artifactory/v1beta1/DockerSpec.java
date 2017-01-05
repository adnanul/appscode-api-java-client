// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/artifactory/v1beta1/version.proto

package com.appscode.api.artifactory.v1beta1;

/**
 * Protobuf type {@code appscode.artifactory.v1beta1.DockerSpec}
 */
public  final class DockerSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.artifactory.v1beta1.DockerSpec)
    DockerSpecOrBuilder {
  // Use DockerSpec.newBuilder() to construct.
  private DockerSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DockerSpec() {
    tarSums_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    manifestUrl_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DockerSpec(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              tarSums_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            tarSums_.add(s);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            manifestUrl_ = s;
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
        tarSums_ = tarSums_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.appscode.api.artifactory.v1beta1.VersionProto.internal_static_appscode_artifactory_v1beta1_DockerSpec_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.artifactory.v1beta1.VersionProto.internal_static_appscode_artifactory_v1beta1_DockerSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.artifactory.v1beta1.DockerSpec.class, com.appscode.api.artifactory.v1beta1.DockerSpec.Builder.class);
  }

  private int bitField0_;
  public static final int TAR_SUMS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList tarSums_;
  /**
   * <code>repeated string tar_sums = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getTarSumsList() {
    return tarSums_;
  }
  /**
   * <code>repeated string tar_sums = 1;</code>
   */
  public int getTarSumsCount() {
    return tarSums_.size();
  }
  /**
   * <code>repeated string tar_sums = 1;</code>
   */
  public java.lang.String getTarSums(int index) {
    return tarSums_.get(index);
  }
  /**
   * <code>repeated string tar_sums = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTarSumsBytes(int index) {
    return tarSums_.getByteString(index);
  }

  public static final int MANIFEST_URL_FIELD_NUMBER = 2;
  private volatile java.lang.Object manifestUrl_;
  /**
   * <code>optional string manifest_url = 2;</code>
   */
  public java.lang.String getManifestUrl() {
    java.lang.Object ref = manifestUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      manifestUrl_ = s;
      return s;
    }
  }
  /**
   * <code>optional string manifest_url = 2;</code>
   */
  public com.google.protobuf.ByteString
      getManifestUrlBytes() {
    java.lang.Object ref = manifestUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      manifestUrl_ = b;
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
    for (int i = 0; i < tarSums_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tarSums_.getRaw(i));
    }
    if (!getManifestUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, manifestUrl_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < tarSums_.size(); i++) {
        dataSize += computeStringSizeNoTag(tarSums_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTarSumsList().size();
    }
    if (!getManifestUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, manifestUrl_);
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
    if (!(obj instanceof com.appscode.api.artifactory.v1beta1.DockerSpec)) {
      return super.equals(obj);
    }
    com.appscode.api.artifactory.v1beta1.DockerSpec other = (com.appscode.api.artifactory.v1beta1.DockerSpec) obj;

    boolean result = true;
    result = result && getTarSumsList()
        .equals(other.getTarSumsList());
    result = result && getManifestUrl()
        .equals(other.getManifestUrl());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getTarSumsCount() > 0) {
      hash = (37 * hash) + TAR_SUMS_FIELD_NUMBER;
      hash = (53 * hash) + getTarSumsList().hashCode();
    }
    hash = (37 * hash) + MANIFEST_URL_FIELD_NUMBER;
    hash = (53 * hash) + getManifestUrl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.artifactory.v1beta1.DockerSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.artifactory.v1beta1.DockerSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.artifactory.v1beta1.DockerSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.artifactory.v1beta1.DockerSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.artifactory.v1beta1.DockerSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.artifactory.v1beta1.DockerSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.artifactory.v1beta1.DockerSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.artifactory.v1beta1.DockerSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.artifactory.v1beta1.DockerSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.artifactory.v1beta1.DockerSpec parseFrom(
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
  public static Builder newBuilder(com.appscode.api.artifactory.v1beta1.DockerSpec prototype) {
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
   * Protobuf type {@code appscode.artifactory.v1beta1.DockerSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.artifactory.v1beta1.DockerSpec)
      com.appscode.api.artifactory.v1beta1.DockerSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.artifactory.v1beta1.VersionProto.internal_static_appscode_artifactory_v1beta1_DockerSpec_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.artifactory.v1beta1.VersionProto.internal_static_appscode_artifactory_v1beta1_DockerSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.artifactory.v1beta1.DockerSpec.class, com.appscode.api.artifactory.v1beta1.DockerSpec.Builder.class);
    }

    // Construct using com.appscode.api.artifactory.v1beta1.DockerSpec.newBuilder()
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
      tarSums_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      manifestUrl_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.artifactory.v1beta1.VersionProto.internal_static_appscode_artifactory_v1beta1_DockerSpec_descriptor;
    }

    public com.appscode.api.artifactory.v1beta1.DockerSpec getDefaultInstanceForType() {
      return com.appscode.api.artifactory.v1beta1.DockerSpec.getDefaultInstance();
    }

    public com.appscode.api.artifactory.v1beta1.DockerSpec build() {
      com.appscode.api.artifactory.v1beta1.DockerSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.artifactory.v1beta1.DockerSpec buildPartial() {
      com.appscode.api.artifactory.v1beta1.DockerSpec result = new com.appscode.api.artifactory.v1beta1.DockerSpec(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        tarSums_ = tarSums_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.tarSums_ = tarSums_;
      result.manifestUrl_ = manifestUrl_;
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
      if (other instanceof com.appscode.api.artifactory.v1beta1.DockerSpec) {
        return mergeFrom((com.appscode.api.artifactory.v1beta1.DockerSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.artifactory.v1beta1.DockerSpec other) {
      if (other == com.appscode.api.artifactory.v1beta1.DockerSpec.getDefaultInstance()) return this;
      if (!other.tarSums_.isEmpty()) {
        if (tarSums_.isEmpty()) {
          tarSums_ = other.tarSums_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTarSumsIsMutable();
          tarSums_.addAll(other.tarSums_);
        }
        onChanged();
      }
      if (!other.getManifestUrl().isEmpty()) {
        manifestUrl_ = other.manifestUrl_;
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
      com.appscode.api.artifactory.v1beta1.DockerSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.artifactory.v1beta1.DockerSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList tarSums_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTarSumsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        tarSums_ = new com.google.protobuf.LazyStringArrayList(tarSums_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string tar_sums = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getTarSumsList() {
      return tarSums_.getUnmodifiableView();
    }
    /**
     * <code>repeated string tar_sums = 1;</code>
     */
    public int getTarSumsCount() {
      return tarSums_.size();
    }
    /**
     * <code>repeated string tar_sums = 1;</code>
     */
    public java.lang.String getTarSums(int index) {
      return tarSums_.get(index);
    }
    /**
     * <code>repeated string tar_sums = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTarSumsBytes(int index) {
      return tarSums_.getByteString(index);
    }
    /**
     * <code>repeated string tar_sums = 1;</code>
     */
    public Builder setTarSums(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTarSumsIsMutable();
      tarSums_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tar_sums = 1;</code>
     */
    public Builder addTarSums(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTarSumsIsMutable();
      tarSums_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tar_sums = 1;</code>
     */
    public Builder addAllTarSums(
        java.lang.Iterable<java.lang.String> values) {
      ensureTarSumsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, tarSums_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tar_sums = 1;</code>
     */
    public Builder clearTarSums() {
      tarSums_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tar_sums = 1;</code>
     */
    public Builder addTarSumsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTarSumsIsMutable();
      tarSums_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object manifestUrl_ = "";
    /**
     * <code>optional string manifest_url = 2;</code>
     */
    public java.lang.String getManifestUrl() {
      java.lang.Object ref = manifestUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        manifestUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string manifest_url = 2;</code>
     */
    public com.google.protobuf.ByteString
        getManifestUrlBytes() {
      java.lang.Object ref = manifestUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        manifestUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string manifest_url = 2;</code>
     */
    public Builder setManifestUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      manifestUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string manifest_url = 2;</code>
     */
    public Builder clearManifestUrl() {
      
      manifestUrl_ = getDefaultInstance().getManifestUrl();
      onChanged();
      return this;
    }
    /**
     * <code>optional string manifest_url = 2;</code>
     */
    public Builder setManifestUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      manifestUrl_ = value;
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


    // @@protoc_insertion_point(builder_scope:appscode.artifactory.v1beta1.DockerSpec)
  }

  // @@protoc_insertion_point(class_scope:appscode.artifactory.v1beta1.DockerSpec)
  private static final com.appscode.api.artifactory.v1beta1.DockerSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.artifactory.v1beta1.DockerSpec();
  }

  public static com.appscode.api.artifactory.v1beta1.DockerSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DockerSpec>
      PARSER = new com.google.protobuf.AbstractParser<DockerSpec>() {
    public DockerSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DockerSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DockerSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DockerSpec> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.artifactory.v1beta1.DockerSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

