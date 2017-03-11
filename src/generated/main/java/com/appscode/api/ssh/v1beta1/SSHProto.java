// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/ssh/v1beta1/ssh.proto

package com.appscode.api.ssh.v1beta1;

public final class SSHProto {
  private SSHProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_ssh_v1beta1_SSHGetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_ssh_v1beta1_SSHGetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_ssh_v1beta1_SSHGetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_ssh_v1beta1_SSHGetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_ssh_v1beta1_SSHKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_ssh_v1beta1_SSHKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"appscode/api/ssh/v1beta1/ssh.proto\022\024ap" +
      "pscode.ssh.v1beta1\032\034google/api/annotatio" +
      "ns.proto\032\037appscode/api/dtypes/types.prot" +
      "o\"O\n\rSSHGetRequest\022\021\n\tnamespace\030\001 \001(\t\022\024\n" +
      "\014cluster_name\030\002 \001(\t\022\025\n\rinstance_name\030\003 \001" +
      "(\t\"\265\001\n\016SSHGetResponse\022\'\n\006status\030\001 \001(\0132\027." +
      "appscode.dtypes.Status\022-\n\007ssh_key\030\002 \001(\0132" +
      "\034.appscode.ssh.v1beta1.SSHKey\022\025\n\rinstanc" +
      "e_addr\030\003 \001(\t\022\025\n\rinstance_port\030\004 \001(\005\022\014\n\004u" +
      "ser\030\005 \001(\t\022\017\n\007command\030\006 \001(\t\"g\n\006SSHKey\022\022\n\n",
      "public_key\030\001 \001(\014\022\023\n\013private_key\030\002 \001(\014\022\027\n" +
      "\017aws_fingerprint\030\003 \001(\t\022\033\n\023openssh_finger" +
      "print\030\004 \001(\t2\204\001\n\003SSH\022}\n\003Get\022#.appscode.ss" +
      "h.v1beta1.SSHGetRequest\032$.appscode.ssh.v" +
      "1beta1.SSHGetResponse\"+\202\323\344\223\002%\022#/_appscod" +
      "e/api/ssh/v1beta1/ssh/jsonB3\n\034com.appsco" +
      "de.api.ssh.v1beta1B\010SSHProtoP\001Z\007v1beta1b" +
      "\006proto3"
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
          com.appscode.api.dtypes.TypeProto.getDescriptor(),
        }, assigner);
    internal_static_appscode_ssh_v1beta1_SSHGetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_appscode_ssh_v1beta1_SSHGetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ssh_v1beta1_SSHGetRequest_descriptor,
        new java.lang.String[] { "Namespace", "ClusterName", "InstanceName", });
    internal_static_appscode_ssh_v1beta1_SSHGetResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_appscode_ssh_v1beta1_SSHGetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ssh_v1beta1_SSHGetResponse_descriptor,
        new java.lang.String[] { "Status", "SshKey", "InstanceAddr", "InstancePort", "User", "Command", });
    internal_static_appscode_ssh_v1beta1_SSHKey_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_appscode_ssh_v1beta1_SSHKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_ssh_v1beta1_SSHKey_descriptor,
        new java.lang.String[] { "PublicKey", "PrivateKey", "AwsFingerprint", "OpensshFingerprint", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.appscode.api.dtypes.TypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
