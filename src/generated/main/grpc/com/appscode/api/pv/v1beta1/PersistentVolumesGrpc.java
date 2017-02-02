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
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: appscode/api/pv/v1beta1/persistentvolume.proto")
public class PersistentVolumesGrpc {

  private PersistentVolumesGrpc() {}

  public static final String SERVICE_NAME = "appscode.pv.v1beta1.PersistentVolumes";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.pv.v1beta1.PVDescribeRequest,
      com.appscode.api.pv.v1beta1.PVDescribeResponse> METHOD_DESCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.pv.v1beta1.PersistentVolumes", "Describe"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.pv.v1beta1.PVDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.pv.v1beta1.PVDescribeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.pv.v1beta1.PVRegisterRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_REGISTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.pv.v1beta1.PersistentVolumes", "Register"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.pv.v1beta1.PVRegisterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.pv.v1beta1.PVUnregisterRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_UNREGISTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.pv.v1beta1.PersistentVolumes", "Unregister"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.pv.v1beta1.PVUnregisterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersistentVolumesStub newStub(io.grpc.Channel channel) {
    return new PersistentVolumesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersistentVolumesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersistentVolumesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static PersistentVolumesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersistentVolumesFutureStub(channel);
  }

  /**
   */
  public static abstract class PersistentVolumesImplBase implements io.grpc.BindableService {

    /**
     */
    public void describe(com.appscode.api.pv.v1beta1.PVDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.pv.v1beta1.PVDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESCRIBE, responseObserver);
    }

    /**
     */
    public void register(com.appscode.api.pv.v1beta1.PVRegisterRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER, responseObserver);
    }

    /**
     */
    public void unregister(com.appscode.api.pv.v1beta1.PVUnregisterRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UNREGISTER, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_DESCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.pv.v1beta1.PVDescribeRequest,
                com.appscode.api.pv.v1beta1.PVDescribeResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            METHOD_REGISTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.pv.v1beta1.PVRegisterRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_REGISTER)))
          .addMethod(
            METHOD_UNREGISTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.pv.v1beta1.PVUnregisterRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_UNREGISTER)))
          .build();
    }
  }

  /**
   */
  public static final class PersistentVolumesStub extends io.grpc.stub.AbstractStub<PersistentVolumesStub> {
    private PersistentVolumesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersistentVolumesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersistentVolumesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersistentVolumesStub(channel, callOptions);
    }

    /**
     */
    public void describe(com.appscode.api.pv.v1beta1.PVDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.pv.v1beta1.PVDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void register(com.appscode.api.pv.v1beta1.PVRegisterRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unregister(com.appscode.api.pv.v1beta1.PVUnregisterRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UNREGISTER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersistentVolumesBlockingStub extends io.grpc.stub.AbstractStub<PersistentVolumesBlockingStub> {
    private PersistentVolumesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersistentVolumesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersistentVolumesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersistentVolumesBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.pv.v1beta1.PVDescribeResponse describe(com.appscode.api.pv.v1beta1.PVDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESCRIBE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse register(com.appscode.api.pv.v1beta1.PVRegisterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse unregister(com.appscode.api.pv.v1beta1.PVUnregisterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UNREGISTER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersistentVolumesFutureStub extends io.grpc.stub.AbstractStub<PersistentVolumesFutureStub> {
    private PersistentVolumesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersistentVolumesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersistentVolumesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersistentVolumesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.pv.v1beta1.PVDescribeResponse> describe(
        com.appscode.api.pv.v1beta1.PVDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> register(
        com.appscode.api.pv.v1beta1.PVRegisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> unregister(
        com.appscode.api.pv.v1beta1.PVUnregisterRequest request) {
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
    private final PersistentVolumesImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(PersistentVolumesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.appscode.api.pv.v1beta1.PVDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.pv.v1beta1.PVDescribeResponse>) responseObserver);
          break;
        case METHODID_REGISTER:
          serviceImpl.register((com.appscode.api.pv.v1beta1.PVRegisterRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_UNREGISTER:
          serviceImpl.unregister((com.appscode.api.pv.v1beta1.PVUnregisterRequest) request,
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
