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
    value = "by gRPC proto compiler (version 1.3.0)",
    comments = "Source: appscode/api/attic/v1beta1/artifact.proto")
public final class ArtifactsGrpc {

  private ArtifactsGrpc() {}

  public static final String SERVICE_NAME = "appscode.attic.v1beta1.Artifacts";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.attic.v1beta1.ArtifactSearchRequest,
      com.appscode.api.attic.v1beta1.ArtifactSearchResponse> METHOD_SEARCH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.attic.v1beta1.Artifacts", "Search"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.attic.v1beta1.ArtifactSearchRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.attic.v1beta1.ArtifactSearchResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.attic.v1beta1.ArtifactListRequest,
      com.appscode.api.attic.v1beta1.ArtifactListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.attic.v1beta1.Artifacts", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.attic.v1beta1.ArtifactListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.attic.v1beta1.ArtifactListResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ArtifactsStub newStub(io.grpc.Channel channel) {
    return new ArtifactsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ArtifactsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ArtifactsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ArtifactsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ArtifactsFutureStub(channel);
  }

  /**
   */
  public static abstract class ArtifactsImplBase implements io.grpc.BindableService {

    /**
     */
    public void search(com.appscode.api.attic.v1beta1.ArtifactSearchRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.attic.v1beta1.ArtifactSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH, responseObserver);
    }

    /**
     */
    public void list(com.appscode.api.attic.v1beta1.ArtifactListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.attic.v1beta1.ArtifactListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEARCH,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.attic.v1beta1.ArtifactSearchRequest,
                com.appscode.api.attic.v1beta1.ArtifactSearchResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.attic.v1beta1.ArtifactListRequest,
                com.appscode.api.attic.v1beta1.ArtifactListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class ArtifactsStub extends io.grpc.stub.AbstractStub<ArtifactsStub> {
    private ArtifactsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArtifactsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArtifactsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArtifactsStub(channel, callOptions);
    }

    /**
     */
    public void search(com.appscode.api.attic.v1beta1.ArtifactSearchRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.attic.v1beta1.ArtifactSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(com.appscode.api.attic.v1beta1.ArtifactListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.attic.v1beta1.ArtifactListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ArtifactsBlockingStub extends io.grpc.stub.AbstractStub<ArtifactsBlockingStub> {
    private ArtifactsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArtifactsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArtifactsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArtifactsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.attic.v1beta1.ArtifactSearchResponse search(com.appscode.api.attic.v1beta1.ArtifactSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.attic.v1beta1.ArtifactListResponse list(com.appscode.api.attic.v1beta1.ArtifactListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ArtifactsFutureStub extends io.grpc.stub.AbstractStub<ArtifactsFutureStub> {
    private ArtifactsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArtifactsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArtifactsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArtifactsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.attic.v1beta1.ArtifactSearchResponse> search(
        com.appscode.api.attic.v1beta1.ArtifactSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.attic.v1beta1.ArtifactListResponse> list(
        com.appscode.api.attic.v1beta1.ArtifactListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ArtifactsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ArtifactsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((com.appscode.api.attic.v1beta1.ArtifactSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.attic.v1beta1.ArtifactSearchResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.appscode.api.attic.v1beta1.ArtifactListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.attic.v1beta1.ArtifactListResponse>) responseObserver);
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

  private static final class ArtifactsDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.appscode.api.attic.v1beta1.ArtifactProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ArtifactsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ArtifactsDescriptorSupplier())
              .addMethod(METHOD_SEARCH)
              .addMethod(METHOD_LIST)
              .build();
        }
      }
    }
    return result;
  }
}
