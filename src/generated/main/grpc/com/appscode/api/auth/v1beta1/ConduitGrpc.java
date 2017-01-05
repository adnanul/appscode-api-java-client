package com.appscode.api.auth.v1beta1;

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
    comments = "Source: appscode/api/auth/v1beta1/conduit.proto")
public class ConduitGrpc {

  private ConduitGrpc() {}

  public static final String SERVICE_NAME = "appscode.auth.v1beta1.Conduit";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.dtypes.VoidRequest,
      com.appscode.api.auth.v1beta1.ConduitWhoAmIResponse> METHOD_WHO_AM_I =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.auth.v1beta1.Conduit", "WhoAmI"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.auth.v1beta1.ConduitWhoAmIResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.dtypes.VoidRequest,
      com.appscode.api.auth.v1beta1.ConduitUsersResponse> METHOD_USERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.auth.v1beta1.Conduit", "Users"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.auth.v1beta1.ConduitUsersResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConduitStub newStub(io.grpc.Channel channel) {
    return new ConduitStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConduitBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConduitBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ConduitFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConduitFutureStub(channel);
  }

  /**
   */
  public static abstract class ConduitImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * This rpc is used to check a valid user from other applications.
     * </pre>
     */
    public void whoAmI(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.ConduitWhoAmIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_WHO_AM_I, responseObserver);
    }

    /**
     * <pre>
     * appctl used this to validates the user token with phabricator.
     * </pre>
     */
    public void users(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.ConduitUsersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_USERS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_WHO_AM_I,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.dtypes.VoidRequest,
                com.appscode.api.auth.v1beta1.ConduitWhoAmIResponse>(
                  this, METHODID_WHO_AM_I)))
          .addMethod(
            METHOD_USERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.dtypes.VoidRequest,
                com.appscode.api.auth.v1beta1.ConduitUsersResponse>(
                  this, METHODID_USERS)))
          .build();
    }
  }

  /**
   */
  public static final class ConduitStub extends io.grpc.stub.AbstractStub<ConduitStub> {
    private ConduitStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConduitStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConduitStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConduitStub(channel, callOptions);
    }

    /**
     * <pre>
     * This rpc is used to check a valid user from other applications.
     * </pre>
     */
    public void whoAmI(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.ConduitWhoAmIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_WHO_AM_I, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * appctl used this to validates the user token with phabricator.
     * </pre>
     */
    public void users(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.ConduitUsersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_USERS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConduitBlockingStub extends io.grpc.stub.AbstractStub<ConduitBlockingStub> {
    private ConduitBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConduitBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConduitBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConduitBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * This rpc is used to check a valid user from other applications.
     * </pre>
     */
    public com.appscode.api.auth.v1beta1.ConduitWhoAmIResponse whoAmI(com.appscode.api.dtypes.VoidRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_WHO_AM_I, getCallOptions(), request);
    }

    /**
     * <pre>
     * appctl used this to validates the user token with phabricator.
     * </pre>
     */
    public com.appscode.api.auth.v1beta1.ConduitUsersResponse users(com.appscode.api.dtypes.VoidRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_USERS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConduitFutureStub extends io.grpc.stub.AbstractStub<ConduitFutureStub> {
    private ConduitFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConduitFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConduitFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConduitFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * This rpc is used to check a valid user from other applications.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.auth.v1beta1.ConduitWhoAmIResponse> whoAmI(
        com.appscode.api.dtypes.VoidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_WHO_AM_I, getCallOptions()), request);
    }

    /**
     * <pre>
     * appctl used this to validates the user token with phabricator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.auth.v1beta1.ConduitUsersResponse> users(
        com.appscode.api.dtypes.VoidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_USERS, getCallOptions()), request);
    }
  }

  private static final int METHODID_WHO_AM_I = 0;
  private static final int METHODID_USERS = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConduitImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ConduitImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WHO_AM_I:
          serviceImpl.whoAmI((com.appscode.api.dtypes.VoidRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.ConduitWhoAmIResponse>) responseObserver);
          break;
        case METHODID_USERS:
          serviceImpl.users((com.appscode.api.dtypes.VoidRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.ConduitUsersResponse>) responseObserver);
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
        METHOD_WHO_AM_I,
        METHOD_USERS);
  }

}
