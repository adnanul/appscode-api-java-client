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
    value = "by gRPC proto compiler (version 1.3.0)",
    comments = "Source: appscode/api/ci/v1beta1/metadata.proto")
public final class MetadataGrpc {

  private MetadataGrpc() {}

  public static final String SERVICE_NAME = "appscode.ci.v1beta1.Metadata";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.dtypes.VoidRequest,
      com.appscode.api.ci.v1beta1.ServerInfoResponse> METHOD_SERVER_INFO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.ci.v1beta1.Metadata", "ServerInfo"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ci.v1beta1.ServerInfoResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetadataStub newStub(io.grpc.Channel channel) {
    return new MetadataStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetadataBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MetadataBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static MetadataFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MetadataFutureStub(channel);
  }

  /**
   */
  public static abstract class MetadataImplBase implements io.grpc.BindableService {

    /**
     */
    public void serverInfo(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.ci.v1beta1.ServerInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SERVER_INFO, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SERVER_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.dtypes.VoidRequest,
                com.appscode.api.ci.v1beta1.ServerInfoResponse>(
                  this, METHODID_SERVER_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class MetadataStub extends io.grpc.stub.AbstractStub<MetadataStub> {
    private MetadataStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataStub(channel, callOptions);
    }

    /**
     */
    public void serverInfo(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.ci.v1beta1.ServerInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SERVER_INFO, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MetadataBlockingStub extends io.grpc.stub.AbstractStub<MetadataBlockingStub> {
    private MetadataBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.ci.v1beta1.ServerInfoResponse serverInfo(com.appscode.api.dtypes.VoidRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SERVER_INFO, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MetadataFutureStub extends io.grpc.stub.AbstractStub<MetadataFutureStub> {
    private MetadataFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.ci.v1beta1.ServerInfoResponse> serverInfo(
        com.appscode.api.dtypes.VoidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SERVER_INFO, getCallOptions()), request);
    }
  }

  private static final int METHODID_SERVER_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetadataImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MetadataImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SERVER_INFO:
          serviceImpl.serverInfo((com.appscode.api.dtypes.VoidRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.ci.v1beta1.ServerInfoResponse>) responseObserver);
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

  private static final class MetadataDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.appscode.api.ci.v1beta1.MetadataProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MetadataGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MetadataDescriptorSupplier())
              .addMethod(METHOD_SERVER_INFO)
              .build();
        }
      }
    }
    return result;
  }
}
