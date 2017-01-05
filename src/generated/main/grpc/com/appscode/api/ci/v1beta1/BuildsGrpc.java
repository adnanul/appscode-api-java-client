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
    comments = "Source: appscode/api/ci/v1beta1/build.proto")
public class BuildsGrpc {

  private BuildsGrpc() {}

  public static final String SERVICE_NAME = "appscode.ci.v1beta1.Builds";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.ci.v1beta1.BuildDescribeRequest,
      com.appscode.api.ci.v1beta1.BuildDescribeResponse> METHOD_DESCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.ci.v1beta1.Builds", "Describe"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ci.v1beta1.BuildDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ci.v1beta1.BuildDescribeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.ci.v1beta1.BuildListRequest,
      com.appscode.api.ci.v1beta1.BuildListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.ci.v1beta1.Builds", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ci.v1beta1.BuildListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ci.v1beta1.BuildListResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BuildsStub newStub(io.grpc.Channel channel) {
    return new BuildsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BuildsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BuildsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static BuildsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BuildsFutureStub(channel);
  }

  /**
   */
  public static abstract class BuildsImplBase implements io.grpc.BindableService {

    /**
     */
    public void describe(com.appscode.api.ci.v1beta1.BuildDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.ci.v1beta1.BuildDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESCRIBE, responseObserver);
    }

    /**
     */
    public void list(com.appscode.api.ci.v1beta1.BuildListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.ci.v1beta1.BuildListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_DESCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.ci.v1beta1.BuildDescribeRequest,
                com.appscode.api.ci.v1beta1.BuildDescribeResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.ci.v1beta1.BuildListRequest,
                com.appscode.api.ci.v1beta1.BuildListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class BuildsStub extends io.grpc.stub.AbstractStub<BuildsStub> {
    private BuildsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuildsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuildsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuildsStub(channel, callOptions);
    }

    /**
     */
    public void describe(com.appscode.api.ci.v1beta1.BuildDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.ci.v1beta1.BuildDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(com.appscode.api.ci.v1beta1.BuildListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.ci.v1beta1.BuildListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BuildsBlockingStub extends io.grpc.stub.AbstractStub<BuildsBlockingStub> {
    private BuildsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuildsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuildsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuildsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.ci.v1beta1.BuildDescribeResponse describe(com.appscode.api.ci.v1beta1.BuildDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESCRIBE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.ci.v1beta1.BuildListResponse list(com.appscode.api.ci.v1beta1.BuildListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BuildsFutureStub extends io.grpc.stub.AbstractStub<BuildsFutureStub> {
    private BuildsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuildsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuildsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuildsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.ci.v1beta1.BuildDescribeResponse> describe(
        com.appscode.api.ci.v1beta1.BuildDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.ci.v1beta1.BuildListResponse> list(
        com.appscode.api.ci.v1beta1.BuildListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }
  }

  private static final int METHODID_DESCRIBE = 0;
  private static final int METHODID_LIST = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BuildsImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(BuildsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.appscode.api.ci.v1beta1.BuildDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.ci.v1beta1.BuildDescribeResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.appscode.api.ci.v1beta1.BuildListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.ci.v1beta1.BuildListResponse>) responseObserver);
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
        METHOD_DESCRIBE,
        METHOD_LIST);
  }

}
