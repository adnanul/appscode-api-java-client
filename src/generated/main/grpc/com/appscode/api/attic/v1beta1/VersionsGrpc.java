package com.appscode.api.attic.v1beta1;

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
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: appscode/api/attic/v1beta1/version.proto")
public class VersionsGrpc {

  private VersionsGrpc() {}

  public static final String SERVICE_NAME = "appscode.attic.v1beta1.Versions";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.attic.v1beta1.VersionListRequest,
      com.appscode.api.attic.v1beta1.VersionListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.attic.v1beta1.Versions", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.attic.v1beta1.VersionListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.attic.v1beta1.VersionListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.attic.v1beta1.VersionDescribeRequest,
      com.appscode.api.attic.v1beta1.VersionDescribeResponse> METHOD_DESCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.attic.v1beta1.Versions", "Describe"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.attic.v1beta1.VersionDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.attic.v1beta1.VersionDescribeResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VersionsStub newStub(io.grpc.Channel channel) {
    return new VersionsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VersionsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VersionsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static VersionsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VersionsFutureStub(channel);
  }

  /**
   */
  public static abstract class VersionsImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(com.appscode.api.attic.v1beta1.VersionListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.attic.v1beta1.VersionListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.attic.v1beta1.VersionDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.attic.v1beta1.VersionDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESCRIBE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.attic.v1beta1.VersionListRequest,
                com.appscode.api.attic.v1beta1.VersionListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_DESCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.attic.v1beta1.VersionDescribeRequest,
                com.appscode.api.attic.v1beta1.VersionDescribeResponse>(
                  this, METHODID_DESCRIBE)))
          .build();
    }
  }

  /**
   */
  public static final class VersionsStub extends io.grpc.stub.AbstractStub<VersionsStub> {
    private VersionsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VersionsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VersionsStub(channel, callOptions);
    }

    /**
     */
    public void list(com.appscode.api.attic.v1beta1.VersionListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.attic.v1beta1.VersionListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.attic.v1beta1.VersionDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.attic.v1beta1.VersionDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VersionsBlockingStub extends io.grpc.stub.AbstractStub<VersionsBlockingStub> {
    private VersionsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VersionsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VersionsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.attic.v1beta1.VersionListResponse list(com.appscode.api.attic.v1beta1.VersionListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.attic.v1beta1.VersionDescribeResponse describe(com.appscode.api.attic.v1beta1.VersionDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESCRIBE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VersionsFutureStub extends io.grpc.stub.AbstractStub<VersionsFutureStub> {
    private VersionsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VersionsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VersionsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.attic.v1beta1.VersionListResponse> list(
        com.appscode.api.attic.v1beta1.VersionListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.attic.v1beta1.VersionDescribeResponse> describe(
        com.appscode.api.attic.v1beta1.VersionDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_DESCRIBE = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VersionsImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(VersionsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.appscode.api.attic.v1beta1.VersionListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.attic.v1beta1.VersionListResponse>) responseObserver);
          break;
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.appscode.api.attic.v1beta1.VersionDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.attic.v1beta1.VersionDescribeResponse>) responseObserver);
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
        METHOD_DESCRIBE);
  }

}
