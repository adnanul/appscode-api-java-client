package com.appscode.api.backup.v1beta1;

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
    comments = "Source: appscode/api/backup/v1beta1/client.proto")
public class ClientsGrpc {

  private ClientsGrpc() {}

  public static final String SERVICE_NAME = "appscode.backup.v1beta1.Clients";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.backup.v1beta1.ClientReconfigureRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_RECONFIGURE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.backup.v1beta1.Clients", "Reconfigure"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.backup.v1beta1.ClientReconfigureRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientsStub newStub(io.grpc.Channel channel) {
    return new ClientsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClientsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ClientsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClientsFutureStub(channel);
  }

  /**
   */
  public static abstract class ClientsImplBase implements io.grpc.BindableService {

    /**
     */
    public void reconfigure(com.appscode.api.backup.v1beta1.ClientReconfigureRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RECONFIGURE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_RECONFIGURE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.backup.v1beta1.ClientReconfigureRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_RECONFIGURE)))
          .build();
    }
  }

  /**
   */
  public static final class ClientsStub extends io.grpc.stub.AbstractStub<ClientsStub> {
    private ClientsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientsStub(channel, callOptions);
    }

    /**
     */
    public void reconfigure(com.appscode.api.backup.v1beta1.ClientReconfigureRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RECONFIGURE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClientsBlockingStub extends io.grpc.stub.AbstractStub<ClientsBlockingStub> {
    private ClientsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse reconfigure(com.appscode.api.backup.v1beta1.ClientReconfigureRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RECONFIGURE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClientsFutureStub extends io.grpc.stub.AbstractStub<ClientsFutureStub> {
    private ClientsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> reconfigure(
        com.appscode.api.backup.v1beta1.ClientReconfigureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RECONFIGURE, getCallOptions()), request);
    }
  }

  private static final int METHODID_RECONFIGURE = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClientsImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ClientsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECONFIGURE:
          serviceImpl.reconfigure((com.appscode.api.backup.v1beta1.ClientReconfigureRequest) request,
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
        METHOD_RECONFIGURE);
  }

}
