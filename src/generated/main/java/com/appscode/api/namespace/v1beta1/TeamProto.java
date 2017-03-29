// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/namespace/v1beta1/team.proto

package com.appscode.api.namespace.v1beta1;

public final class TeamProto {
  private TeamProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_namespace_v1beta1_CreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_namespace_v1beta1_CreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_namespace_v1beta1_CreateRequest_OptionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_namespace_v1beta1_CreateRequest_OptionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_namespace_v1beta1_CreateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_namespace_v1beta1_CreateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_namespace_v1beta1_GetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_namespace_v1beta1_GetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_namespace_v1beta1_GetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_namespace_v1beta1_GetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_namespace_v1beta1_IsAvailableRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_namespace_v1beta1_IsAvailableRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)appscode/api/namespace/v1beta1/team.pr" +
      "oto\022\032appscode.namespace.v1beta1\032\034google/" +
      "api/annotations.proto\032\036appscode/api/anno" +
      "tations.proto\032\037appscode/api/dtypes/types" +
      ".proto\"\303\002\n\rCreateRequest\022\014\n\004name\030\001 \001(\t\022\024" +
      "\n\014display_name\030\002 \001(\t\022\r\n\005email\030\003 \001(\t\022\021\n\tu" +
      "ser_name\030\004 \001(\t\022\020\n\010password\030\005 \001(\t\022\025\n\rinvi" +
      "te_emails\030\006 \003(\t\022\031\n\021subscription_type\030\007 \001" +
      "(\t\022\021\n\tclient_ip\030\010 \001(\t\022\034\n\024payment_method_" +
      "nonce\030\t \001(\t\022G\n\007options\030\n \003(\01326.appscode.",
      "namespace.v1beta1.CreateRequest.OptionsE" +
      "ntry\032.\n\014OptionsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005val" +
      "ue\030\002 \001(\t:\0028\001\"9\n\016CreateResponse\022\'\n\006status" +
      "\030\001 \001(\0132\027.appscode.dtypes.Status\"\032\n\nGetRe" +
      "quest\022\014\n\004name\030\001 \001(\t\"D\n\013GetResponse\022\'\n\006st" +
      "atus\030\001 \001(\0132\027.appscode.dtypes.Status\022\014\n\004p" +
      "hid\030\002 \001(\t\"\"\n\022IsAvailableRequest\022\014\n\004name\030" +
      "\001 \001(\t2\360\003\n\005Teams\022\235\001\n\006Create\022).appscode.na" +
      "mespace.v1beta1.CreateRequest\032*.appscode" +
      ".namespace.v1beta1.CreateResponse\"<\202\323\344\223\002",
      "0\"+/_appscode/api/namespace/v1beta1/team" +
      "s/json:\001*\202\265\030\002\010\001\022\230\001\n\003Get\022&.appscode.names" +
      "pace.v1beta1.GetRequest\032\'.appscode.names" +
      "pace.v1beta1.GetResponse\"@\202\323\344\223\0024\0222/_apps" +
      "code/api/namespace/v1beta1/teams/{name}/" +
      "json\202\265\030\002\010\001\022\253\001\n\013IsAvailable\022..appscode.na" +
      "mespace.v1beta1.IsAvailableRequest\032\035.app" +
      "scode.dtypes.VoidResponse\"M\202\323\344\223\002A\022?/_app" +
      "scode/api/namespace/v1beta1/teams/{name}" +
      "/is-available/json\202\265\030\002\010\001B:\n\"com.appscode",
      ".api.namespace.v1beta1B\tTeamProtoP\001Z\007v1b" +
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
    internal_static_appscode_namespace_v1beta1_CreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_appscode_namespace_v1beta1_CreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_namespace_v1beta1_CreateRequest_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Email", "UserName", "Password", "InviteEmails", "SubscriptionType", "ClientIp", "PaymentMethodNonce", "Options", });
    internal_static_appscode_namespace_v1beta1_CreateRequest_OptionsEntry_descriptor =
      internal_static_appscode_namespace_v1beta1_CreateRequest_descriptor.getNestedTypes().get(0);
    internal_static_appscode_namespace_v1beta1_CreateRequest_OptionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_namespace_v1beta1_CreateRequest_OptionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_appscode_namespace_v1beta1_CreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_appscode_namespace_v1beta1_CreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_namespace_v1beta1_CreateResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_appscode_namespace_v1beta1_GetRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_appscode_namespace_v1beta1_GetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_namespace_v1beta1_GetRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_appscode_namespace_v1beta1_GetResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_appscode_namespace_v1beta1_GetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_namespace_v1beta1_GetResponse_descriptor,
        new java.lang.String[] { "Status", "Phid", });
    internal_static_appscode_namespace_v1beta1_IsAvailableRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_appscode_namespace_v1beta1_IsAvailableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_namespace_v1beta1_IsAvailableRequest_descriptor,
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
