// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/ci/v1beta1/metadata.proto

package com.appscode.api.ci.v1beta1;

public final class MetadataProto {
  private MetadataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_ci_v1beta1_ServerInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_ci_v1beta1_ServerInfoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&appscode/api/ci/v1beta1/metadata.proto" +
      "\022\023appscode.ci.v1beta1\032\034google/api/annota" +
      "tions.proto\032\036appscode/api/annotations.pr" +
      "oto\032\037appscode/api/dtypes/types.proto\"t\n\022" +
      "ServerInfoResponse\022\'\n\006status\030\001 \001(\0132\027.app" +
      "scode.dtypes.Status\022\020\n\010provider\030\002 \001(\t\022\022\n" +
      "\nserver_url\030\003 \001(\t\022\017\n\007ca_cert\030\004 \001(\t2\243\001\n\010M" +
      "etadata\022\226\001\n\nServerInfo\022\034.appscode.dtypes" +
      ".VoidRequest\032\'.appscode.ci.v1beta1.Serve" +
      "rInfoResponse\"A\202\323\344\223\0025\0223/_appscode/api/ci",
      "/v1beta1/metadata/server-info/json\202\265\030\002\010\001" +
      "B7\n\033com.appscode.api.ci.v1beta1B\rMetadat" +
      "aProtoP\001Z\007v1beta1b\006proto3"
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
    internal_static_appscode_ci_v1beta1_ServerInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_appscode_ci_v1beta1_ServerInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ci_v1beta1_ServerInfoResponse_descriptor,
        new java.lang.String[] { "Status", "Provider", "ServerUrl", "CaCert", });
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
