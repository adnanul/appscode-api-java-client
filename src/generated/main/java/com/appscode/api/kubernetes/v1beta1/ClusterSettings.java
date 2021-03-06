// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/cluster.proto

package com.appscode.api.kubernetes.v1beta1;

/**
 * Protobuf type {@code appscode.kubernetes.v1beta1.ClusterSettings}
 */
public  final class ClusterSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appscode.kubernetes.v1beta1.ClusterSettings)
    ClusterSettingsOrBuilder {
  // Use ClusterSettings.newBuilder() to construct.
  private ClusterSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClusterSettings() {
    logIndexPrefix_ = "";
    logStorageLifetime_ = 0L;
    monitoringStorageLifetime_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ClusterSettings(
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

            logIndexPrefix_ = s;
            break;
          }
          case 16: {

            logStorageLifetime_ = input.readInt64();
            break;
          }
          case 24: {

            monitoringStorageLifetime_ = input.readInt64();
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
    return com.appscode.api.kubernetes.v1beta1.ClusterProto.internal_static_appscode_kubernetes_v1beta1_ClusterSettings_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appscode.api.kubernetes.v1beta1.ClusterProto.internal_static_appscode_kubernetes_v1beta1_ClusterSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appscode.api.kubernetes.v1beta1.ClusterSettings.class, com.appscode.api.kubernetes.v1beta1.ClusterSettings.Builder.class);
  }

  public static final int LOG_INDEX_PREFIX_FIELD_NUMBER = 1;
  private volatile java.lang.Object logIndexPrefix_;
  /**
   * <code>string log_index_prefix = 1;</code>
   */
  public java.lang.String getLogIndexPrefix() {
    java.lang.Object ref = logIndexPrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      logIndexPrefix_ = s;
      return s;
    }
  }
  /**
   * <code>string log_index_prefix = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLogIndexPrefixBytes() {
    java.lang.Object ref = logIndexPrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      logIndexPrefix_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOG_STORAGE_LIFETIME_FIELD_NUMBER = 2;
  private long logStorageLifetime_;
  /**
   * <pre>
   * Number of secs logs will be stored in ElasticSearch
   * </pre>
   *
   * <code>int64 log_storage_lifetime = 2;</code>
   */
  public long getLogStorageLifetime() {
    return logStorageLifetime_;
  }

  public static final int MONITORING_STORAGE_LIFETIME_FIELD_NUMBER = 3;
  private long monitoringStorageLifetime_;
  /**
   * <pre>
   * Number of secs logs will be stored in InfluxDB
   * </pre>
   *
   * <code>int64 monitoring_storage_lifetime = 3;</code>
   */
  public long getMonitoringStorageLifetime() {
    return monitoringStorageLifetime_;
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
    if (!getLogIndexPrefixBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, logIndexPrefix_);
    }
    if (logStorageLifetime_ != 0L) {
      output.writeInt64(2, logStorageLifetime_);
    }
    if (monitoringStorageLifetime_ != 0L) {
      output.writeInt64(3, monitoringStorageLifetime_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLogIndexPrefixBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, logIndexPrefix_);
    }
    if (logStorageLifetime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, logStorageLifetime_);
    }
    if (monitoringStorageLifetime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, monitoringStorageLifetime_);
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
    if (!(obj instanceof com.appscode.api.kubernetes.v1beta1.ClusterSettings)) {
      return super.equals(obj);
    }
    com.appscode.api.kubernetes.v1beta1.ClusterSettings other = (com.appscode.api.kubernetes.v1beta1.ClusterSettings) obj;

    boolean result = true;
    result = result && getLogIndexPrefix()
        .equals(other.getLogIndexPrefix());
    result = result && (getLogStorageLifetime()
        == other.getLogStorageLifetime());
    result = result && (getMonitoringStorageLifetime()
        == other.getMonitoringStorageLifetime());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LOG_INDEX_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getLogIndexPrefix().hashCode();
    hash = (37 * hash) + LOG_STORAGE_LIFETIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLogStorageLifetime());
    hash = (37 * hash) + MONITORING_STORAGE_LIFETIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMonitoringStorageLifetime());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appscode.api.kubernetes.v1beta1.ClusterSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appscode.api.kubernetes.v1beta1.ClusterSettings parseFrom(
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
  public static Builder newBuilder(com.appscode.api.kubernetes.v1beta1.ClusterSettings prototype) {
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
   * Protobuf type {@code appscode.kubernetes.v1beta1.ClusterSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appscode.kubernetes.v1beta1.ClusterSettings)
      com.appscode.api.kubernetes.v1beta1.ClusterSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appscode.api.kubernetes.v1beta1.ClusterProto.internal_static_appscode_kubernetes_v1beta1_ClusterSettings_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appscode.api.kubernetes.v1beta1.ClusterProto.internal_static_appscode_kubernetes_v1beta1_ClusterSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appscode.api.kubernetes.v1beta1.ClusterSettings.class, com.appscode.api.kubernetes.v1beta1.ClusterSettings.Builder.class);
    }

    // Construct using com.appscode.api.kubernetes.v1beta1.ClusterSettings.newBuilder()
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
      logIndexPrefix_ = "";

      logStorageLifetime_ = 0L;

      monitoringStorageLifetime_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appscode.api.kubernetes.v1beta1.ClusterProto.internal_static_appscode_kubernetes_v1beta1_ClusterSettings_descriptor;
    }

    public com.appscode.api.kubernetes.v1beta1.ClusterSettings getDefaultInstanceForType() {
      return com.appscode.api.kubernetes.v1beta1.ClusterSettings.getDefaultInstance();
    }

    public com.appscode.api.kubernetes.v1beta1.ClusterSettings build() {
      com.appscode.api.kubernetes.v1beta1.ClusterSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appscode.api.kubernetes.v1beta1.ClusterSettings buildPartial() {
      com.appscode.api.kubernetes.v1beta1.ClusterSettings result = new com.appscode.api.kubernetes.v1beta1.ClusterSettings(this);
      result.logIndexPrefix_ = logIndexPrefix_;
      result.logStorageLifetime_ = logStorageLifetime_;
      result.monitoringStorageLifetime_ = monitoringStorageLifetime_;
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
      if (other instanceof com.appscode.api.kubernetes.v1beta1.ClusterSettings) {
        return mergeFrom((com.appscode.api.kubernetes.v1beta1.ClusterSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appscode.api.kubernetes.v1beta1.ClusterSettings other) {
      if (other == com.appscode.api.kubernetes.v1beta1.ClusterSettings.getDefaultInstance()) return this;
      if (!other.getLogIndexPrefix().isEmpty()) {
        logIndexPrefix_ = other.logIndexPrefix_;
        onChanged();
      }
      if (other.getLogStorageLifetime() != 0L) {
        setLogStorageLifetime(other.getLogStorageLifetime());
      }
      if (other.getMonitoringStorageLifetime() != 0L) {
        setMonitoringStorageLifetime(other.getMonitoringStorageLifetime());
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
      com.appscode.api.kubernetes.v1beta1.ClusterSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appscode.api.kubernetes.v1beta1.ClusterSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object logIndexPrefix_ = "";
    /**
     * <code>string log_index_prefix = 1;</code>
     */
    public java.lang.String getLogIndexPrefix() {
      java.lang.Object ref = logIndexPrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logIndexPrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string log_index_prefix = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLogIndexPrefixBytes() {
      java.lang.Object ref = logIndexPrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logIndexPrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string log_index_prefix = 1;</code>
     */
    public Builder setLogIndexPrefix(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      logIndexPrefix_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string log_index_prefix = 1;</code>
     */
    public Builder clearLogIndexPrefix() {
      
      logIndexPrefix_ = getDefaultInstance().getLogIndexPrefix();
      onChanged();
      return this;
    }
    /**
     * <code>string log_index_prefix = 1;</code>
     */
    public Builder setLogIndexPrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      logIndexPrefix_ = value;
      onChanged();
      return this;
    }

    private long logStorageLifetime_ ;
    /**
     * <pre>
     * Number of secs logs will be stored in ElasticSearch
     * </pre>
     *
     * <code>int64 log_storage_lifetime = 2;</code>
     */
    public long getLogStorageLifetime() {
      return logStorageLifetime_;
    }
    /**
     * <pre>
     * Number of secs logs will be stored in ElasticSearch
     * </pre>
     *
     * <code>int64 log_storage_lifetime = 2;</code>
     */
    public Builder setLogStorageLifetime(long value) {
      
      logStorageLifetime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of secs logs will be stored in ElasticSearch
     * </pre>
     *
     * <code>int64 log_storage_lifetime = 2;</code>
     */
    public Builder clearLogStorageLifetime() {
      
      logStorageLifetime_ = 0L;
      onChanged();
      return this;
    }

    private long monitoringStorageLifetime_ ;
    /**
     * <pre>
     * Number of secs logs will be stored in InfluxDB
     * </pre>
     *
     * <code>int64 monitoring_storage_lifetime = 3;</code>
     */
    public long getMonitoringStorageLifetime() {
      return monitoringStorageLifetime_;
    }
    /**
     * <pre>
     * Number of secs logs will be stored in InfluxDB
     * </pre>
     *
     * <code>int64 monitoring_storage_lifetime = 3;</code>
     */
    public Builder setMonitoringStorageLifetime(long value) {
      
      monitoringStorageLifetime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of secs logs will be stored in InfluxDB
     * </pre>
     *
     * <code>int64 monitoring_storage_lifetime = 3;</code>
     */
    public Builder clearMonitoringStorageLifetime() {
      
      monitoringStorageLifetime_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:appscode.kubernetes.v1beta1.ClusterSettings)
  }

  // @@protoc_insertion_point(class_scope:appscode.kubernetes.v1beta1.ClusterSettings)
  private static final com.appscode.api.kubernetes.v1beta1.ClusterSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appscode.api.kubernetes.v1beta1.ClusterSettings();
  }

  public static com.appscode.api.kubernetes.v1beta1.ClusterSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClusterSettings>
      PARSER = new com.google.protobuf.AbstractParser<ClusterSettings>() {
    public ClusterSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClusterSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClusterSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClusterSettings> getParserForType() {
    return PARSER;
  }

  public com.appscode.api.kubernetes.v1beta1.ClusterSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

