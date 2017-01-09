// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/pv/v1beta1/disk.proto

package com.appscode.api.pv.v1beta1;

public final class DiskProto {
  private DiskProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_pv_v1beta1_DiskCreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_pv_v1beta1_DiskCreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_pv_v1beta1_DiskDeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_pv_v1beta1_DiskDeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_pv_v1beta1_DiskListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_pv_v1beta1_DiskListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_pv_v1beta1_DiskListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_pv_v1beta1_DiskListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_pv_v1beta1_Result_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_pv_v1beta1_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_pv_v1beta1_Disk_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_pv_v1beta1_Disk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_pv_v1beta1_PV_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_pv_v1beta1_PV_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_pv_v1beta1_PVC_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_pv_v1beta1_PVC_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_pv_v1beta1_DiskDescribeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_pv_v1beta1_DiskDescribeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_pv_v1beta1_DiskDescribeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_pv_v1beta1_DiskDescribeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"appscode/api/pv/v1beta1/disk.proto\022\023ap" +
      "pscode.pv.v1beta1\032\034google/api/annotation" +
      "s.proto\032\036appscode/api/annotations.proto\032" +
      "\037appscode/api/dtypes/types.proto\"d\n\021Disk" +
      "CreateRequest\022\017\n\007cluster\030\001 \001(\t\022\014\n\004name\030\002" +
      " \001(\t\022\014\n\004zone\030\003 \001(\t\022\021\n\tdisk_type\030\004 \001(\t\022\017\n" +
      "\007size_gb\030\005 \001(\003\"1\n\021DiskDeleteRequest\022\017\n\007c" +
      "luster\030\001 \001(\t\022\013\n\003uid\030\002 \001(\t\"\"\n\017DiskListReq" +
      "uest\022\017\n\007cluster\030\001 \001(\t\"w\n\020DiskListRespons" +
      "e\022\'\n\006status\030\001 \001(\0132\027.appscode.dtypes.Stat",
      "us\022\014\n\004kube\030\002 \001(\t\022,\n\007results\030\003 \003(\0132\033.apps" +
      "code.pv.v1beta1.Result\"}\n\006Result\022\'\n\004disk" +
      "\030\001 \001(\0132\031.appscode.pv.v1beta1.Disk\022#\n\002pv\030" +
      "\002 \001(\0132\027.appscode.pv.v1beta1.PV\022%\n\003pvc\030\003 " +
      "\001(\0132\030.appscode.pv.v1beta1.PVC\"\252\001\n\004Disk\022\014" +
      "\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(\t\022\016\n\006plugin\030\003 \001(\t" +
      "\022\017\n\007size_gb\030\004 \001(\003\022\014\n\004type\030\005 \001(\t\022\014\n\004zone\030" +
      "\006 \001(\t\022\016\n\006status\030\007 \001(\t\022\r\n\005users\030\010 \003(\t\022\014\n\004" +
      "kind\030\t \001(\t\022\020\n\010endpoint\030\n \001(\t\022\014\n\004iops\030\013 \001" +
      "(\003\"p\n\002PV\022\014\n\004name\030\001 \001(\t\022\017\n\007size_gb\030\002 \001(\003\022",
      "\016\n\006status\030\003 \001(\t\022\r\n\005claim\030\004 \001(\t\022\016\n\006volume" +
      "\030\005 \001(\t\022\016\n\006plugin\030\006 \001(\t\022\014\n\004type\030\007 \001(\t\"W\n\003" +
      "PVC\022\014\n\004name\030\001 \001(\t\022\017\n\007size_gb\030\002 \001(\003\022\021\n\tna" +
      "mespace\030\003 \001(\t\022\016\n\006status\030\004 \001(\t\022\016\n\006volume\030" +
      "\005 \001(\t\"D\n\023DiskDescribeRequest\022\017\n\007cluster\030" +
      "\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\016\n\006plugin\030\003 \001(\t\"h\n\024D" +
      "iskDescribeResponse\022\'\n\006status\030\001 \001(\0132\027.ap" +
      "pscode.dtypes.Status\022\'\n\004disk\030\002 \001(\0132\031.app" +
      "scode.pv.v1beta1.Disk2\207\005\n\005Disks\022\230\001\n\004List" +
      "\022$.appscode.pv.v1beta1.DiskListRequest\032%",
      ".appscode.pv.v1beta1.DiskListResponse\"C\202" +
      "\323\344\223\0027\0225/_appscode/api/cloud/v1beta1/clus" +
      "ters/{cluster}/disks\202\265\030\002\010\001\022\253\001\n\010Describe\022" +
      "(.appscode.pv.v1beta1.DiskDescribeReques" +
      "t\032).appscode.pv.v1beta1.DiskDescribeResp" +
      "onse\"J\202\323\344\223\002>\022</_appscode/api/cloud/v1bet" +
      "a1/clusters/{cluster}/disks/{name}\202\265\030\002\010\001" +
      "\022\227\001\n\006Create\022&.appscode.pv.v1beta1.DiskCr" +
      "eateRequest\032\035.appscode.dtypes.VoidRespon" +
      "se\"F\202\323\344\223\002:\"5/_appscode/api/cloud/v1beta1",
      "/clusters/{cluster}/disks:\001*\202\265\030\002\010\001\022\232\001\n\006D" +
      "elete\022&.appscode.pv.v1beta1.DiskDeleteRe" +
      "quest\032\035.appscode.dtypes.VoidResponse\"I\202\323" +
      "\344\223\002=*;/_appscode/api/cloud/v1beta1/clust" +
      "ers/{cluster}/disks/{uid}\202\265\030\002\010\001B3\n\033com.a" +
      "ppscode.api.pv.v1beta1B\tDiskProtoP\001Z\007v1b" +
      "eta1b\006proto3"
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
    internal_static_appscode_pv_v1beta1_DiskCreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_appscode_pv_v1beta1_DiskCreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_pv_v1beta1_DiskCreateRequest_descriptor,
        new java.lang.String[] { "Cluster", "Name", "Zone", "DiskType", "SizeGb", });
    internal_static_appscode_pv_v1beta1_DiskDeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_appscode_pv_v1beta1_DiskDeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_pv_v1beta1_DiskDeleteRequest_descriptor,
        new java.lang.String[] { "Cluster", "Uid", });
    internal_static_appscode_pv_v1beta1_DiskListRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_appscode_pv_v1beta1_DiskListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_pv_v1beta1_DiskListRequest_descriptor,
        new java.lang.String[] { "Cluster", });
    internal_static_appscode_pv_v1beta1_DiskListResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_appscode_pv_v1beta1_DiskListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_pv_v1beta1_DiskListResponse_descriptor,
        new java.lang.String[] { "Status", "Kube", "Results", });
    internal_static_appscode_pv_v1beta1_Result_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_appscode_pv_v1beta1_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_pv_v1beta1_Result_descriptor,
        new java.lang.String[] { "Disk", "Pv", "Pvc", });
    internal_static_appscode_pv_v1beta1_Disk_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_appscode_pv_v1beta1_Disk_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_pv_v1beta1_Disk_descriptor,
        new java.lang.String[] { "Name", "Id", "Plugin", "SizeGb", "Type", "Zone", "Status", "Users", "Kind", "Endpoint", "Iops", });
    internal_static_appscode_pv_v1beta1_PV_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_appscode_pv_v1beta1_PV_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_pv_v1beta1_PV_descriptor,
        new java.lang.String[] { "Name", "SizeGb", "Status", "Claim", "Volume", "Plugin", "Type", });
    internal_static_appscode_pv_v1beta1_PVC_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_appscode_pv_v1beta1_PVC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_pv_v1beta1_PVC_descriptor,
        new java.lang.String[] { "Name", "SizeGb", "Namespace", "Status", "Volume", });
    internal_static_appscode_pv_v1beta1_DiskDescribeRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_appscode_pv_v1beta1_DiskDescribeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_pv_v1beta1_DiskDescribeRequest_descriptor,
        new java.lang.String[] { "Cluster", "Name", "Plugin", });
    internal_static_appscode_pv_v1beta1_DiskDescribeResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_appscode_pv_v1beta1_DiskDescribeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_pv_v1beta1_DiskDescribeResponse_descriptor,
        new java.lang.String[] { "Status", "Disk", });
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