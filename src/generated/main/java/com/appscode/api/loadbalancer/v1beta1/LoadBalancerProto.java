// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/loadbalancer.proto

package com.appscode.api.loadbalancer.v1beta1;

public final class LoadBalancerProto {
  private LoadBalancerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_ListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_ListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_ListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_ListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_DescribeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_DescribeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_DescribeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_DescribeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_CreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_CreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_UpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_UpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_DeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_DeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_LoadBalancer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_LoadBalancer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_LoadBalancer_OptionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_LoadBalancer_OptionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_Spec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_Spec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_Status_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_LoadBalancerStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_LoadBalancerStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_LoadBalancerBackend_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_LoadBalancerBackend_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_LoadBalancerRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_LoadBalancerRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_HTTPLoadBalancerRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_HTTPLoadBalancerRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appscode_kubernetes_v1beta1_TCPLoadBalancerRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appscode_kubernetes_v1beta1_TCPLoadBalancerRule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2appscode/api/kubernetes/v1beta1/loadba" +
      "lancer.proto\022\033appscode.kubernetes.v1beta" +
      "1\032\034google/api/annotations.proto\032\036appscod" +
      "e/api/annotations.proto\032\037appscode/api/dt" +
      "ypes/types.proto\"\036\n\013ListRequest\022\017\n\007clust" +
      "er\030\001 \001(\t\"z\n\014ListResponse\022\'\n\006status\030\001 \001(\013" +
      "2\027.appscode.dtypes.Status\022A\n\016load_balanc" +
      "ers\030\002 \003(\0132).appscode.kubernetes.v1beta1." +
      "LoadBalancer\"Q\n\017DescribeRequest\022\014\n\004kind\030" +
      "\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\021\n\tnamespace\030\003 \001(\t\022\017",
      "\n\007cluster\030\004 \001(\t\"}\n\020DescribeResponse\022\'\n\006s" +
      "tatus\030\001 \001(\0132\027.appscode.dtypes.Status\022@\n\r" +
      "load_balancer\030\002 \001(\0132).appscode.kubernete" +
      "s.v1beta1.LoadBalancer\"\203\001\n\rCreateRequest" +
      "\022\014\n\004name\030\001 \001(\t\022\021\n\tnamespace\030\002 \001(\t\022\017\n\007clu" +
      "ster\030\003 \001(\t\022@\n\rload_balancer\030\004 \001(\0132).apps" +
      "code.kubernetes.v1beta1.LoadBalancer\"p\n\r" +
      "UpdateRequest\022\014\n\004name\030\001 \001(\t\022\017\n\007cluster\030\002" +
      " \001(\t\022@\n\rload_balancer\030\003 \001(\0132).appscode.k" +
      "ubernetes.v1beta1.LoadBalancer\"O\n\rDelete",
      "Request\022\014\n\004kind\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\021\n\tn" +
      "amespace\030\003 \001(\t\022\017\n\007cluster\030\004 \001(\t\"\306\002\n\014Load" +
      "Balancer\022\014\n\004kind\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\021\n\t" +
      "namespace\030\003 \001(\t\022\032\n\022creation_timestamp\030\004 " +
      "\001(\003\022G\n\007options\030\005 \003(\01326.appscode.kubernet" +
      "es.v1beta1.LoadBalancer.OptionsEntry\022/\n\004" +
      "spec\030\006 \001(\0132!.appscode.kubernetes.v1beta1" +
      ".Spec\0223\n\006status\030\007 \001(\0132#.appscode.kuberne" +
      "tes.v1beta1.Status\022\014\n\004json\030\010 \001(\t\032.\n\014Opti" +
      "onsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001",
      "\"\210\001\n\004Spec\022B\n\007backend\030\001 \001(\01321.appscode.ku" +
      "bernetes.v1beta1.HTTPLoadBalancerRule\022<\n" +
      "\005rules\030\002 \003(\0132-.appscode.kubernetes.v1bet" +
      "a1.LoadBalancerRule\"I\n\006Status\022?\n\006status\030" +
      "\001 \003(\0132/.appscode.kubernetes.v1beta1.Load" +
      "BalancerStatus\".\n\022LoadBalancerStatus\022\n\n\002" +
      "IP\030\001 \001(\t\022\014\n\004host\030\002 \001(\t\"A\n\023LoadBalancerBa" +
      "ckend\022\024\n\014service_name\030\001 \001(\t\022\024\n\014service_p" +
      "ort\030\002 \001(\t\"\271\001\n\020LoadBalancerRule\022\014\n\004host\030\001" +
      " \001(\t\022\027\n\017SSL_secret_name\030\005 \001(\t\022?\n\004http\030\002 ",
      "\003(\01321.appscode.kubernetes.v1beta1.HTTPLo" +
      "adBalancerRule\022=\n\003tcp\030\003 \003(\01320.appscode.k" +
      "ubernetes.v1beta1.TCPLoadBalancerRule\"\224\001" +
      "\n\024HTTPLoadBalancerRule\022\014\n\004path\030\001 \001(\t\022A\n\007" +
      "backend\030\002 \001(\01320.appscode.kubernetes.v1be" +
      "ta1.LoadBalancerBackend\022\024\n\014header_rules\030" +
      "\003 \003(\t\022\025\n\rrewrite_rules\030\004 \003(\t\"\230\001\n\023TCPLoad" +
      "BalancerRule\022\014\n\004port\030\001 \001(\t\022A\n\007backend\030\002 " +
      "\001(\01320.appscode.kubernetes.v1beta1.LoadBa" +
      "lancerBackend\022\027\n\017SSL_secret_name\030\003 \001(\t\022\027",
      "\n\017secret_pem_name\030\004 \001(\t2\247\007\n\rLoadBalancer" +
      "s\022\262\001\n\004List\022(.appscode.kubernetes.v1beta1" +
      ".ListRequest\032).appscode.kubernetes.v1bet" +
      "a1.ListResponse\"U\202\323\344\223\002I\022G/_appscode/api/" +
      "kubernetes/v1beta1/clusters/{cluster}/lo" +
      "adbalancers/json\202\265\030\002\010\001\022\305\001\n\010Describe\022,.ap" +
      "pscode.kubernetes.v1beta1.DescribeReques" +
      "t\032-.appscode.kubernetes.v1beta1.Describe" +
      "Response\"\\\202\323\344\223\002P\022N/_appscode/api/kuberne" +
      "tes/v1beta1/clusters/{cluster}/loadbalan",
      "cers/{name}/json\202\265\030\002\010\001\022\255\001\n\006Create\022*.apps" +
      "code.kubernetes.v1beta1.CreateRequest\032\035." +
      "appscode.dtypes.VoidResponse\"X\202\323\344\223\002L\"G/_" +
      "appscode/api/kubernetes/v1beta1/clusters" +
      "/{cluster}/loadbalancers/json:\001*\202\265\030\002\010\001\022\264" +
      "\001\n\006Update\022*.appscode.kubernetes.v1beta1." +
      "UpdateRequest\032\035.appscode.dtypes.VoidResp" +
      "onse\"_\202\323\344\223\002S\032N/_appscode/api/kubernetes/" +
      "v1beta1/clusters/{cluster}/loadbalancers" +
      "/{name}/json:\001*\202\265\030\002\010\001\022\261\001\n\006Delete\022*.appsc",
      "ode.kubernetes.v1beta1.DeleteRequest\032\035.a" +
      "ppscode.dtypes.VoidResponse\"\\\202\323\344\223\002P*N/_a" +
      "ppscode/api/kubernetes/v1beta1/clusters/" +
      "{cluster}/loadbalancers/{name}/json\202\265\030\002\010" +
      "\001BE\n%com.appscode.api.loadbalancer.v1bet" +
      "a1B\021LoadBalancerProtoP\001Z\007v1beta1b\006proto3"
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
    internal_static_appscode_kubernetes_v1beta1_ListRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_appscode_kubernetes_v1beta1_ListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_ListRequest_descriptor,
        new java.lang.String[] { "Cluster", });
    internal_static_appscode_kubernetes_v1beta1_ListResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_appscode_kubernetes_v1beta1_ListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_ListResponse_descriptor,
        new java.lang.String[] { "Status", "LoadBalancers", });
    internal_static_appscode_kubernetes_v1beta1_DescribeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_appscode_kubernetes_v1beta1_DescribeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_DescribeRequest_descriptor,
        new java.lang.String[] { "Kind", "Name", "Namespace", "Cluster", });
    internal_static_appscode_kubernetes_v1beta1_DescribeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_appscode_kubernetes_v1beta1_DescribeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_DescribeResponse_descriptor,
        new java.lang.String[] { "Status", "LoadBalancer", });
    internal_static_appscode_kubernetes_v1beta1_CreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_appscode_kubernetes_v1beta1_CreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_CreateRequest_descriptor,
        new java.lang.String[] { "Name", "Namespace", "Cluster", "LoadBalancer", });
    internal_static_appscode_kubernetes_v1beta1_UpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_appscode_kubernetes_v1beta1_UpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_UpdateRequest_descriptor,
        new java.lang.String[] { "Name", "Cluster", "LoadBalancer", });
    internal_static_appscode_kubernetes_v1beta1_DeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_appscode_kubernetes_v1beta1_DeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_DeleteRequest_descriptor,
        new java.lang.String[] { "Kind", "Name", "Namespace", "Cluster", });
    internal_static_appscode_kubernetes_v1beta1_LoadBalancer_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_appscode_kubernetes_v1beta1_LoadBalancer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_LoadBalancer_descriptor,
        new java.lang.String[] { "Kind", "Name", "Namespace", "CreationTimestamp", "Options", "Spec", "Status", "Json", });
    internal_static_appscode_kubernetes_v1beta1_LoadBalancer_OptionsEntry_descriptor =
      internal_static_appscode_kubernetes_v1beta1_LoadBalancer_descriptor.getNestedTypes().get(0);
    internal_static_appscode_kubernetes_v1beta1_LoadBalancer_OptionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_LoadBalancer_OptionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_appscode_kubernetes_v1beta1_Spec_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_appscode_kubernetes_v1beta1_Spec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_Spec_descriptor,
        new java.lang.String[] { "Backend", "Rules", });
    internal_static_appscode_kubernetes_v1beta1_Status_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_appscode_kubernetes_v1beta1_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_Status_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_appscode_kubernetes_v1beta1_LoadBalancerStatus_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_appscode_kubernetes_v1beta1_LoadBalancerStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_LoadBalancerStatus_descriptor,
        new java.lang.String[] { "IP", "Host", });
    internal_static_appscode_kubernetes_v1beta1_LoadBalancerBackend_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_appscode_kubernetes_v1beta1_LoadBalancerBackend_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_LoadBalancerBackend_descriptor,
        new java.lang.String[] { "ServiceName", "ServicePort", });
    internal_static_appscode_kubernetes_v1beta1_LoadBalancerRule_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_appscode_kubernetes_v1beta1_LoadBalancerRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_LoadBalancerRule_descriptor,
        new java.lang.String[] { "Host", "SSLSecretName", "Http", "Tcp", });
    internal_static_appscode_kubernetes_v1beta1_HTTPLoadBalancerRule_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_appscode_kubernetes_v1beta1_HTTPLoadBalancerRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_HTTPLoadBalancerRule_descriptor,
        new java.lang.String[] { "Path", "Backend", "HeaderRules", "RewriteRules", });
    internal_static_appscode_kubernetes_v1beta1_TCPLoadBalancerRule_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_appscode_kubernetes_v1beta1_TCPLoadBalancerRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appscode_kubernetes_v1beta1_TCPLoadBalancerRule_descriptor,
        new java.lang.String[] { "Port", "Backend", "SSLSecretName", "SecretPemName", });
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
