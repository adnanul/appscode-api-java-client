// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/ci/v1beta1/agent.proto

package com.appscode.api.ci.v1beta1;

public final class AgentProto {
  private AgentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_ci_v1beta1_AgentListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_ci_v1beta1_AgentListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_ci_v1beta1_Agent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_ci_v1beta1_Agent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_ci_v1beta1_AgentCreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_ci_v1beta1_AgentCreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_ci_v1beta1_AgentCreateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_ci_v1beta1_AgentCreateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_ci_v1beta1_AgentCreateResponse_ConduitUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_ci_v1beta1_AgentCreateResponse_ConduitUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_ci_v1beta1_AgentDeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_ci_v1beta1_AgentDeleteRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#appscode/api/ci/v1beta1/agent.proto\022\023a" +
      "ppscode.ci.v1beta1\032\034google/api/annotatio" +
      "ns.proto\032\036appscode/api/annotations.proto" +
      "\032\037appscode/api/dtypes/types.proto\"h\n\021Age" +
      "ntListResponse\022\'\n\006status\030\001 \001(\0132\027.appscod" +
      "e.dtypes.Status\022*\n\006agents\030\002 \003(\0132\032.appsco" +
      "de.ci.v1beta1.Agent\"\210\001\n\005Agent\022\014\n\004name\030\001 " +
      "\001(\t\022\014\n\004role\030\002 \001(\t\022\023\n\013external_ip\030\003 \001(\t\022\023" +
      "\n\013internal_ip\030\004 \001(\t\022\021\n\tisDeleted\030\005 \001(\010\022\022" +
      "\n\ncreated_at\030\006 \001(\003\022\022\n\nupdated_at\030\007 \001(\003\"\265",
      "\001\n\022AgentCreateRequest\022\014\n\004name\030\001 \001(\t\022\014\n\004r" +
      "ole\030\002 \001(\t\022\023\n\013external_ip\030\003 \001(\t\022\023\n\013intern" +
      "al_ip\030\004 \001(\t\022\020\n\010ssh_user\030\005 \001(\t\022\020\n\010ssh_por" +
      "t\030\006 \001(\005\022\031\n\021jenkins_jnlp_port\030\007 \001(\005\022\032\n\022gi" +
      "t_ssh_public_key\030\010 \001(\t\"\275\002\n\023AgentCreateRe" +
      "sponse\022\'\n\006status\030\001 \001(\0132\027.appscode.dtypes" +
      ".Status\022\021\n\tnamespace\030\002 \001(\t\022!\n\031ssh_author" +
      "ized_public_key\030\003 \001(\t\022\024\n\014git_hostname\030\004 " +
      "\001(\t\022\033\n\023git_host_public_key\030\005 \001(\t\022F\n\010git_" +
      "user\030\006 \001(\01324.appscode.ci.v1beta1.AgentCr",
      "eateResponse.ConduitUser\032L\n\013ConduitUser\022" +
      "\014\n\004phid\030\001 \001(\t\022\021\n\tuser_name\030\002 \001(\t\022\r\n\005toke" +
      "n\030\003 \001(\t\022\r\n\005email\030\004 \001(\t\"\"\n\022AgentDeleteReq" +
      "uest\022\014\n\004name\030\001 \001(\t2\241\003\n\006Agents\022|\n\004List\022\034." +
      "appscode.dtypes.VoidRequest\032&.appscode.c" +
      "i.v1beta1.AgentListResponse\".\202\323\344\223\002\"\022 /_a" +
      "ppscode/api/ci/v1beta1/agents\202\265\030\002\010\001\022\216\001\n\006" +
      "Create\022\'.appscode.ci.v1beta1.AgentCreate" +
      "Request\032(.appscode.ci.v1beta1.AgentCreat" +
      "eResponse\"1\202\323\344\223\002%\" /_appscode/api/ci/v1b",
      "eta1/agents:\001*\202\265\030\002\010\001\022\207\001\n\006Delete\022\'.appsco" +
      "de.ci.v1beta1.AgentDeleteRequest\032\035.appsc" +
      "ode.dtypes.VoidResponse\"5\202\323\344\223\002)*\'/_appsc" +
      "ode/api/ci/v1beta1/agents/{name}\202\265\030\002\010\001B4" +
      "\n\033com.appscode.api.ci.v1beta1B\nAgentProt" +
      "oP\001Z\007v1beta1b\006proto3"
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
    internal_static_appscode_ci_v1beta1_AgentListResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_appscode_ci_v1beta1_AgentListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ci_v1beta1_AgentListResponse_descriptor,
        new java.lang.String[] { "Status", "Agents", });
    internal_static_appscode_ci_v1beta1_Agent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_appscode_ci_v1beta1_Agent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ci_v1beta1_Agent_descriptor,
        new java.lang.String[] { "Name", "Role", "ExternalIp", "InternalIp", "IsDeleted", "CreatedAt", "UpdatedAt", });
    internal_static_appscode_ci_v1beta1_AgentCreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_appscode_ci_v1beta1_AgentCreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ci_v1beta1_AgentCreateRequest_descriptor,
        new java.lang.String[] { "Name", "Role", "ExternalIp", "InternalIp", "SshUser", "SshPort", "JenkinsJnlpPort", "GitSshPublicKey", });
    internal_static_appscode_ci_v1beta1_AgentCreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_appscode_ci_v1beta1_AgentCreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ci_v1beta1_AgentCreateResponse_descriptor,
        new java.lang.String[] { "Status", "Namespace", "SshAuthorizedPublicKey", "GitHostname", "GitHostPublicKey", "GitUser", });
    internal_static_appscode_ci_v1beta1_AgentCreateResponse_ConduitUser_descriptor =
      internal_static_appscode_ci_v1beta1_AgentCreateResponse_descriptor.getNestedTypes().get(0);
    internal_static_appscode_ci_v1beta1_AgentCreateResponse_ConduitUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ci_v1beta1_AgentCreateResponse_ConduitUser_descriptor,
        new java.lang.String[] { "Phid", "UserName", "Token", "Email", });
    internal_static_appscode_ci_v1beta1_AgentDeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_appscode_ci_v1beta1_AgentDeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ci_v1beta1_AgentDeleteRequest_descriptor,
        new java.lang.String[] { "Name", });
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
