// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/metadata.proto

package com.appscode.api.kubernetes.v1beta1;

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
    internal_static_appscode_kubernetes_v1beta1_RegionListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_RegionListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_RegionListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_RegionListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_ZoneListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_ZoneListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_ZoneListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_ZoneListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_BucketListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_BucketListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_BucketListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_BucketListResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.appscode/api/kubernetes/v1beta1/metada" +
      "ta.proto\022\033appscode.kubernetes.v1beta1\032\034g" +
      "oogle/api/annotations.proto\032\036appscode/ap" +
      "i/annotations.proto\032\037appscode/api/dtypes" +
      "/types.proto\"-\n\021RegionListRequest\022\030\n\020clo" +
      "ud_credential\030\001 \001(\t\"N\n\022RegionListRespons" +
      "e\022\'\n\006status\030\001 \001(\0132\027.appscode.dtypes.Stat" +
      "us\022\017\n\007regions\030\002 \003(\t\";\n\017ZoneListRequest\022\030" +
      "\n\020cloud_credential\030\001 \001(\t\022\016\n\006region\030\002 \001(\t" +
      "\"J\n\020ZoneListResponse\022\'\n\006status\030\001 \001(\0132\027.a",
      "ppscode.dtypes.Status\022\r\n\005zones\030\002 \003(\t\"B\n\021" +
      "BucketListRequest\022\030\n\020cloud_credential\030\001 " +
      "\001(\t\022\023\n\013gce_project\030\002 \001(\t\"L\n\022BucketListRe" +
      "sponse\022\'\n\006status\030\001 \001(\0132\027.appscode.dtypes" +
      ".Status\022\r\n\005names\030\002 \003(\t2\221\004\n\010Metadata\022\247\001\n\013" +
      "ListRegions\022..appscode.kubernetes.v1beta" +
      "1.RegionListRequest\032/.appscode.kubernete" +
      "s.v1beta1.RegionListResponse\"7\202\323\344\223\002+\022)/_" +
      "appscode/api/cloud/v1beta1/regions/json\202" +
      "\265\030\002\010\001\022\260\001\n\tListZones\022,.appscode.kubernete",
      "s.v1beta1.ZoneListRequest\032-.appscode.kub" +
      "ernetes.v1beta1.ZoneListResponse\"F\202\323\344\223\002:" +
      "\0228/_appscode/api/cloud/v1beta1/regions/{" +
      "region}/zones/json\202\265\030\002\010\001\022\247\001\n\013ListBuckets" +
      "\022..appscode.kubernetes.v1beta1.BucketLis" +
      "tRequest\032/.appscode.kubernetes.v1beta1.B" +
      "ucketListResponse\"7\202\323\344\223\002+\022)/_appscode/ap" +
      "i/cloud/v1beta1/buckets/json\202\265\030\002\010\001B?\n#co" +
      "m.appscode.api.kubernetes.v1beta1B\rMetad" +
      "ataProtoP\001Z\007v1beta1b\006proto3"
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
    internal_static_appscode_kubernetes_v1beta1_RegionListRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_appscode_kubernetes_v1beta1_RegionListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_RegionListRequest_descriptor,
        new java.lang.String[] { "CloudCredential", });
    internal_static_appscode_kubernetes_v1beta1_RegionListResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_appscode_kubernetes_v1beta1_RegionListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_RegionListResponse_descriptor,
        new java.lang.String[] { "Status", "Regions", });
    internal_static_appscode_kubernetes_v1beta1_ZoneListRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_appscode_kubernetes_v1beta1_ZoneListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_ZoneListRequest_descriptor,
        new java.lang.String[] { "CloudCredential", "Region", });
    internal_static_appscode_kubernetes_v1beta1_ZoneListResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_appscode_kubernetes_v1beta1_ZoneListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_ZoneListResponse_descriptor,
        new java.lang.String[] { "Status", "Zones", });
    internal_static_appscode_kubernetes_v1beta1_BucketListRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_appscode_kubernetes_v1beta1_BucketListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_BucketListRequest_descriptor,
        new java.lang.String[] { "CloudCredential", "GceProject", });
    internal_static_appscode_kubernetes_v1beta1_BucketListResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_appscode_kubernetes_v1beta1_BucketListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_BucketListResponse_descriptor,
        new java.lang.String[] { "Status", "Names", });
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
