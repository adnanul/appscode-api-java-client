// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/certificate/v1beta1/certificate.proto

package com.appscode.api.certificate.v1beta1;

public final class CertificateProto {
  private CertificateProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_certificate_v1beta1_CertificateListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_certificate_v1beta1_CertificateListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_certificate_v1beta1_CertificateListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_certificate_v1beta1_CertificateListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_certificate_v1beta1_CertificateDescribeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_certificate_v1beta1_CertificateDescribeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_certificate_v1beta1_CertificateDescribeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_certificate_v1beta1_CertificateDescribeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_certificate_v1beta1_Certificate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_certificate_v1beta1_Certificate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_certificate_v1beta1_CertificateLoadRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_certificate_v1beta1_CertificateLoadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_certificate_v1beta1_CertificateDeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_certificate_v1beta1_CertificateDeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_certificate_v1beta1_CertificateDeployRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_certificate_v1beta1_CertificateDeployRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2appscode/api/certificate/v1beta1/certi" +
      "ficate.proto\022\034appscode.certificate.v1bet" +
      "a1\032\034google/api/annotations.proto\032\036appsco" +
      "de/api/annotations.proto\032\037appscode/api/d" +
      "types/types.proto\"\030\n\026CertificateListRequ" +
      "est\"Z\n\027CertificateListResponse\022?\n\014certif" +
      "icates\030\001 \003(\0132).appscode.certificate.v1be" +
      "ta1.Certificate\")\n\032CertificateDescribeRe" +
      "quest\022\013\n\003uid\030\001 \001(\t\"]\n\033CertificateDescrib" +
      "eResponse\022>\n\013certificate\030\001 \001(\0132).appscod",
      "e.certificate.v1beta1.Certificate\"\313\001\n\013Ce" +
      "rtificate\022\014\n\004phid\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\023\n" +
      "\013common_name\030\003 \001(\t\022\021\n\tissued_by\030\004 \001(\t\022\022\n" +
      "\nvalid_from\030\005 \001(\003\022\023\n\013expire_date\030\006 \001(\003\022\014" +
      "\n\004sans\030\007 \003(\t\022\014\n\004cert\030\010 \001(\t\022\013\n\003key\030\t \001(\t\022" +
      "\017\n\007version\030\n \001(\005\022\025\n\rserial_number\030\013 \001(\t\"" +
      "K\n\026CertificateLoadRequest\022\014\n\004name\030\001 \001(\t\022" +
      "\021\n\tcert_data\030\002 \001(\t\022\020\n\010key_data\030\003 \001(\t\"\'\n\030" +
      "CertificateDeleteRequest\022\013\n\003uid\030\001 \001(\t\"e\n" +
      "\030CertificateDeployRequest\022\013\n\003uid\030\001 \001(\t\022\023",
      "\n\013secret_name\030\002 \001(\t\022\024\n\014cluster_name\030\003 \001(" +
      "\t\022\021\n\tnamespace\030\004 \001(\t2\271\007\n\014Certificates\022\267\001" +
      "\n\004List\0224.appscode.certificate.v1beta1.Ce" +
      "rtificateListRequest\0325.appscode.certific" +
      "ate.v1beta1.CertificateListResponse\"B\202\323\344" +
      "\223\0026\0224/_appscode/api/certificate/v1beta1/" +
      "certificates/json\202\265\030\002\010\001\022\311\001\n\010Describe\0228.a" +
      "ppscode.certificate.v1beta1.CertificateD" +
      "escribeRequest\0329.appscode.certificate.v1" +
      "beta1.CertificateDescribeResponse\"H\202\323\344\223\002",
      "<\022:/_appscode/api/certificate/v1beta1/ce" +
      "rtificates/{uid}/json\202\265\030\002\010\001\022\270\001\n\004Load\0224.a" +
      "ppscode.certificate.v1beta1.CertificateL" +
      "oadRequest\032\035.appscode.dtypes.VoidRespons" +
      "e\"[\202\323\344\223\002O\032J/_appscode/api/certificate/v1" +
      "beta1/certificates/{name}/actions/obtain" +
      "/json:\001*\202\265\030\002\010\001\022\251\001\n\006Delete\0226.appscode.cer" +
      "tificate.v1beta1.CertificateDeleteReques" +
      "t\032\035.appscode.dtypes.VoidResponse\"H\202\323\344\223\002<" +
      "*:/_appscode/api/certificate/v1beta1/cer",
      "tificates/{uid}/json\202\265\030\002\010\001\022\273\001\n\006Deploy\0226." +
      "appscode.certificate.v1beta1.Certificate" +
      "DeployRequest\032\035.appscode.dtypes.VoidResp" +
      "onse\"Z\202\323\344\223\002N\032I/_appscode/api/certificate" +
      "/v1beta1/certificates/{uid}/actions/depl" +
      "oy/json:\001*\202\265\030\002\010\001BC\n$com.appscode.api.cer" +
      "tificate.v1beta1B\020CertificateProtoP\001Z\007v1" +
      "beta1b\006proto3"
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
    internal_static_appscode_certificate_v1beta1_CertificateListRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_appscode_certificate_v1beta1_CertificateListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_certificate_v1beta1_CertificateListRequest_descriptor,
        new java.lang.String[] { });
    internal_static_appscode_certificate_v1beta1_CertificateListResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_appscode_certificate_v1beta1_CertificateListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_certificate_v1beta1_CertificateListResponse_descriptor,
        new java.lang.String[] { "Certificates", });
    internal_static_appscode_certificate_v1beta1_CertificateDescribeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_appscode_certificate_v1beta1_CertificateDescribeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_certificate_v1beta1_CertificateDescribeRequest_descriptor,
        new java.lang.String[] { "Uid", });
    internal_static_appscode_certificate_v1beta1_CertificateDescribeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_appscode_certificate_v1beta1_CertificateDescribeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_certificate_v1beta1_CertificateDescribeResponse_descriptor,
        new java.lang.String[] { "Certificate", });
    internal_static_appscode_certificate_v1beta1_Certificate_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_appscode_certificate_v1beta1_Certificate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_certificate_v1beta1_Certificate_descriptor,
        new java.lang.String[] { "Phid", "Name", "CommonName", "IssuedBy", "ValidFrom", "ExpireDate", "Sans", "Cert", "Key", "Version", "SerialNumber", });
    internal_static_appscode_certificate_v1beta1_CertificateLoadRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_appscode_certificate_v1beta1_CertificateLoadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_certificate_v1beta1_CertificateLoadRequest_descriptor,
        new java.lang.String[] { "Name", "CertData", "KeyData", });
    internal_static_appscode_certificate_v1beta1_CertificateDeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_appscode_certificate_v1beta1_CertificateDeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_certificate_v1beta1_CertificateDeleteRequest_descriptor,
        new java.lang.String[] { "Uid", });
    internal_static_appscode_certificate_v1beta1_CertificateDeployRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_appscode_certificate_v1beta1_CertificateDeployRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_certificate_v1beta1_CertificateDeployRequest_descriptor,
        new java.lang.String[] { "Uid", "SecretName", "ClusterName", "Namespace", });
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
