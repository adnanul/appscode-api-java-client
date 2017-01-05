package com.appscode.api.pv.v1beta1;

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
    comments = "Source: appscode/api/pv/v1beta1/persistentvolumeclaim.proto")
public class PersistentVolumeClaimsGrpc {

  private PersistentVolumeClaimsGrpc() {}

  public static final String SERVICE_NAME = "appscode.pv.v1beta1.PersistentVolumeClaims";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.pv.v1beta1.PVCDescribeRequest,
      com.appscode.api.pv.v1beta1.PVCDescribeResponse> METHOD_DESCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.pv.v1beta1.PersistentVolumeClaims", "Describe"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.pv.v1beta1.PVCDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.pv.v1beta1.PVCDescribeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.pv.v1beta1.PVCRegisterRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_REGISTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.pv.v1beta1.PersistentVolumeClaims", "Register"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.pv.v1beta1.PVCRegisterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.pv.v1beta1.PVCUnregisterRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_UNREGISTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.pv.v1beta1.PersistentVolumeClaims", "Unregister"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.pv.v1beta1.PVCUnregisterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersistentVolumeClaimsStub newStub(io.grpc.Channel channel) {
    return new PersistentVolumeClaimsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersistentVolumeClaimsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersistentVolumeClaimsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static PersistentVolumeClaimsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersistentVolumeClaimsFutureStub(channel);
  }

  /**
   */
  public static abstract class PersistentVolumeClaimsImplBase implements io.grpc.BindableService {

    /**
     */
    public void describe(com.appscode.api.pv.v1beta1.PVCDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.pv.v1beta1.PVCDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESCRIBE, responseObserver);
    }

    /**
     */
    public void register(com.appscode.api.pv.v1beta1.PVCRegisterRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER, responseObserver);
    }

    /**
     */
    public void unregister(com.appscode.api.pv.v1beta1.PVCUnregisterRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UNREGISTER, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_DESCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.pv.v1beta1.PVCDescribeRequest,
                com.appscode.api.pv.v1beta1.PVCDescribeResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            METHOD_REGISTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.pv.v1beta1.PVCRegisterRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_REGISTER)))
          .addMethod(
            METHOD_UNREGISTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.pv.v1beta1.PVCUnregisterRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_UNREGISTER)))
          .build();
    }
  }

  /**
   */
  public static final class PersistentVolumeClaimsStub extends io.grpc.stub.AbstractStub<PersistentVolumeClaimsStub> {
    private PersistentVolumeClaimsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersistentVolumeClaimsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersistentVolumeClaimsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersistentVolumeClaimsStub(channel, callOptions);
    }

    /**
     */
    public void describe(com.appscode.api.pv.v1beta1.PVCDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.pv.v1beta1.PVCDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void register(com.appscode.api.pv.v1beta1.PVCRegisterRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unregister(com.appscode.api.pv.v1beta1.PVCUnregisterRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UNREGISTER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersistentVolumeClaimsBlockingStub extends io.grpc.stub.AbstractStub<PersistentVolumeClaimsBlockingStub> {
    private PersistentVolumeClaimsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersistentVolumeClaimsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersistentVolumeClaimsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersistentVolumeClaimsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.pv.v1beta1.PVCDescribeResponse describe(com.appscode.api.pv.v1beta1.PVCDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESCRIBE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse register(com.appscode.api.pv.v1beta1.PVCRegisterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse unregister(com.appscode.api.pv.v1beta1.PVCUnregisterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UNREGISTER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersistentVolumeClaimsFutureStub extends io.grpc.stub.AbstractStub<PersistentVolumeClaimsFutureStub> {
    private PersistentVolumeClaimsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersistentVolumeClaimsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersistentVolumeClaimsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersistentVolumeClaimsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.pv.v1beta1.PVCDescribeResponse> describe(
        com.appscode.api.pv.v1beta1.PVCDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> register(
        com.appscode.api.pv.v1beta1.PVCRegisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> unregister(
        com.appscode.api.pv.v1beta1.PVCUnregisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UNREGISTER, getCallOptions()), request);
    }
  }

  private static final int METHODID_DESCRIBE = 0;
  private static final int METHODID_REGISTER = 1;
  private static final int METHODID_UNREGISTER = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersistentVolumeClaimsImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(PersistentVolumeClaimsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.appscode.api.pv.v1beta1.PVCDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.pv.v1beta1.PVCDescribeResponse>) responseObserver);
          break;
        case METHODID_REGISTER:
          serviceImpl.register((com.appscode.api.pv.v1beta1.PVCRegisterRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_UNREGISTER:
          serviceImpl.unregister((com.appscode.api.pv.v1beta1.PVCUnregisterRequest) request,
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
        METHOD_DESCRIBE,
        METHOD_REGISTER,
        METHOD_UNREGISTER);
  }

}
