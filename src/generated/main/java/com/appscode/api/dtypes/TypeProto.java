// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/dtypes/types.proto

package com.appscode.api.dtypes;

public final class TypeProto {
  private TypeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_dtypes_ErrorDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_dtypes_ErrorDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_dtypes_LongRunningResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_dtypes_LongRunningResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_dtypes_VoidRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_dtypes_VoidRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_dtypes_VoidResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_dtypes_VoidResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_dtypes_Uid_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_dtypes_Uid_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037appscode/api/dtypes/types.proto\022\017appsc" +
      "ode.dtypes\032\031google/protobuf/any.proto\">\n" +
      "\014ErrorDetails\022\032\n\022requested_resource\030\001 \001(" +
      "\t\022\022\n\nstacktrace\030\002 \001(\t\"\'\n\023LongRunningResp" +
      "onse\022\020\n\010job_phid\030\001 \001(\t\"\r\n\013VoidRequest\"\016\n" +
      "\014VoidResponse\"!\n\003Uid\022\014\n\004phid\030\001 \001(\t\022\014\n\004na" +
      "me\030\002 \001(\tB.\n\027com.appscode.api.dtypesB\tTyp" +
      "eProtoP\001Z\006dtypesb\006proto3"
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
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_appscode_dtypes_ErrorDetails_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_appscode_dtypes_ErrorDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_dtypes_ErrorDetails_descriptor,
        new java.lang.String[] { "RequestedResource", "Stacktrace", });
    internal_static_appscode_dtypes_LongRunningResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_appscode_dtypes_LongRunningResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_dtypes_LongRunningResponse_descriptor,
        new java.lang.String[] { "JobPhid", });
    internal_static_appscode_dtypes_VoidRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_appscode_dtypes_VoidRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_dtypes_VoidRequest_descriptor,
        new java.lang.String[] { });
    internal_static_appscode_dtypes_VoidResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_appscode_dtypes_VoidResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_dtypes_VoidResponse_descriptor,
        new java.lang.String[] { });
    internal_static_appscode_dtypes_Uid_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_appscode_dtypes_Uid_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_dtypes_Uid_descriptor,
        new java.lang.String[] { "Phid", "Name", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
