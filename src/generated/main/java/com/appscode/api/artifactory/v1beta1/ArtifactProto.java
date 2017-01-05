// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/artifactory/v1beta1/artifact.proto

package com.appscode.api.artifactory.v1beta1;

public final class ArtifactProto {
  private ArtifactProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_artifactory_v1beta1_ArtifactSearchRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_artifactory_v1beta1_ArtifactSearchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_artifactory_v1beta1_ArtifactSearchResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_artifactory_v1beta1_ArtifactSearchResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_artifactory_v1beta1_ArtifactListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_artifactory_v1beta1_ArtifactListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_artifactory_v1beta1_ArtifactListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_artifactory_v1beta1_ArtifactListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_artifactory_v1beta1_Artifact_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_artifactory_v1beta1_Artifact_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/appscode/api/artifactory/v1beta1/artif" +
      "act.proto\022\034appscode.artifactory.v1beta1\032" +
      "\034google/api/annotations.proto\032\036appscode/" +
      "api/annotations.proto\032\037appscode/api/dtyp" +
      "es/types.proto\"4\n\025ArtifactSearchRequest\022" +
      "\r\n\005query\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\"|\n\026Artifact" +
      "SearchResponse\022\'\n\006status\030\001 \001(\0132\027.appscod" +
      "e.dtypes.Status\0229\n\tartifacts\030\002 \003(\0132&.app" +
      "scode.artifactory.v1beta1.Artifact\"#\n\023Ar" +
      "tifactListRequest\022\014\n\004type\030\001 \001(\t\"z\n\024Artif",
      "actListResponse\022\'\n\006status\030\001 \001(\0132\027.appsco" +
      "de.dtypes.Status\0229\n\tartifacts\030\002 \003(\0132&.ap" +
      "pscode.artifactory.v1beta1.Artifact\";\n\010A" +
      "rtifact\022\014\n\004name\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\022\023\n\013m" +
      "odified_at\030\003 \001(\0032\355\002\n\tArtifacts\022\254\001\n\006Searc" +
      "h\0223.appscode.artifactory.v1beta1.Artifac" +
      "tSearchRequest\0324.appscode.artifactory.v1" +
      "beta1.ArtifactSearchResponse\"7\202\323\344\223\002+\022)/_" +
      "appscode/api/artifactory/v1beta1/search\202" +
      "\265\030\002\010\001\022\260\001\n\004List\0221.appscode.artifactory.v1",
      "beta1.ArtifactListRequest\0322.appscode.art" +
      "ifactory.v1beta1.ArtifactListResponse\"A\202" +
      "\323\344\223\0025\0223/_appscode/api/artifactory/v1beta" +
      "1/artifacts/{type}\202\265\030\002\010\001B@\n$com.appscode" +
      ".api.artifactory.v1beta1B\rArtifactProtoP" +
      "\001Z\007v1beta1b\006proto3"
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
        }, assigner);
    internal_static_appscode_artifactory_v1beta1_ArtifactSearchRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_appscode_artifactory_v1beta1_ArtifactSearchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_artifactory_v1beta1_ArtifactSearchRequest_descriptor,
        new java.lang.String[] { "Query", "Type", });
    internal_static_appscode_artifactory_v1beta1_ArtifactSearchResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_appscode_artifactory_v1beta1_ArtifactSearchResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_artifactory_v1beta1_ArtifactSearchResponse_descriptor,
        new java.lang.String[] { "Status", "Artifacts", });
    internal_static_appscode_artifactory_v1beta1_ArtifactListRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_appscode_artifactory_v1beta1_ArtifactListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_artifactory_v1beta1_ArtifactListRequest_descriptor,
        new java.lang.String[] { "Type", });
    internal_static_appscode_artifactory_v1beta1_ArtifactListResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_appscode_artifactory_v1beta1_ArtifactListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_artifactory_v1beta1_ArtifactListResponse_descriptor,
        new java.lang.String[] { "Status", "Artifacts", });
    internal_static_appscode_artifactory_v1beta1_Artifact_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_appscode_artifactory_v1beta1_Artifact_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_artifactory_v1beta1_Artifact_descriptor,
        new java.lang.String[] { "Name", "Type", "ModifiedAt", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.appscode.api.AnnotationsProto.cors);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.appscode.api.AnnotationsProto.getDescriptor();
    com.appscode.api.dtypes.TypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
