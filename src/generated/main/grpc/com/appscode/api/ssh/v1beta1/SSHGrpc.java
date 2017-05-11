package com.appscode.api.ssh.v1beta1;

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
    comments = "Source: appscode/api/ssh/v1beta1/ssh.proto")
public final class SSHGrpc {

  private SSHGrpc() {}

  public static final String SERVICE_NAME = "appscode.ssh.v1beta1.SSH";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.ssh.v1beta1.SSHGetRequest,
      com.appscode.api.ssh.v1beta1.SSHGetResponse> METHOD_GET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.ssh.v1beta1.SSH", "Get"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ssh.v1beta1.SSHGetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ssh.v1beta1.SSHGetResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SSHStub newStub(io.grpc.Channel channel) {
    return new SSHStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SSHBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SSHBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static SSHFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SSHFutureStub(channel);
  }

  /**
   */
  public static abstract class SSHImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(com.appscode.api.ssh.v1beta1.SSHGetRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.ssh.v1beta1.SSHGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.ssh.v1beta1.SSHGetRequest,
                com.appscode.api.ssh.v1beta1.SSHGetResponse>(
                  this, METHODID_GET)))
          .build();
    }
  }

  /**
   */
  public static final class SSHStub extends io.grpc.stub.AbstractStub<SSHStub> {
    private SSHStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SSHStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SSHStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SSHStub(channel, callOptions);
    }

    /**
     */
    public void get(com.appscode.api.ssh.v1beta1.SSHGetRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.ssh.v1beta1.SSHGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SSHBlockingStub extends io.grpc.stub.AbstractStub<SSHBlockingStub> {
    private SSHBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SSHBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SSHBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SSHBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.ssh.v1beta1.SSHGetResponse get(com.appscode.api.ssh.v1beta1.SSHGetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SSHFutureStub extends io.grpc.stub.AbstractStub<SSHFutureStub> {
    private SSHFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SSHFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SSHFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SSHFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.ssh.v1beta1.SSHGetResponse> get(
        com.appscode.api.ssh.v1beta1.SSHGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SSHImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SSHImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((com.appscode.api.ssh.v1beta1.SSHGetRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.ssh.v1beta1.SSHGetResponse>) responseObserver);
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

  private static final class SSHDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.appscode.api.ssh.v1beta1.SSHProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SSHGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SSHDescriptorSupplier())
              .addMethod(METHOD_GET)
              .build();
        }
      }
    }
    return result;
  }
}
