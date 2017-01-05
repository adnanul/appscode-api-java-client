// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/auth/v1beta1/project.proto

package com.appscode.api.auth.v1beta1;

public final class ProjectProto {
  private ProjectProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_auth_v1beta1_ProjectListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_auth_v1beta1_ProjectListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_auth_v1beta1_ProjectListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_auth_v1beta1_ProjectListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_auth_v1beta1_ProjectMemberListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_auth_v1beta1_ProjectMemberListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_auth_v1beta1_ProjectMemberListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_auth_v1beta1_ProjectMemberListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_auth_v1beta1_Project_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_auth_v1beta1_Project_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_auth_v1beta1_Member_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_auth_v1beta1_Member_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'appscode/api/auth/v1beta1/project.prot" +
      "o\022\025appscode.auth.v1beta1\032\034google/api/ann" +
      "otations.proto\032\036appscode/api/annotations" +
      ".proto\032\037appscode/api/dtypes/types.proto\"" +
      ":\n\022ProjectListRequest\022\023\n\013with_member\030\001 \001" +
      "(\010\022\017\n\007members\030\002 \003(\t\"o\n\023ProjectListRespon" +
      "se\022\'\n\006status\030\001 \001(\0132\027.appscode.dtypes.Sta" +
      "tus\022/\n\007projets\030\002 \003(\0132\036.appscode.auth.v1b" +
      "eta1.Project\"\'\n\030ProjectMemberListRequest" +
      "\022\013\n\003uid\030\001 \001(\t\"t\n\031ProjectMemberListRespon",
      "se\022\'\n\006status\030\001 \001(\0132\027.appscode.dtypes.Sta" +
      "tus\022.\n\006projet\030\002 \001(\0132\036.appscode.auth.v1be" +
      "ta1.Project\"\372\001\n\007Project\022\014\n\004name\030\001 \001(\t\022\014\n" +
      "\004phid\030\002 \001(\t\022\014\n\004type\030\003 \001(\t\022\016\n\006status\030\004 \001(" +
      "\t\022\023\n\013view_policy\030\005 \001(\t\022\023\n\013edit_policy\030\006 " +
      "\001(\t\022\023\n\013join_policy\030\007 \001(\t\022\031\n\021membership_l" +
      "ocked\030\010 \001(\010\022\027\n\017has_subprojects\030\t \001(\010\022.\n\007" +
      "members\030\n \003(\0132\035.appscode.auth.v1beta1.Me" +
      "mber\022\022\n\ncreated_at\030\013 \001(\003\"N\n\006Member\022\014\n\004ph" +
      "id\030\001 \001(\t\022\021\n\tuser_name\030\002 \001(\t\022\021\n\treal_name",
      "\030\003 \001(\t\022\020\n\010is_admin\030\004 \001(\0102\317\002\n\010Projects\022\221\001" +
      "\n\004List\022).appscode.auth.v1beta1.ProjectLi" +
      "stRequest\032*.appscode.auth.v1beta1.Projec" +
      "tListResponse\"2\202\323\344\223\002&\022$/_appscode/api/au" +
      "th/v1beta1/projects\202\265\030\002\010\001\022\256\001\n\007Members\022/." +
      "appscode.auth.v1beta1.ProjectMemberListR" +
      "equest\0320.appscode.auth.v1beta1.ProjectMe" +
      "mberListResponse\"@\202\323\344\223\0024\0222/_appscode/api" +
      "/auth/v1beta1/projects/{uid}/members\202\265\030\002" +
      "\010\001B8\n\035com.appscode.api.auth.v1beta1B\014Pro",
      "jectProtoP\001Z\007v1beta1b\006proto3"
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
    internal_static_appscode_auth_v1beta1_ProjectListRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_appscode_auth_v1beta1_ProjectListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_auth_v1beta1_ProjectListRequest_descriptor,
        new java.lang.String[] { "WithMember", "Members", });
    internal_static_appscode_auth_v1beta1_ProjectListResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_appscode_auth_v1beta1_ProjectListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_auth_v1beta1_ProjectListResponse_descriptor,
        new java.lang.String[] { "Status", "Projets", });
    internal_static_appscode_auth_v1beta1_ProjectMemberListRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_appscode_auth_v1beta1_ProjectMemberListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_auth_v1beta1_ProjectMemberListRequest_descriptor,
        new java.lang.String[] { "Uid", });
    internal_static_appscode_auth_v1beta1_ProjectMemberListResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_appscode_auth_v1beta1_ProjectMemberListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_auth_v1beta1_ProjectMemberListResponse_descriptor,
        new java.lang.String[] { "Status", "Projet", });
    internal_static_appscode_auth_v1beta1_Project_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_appscode_auth_v1beta1_Project_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_auth_v1beta1_Project_descriptor,
        new java.lang.String[] { "Name", "Phid", "Type", "Status", "ViewPolicy", "EditPolicy", "JoinPolicy", "MembershipLocked", "HasSubprojects", "Members", "CreatedAt", });
    internal_static_appscode_auth_v1beta1_Member_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_appscode_auth_v1beta1_Member_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_auth_v1beta1_Member_descriptor,
        new java.lang.String[] { "Phid", "UserName", "RealName", "IsAdmin", });
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
