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
    comments = "Source: appscode/api/glusterfs/v1beta1/volume.proto")
public class VolumesGrpc {

  private VolumesGrpc() {}

  public static final String SERVICE_NAME = "appscode.glusterfs.v1beta1.Volumes";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.glusterfs.v1beta1.VolumeListRequest,
      com.appscode.api.glusterfs.v1beta1.VolumeListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.glusterfs.v1beta1.Volumes", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.glusterfs.v1beta1.VolumeListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.glusterfs.v1beta1.VolumeListResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VolumesStub newStub(io.grpc.Channel channel) {
    return new VolumesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VolumesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VolumesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static VolumesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VolumesFutureStub(channel);
  }

  /**
   */
  public static abstract class VolumesImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(com.appscode.api.glusterfs.v1beta1.VolumeListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.glusterfs.v1beta1.VolumeListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.glusterfs.v1beta1.VolumeListRequest,
                com.appscode.api.glusterfs.v1beta1.VolumeListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class VolumesStub extends io.grpc.stub.AbstractStub<VolumesStub> {
    private VolumesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VolumesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VolumesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VolumesStub(channel, callOptions);
    }

    /**
     */
    public void list(com.appscode.api.glusterfs.v1beta1.VolumeListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.glusterfs.v1beta1.VolumeListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VolumesBlockingStub extends io.grpc.stub.AbstractStub<VolumesBlockingStub> {
    private VolumesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VolumesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VolumesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VolumesBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.glusterfs.v1beta1.VolumeListResponse list(com.appscode.api.glusterfs.v1beta1.VolumeListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VolumesFutureStub extends io.grpc.stub.AbstractStub<VolumesFutureStub> {
    private VolumesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VolumesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VolumesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VolumesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.glusterfs.v1beta1.VolumeListResponse> list(
        com.appscode.api.glusterfs.v1beta1.VolumeListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VolumesImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(VolumesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.appscode.api.glusterfs.v1beta1.VolumeListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.glusterfs.v1beta1.VolumeListResponse>) responseObserver);
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
        METHOD_LIST);
  }

}
