package com.appscode.api.kubernetes.v1beta1;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * All those clients api in v1beta1 are deprecated. will be removed in future version.
 * Use v0.2 apis instead.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: appscode/api/kubernetes/v1beta1/client.proto")
public class ClientsGrpc {

  private ClientsGrpc() {}

  public static final String SERVICE_NAME = "appscode.kubernetes.v1beta1.Clients";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.CopyResourceRequest,
      com.appscode.api.kubernetes.v1beta1.CopyResourceResponse> METHOD_COPY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clients", "Copy"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.CopyResourceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.CopyResourceResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClientRequest,
      com.appscode.api.kubernetes.v1beta1.NodeListResponse> METHOD_NODES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clients", "Nodes"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClientRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.NodeListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClientRequest,
      com.appscode.api.kubernetes.v1beta1.AppListResponse> METHOD_APPS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clients", "Apps"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClientRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.AppListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.AppDescribeRequest,
      com.appscode.api.kubernetes.v1beta1.AppDescribeResponse> METHOD_APP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clients", "App"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.AppDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.AppDescribeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.AppDescribeRequest,
      com.appscode.api.kubernetes.v1beta1.PodListResponse> METHOD_APP_PODS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clients", "AppPods"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.AppDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.PodListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClientRequest,
      com.appscode.api.kubernetes.v1beta1.NamespaceListResponse> METHOD_NAMESPACES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clients", "Namespaces"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClientRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.NamespaceListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClientRequest,
      com.appscode.api.kubernetes.v1beta1.SecretListResponse> METHOD_SECRETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clients", "Secrets"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClientRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.SecretListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.SecretDescribeRequest,
      com.appscode.api.kubernetes.v1beta1.SecretDescribeResponse> METHOD_SECRET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clients", "Secret"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.SecretDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.SecretDescribeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClientRequest,
      com.appscode.api.kubernetes.v1beta1.JobListResponse> METHOD_JOBS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clients", "Jobs"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClientRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.JobListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClientRequest,
      com.appscode.api.kubernetes.v1beta1.PodListResponse> METHOD_PODS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clients", "Pods"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClientRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.PodListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClientRequest,
      com.appscode.api.kubernetes.v1beta1.ServiceListResponse> METHOD_SERVICES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clients", "Services"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClientRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ServiceListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClientRequest,
      com.appscode.api.kubernetes.v1beta1.ReplicationControllerListResponse> METHOD_REPLICATION_CONTROLLERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clients", "ReplicationControllers"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClientRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ReplicationControllerListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClientRequest,
      com.appscode.api.kubernetes.v1beta1.ConfigMapListResponse> METHOD_CONFIG_MAPS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clients", "ConfigMaps"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClientRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ConfigMapListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ConfigMapDescribeRequest,
      com.appscode.api.kubernetes.v1beta1.ConfigMapDescribeResponse> METHOD_CONFIG_MAP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clients", "ConfigMap"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ConfigMapDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ConfigMapDescribeResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientsStub newStub(io.grpc.Channel channel) {
    return new ClientsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClientsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ClientsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClientsFutureStub(channel);
  }

  /**
   * <pre>
   * All those clients api in v1beta1 are deprecated. will be removed in future version.
   * Use v0.2 apis instead.
   * </pre>
   */
  public static abstract class ClientsImplBase implements io.grpc.BindableService {

    /**
     */
    public void copy(com.appscode.api.kubernetes.v1beta1.CopyResourceRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.CopyResourceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COPY, responseObserver);
    }

    /**
     */
    public void nodes(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.NodeListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_NODES, responseObserver);
    }

    /**
     */
    public void apps(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.AppListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_APPS, responseObserver);
    }

    /**
     */
    public void app(com.appscode.api.kubernetes.v1beta1.AppDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.AppDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_APP, responseObserver);
    }

    /**
     */
    public void appPods(com.appscode.api.kubernetes.v1beta1.AppDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.PodListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_APP_PODS, responseObserver);
    }

    /**
     */
    public void namespaces(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.NamespaceListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_NAMESPACES, responseObserver);
    }

    /**
     */
    public void secrets(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.SecretListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SECRETS, responseObserver);
    }

    /**
     */
    public void secret(com.appscode.api.kubernetes.v1beta1.SecretDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.SecretDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SECRET, responseObserver);
    }

    /**
     */
    public void jobs(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.JobListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_JOBS, responseObserver);
    }

    /**
     */
    public void pods(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.PodListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PODS, responseObserver);
    }

    /**
     */
    public void services(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ServiceListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SERVICES, responseObserver);
    }

    /**
     */
    public void replicationControllers(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ReplicationControllerListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REPLICATION_CONTROLLERS, responseObserver);
    }

    /**
     */
    public void configMaps(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ConfigMapListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CONFIG_MAPS, responseObserver);
    }

    /**
     */
    public void configMap(com.appscode.api.kubernetes.v1beta1.ConfigMapDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ConfigMapDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CONFIG_MAP, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_COPY,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.CopyResourceRequest,
                com.appscode.api.kubernetes.v1beta1.CopyResourceResponse>(
                  this, METHODID_COPY)))
          .addMethod(
            METHOD_NODES,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClientRequest,
                com.appscode.api.kubernetes.v1beta1.NodeListResponse>(
                  this, METHODID_NODES)))
          .addMethod(
            METHOD_APPS,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClientRequest,
                com.appscode.api.kubernetes.v1beta1.AppListResponse>(
                  this, METHODID_APPS)))
          .addMethod(
            METHOD_APP,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.AppDescribeRequest,
                com.appscode.api.kubernetes.v1beta1.AppDescribeResponse>(
                  this, METHODID_APP)))
          .addMethod(
            METHOD_APP_PODS,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.AppDescribeRequest,
                com.appscode.api.kubernetes.v1beta1.PodListResponse>(
                  this, METHODID_APP_PODS)))
          .addMethod(
            METHOD_NAMESPACES,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClientRequest,
                com.appscode.api.kubernetes.v1beta1.NamespaceListResponse>(
                  this, METHODID_NAMESPACES)))
          .addMethod(
            METHOD_SECRETS,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClientRequest,
                com.appscode.api.kubernetes.v1beta1.SecretListResponse>(
                  this, METHODID_SECRETS)))
          .addMethod(
            METHOD_SECRET,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.SecretDescribeRequest,
                com.appscode.api.kubernetes.v1beta1.SecretDescribeResponse>(
                  this, METHODID_SECRET)))
          .addMethod(
            METHOD_JOBS,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClientRequest,
                com.appscode.api.kubernetes.v1beta1.JobListResponse>(
                  this, METHODID_JOBS)))
          .addMethod(
            METHOD_PODS,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClientRequest,
                com.appscode.api.kubernetes.v1beta1.PodListResponse>(
                  this, METHODID_PODS)))
          .addMethod(
            METHOD_SERVICES,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClientRequest,
                com.appscode.api.kubernetes.v1beta1.ServiceListResponse>(
                  this, METHODID_SERVICES)))
          .addMethod(
            METHOD_REPLICATION_CONTROLLERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClientRequest,
                com.appscode.api.kubernetes.v1beta1.ReplicationControllerListResponse>(
                  this, METHODID_REPLICATION_CONTROLLERS)))
          .addMethod(
            METHOD_CONFIG_MAPS,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClientRequest,
                com.appscode.api.kubernetes.v1beta1.ConfigMapListResponse>(
                  this, METHODID_CONFIG_MAPS)))
          .addMethod(
            METHOD_CONFIG_MAP,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ConfigMapDescribeRequest,
                com.appscode.api.kubernetes.v1beta1.ConfigMapDescribeResponse>(
                  this, METHODID_CONFIG_MAP)))
          .build();
    }
  }

  /**
   * <pre>
   * All those clients api in v1beta1 are deprecated. will be removed in future version.
   * Use v0.2 apis instead.
   * </pre>
   */
  public static final class ClientsStub extends io.grpc.stub.AbstractStub<ClientsStub> {
    private ClientsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientsStub(channel, callOptions);
    }

    /**
     */
    public void copy(com.appscode.api.kubernetes.v1beta1.CopyResourceRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.CopyResourceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COPY, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nodes(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.NodeListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_NODES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void apps(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.AppListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_APPS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void app(com.appscode.api.kubernetes.v1beta1.AppDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.AppDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_APP, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void appPods(com.appscode.api.kubernetes.v1beta1.AppDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.PodListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_APP_PODS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void namespaces(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.NamespaceListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_NAMESPACES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void secrets(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.SecretListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SECRETS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void secret(com.appscode.api.kubernetes.v1beta1.SecretDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.SecretDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SECRET, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void jobs(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.JobListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_JOBS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pods(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.PodListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PODS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void services(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ServiceListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SERVICES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void replicationControllers(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ReplicationControllerListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REPLICATION_CONTROLLERS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void configMaps(com.appscode.api.kubernetes.v1beta1.ClientRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ConfigMapListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CONFIG_MAPS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void configMap(com.appscode.api.kubernetes.v1beta1.ConfigMapDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ConfigMapDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CONFIG_MAP, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * All those clients api in v1beta1 are deprecated. will be removed in future version.
   * Use v0.2 apis instead.
   * </pre>
   */
  public static final class ClientsBlockingStub extends io.grpc.stub.AbstractStub<ClientsBlockingStub> {
    private ClientsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.CopyResourceResponse copy(com.appscode.api.kubernetes.v1beta1.CopyResourceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COPY, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.NodeListResponse nodes(com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_NODES, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.AppListResponse apps(com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_APPS, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.AppDescribeResponse app(com.appscode.api.kubernetes.v1beta1.AppDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_APP, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.PodListResponse appPods(com.appscode.api.kubernetes.v1beta1.AppDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_APP_PODS, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.NamespaceListResponse namespaces(com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_NAMESPACES, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.SecretListResponse secrets(com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SECRETS, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.SecretDescribeResponse secret(com.appscode.api.kubernetes.v1beta1.SecretDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SECRET, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.JobListResponse jobs(com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_JOBS, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.PodListResponse pods(com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PODS, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.ServiceListResponse services(com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SERVICES, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.ReplicationControllerListResponse replicationControllers(com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REPLICATION_CONTROLLERS, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.ConfigMapListResponse configMaps(com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CONFIG_MAPS, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.ConfigMapDescribeResponse configMap(com.appscode.api.kubernetes.v1beta1.ConfigMapDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CONFIG_MAP, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * All those clients api in v1beta1 are deprecated. will be removed in future version.
   * Use v0.2 apis instead.
   * </pre>
   */
  public static final class ClientsFutureStub extends io.grpc.stub.AbstractStub<ClientsFutureStub> {
    private ClientsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.CopyResourceResponse> copy(
        com.appscode.api.kubernetes.v1beta1.CopyResourceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COPY, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.NodeListResponse> nodes(
        com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NODES, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.AppListResponse> apps(
        com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_APPS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.AppDescribeResponse> app(
        com.appscode.api.kubernetes.v1beta1.AppDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_APP, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.PodListResponse> appPods(
        com.appscode.api.kubernetes.v1beta1.AppDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_APP_PODS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.NamespaceListResponse> namespaces(
        com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NAMESPACES, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.SecretListResponse> secrets(
        com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SECRETS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.SecretDescribeResponse> secret(
        com.appscode.api.kubernetes.v1beta1.SecretDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SECRET, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.JobListResponse> jobs(
        com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_JOBS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.PodListResponse> pods(
        com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PODS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.ServiceListResponse> services(
        com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SERVICES, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.ReplicationControllerListResponse> replicationControllers(
        com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REPLICATION_CONTROLLERS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.ConfigMapListResponse> configMaps(
        com.appscode.api.kubernetes.v1beta1.ClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CONFIG_MAPS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.ConfigMapDescribeResponse> configMap(
        com.appscode.api.kubernetes.v1beta1.ConfigMapDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CONFIG_MAP, getCallOptions()), request);
    }
  }

  private static final int METHODID_COPY = 0;
  private static final int METHODID_NODES = 1;
  private static final int METHODID_APPS = 2;
  private static final int METHODID_APP = 3;
  private static final int METHODID_APP_PODS = 4;
  private static final int METHODID_NAMESPACES = 5;
  private static final int METHODID_SECRETS = 6;
  private static final int METHODID_SECRET = 7;
  private static final int METHODID_JOBS = 8;
  private static final int METHODID_PODS = 9;
  private static final int METHODID_SERVICES = 10;
  private static final int METHODID_REPLICATION_CONTROLLERS = 11;
  private static final int METHODID_CONFIG_MAPS = 12;
  private static final int METHODID_CONFIG_MAP = 13;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClientsImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ClientsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COPY:
          serviceImpl.copy((com.appscode.api.kubernetes.v1beta1.CopyResourceRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.CopyResourceResponse>) responseObserver);
          break;
        case METHODID_NODES:
          serviceImpl.nodes((com.appscode.api.kubernetes.v1beta1.ClientRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.NodeListResponse>) responseObserver);
          break;
        case METHODID_APPS:
          serviceImpl.apps((com.appscode.api.kubernetes.v1beta1.ClientRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.AppListResponse>) responseObserver);
          break;
        case METHODID_APP:
          serviceImpl.app((com.appscode.api.kubernetes.v1beta1.AppDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.AppDescribeResponse>) responseObserver);
          break;
        case METHODID_APP_PODS:
          serviceImpl.appPods((com.appscode.api.kubernetes.v1beta1.AppDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.PodListResponse>) responseObserver);
          break;
        case METHODID_NAMESPACES:
          serviceImpl.namespaces((com.appscode.api.kubernetes.v1beta1.ClientRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.NamespaceListResponse>) responseObserver);
          break;
        case METHODID_SECRETS:
          serviceImpl.secrets((com.appscode.api.kubernetes.v1beta1.ClientRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.SecretListResponse>) responseObserver);
          break;
        case METHODID_SECRET:
          serviceImpl.secret((com.appscode.api.kubernetes.v1beta1.SecretDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.SecretDescribeResponse>) responseObserver);
          break;
        case METHODID_JOBS:
          serviceImpl.jobs((com.appscode.api.kubernetes.v1beta1.ClientRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.JobListResponse>) responseObserver);
          break;
        case METHODID_PODS:
          serviceImpl.pods((com.appscode.api.kubernetes.v1beta1.ClientRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.PodListResponse>) responseObserver);
          break;
        case METHODID_SERVICES:
          serviceImpl.services((com.appscode.api.kubernetes.v1beta1.ClientRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ServiceListResponse>) responseObserver);
          break;
        case METHODID_REPLICATION_CONTROLLERS:
          serviceImpl.replicationControllers((com.appscode.api.kubernetes.v1beta1.ClientRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ReplicationControllerListResponse>) responseObserver);
          break;
        case METHODID_CONFIG_MAPS:
          serviceImpl.configMaps((com.appscode.api.kubernetes.v1beta1.ClientRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ConfigMapListResponse>) responseObserver);
          break;
        case METHODID_CONFIG_MAP:
          serviceImpl.configMap((com.appscode.api.kubernetes.v1beta1.ConfigMapDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ConfigMapDescribeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_COPY,
        METHOD_NODES,
        METHOD_APPS,
        METHOD_APP,
        METHOD_APP_PODS,
        METHOD_NAMESPACES,
        METHOD_SECRETS,
        METHOD_SECRET,
        METHOD_JOBS,
        METHOD_PODS,
        METHOD_SERVICES,
        METHOD_REPLICATION_CONTROLLERS,
        METHOD_CONFIG_MAPS,
        METHOD_CONFIG_MAP);
  }

}
