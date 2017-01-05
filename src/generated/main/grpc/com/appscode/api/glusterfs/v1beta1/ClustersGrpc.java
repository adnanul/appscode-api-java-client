package com.appscode.api.glusterfs.v1beta1;

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
    value = "by gRPC proto compiler (version 1.0.2)",
    comments = "Source: appscode/api/glusterfs/v1beta1/cluster.proto")
public class ClustersGrpc {

  private ClustersGrpc() {}

  public static final String SERVICE_NAME = "appscode.glusterfs.v1beta1.Clusters";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.glusterfs.v1beta1.ClusterListRequest,
      com.appscode.api.glusterfs.v1beta1.ClusterListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.glusterfs.v1beta1.Clusters", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.glusterfs.v1beta1.ClusterListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.glusterfs.v1beta1.ClusterListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.glusterfs.v1beta1.ClusterDescribeRequest,
      com.appscode.api.glusterfs.v1beta1.ClusterDescribeResponse> METHOD_DESCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.glusterfs.v1beta1.Clusters", "Describe"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.glusterfs.v1beta1.ClusterDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.glusterfs.v1beta1.ClusterDescribeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.glusterfs.v1beta1.ClusterCreateRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.glusterfs.v1beta1.Clusters", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.glusterfs.v1beta1.ClusterCreateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.glusterfs.v1beta1.ClusterDeleteRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.glusterfs.v1beta1.Clusters", "Delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.glusterfs.v1beta1.ClusterDeleteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));

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
     * <pre>
     * Glusterfs cluster list. Needs to work with two modes.
     * First is to list all the glusterfs cluster through the
     * space with out considering the kubernetes cluster. if the
     * cluster_name is provided then list all the glusterfs cluster
     * with respect to the provided kube cluster space.
     * </pre>
     */
    public void list(com.appscode.api.glusterfs.v1beta1.ClusterListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.glusterfs.v1beta1.ClusterListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.glusterfs.v1beta1.ClusterDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.glusterfs.v1beta1.ClusterDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESCRIBE, responseObserver);
    }

    /**
     */
    public void create(com.appscode.api.glusterfs.v1beta1.ClusterCreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.glusterfs.v1beta1.ClusterDeleteRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.glusterfs.v1beta1.ClusterListRequest,
                com.appscode.api.glusterfs.v1beta1.ClusterListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_DESCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.glusterfs.v1beta1.ClusterDescribeRequest,
                com.appscode.api.glusterfs.v1beta1.ClusterDescribeResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.glusterfs.v1beta1.ClusterCreateRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.glusterfs.v1beta1.ClusterDeleteRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_DELETE)))
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
     * <pre>
     * Glusterfs cluster list. Needs to work with two modes.
     * First is to list all the glusterfs cluster through the
     * space with out considering the kubernetes cluster. if the
     * cluster_name is provided then list all the glusterfs cluster
     * with respect to the provided kube cluster space.
     * </pre>
     */
    public void list(com.appscode.api.glusterfs.v1beta1.ClusterListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.glusterfs.v1beta1.ClusterListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.glusterfs.v1beta1.ClusterDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.glusterfs.v1beta1.ClusterDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(com.appscode.api.glusterfs.v1beta1.ClusterCreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.glusterfs.v1beta1.ClusterDeleteRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
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
     * <pre>
     * Glusterfs cluster list. Needs to work with two modes.
     * First is to list all the glusterfs cluster through the
     * space with out considering the kubernetes cluster. if the
     * cluster_name is provided then list all the glusterfs cluster
     * with respect to the provided kube cluster space.
     * </pre>
     */
    public com.appscode.api.glusterfs.v1beta1.ClusterListResponse list(com.appscode.api.glusterfs.v1beta1.ClusterListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.glusterfs.v1beta1.ClusterDescribeResponse describe(com.appscode.api.glusterfs.v1beta1.ClusterDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESCRIBE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse create(com.appscode.api.glusterfs.v1beta1.ClusterCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse delete(com.appscode.api.glusterfs.v1beta1.ClusterDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
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
     * <pre>
     * Glusterfs cluster list. Needs to work with two modes.
     * First is to list all the glusterfs cluster through the
     * space with out considering the kubernetes cluster. if the
     * cluster_name is provided then list all the glusterfs cluster
     * with respect to the provided kube cluster space.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.glusterfs.v1beta1.ClusterListResponse> list(
        com.appscode.api.glusterfs.v1beta1.ClusterListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.glusterfs.v1beta1.ClusterDescribeResponse> describe(
        com.appscode.api.glusterfs.v1beta1.ClusterDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> create(
        com.appscode.api.glusterfs.v1beta1.ClusterCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> delete(
        com.appscode.api.glusterfs.v1beta1.ClusterDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_DESCRIBE = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_DELETE = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClustersImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ClustersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.appscode.api.glusterfs.v1beta1.ClusterListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.glusterfs.v1beta1.ClusterListResponse>) responseObserver);
          break;
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.appscode.api.glusterfs.v1beta1.ClusterDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.glusterfs.v1beta1.ClusterDescribeResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.appscode.api.glusterfs.v1beta1.ClusterCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.appscode.api.glusterfs.v1beta1.ClusterDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
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
        METHOD_LIST,
        METHOD_DESCRIBE,
        METHOD_CREATE,
        METHOD_DELETE);
  }

}
