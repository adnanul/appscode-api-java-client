package com.appscode.api.certificate.v1beta1;

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
    comments = "Source: appscode/api/certificate/v1beta1/certificate.proto")
public class CertificatesGrpc {

  private CertificatesGrpc() {}

  public static final String SERVICE_NAME = "appscode.certificate.v1beta1.Certificates";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.certificate.v1beta1.CertificateListRequest,
      com.appscode.api.certificate.v1beta1.CertificateListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.certificate.v1beta1.Certificates", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.certificate.v1beta1.CertificateListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.certificate.v1beta1.CertificateListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.certificate.v1beta1.CertificateDescribeRequest,
      com.appscode.api.certificate.v1beta1.CertificateDescribeResponse> METHOD_DESCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.certificate.v1beta1.Certificates", "Describe"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.certificate.v1beta1.CertificateDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.certificate.v1beta1.CertificateDescribeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.certificate.v1beta1.CertificateLoadRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_LOAD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.certificate.v1beta1.Certificates", "Load"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.certificate.v1beta1.CertificateLoadRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.certificate.v1beta1.CertificateDeleteRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.certificate.v1beta1.Certificates", "Delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.certificate.v1beta1.CertificateDeleteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.certificate.v1beta1.CertificateDeployRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_DEPLOY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.certificate.v1beta1.Certificates", "Deploy"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.certificate.v1beta1.CertificateDeployRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CertificatesStub newStub(io.grpc.Channel channel) {
    return new CertificatesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CertificatesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CertificatesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static CertificatesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CertificatesFutureStub(channel);
  }

  /**
   */
  public static abstract class CertificatesImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(com.appscode.api.certificate.v1beta1.CertificateListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.certificate.v1beta1.CertificateListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.certificate.v1beta1.CertificateDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.certificate.v1beta1.CertificateDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESCRIBE, responseObserver);
    }

    /**
     */
    public void load(com.appscode.api.certificate.v1beta1.CertificateLoadRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOAD, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.certificate.v1beta1.CertificateDeleteRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     */
    public void deploy(com.appscode.api.certificate.v1beta1.CertificateDeployRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEPLOY, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.certificate.v1beta1.CertificateListRequest,
                com.appscode.api.certificate.v1beta1.CertificateListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_DESCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.certificate.v1beta1.CertificateDescribeRequest,
                com.appscode.api.certificate.v1beta1.CertificateDescribeResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            METHOD_LOAD,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.certificate.v1beta1.CertificateLoadRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_LOAD)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.certificate.v1beta1.CertificateDeleteRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_DEPLOY,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.certificate.v1beta1.CertificateDeployRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_DEPLOY)))
          .build();
    }
  }

  /**
   */
  public static final class CertificatesStub extends io.grpc.stub.AbstractStub<CertificatesStub> {
    private CertificatesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CertificatesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificatesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CertificatesStub(channel, callOptions);
    }

    /**
     */
    public void list(com.appscode.api.certificate.v1beta1.CertificateListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.certificate.v1beta1.CertificateListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.certificate.v1beta1.CertificateDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.certificate.v1beta1.CertificateDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void load(com.appscode.api.certificate.v1beta1.CertificateLoadRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOAD, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.certificate.v1beta1.CertificateDeleteRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deploy(com.appscode.api.certificate.v1beta1.CertificateDeployRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEPLOY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CertificatesBlockingStub extends io.grpc.stub.AbstractStub<CertificatesBlockingStub> {
    private CertificatesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CertificatesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificatesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CertificatesBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.certificate.v1beta1.CertificateListResponse list(com.appscode.api.certificate.v1beta1.CertificateListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.certificate.v1beta1.CertificateDescribeResponse describe(com.appscode.api.certificate.v1beta1.CertificateDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESCRIBE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse load(com.appscode.api.certificate.v1beta1.CertificateLoadRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOAD, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse delete(com.appscode.api.certificate.v1beta1.CertificateDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse deploy(com.appscode.api.certificate.v1beta1.CertificateDeployRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEPLOY, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CertificatesFutureStub extends io.grpc.stub.AbstractStub<CertificatesFutureStub> {
    private CertificatesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CertificatesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificatesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CertificatesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.certificate.v1beta1.CertificateListResponse> list(
        com.appscode.api.certificate.v1beta1.CertificateListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.certificate.v1beta1.CertificateDescribeResponse> describe(
        com.appscode.api.certificate.v1beta1.CertificateDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> load(
        com.appscode.api.certificate.v1beta1.CertificateLoadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOAD, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> delete(
        com.appscode.api.certificate.v1beta1.CertificateDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> deploy(
        com.appscode.api.certificate.v1beta1.CertificateDeployRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEPLOY, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_DESCRIBE = 1;
  private static final int METHODID_LOAD = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_DEPLOY = 4;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CertificatesImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(CertificatesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.appscode.api.certificate.v1beta1.CertificateListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.certificate.v1beta1.CertificateListResponse>) responseObserver);
          break;
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.appscode.api.certificate.v1beta1.CertificateDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.certificate.v1beta1.CertificateDescribeResponse>) responseObserver);
          break;
        case METHODID_LOAD:
          serviceImpl.load((com.appscode.api.certificate.v1beta1.CertificateLoadRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.appscode.api.certificate.v1beta1.CertificateDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_DEPLOY:
          serviceImpl.deploy((com.appscode.api.certificate.v1beta1.CertificateDeployRequest) request,
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
        METHOD_LOAD,
        METHOD_DELETE,
        METHOD_DEPLOY);
  }

}
