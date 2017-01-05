package com.appscode.api.db.v1beta1;

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
    comments = "Source: appscode/api/db/v1beta1/database.proto")
public class DatabasesGrpc {

  private DatabasesGrpc() {}

  public static final String SERVICE_NAME = "appscode.db.v1beta1.Databases";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.db.v1beta1.DatabaseListRequest,
      com.appscode.api.db.v1beta1.DatabaseListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.db.v1beta1.Databases", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.db.v1beta1.DatabaseListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.db.v1beta1.DatabaseListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.db.v1beta1.DatabaseCreateRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.db.v1beta1.Databases", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.db.v1beta1.DatabaseCreateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.db.v1beta1.DatabaseScaleRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_SCALE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.db.v1beta1.Databases", "Scale"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.db.v1beta1.DatabaseScaleRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.db.v1beta1.DatabaseUpdateRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_UPDATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.db.v1beta1.Databases", "Update"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.db.v1beta1.DatabaseUpdateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.db.v1beta1.DatabaseDescribeRequest,
      com.appscode.api.db.v1beta1.DatabaseDescribeResponse> METHOD_DESCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.db.v1beta1.Databases", "Describe"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.db.v1beta1.DatabaseDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.db.v1beta1.DatabaseDescribeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.db.v1beta1.DatabaseDeleteRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.db.v1beta1.Databases", "Delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.db.v1beta1.DatabaseDeleteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.db.v1beta1.DatabaseRecoverRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_RECOVER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.db.v1beta1.Databases", "Recover"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.db.v1beta1.DatabaseRecoverRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatabasesStub newStub(io.grpc.Channel channel) {
    return new DatabasesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatabasesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DatabasesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DatabasesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DatabasesFutureStub(channel);
  }

  /**
   */
  public static abstract class DatabasesImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(com.appscode.api.db.v1beta1.DatabaseListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.db.v1beta1.DatabaseListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void create(com.appscode.api.db.v1beta1.DatabaseCreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void scale(com.appscode.api.db.v1beta1.DatabaseScaleRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SCALE, responseObserver);
    }

    /**
     */
    public void update(com.appscode.api.db.v1beta1.DatabaseUpdateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.db.v1beta1.DatabaseDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.db.v1beta1.DatabaseDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESCRIBE, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.db.v1beta1.DatabaseDeleteRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     */
    public void recover(com.appscode.api.db.v1beta1.DatabaseRecoverRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RECOVER, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.db.v1beta1.DatabaseListRequest,
                com.appscode.api.db.v1beta1.DatabaseListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.db.v1beta1.DatabaseCreateRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_SCALE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.db.v1beta1.DatabaseScaleRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_SCALE)))
          .addMethod(
            METHOD_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.db.v1beta1.DatabaseUpdateRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            METHOD_DESCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.db.v1beta1.DatabaseDescribeRequest,
                com.appscode.api.db.v1beta1.DatabaseDescribeResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.db.v1beta1.DatabaseDeleteRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_RECOVER,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.db.v1beta1.DatabaseRecoverRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_RECOVER)))
          .build();
    }
  }

  /**
   */
  public static final class DatabasesStub extends io.grpc.stub.AbstractStub<DatabasesStub> {
    private DatabasesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatabasesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabasesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatabasesStub(channel, callOptions);
    }

    /**
     */
    public void list(com.appscode.api.db.v1beta1.DatabaseListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.db.v1beta1.DatabaseListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(com.appscode.api.db.v1beta1.DatabaseCreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scale(com.appscode.api.db.v1beta1.DatabaseScaleRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SCALE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.appscode.api.db.v1beta1.DatabaseUpdateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.db.v1beta1.DatabaseDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.db.v1beta1.DatabaseDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.db.v1beta1.DatabaseDeleteRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recover(com.appscode.api.db.v1beta1.DatabaseRecoverRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RECOVER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DatabasesBlockingStub extends io.grpc.stub.AbstractStub<DatabasesBlockingStub> {
    private DatabasesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatabasesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabasesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatabasesBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.db.v1beta1.DatabaseListResponse list(com.appscode.api.db.v1beta1.DatabaseListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse create(com.appscode.api.db.v1beta1.DatabaseCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse scale(com.appscode.api.db.v1beta1.DatabaseScaleRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SCALE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse update(com.appscode.api.db.v1beta1.DatabaseUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.db.v1beta1.DatabaseDescribeResponse describe(com.appscode.api.db.v1beta1.DatabaseDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESCRIBE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse delete(com.appscode.api.db.v1beta1.DatabaseDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse recover(com.appscode.api.db.v1beta1.DatabaseRecoverRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RECOVER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DatabasesFutureStub extends io.grpc.stub.AbstractStub<DatabasesFutureStub> {
    private DatabasesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatabasesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabasesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatabasesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.db.v1beta1.DatabaseListResponse> list(
        com.appscode.api.db.v1beta1.DatabaseListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> create(
        com.appscode.api.db.v1beta1.DatabaseCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> scale(
        com.appscode.api.db.v1beta1.DatabaseScaleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SCALE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> update(
        com.appscode.api.db.v1beta1.DatabaseUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.db.v1beta1.DatabaseDescribeResponse> describe(
        com.appscode.api.db.v1beta1.DatabaseDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> delete(
        com.appscode.api.db.v1beta1.DatabaseDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> recover(
        com.appscode.api.db.v1beta1.DatabaseRecoverRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RECOVER, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_SCALE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DESCRIBE = 4;
  private static final int METHODID_DELETE = 5;
  private static final int METHODID_RECOVER = 6;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DatabasesImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(DatabasesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.appscode.api.db.v1beta1.DatabaseListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.db.v1beta1.DatabaseListResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.appscode.api.db.v1beta1.DatabaseCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_SCALE:
          serviceImpl.scale((com.appscode.api.db.v1beta1.DatabaseScaleRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.appscode.api.db.v1beta1.DatabaseUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.appscode.api.db.v1beta1.DatabaseDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.db.v1beta1.DatabaseDescribeResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.appscode.api.db.v1beta1.DatabaseDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_RECOVER:
          serviceImpl.recover((com.appscode.api.db.v1beta1.DatabaseRecoverRequest) request,
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
        METHOD_CREATE,
        METHOD_SCALE,
        METHOD_UPDATE,
        METHOD_DESCRIBE,
        METHOD_DELETE,
        METHOD_RECOVER);
  }

}
