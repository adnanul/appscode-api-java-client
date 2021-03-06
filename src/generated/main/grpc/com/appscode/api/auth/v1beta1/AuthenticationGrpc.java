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
    value = "by gRPC proto compiler (version 1.3.0)",
    comments = "Source: appscode/api/auth/v1beta1/authentication.proto")
public final class AuthenticationGrpc {

  private AuthenticationGrpc() {}

  public static final String SERVICE_NAME = "appscode.auth.v1beta1.Authentication";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.auth.v1beta1.LoginRequest,
      com.appscode.api.auth.v1beta1.LoginResponse> METHOD_LOGIN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.auth.v1beta1.Authentication", "Login"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.auth.v1beta1.LoginRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.auth.v1beta1.LoginResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.dtypes.VoidRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_LOGOUT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.auth.v1beta1.Authentication", "Logout"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.dtypes.VoidRequest,
      com.appscode.api.auth.v1beta1.CSRFTokenResponse> METHOD_CSRFTOKEN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.auth.v1beta1.Authentication", "CSRFToken"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.auth.v1beta1.CSRFTokenResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthenticationStub newStub(io.grpc.Channel channel) {
    return new AuthenticationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthenticationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthenticationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static AuthenticationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthenticationFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthenticationImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * This rpc is used to check a valid user from other applications.
     * </pre>
     */
    public void login(com.appscode.api.auth.v1beta1.LoginRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOGIN, responseObserver);
    }

    /**
     */
    public void logout(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOGOUT, responseObserver);
    }

    /**
     */
    public void cSRFToken(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.CSRFTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CSRFTOKEN, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LOGIN,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.auth.v1beta1.LoginRequest,
                com.appscode.api.auth.v1beta1.LoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            METHOD_LOGOUT,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.dtypes.VoidRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_LOGOUT)))
          .addMethod(
            METHOD_CSRFTOKEN,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.dtypes.VoidRequest,
                com.appscode.api.auth.v1beta1.CSRFTokenResponse>(
                  this, METHODID_CSRFTOKEN)))
          .build();
    }
  }

  /**
   */
  public static final class AuthenticationStub extends io.grpc.stub.AbstractStub<AuthenticationStub> {
    private AuthenticationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthenticationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthenticationStub(channel, callOptions);
    }

    /**
     * <pre>
     * This rpc is used to check a valid user from other applications.
     * </pre>
     */
    public void login(com.appscode.api.auth.v1beta1.LoginRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOGIN, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOGOUT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cSRFToken(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.CSRFTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CSRFTOKEN, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthenticationBlockingStub extends io.grpc.stub.AbstractStub<AuthenticationBlockingStub> {
    private AuthenticationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthenticationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthenticationBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * This rpc is used to check a valid user from other applications.
     * </pre>
     */
    public com.appscode.api.auth.v1beta1.LoginResponse login(com.appscode.api.auth.v1beta1.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOGIN, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse logout(com.appscode.api.dtypes.VoidRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOGOUT, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.auth.v1beta1.CSRFTokenResponse cSRFToken(com.appscode.api.dtypes.VoidRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CSRFTOKEN, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthenticationFutureStub extends io.grpc.stub.AbstractStub<AuthenticationFutureStub> {
    private AuthenticationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthenticationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthenticationFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * This rpc is used to check a valid user from other applications.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.auth.v1beta1.LoginResponse> login(
        com.appscode.api.auth.v1beta1.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOGIN, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> logout(
        com.appscode.api.dtypes.VoidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOGOUT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.auth.v1beta1.CSRFTokenResponse> cSRFToken(
        com.appscode.api.dtypes.VoidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CSRFTOKEN, getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;
  private static final int METHODID_CSRFTOKEN = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthenticationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthenticationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.appscode.api.auth.v1beta1.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.LoginResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.appscode.api.dtypes.VoidRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_CSRFTOKEN:
          serviceImpl.cSRFToken((com.appscode.api.dtypes.VoidRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.CSRFTokenResponse>) responseObserver);
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

  private static final class AuthenticationDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.appscode.api.auth.v1beta1.AuthenticationProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthenticationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthenticationDescriptorSupplier())
              .addMethod(METHOD_LOGIN)
              .addMethod(METHOD_LOGOUT)
              .addMethod(METHOD_CSRFTOKEN)
              .build();
        }
      }
    }
    return result;
  }
}
