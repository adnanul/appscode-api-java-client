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
    internal_static_appscode_ci_v1beta1_AgentGetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_ci_v1beta1_AgentGetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_ci_v1beta1_AgentGetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_ci_v1beta1_AgentGetResponse_fieldAccessorTable;
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
      "\032\037appscode/api/dtypes/types.proto\"?\n\021Age" +
      "ntListResponse\022*\n\006agents\030\001 \003(\0132\032.appscod" +
      "e.ci.v1beta1.Agent\"\036\n\017AgentGetRequest\022\013\n" +
      "\003uid\030\001 \001(\t\"=\n\020AgentGetResponse\022)\n\005agent\030" +
      "\001 \001(\0132\032.appscode.ci.v1beta1.Agent\"\226\001\n\005Ag" +
      "ent\022\014\n\004phid\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\014\n\004role\030" +
      "\003 \001(\t\022\023\n\013external_ip\030\004 \001(\t\022\023\n\013internal_i",
      "p\030\005 \001(\t\022\021\n\tisDeleted\030\006 \001(\010\022\022\n\ncreated_at" +
      "\030\007 \001(\003\022\022\n\nupdated_at\030\010 \001(\003\"\333\001\n\022AgentCrea" +
      "teRequest\022\014\n\004name\030\001 \001(\t\022\014\n\004role\030\002 \001(\t\022\023\n" +
      "\013external_ip\030\003 \001(\t\022\023\n\013internal_ip\030\004 \001(\t\022" +
      "\020\n\010ssh_user\030\005 \001(\t\022\020\n\010ssh_port\030\006 \001(\005\022\031\n\021j" +
      "enkins_jnlp_port\030\007 \001(\005\022\032\n\022git_ssh_public" +
      "_key\030\010 \001(\t\022\023\n\013jenkins_url\030\t \001(\t\022\017\n\007ca_ce" +
      "rt\030\n \001(\t\"\224\002\n\023AgentCreateResponse\022\021\n\tname" +
      "space\030\001 \001(\t\022!\n\031ssh_authorized_public_key" +
      "\030\002 \001(\t\022\024\n\014git_hostname\030\003 \001(\t\022\033\n\023git_host",
      "_public_key\030\004 \001(\t\022F\n\010git_user\030\005 \001(\01324.ap" +
      "pscode.ci.v1beta1.AgentCreateResponse.Co" +
      "nduitUser\032L\n\013ConduitUser\022\014\n\004phid\030\001 \001(\t\022\021" +
      "\n\tuser_name\030\002 \001(\t\022\r\n\005token\030\003 \001(\t\022\r\n\005emai" +
      "l\030\004 \001(\t\"!\n\022AgentDeleteRequest\022\013\n\003uid\030\001 \001" +
      "(\t2\300\004\n\006Agents\022\201\001\n\004List\022\034.appscode.dtypes" +
      ".VoidRequest\032&.appscode.ci.v1beta1.Agent" +
      "ListResponse\"3\202\323\344\223\002\'\022%/_appscode/api/ci/" +
      "v1beta1/agents/json\202\265\030\002\010\001\022\215\001\n\003Get\022$.apps" +
      "code.ci.v1beta1.AgentGetRequest\032%.appsco",
      "de.ci.v1beta1.AgentGetResponse\"9\202\323\344\223\002-\022+" +
      "/_appscode/api/ci/v1beta1/agents/{uid}/j" +
      "son\202\265\030\002\010\001\022\223\001\n\006Create\022\'.appscode.ci.v1bet" +
      "a1.AgentCreateRequest\032(.appscode.ci.v1be" +
      "ta1.AgentCreateResponse\"6\202\323\344\223\002*\"%/_appsc" +
      "ode/api/ci/v1beta1/agents/json:\001*\202\265\030\002\010\001\022" +
      "\213\001\n\006Delete\022\'.appscode.ci.v1beta1.AgentDe" +
      "leteRequest\032\035.appscode.dtypes.VoidRespon" +
      "se\"9\202\323\344\223\002-*+/_appscode/api/ci/v1beta1/ag" +
      "ents/{uid}/json\202\265\030\002\010\001B4\n\033com.appscode.ap",
      "i.ci.v1beta1B\nAgentProtoP\001Z\007v1beta1b\006pro" +
      "to3"
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
        new java.lang.String[] { "Agents", });
    internal_static_appscode_ci_v1beta1_AgentGetRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_appscode_ci_v1beta1_AgentGetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ci_v1beta1_AgentGetRequest_descriptor,
        new java.lang.String[] { "Uid", });
    internal_static_appscode_ci_v1beta1_AgentGetResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_appscode_ci_v1beta1_AgentGetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ci_v1beta1_AgentGetResponse_descriptor,
        new java.lang.String[] { "Agent", });
    internal_static_appscode_ci_v1beta1_Agent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_appscode_ci_v1beta1_Agent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ci_v1beta1_Agent_descriptor,
        new java.lang.String[] { "Phid", "Name", "Role", "ExternalIp", "InternalIp", "IsDeleted", "CreatedAt", "UpdatedAt", });
    internal_static_appscode_ci_v1beta1_AgentCreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_appscode_ci_v1beta1_AgentCreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ci_v1beta1_AgentCreateRequest_descriptor,
        new java.lang.String[] { "Name", "Role", "ExternalIp", "InternalIp", "SshUser", "SshPort", "JenkinsJnlpPort", "GitSshPublicKey", "JenkinsUrl", "CaCert", });
    internal_static_appscode_ci_v1beta1_AgentCreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_appscode_ci_v1beta1_AgentCreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ci_v1beta1_AgentCreateResponse_descriptor,
        new java.lang.String[] { "Namespace", "SshAuthorizedPublicKey", "GitHostname", "GitHostPublicKey", "GitUser", });
    internal_static_appscode_ci_v1beta1_AgentCreateResponse_ConduitUser_descriptor =
      internal_static_appscode_ci_v1beta1_AgentCreateResponse_descriptor.getNestedTypes().get(0);
    internal_static_appscode_ci_v1beta1_AgentCreateResponse_ConduitUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ci_v1beta1_AgentCreateResponse_ConduitUser_descriptor,
        new java.lang.String[] { "Phid", "UserName", "Token", "Email", });
    internal_static_appscode_ci_v1beta1_AgentDeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_appscode_ci_v1beta1_AgentDeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ci_v1beta1_AgentDeleteRequest_descriptor,
        new java.lang.String[] { "Uid", });
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
