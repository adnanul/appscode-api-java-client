// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/health/health.proto

package com.appscode.api.health;

public final class HealthProto {
  private HealthProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_health_StatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_health_StatusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_health_URLBase_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_health_URLBase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_health_NetConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_health_NetConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_health_Metadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_health_Metadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n appscode/api/health/health.proto\022\017apps" +
      "code.health\032\034google/api/annotations.prot" +
      "o\032\036appscode/api/annotations.proto\032\037appsc" +
      "ode/api/dtypes/types.proto\032\"appscode/api" +
      "/version/version.proto\"\222\001\n\016StatusRespons" +
      "e\022\'\n\006status\030\001 \001(\0132\027.appscode.dtypes.Stat" +
      "us\022*\n\007version\030\002 \001(\0132\031.appscode.version.V" +
      "ersion\022+\n\010metadata\030\003 \001(\0132\031.appscode.heal" +
      "th.Metadata\",\n\007URLBase\022\016\n\006scheme\030\001 \001(\t\022\021" +
      "\n\tbase_addr\030\002 \001(\t\"\300\002\n\tNetConfig\022\021\n\tteam_",
      "addr\030\001 \001(\t\022-\n\013public_urls\030\002 \001(\0132\030.appsco" +
      "de.health.URLBase\022+\n\tteam_urls\030\003 \001(\0132\030.a" +
      "ppscode.health.URLBase\022.\n\014cluster_urls\030\004" +
      " \001(\0132\030.appscode.health.URLBase\0221\n\017in_clu" +
      "ster_urls\030\005 \001(\0132\030.appscode.health.URLBas" +
      "e\0224\n\022URL_shortener_urls\030\006 \001(\0132\030.appscode" +
      ".health.URLBase\022+\n\tfile_urls\030\007 \001(\0132\030.app" +
      "scode.health.URLBase\"X\n\010Metadata\022\013\n\003env\030" +
      "\001 \001(\t\022\017\n\007team_id\030\002 \001(\t\022.\n\nnet_config\030\003 \001" +
      "(\0132\032.appscode.health.NetConfig2{\n\006Health",
      "\022q\n\006Status\022\034.appscode.dtypes.VoidRequest" +
      "\032\037.appscode.health.StatusResponse\"(\202\323\344\223\002" +
      "\034\022\032/_appscode/api/health/json\202\265\030\002\010\001B0\n\027c" +
      "om.appscode.api.healthB\013HealthProtoP\001Z\006h" +
      "ealthb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.appscode.api.AnnotationsProto.getDescriptor(),
          com.appscode.api.dtypes.TypeProto.getDescriptor(),
          com.appscode.api.version.VersionProto.getDescriptor(),
        }, assigner);
    internal_static_appscode_health_StatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_appscode_health_StatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_health_StatusResponse_descriptor,
        new java.lang.String[] { "Status", "Version", "Metadata", });
    internal_static_appscode_health_URLBase_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_appscode_health_URLBase_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_health_URLBase_descriptor,
        new java.lang.String[] { "Scheme", "BaseAddr", });
    internal_static_appscode_health_NetConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_appscode_health_NetConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_health_NetConfig_descriptor,
        new java.lang.String[] { "TeamAddr", "PublicUrls", "TeamUrls", "ClusterUrls", "InClusterUrls", "URLShortenerUrls", "FileUrls", });
    internal_static_appscode_health_Metadata_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_appscode_health_Metadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_health_Metadata_descriptor,
        new java.lang.String[] { "Env", "TeamId", "NetConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.appscode.api.AnnotationsProto.cors);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.appscode.api.AnnotationsProto.getDescriptor();
    com.appscode.api.dtypes.TypeProto.getDescriptor();
    com.appscode.api.version.VersionProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
