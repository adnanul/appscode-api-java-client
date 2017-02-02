package com.appscode.api.operation.v1beta1;

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
    comments = "Source: appscode/api/operation/v1beta1/operation.proto")
public class OperationsGrpc {

  private OperationsGrpc() {}

  public static final String SERVICE_NAME = "appscode.operation.v1beta1.Operations";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.operation.v1beta1.DescribeRequest,
      com.appscode.api.operation.v1beta1.DescribeResponse> METHOD_DESCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.operation.v1beta1.Operations", "Describe"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.operation.v1beta1.DescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.operation.v1beta1.DescribeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.operation.v1beta1.LogDescribeRequest,
      com.appscode.api.operation.v1beta1.LogDescribeResponse> METHOD_DESCRIBE_LOG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.operation.v1beta1.Operations", "DescribeLog"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.operation.v1beta1.LogDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.operation.v1beta1.LogDescribeResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OperationsStub newStub(io.grpc.Channel channel) {
    return new OperationsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OperationsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OperationsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static OperationsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OperationsFutureStub(channel);
  }

  /**
   */
  public static abstract class OperationsImplBase implements io.grpc.BindableService {

    /**
     */
    public void describe(com.appscode.api.operation.v1beta1.DescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.operation.v1beta1.DescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESCRIBE, responseObserver);
    }

    /**
     */
    public void describeLog(com.appscode.api.operation.v1beta1.LogDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.operation.v1beta1.LogDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESCRIBE_LOG, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_DESCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.operation.v1beta1.DescribeRequest,
                com.appscode.api.operation.v1beta1.DescribeResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            METHOD_DESCRIBE_LOG,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.operation.v1beta1.LogDescribeRequest,
                com.appscode.api.operation.v1beta1.LogDescribeResponse>(
                  this, METHODID_DESCRIBE_LOG)))
          .build();
    }
  }

  /**
   */
  public static final class OperationsStub extends io.grpc.stub.AbstractStub<OperationsStub> {
    private OperationsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OperationsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OperationsStub(channel, callOptions);
    }

    /**
     */
    public void describe(com.appscode.api.operation.v1beta1.DescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.operation.v1beta1.DescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeLog(com.appscode.api.operation.v1beta1.LogDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.operation.v1beta1.LogDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE_LOG, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OperationsBlockingStub extends io.grpc.stub.AbstractStub<OperationsBlockingStub> {
    private OperationsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OperationsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OperationsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.operation.v1beta1.DescribeResponse describe(com.appscode.api.operation.v1beta1.DescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESCRIBE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.operation.v1beta1.LogDescribeResponse describeLog(com.appscode.api.operation.v1beta1.LogDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESCRIBE_LOG, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OperationsFutureStub extends io.grpc.stub.AbstractStub<OperationsFutureStub> {
    private OperationsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OperationsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OperationsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.operation.v1beta1.DescribeResponse> describe(
        com.appscode.api.operation.v1beta1.DescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.operation.v1beta1.LogDescribeResponse> describeLog(
        com.appscode.api.operation.v1beta1.LogDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE_LOG, getCallOptions()), request);
    }
  }

  private static final int METHODID_DESCRIBE = 0;
  private static final int METHODID_DESCRIBE_LOG = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OperationsImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(OperationsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.appscode.api.operation.v1beta1.DescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.operation.v1beta1.DescribeResponse>) responseObserver);
          break;
        case METHODID_DESCRIBE_LOG:
          serviceImpl.describeLog((com.appscode.api.operation.v1beta1.LogDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.operation.v1beta1.LogDescribeResponse>) responseObserver);
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
        METHOD_DESCRIBE_LOG);
  }

}
