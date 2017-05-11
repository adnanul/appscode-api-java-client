package com.appscode.api.namespace.v1beta1;

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
 * <pre>
 * no authentication required, but rate limited apis.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.3.0)",
    comments = "Source: appscode/api/namespace/v1beta1/team.proto")
public final class TeamsGrpc {

  private TeamsGrpc() {}

  public static final String SERVICE_NAME = "appscode.namespace.v1beta1.Teams";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.namespace.v1beta1.CreateRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.namespace.v1beta1.Teams", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.namespace.v1beta1.CreateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.namespace.v1beta1.GetRequest,
      com.appscode.api.namespace.v1beta1.GetResponse> METHOD_GET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.namespace.v1beta1.Teams", "Get"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.namespace.v1beta1.GetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.namespace.v1beta1.GetResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.namespace.v1beta1.IsAvailableRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_IS_AVAILABLE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.namespace.v1beta1.Teams", "IsAvailable"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.namespace.v1beta1.IsAvailableRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TeamsStub newStub(io.grpc.Channel channel) {
    return new TeamsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TeamsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TeamsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static TeamsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TeamsFutureStub(channel);
  }

  /**
   * <pre>
   * no authentication required, but rate limited apis.
   * </pre>
   */
  public static abstract class TeamsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a new namespace, if name is valid and no namespace with same name exists.
     * </pre>
     */
    public void create(com.appscode.api.namespace.v1beta1.CreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     * <pre>
     * Gets a namespace, if exists. This can be used to check existence of a namespace.
     * </pre>
     */
    public void get(com.appscode.api.namespace.v1beta1.GetRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.namespace.v1beta1.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET, responseObserver);
    }

    /**
     * <pre>
     * Check if a namespace name is available meaning name is valid and no namespace with same name exists.
     * </pre>
     */
    public void isAvailable(com.appscode.api.namespace.v1beta1.IsAvailableRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IS_AVAILABLE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.namespace.v1beta1.CreateRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_GET,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.namespace.v1beta1.GetRequest,
                com.appscode.api.namespace.v1beta1.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            METHOD_IS_AVAILABLE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.namespace.v1beta1.IsAvailableRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_IS_AVAILABLE)))
          .build();
    }
  }

  /**
   * <pre>
   * no authentication required, but rate limited apis.
   * </pre>
   */
  public static final class TeamsStub extends io.grpc.stub.AbstractStub<TeamsStub> {
    private TeamsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeamsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeamsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new namespace, if name is valid and no namespace with same name exists.
     * </pre>
     */
    public void create(com.appscode.api.namespace.v1beta1.CreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a namespace, if exists. This can be used to check existence of a namespace.
     * </pre>
     */
    public void get(com.appscode.api.namespace.v1beta1.GetRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.namespace.v1beta1.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check if a namespace name is available meaning name is valid and no namespace with same name exists.
     * </pre>
     */
    public void isAvailable(com.appscode.api.namespace.v1beta1.IsAvailableRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IS_AVAILABLE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * no authentication required, but rate limited apis.
   * </pre>
   */
  public static final class TeamsBlockingStub extends io.grpc.stub.AbstractStub<TeamsBlockingStub> {
    private TeamsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeamsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeamsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new namespace, if name is valid and no namespace with same name exists.
     * </pre>
     */
    public com.appscode.api.dtypes.VoidResponse create(com.appscode.api.namespace.v1beta1.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a namespace, if exists. This can be used to check existence of a namespace.
     * </pre>
     */
    public com.appscode.api.namespace.v1beta1.GetResponse get(com.appscode.api.namespace.v1beta1.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Check if a namespace name is available meaning name is valid and no namespace with same name exists.
     * </pre>
     */
    public com.appscode.api.dtypes.VoidResponse isAvailable(com.appscode.api.namespace.v1beta1.IsAvailableRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IS_AVAILABLE, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * no authentication required, but rate limited apis.
   * </pre>
   */
  public static final class TeamsFutureStub extends io.grpc.stub.AbstractStub<TeamsFutureStub> {
    private TeamsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeamsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeamsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeamsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new namespace, if name is valid and no namespace with same name exists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> create(
        com.appscode.api.namespace.v1beta1.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a namespace, if exists. This can be used to check existence of a namespace.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.namespace.v1beta1.GetResponse> get(
        com.appscode.api.namespace.v1beta1.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Check if a namespace name is available meaning name is valid and no namespace with same name exists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> isAvailable(
        com.appscode.api.namespace.v1beta1.IsAvailableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IS_AVAILABLE, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_IS_AVAILABLE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TeamsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TeamsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.appscode.api.namespace.v1beta1.CreateRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.appscode.api.namespace.v1beta1.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.namespace.v1beta1.GetResponse>) responseObserver);
          break;
        case METHODID_IS_AVAILABLE:
          serviceImpl.isAvailable((com.appscode.api.namespace.v1beta1.IsAvailableRequest) request,
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

  private static final class TeamsDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.appscode.api.namespace.v1beta1.TeamProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TeamsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TeamsDescriptorSupplier())
              .addMethod(METHOD_CREATE)
              .addMethod(METHOD_GET)
              .addMethod(METHOD_IS_AVAILABLE)
              .build();
        }
      }
    }
    return result;
  }
}
