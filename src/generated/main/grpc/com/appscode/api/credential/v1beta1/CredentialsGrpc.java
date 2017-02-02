package com.appscode.api.credential.v1beta1;

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
    comments = "Source: appscode/api/credential/v1beta1/credential.proto")
public class CredentialsGrpc {

  private CredentialsGrpc() {}

  public static final String SERVICE_NAME = "appscode.credential.v1beta1.Credentials";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.dtypes.VoidRequest,
      com.appscode.api.credential.v1beta1.CredentialListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.credential.v1beta1.Credentials", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.credential.v1beta1.CredentialListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.credential.v1beta1.CredentialDescribeRequest,
      com.appscode.api.credential.v1beta1.CredentialDescribeResponse> METHOD_DESCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.credential.v1beta1.Credentials", "Describe"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.credential.v1beta1.CredentialDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.credential.v1beta1.CredentialDescribeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.credential.v1beta1.CredentialCreateRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.credential.v1beta1.Credentials", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.credential.v1beta1.CredentialCreateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.credential.v1beta1.CredentialUpdateRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_UPDATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.credential.v1beta1.Credentials", "Update"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.credential.v1beta1.CredentialUpdateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.credential.v1beta1.CredentialIsAuthorizedRequest,
      com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse> METHOD_IS_AUTHORIZED =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.credential.v1beta1.Credentials", "IsAuthorized"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.credential.v1beta1.CredentialIsAuthorizedRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.credential.v1beta1.CredentialDeleteRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.credential.v1beta1.Credentials", "Delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.credential.v1beta1.CredentialDeleteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CredentialsStub newStub(io.grpc.Channel channel) {
    return new CredentialsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CredentialsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CredentialsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static CredentialsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CredentialsFutureStub(channel);
  }

  /**
   */
  public static abstract class CredentialsImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.credential.v1beta1.CredentialListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.credential.v1beta1.CredentialDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.credential.v1beta1.CredentialDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESCRIBE, responseObserver);
    }

    /**
     */
    public void create(com.appscode.api.credential.v1beta1.CredentialCreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void update(com.appscode.api.credential.v1beta1.CredentialUpdateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE, responseObserver);
    }

    /**
     */
    public void isAuthorized(com.appscode.api.credential.v1beta1.CredentialIsAuthorizedRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IS_AUTHORIZED, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.credential.v1beta1.CredentialDeleteRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.dtypes.VoidRequest,
                com.appscode.api.credential.v1beta1.CredentialListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_DESCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.credential.v1beta1.CredentialDescribeRequest,
                com.appscode.api.credential.v1beta1.CredentialDescribeResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.credential.v1beta1.CredentialCreateRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.credential.v1beta1.CredentialUpdateRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            METHOD_IS_AUTHORIZED,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.credential.v1beta1.CredentialIsAuthorizedRequest,
                com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse>(
                  this, METHODID_IS_AUTHORIZED)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.credential.v1beta1.CredentialDeleteRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class CredentialsStub extends io.grpc.stub.AbstractStub<CredentialsStub> {
    private CredentialsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CredentialsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CredentialsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CredentialsStub(channel, callOptions);
    }

    /**
     */
    public void list(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.credential.v1beta1.CredentialListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.credential.v1beta1.CredentialDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.credential.v1beta1.CredentialDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(com.appscode.api.credential.v1beta1.CredentialCreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.appscode.api.credential.v1beta1.CredentialUpdateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isAuthorized(com.appscode.api.credential.v1beta1.CredentialIsAuthorizedRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IS_AUTHORIZED, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.credential.v1beta1.CredentialDeleteRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CredentialsBlockingStub extends io.grpc.stub.AbstractStub<CredentialsBlockingStub> {
    private CredentialsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CredentialsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CredentialsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CredentialsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.credential.v1beta1.CredentialListResponse list(com.appscode.api.dtypes.VoidRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.credential.v1beta1.CredentialDescribeResponse describe(com.appscode.api.credential.v1beta1.CredentialDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESCRIBE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse create(com.appscode.api.credential.v1beta1.CredentialCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse update(com.appscode.api.credential.v1beta1.CredentialUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse isAuthorized(com.appscode.api.credential.v1beta1.CredentialIsAuthorizedRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IS_AUTHORIZED, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse delete(com.appscode.api.credential.v1beta1.CredentialDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CredentialsFutureStub extends io.grpc.stub.AbstractStub<CredentialsFutureStub> {
    private CredentialsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CredentialsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CredentialsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CredentialsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.credential.v1beta1.CredentialListResponse> list(
        com.appscode.api.dtypes.VoidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.credential.v1beta1.CredentialDescribeResponse> describe(
        com.appscode.api.credential.v1beta1.CredentialDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> create(
        com.appscode.api.credential.v1beta1.CredentialCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> update(
        com.appscode.api.credential.v1beta1.CredentialUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse> isAuthorized(
        com.appscode.api.credential.v1beta1.CredentialIsAuthorizedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IS_AUTHORIZED, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> delete(
        com.appscode.api.credential.v1beta1.CredentialDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_DESCRIBE = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_IS_AUTHORIZED = 4;
  private static final int METHODID_DELETE = 5;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CredentialsImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(CredentialsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.appscode.api.dtypes.VoidRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.credential.v1beta1.CredentialListResponse>) responseObserver);
          break;
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.appscode.api.credential.v1beta1.CredentialDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.credential.v1beta1.CredentialDescribeResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.appscode.api.credential.v1beta1.CredentialCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.appscode.api.credential.v1beta1.CredentialUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_IS_AUTHORIZED:
          serviceImpl.isAuthorized((com.appscode.api.credential.v1beta1.CredentialIsAuthorizedRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.credential.v1beta1.CredentialIsAuthorizedResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.appscode.api.credential.v1beta1.CredentialDeleteRequest) request,
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
        METHOD_LIST,
        METHOD_DESCRIBE,
        METHOD_CREATE,
        METHOD_UPDATE,
        METHOD_IS_AUTHORIZED,
        METHOD_DELETE);
  }

}
