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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.3.0)",
    comments = "Source: appscode/api/kubernetes/v1beta1/cluster.proto")
public final class ClustersGrpc {

  private ClustersGrpc() {}

  public static final String SERVICE_NAME = "appscode.kubernetes.v1beta1.Clusters";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClusterListRequest,
      com.appscode.api.kubernetes.v1beta1.ClusterListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clusters", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClusterListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClusterListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClusterDescribeRequest,
      com.appscode.api.kubernetes.v1beta1.ClusterDescribeResponse> METHOD_DESCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clusters", "Describe"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClusterDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClusterDescribeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClusterCreateRequest,
      com.appscode.api.dtypes.LongRunningResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clusters", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClusterCreateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.LongRunningResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_UPDATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clusters", "Update"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClusterReconfigureRequest,
      com.appscode.api.dtypes.LongRunningResponse> METHOD_RECONFIGURE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clusters", "Reconfigure"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClusterReconfigureRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.LongRunningResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest,
      com.appscode.api.dtypes.LongRunningResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clusters", "Delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.LongRunningResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClusterClientConfigRequest,
      com.appscode.api.kubernetes.v1beta1.ClusterClientConfigResponse> METHOD_CLIENT_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clusters", "ClientConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClusterClientConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClusterClientConfigResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClusterStartupConfigRequest,
      com.appscode.api.kubernetes.v1beta1.ClusterStartupConfigResponse> METHOD_STARTUP_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clusters", "StartupConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClusterStartupConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClusterStartupConfigResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ClusterInstanceByIPRequest,
      com.appscode.api.kubernetes.v1beta1.ClusterInstanceByIPResponse> METHOD_INSTANCE_BY_IP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Clusters", "InstanceByIP"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClusterInstanceByIPRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ClusterInstanceByIPResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClustersStub newStub(io.grpc.Channel channel) {
    return new ClustersStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClustersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClustersBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ClustersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClustersFutureStub(channel);
  }

  /**
   */
  public static abstract class ClustersImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(com.appscode.api.kubernetes.v1beta1.ClusterListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ClusterListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.kubernetes.v1beta1.ClusterDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ClusterDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESCRIBE, responseObserver);
    }

    /**
     */
    public void create(com.appscode.api.kubernetes.v1beta1.ClusterCreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.LongRunningResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void update(com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE, responseObserver);
    }

    /**
     */
    public void reconfigure(com.appscode.api.kubernetes.v1beta1.ClusterReconfigureRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.LongRunningResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RECONFIGURE, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.LongRunningResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     */
    public void clientConfig(com.appscode.api.kubernetes.v1beta1.ClusterClientConfigRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ClusterClientConfigResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CLIENT_CONFIG, responseObserver);
    }

    /**
     */
    public void startupConfig(com.appscode.api.kubernetes.v1beta1.ClusterStartupConfigRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ClusterStartupConfigResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_STARTUP_CONFIG, responseObserver);
    }

    /**
     */
    public void instanceByIP(com.appscode.api.kubernetes.v1beta1.ClusterInstanceByIPRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ClusterInstanceByIPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_INSTANCE_BY_IP, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClusterListRequest,
                com.appscode.api.kubernetes.v1beta1.ClusterListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_DESCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClusterDescribeRequest,
                com.appscode.api.kubernetes.v1beta1.ClusterDescribeResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClusterCreateRequest,
                com.appscode.api.dtypes.LongRunningResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            METHOD_RECONFIGURE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClusterReconfigureRequest,
                com.appscode.api.dtypes.LongRunningResponse>(
                  this, METHODID_RECONFIGURE)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest,
                com.appscode.api.dtypes.LongRunningResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_CLIENT_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClusterClientConfigRequest,
                com.appscode.api.kubernetes.v1beta1.ClusterClientConfigResponse>(
                  this, METHODID_CLIENT_CONFIG)))
          .addMethod(
            METHOD_STARTUP_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClusterStartupConfigRequest,
                com.appscode.api.kubernetes.v1beta1.ClusterStartupConfigResponse>(
                  this, METHODID_STARTUP_CONFIG)))
          .addMethod(
            METHOD_INSTANCE_BY_IP,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ClusterInstanceByIPRequest,
                com.appscode.api.kubernetes.v1beta1.ClusterInstanceByIPResponse>(
                  this, METHODID_INSTANCE_BY_IP)))
          .build();
    }
  }

  /**
   */
  public static final class ClustersStub extends io.grpc.stub.AbstractStub<ClustersStub> {
    private ClustersStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClustersStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClustersStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClustersStub(channel, callOptions);
    }

    /**
     */
    public void list(com.appscode.api.kubernetes.v1beta1.ClusterListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ClusterListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.kubernetes.v1beta1.ClusterDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ClusterDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(com.appscode.api.kubernetes.v1beta1.ClusterCreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.LongRunningResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reconfigure(com.appscode.api.kubernetes.v1beta1.ClusterReconfigureRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.LongRunningResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RECONFIGURE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.LongRunningResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clientConfig(com.appscode.api.kubernetes.v1beta1.ClusterClientConfigRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ClusterClientConfigResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CLIENT_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startupConfig(com.appscode.api.kubernetes.v1beta1.ClusterStartupConfigRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ClusterStartupConfigResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_STARTUP_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void instanceByIP(com.appscode.api.kubernetes.v1beta1.ClusterInstanceByIPRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ClusterInstanceByIPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_INSTANCE_BY_IP, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClustersBlockingStub extends io.grpc.stub.AbstractStub<ClustersBlockingStub> {
    private ClustersBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClustersBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClustersBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClustersBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.ClusterListResponse list(com.appscode.api.kubernetes.v1beta1.ClusterListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.ClusterDescribeResponse describe(com.appscode.api.kubernetes.v1beta1.ClusterDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESCRIBE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.LongRunningResponse create(com.appscode.api.kubernetes.v1beta1.ClusterCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse update(com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.LongRunningResponse reconfigure(com.appscode.api.kubernetes.v1beta1.ClusterReconfigureRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RECONFIGURE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.LongRunningResponse delete(com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.ClusterClientConfigResponse clientConfig(com.appscode.api.kubernetes.v1beta1.ClusterClientConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CLIENT_CONFIG, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.ClusterStartupConfigResponse startupConfig(com.appscode.api.kubernetes.v1beta1.ClusterStartupConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_STARTUP_CONFIG, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.ClusterInstanceByIPResponse instanceByIP(com.appscode.api.kubernetes.v1beta1.ClusterInstanceByIPRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_INSTANCE_BY_IP, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClustersFutureStub extends io.grpc.stub.AbstractStub<ClustersFutureStub> {
    private ClustersFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClustersFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClustersFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClustersFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.ClusterListResponse> list(
        com.appscode.api.kubernetes.v1beta1.ClusterListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.ClusterDescribeResponse> describe(
        com.appscode.api.kubernetes.v1beta1.ClusterDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.LongRunningResponse> create(
        com.appscode.api.kubernetes.v1beta1.ClusterCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> update(
        com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.LongRunningResponse> reconfigure(
        com.appscode.api.kubernetes.v1beta1.ClusterReconfigureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RECONFIGURE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.LongRunningResponse> delete(
        com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.ClusterClientConfigResponse> clientConfig(
        com.appscode.api.kubernetes.v1beta1.ClusterClientConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CLIENT_CONFIG, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.ClusterStartupConfigResponse> startupConfig(
        com.appscode.api.kubernetes.v1beta1.ClusterStartupConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_STARTUP_CONFIG, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.ClusterInstanceByIPResponse> instanceByIP(
        com.appscode.api.kubernetes.v1beta1.ClusterInstanceByIPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_INSTANCE_BY_IP, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_DESCRIBE = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_RECONFIGURE = 4;
  private static final int METHODID_DELETE = 5;
  private static final int METHODID_CLIENT_CONFIG = 6;
  private static final int METHODID_STARTUP_CONFIG = 7;
  private static final int METHODID_INSTANCE_BY_IP = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClustersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClustersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.appscode.api.kubernetes.v1beta1.ClusterListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ClusterListResponse>) responseObserver);
          break;
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.appscode.api.kubernetes.v1beta1.ClusterDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ClusterDescribeResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.appscode.api.kubernetes.v1beta1.ClusterCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.LongRunningResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.appscode.api.kubernetes.v1beta1.ClusterUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_RECONFIGURE:
          serviceImpl.reconfigure((com.appscode.api.kubernetes.v1beta1.ClusterReconfigureRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.LongRunningResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.appscode.api.kubernetes.v1beta1.ClusterDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.LongRunningResponse>) responseObserver);
          break;
        case METHODID_CLIENT_CONFIG:
          serviceImpl.clientConfig((com.appscode.api.kubernetes.v1beta1.ClusterClientConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ClusterClientConfigResponse>) responseObserver);
          break;
        case METHODID_STARTUP_CONFIG:
          serviceImpl.startupConfig((com.appscode.api.kubernetes.v1beta1.ClusterStartupConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ClusterStartupConfigResponse>) responseObserver);
          break;
        case METHODID_INSTANCE_BY_IP:
          serviceImpl.instanceByIP((com.appscode.api.kubernetes.v1beta1.ClusterInstanceByIPRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ClusterInstanceByIPResponse>) responseObserver);
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

  private static final class ClustersDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.appscode.api.kubernetes.v1beta1.ClusterProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ClustersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClustersDescriptorSupplier())
              .addMethod(METHOD_LIST)
              .addMethod(METHOD_DESCRIBE)
              .addMethod(METHOD_CREATE)
              .addMethod(METHOD_UPDATE)
              .addMethod(METHOD_RECONFIGURE)
              .addMethod(METHOD_DELETE)
              .addMethod(METHOD_CLIENT_CONFIG)
              .addMethod(METHOD_STARTUP_CONFIG)
              .addMethod(METHOD_INSTANCE_BY_IP)
              .build();
        }
      }
    }
    return result;
  }
}
