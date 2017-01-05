package com.appscode.api.kubernetes.v1beta2;

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
    comments = "Source: appscode/api/kubernetes/v1beta2/client.proto")
public class DisksGrpc {

  private DisksGrpc() {}

  public static final String SERVICE_NAME = "appscode.kubernetes.v1beta2.Disks";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta2.DiskListRequest,
      com.appscode.api.kubernetes.v1beta2.DiskListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta2.Disks", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.DiskListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.DiskListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta2.DiskDescribeRequest,
      com.appscode.api.kubernetes.v1beta2.DiskDescribeResponse> METHOD_DESCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta2.Disks", "Describe"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.DiskDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.DiskDescribeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta2.DiskCreateRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta2.Disks", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.DiskCreateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta2.DiskDeleteRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta2.Disks", "Delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.DiskDeleteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DisksStub newStub(io.grpc.Channel channel) {
    return new DisksStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DisksBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DisksBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DisksFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DisksFutureStub(channel);
  }

  /**
   */
  public static abstract class DisksImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(com.appscode.api.kubernetes.v1beta2.DiskListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta2.DiskListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.kubernetes.v1beta2.DiskDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta2.DiskDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESCRIBE, responseObserver);
    }

    /**
     */
    public void create(com.appscode.api.kubernetes.v1beta2.DiskCreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.kubernetes.v1beta2.DiskDeleteRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta2.DiskListRequest,
                com.appscode.api.kubernetes.v1beta2.DiskListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_DESCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta2.DiskDescribeRequest,
                com.appscode.api.kubernetes.v1beta2.DiskDescribeResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta2.DiskCreateRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta2.DiskDeleteRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class DisksStub extends io.grpc.stub.AbstractStub<DisksStub> {
    private DisksStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DisksStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DisksStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DisksStub(channel, callOptions);
    }

    /**
     */
    public void list(com.appscode.api.kubernetes.v1beta2.DiskListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta2.DiskListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.kubernetes.v1beta2.DiskDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta2.DiskDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(com.appscode.api.kubernetes.v1beta2.DiskCreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.kubernetes.v1beta2.DiskDeleteRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DisksBlockingStub extends io.grpc.stub.AbstractStub<DisksBlockingStub> {
    private DisksBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DisksBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DisksBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DisksBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta2.DiskListResponse list(com.appscode.api.kubernetes.v1beta2.DiskListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta2.DiskDescribeResponse describe(com.appscode.api.kubernetes.v1beta2.DiskDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESCRIBE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse create(com.appscode.api.kubernetes.v1beta2.DiskCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse delete(com.appscode.api.kubernetes.v1beta2.DiskDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DisksFutureStub extends io.grpc.stub.AbstractStub<DisksFutureStub> {
    private DisksFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DisksFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DisksFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DisksFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta2.DiskListResponse> list(
        com.appscode.api.kubernetes.v1beta2.DiskListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta2.DiskDescribeResponse> describe(
        com.appscode.api.kubernetes.v1beta2.DiskDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> create(
        com.appscode.api.kubernetes.v1beta2.DiskCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> delete(
        com.appscode.api.kubernetes.v1beta2.DiskDeleteRequest request) {
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
    private final DisksImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(DisksImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.appscode.api.kubernetes.v1beta2.DiskListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta2.DiskListResponse>) responseObserver);
          break;
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.appscode.api.kubernetes.v1beta2.DiskDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta2.DiskDescribeResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.appscode.api.kubernetes.v1beta2.DiskCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.appscode.api.kubernetes.v1beta2.DiskDeleteRequest) request,
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
