package com.appscode.api.ci.v1beta1;

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
    comments = "Source: appscode/api/ci/v1beta1/master.proto")
public class MasterGrpc {

  private MasterGrpc() {}

  public static final String SERVICE_NAME = "appscode.ci.v1beta1.Master";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.ci.v1beta1.MasterCreateRequest,
      com.appscode.api.dtypes.LongRunningResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.ci.v1beta1.Master", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ci.v1beta1.MasterCreateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.LongRunningResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.ci.v1beta1.MasterDeleteRequest,
      com.appscode.api.dtypes.LongRunningResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.ci.v1beta1.Master", "Delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ci.v1beta1.MasterDeleteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.LongRunningResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MasterStub newStub(io.grpc.Channel channel) {
    return new MasterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MasterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MasterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static MasterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MasterFutureStub(channel);
  }

  /**
   */
  public static abstract class MasterImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(com.appscode.api.ci.v1beta1.MasterCreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.LongRunningResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.ci.v1beta1.MasterDeleteRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.LongRunningResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.ci.v1beta1.MasterCreateRequest,
                com.appscode.api.dtypes.LongRunningResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.ci.v1beta1.MasterDeleteRequest,
                com.appscode.api.dtypes.LongRunningResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class MasterStub extends io.grpc.stub.AbstractStub<MasterStub> {
    private MasterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MasterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MasterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MasterStub(channel, callOptions);
    }

    /**
     */
    public void create(com.appscode.api.ci.v1beta1.MasterCreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.LongRunningResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.ci.v1beta1.MasterDeleteRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.LongRunningResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MasterBlockingStub extends io.grpc.stub.AbstractStub<MasterBlockingStub> {
    private MasterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MasterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MasterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MasterBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.dtypes.LongRunningResponse create(com.appscode.api.ci.v1beta1.MasterCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.LongRunningResponse delete(com.appscode.api.ci.v1beta1.MasterDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MasterFutureStub extends io.grpc.stub.AbstractStub<MasterFutureStub> {
    private MasterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MasterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MasterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MasterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.LongRunningResponse> create(
        com.appscode.api.ci.v1beta1.MasterCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.LongRunningResponse> delete(
        com.appscode.api.ci.v1beta1.MasterDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_DELETE = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MasterImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(MasterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.appscode.api.ci.v1beta1.MasterCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.LongRunningResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.appscode.api.ci.v1beta1.MasterDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.LongRunningResponse>) responseObserver);
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
        METHOD_CREATE,
        METHOD_DELETE);
  }

}
