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
    value = "by gRPC proto compiler (version 1.0.2)",
    comments = "Source: appscode/api/ci/v1beta1/job.proto")
public class JobsGrpc {

  private JobsGrpc() {}

  public static final String SERVICE_NAME = "appscode.ci.v1beta1.Jobs";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.ci.v1beta1.JobListRequest,
      com.appscode.api.ci.v1beta1.JobListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.ci.v1beta1.Jobs", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ci.v1beta1.JobListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ci.v1beta1.JobListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.ci.v1beta1.JobDescribeRequest,
      com.appscode.api.ci.v1beta1.JobDescribeResponse> METHOD_DESCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.ci.v1beta1.Jobs", "Describe"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ci.v1beta1.JobDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ci.v1beta1.JobDescribeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.ci.v1beta1.JobCreateRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.ci.v1beta1.Jobs", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ci.v1beta1.JobCreateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.ci.v1beta1.JobCopyRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_COPY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.ci.v1beta1.Jobs", "Copy"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ci.v1beta1.JobCopyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.ci.v1beta1.JobBuildRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_BUILD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.ci.v1beta1.Jobs", "Build"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ci.v1beta1.JobBuildRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.ci.v1beta1.JobDeleteRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.ci.v1beta1.Jobs", "Delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.ci.v1beta1.JobDeleteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobsStub newStub(io.grpc.Channel channel) {
    return new JobsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JobsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static JobsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JobsFutureStub(channel);
  }

  /**
   */
  public static abstract class JobsImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(com.appscode.api.ci.v1beta1.JobListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.ci.v1beta1.JobListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.ci.v1beta1.JobDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.ci.v1beta1.JobDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESCRIBE, responseObserver);
    }

    /**
     */
    public void create(com.appscode.api.ci.v1beta1.JobCreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void copy(com.appscode.api.ci.v1beta1.JobCopyRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COPY, responseObserver);
    }

    /**
     */
    public void build(com.appscode.api.ci.v1beta1.JobBuildRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BUILD, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.ci.v1beta1.JobDeleteRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.ci.v1beta1.JobListRequest,
                com.appscode.api.ci.v1beta1.JobListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_DESCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.ci.v1beta1.JobDescribeRequest,
                com.appscode.api.ci.v1beta1.JobDescribeResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.ci.v1beta1.JobCreateRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_COPY,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.ci.v1beta1.JobCopyRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_COPY)))
          .addMethod(
            METHOD_BUILD,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.ci.v1beta1.JobBuildRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_BUILD)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.ci.v1beta1.JobDeleteRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class JobsStub extends io.grpc.stub.AbstractStub<JobsStub> {
    private JobsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobsStub(channel, callOptions);
    }

    /**
     */
    public void list(com.appscode.api.ci.v1beta1.JobListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.ci.v1beta1.JobListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.ci.v1beta1.JobDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.ci.v1beta1.JobDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(com.appscode.api.ci.v1beta1.JobCreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void copy(com.appscode.api.ci.v1beta1.JobCopyRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COPY, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void build(com.appscode.api.ci.v1beta1.JobBuildRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BUILD, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.ci.v1beta1.JobDeleteRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JobsBlockingStub extends io.grpc.stub.AbstractStub<JobsBlockingStub> {
    private JobsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.ci.v1beta1.JobListResponse list(com.appscode.api.ci.v1beta1.JobListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.ci.v1beta1.JobDescribeResponse describe(com.appscode.api.ci.v1beta1.JobDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESCRIBE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse create(com.appscode.api.ci.v1beta1.JobCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse copy(com.appscode.api.ci.v1beta1.JobCopyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COPY, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse build(com.appscode.api.ci.v1beta1.JobBuildRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BUILD, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse delete(com.appscode.api.ci.v1beta1.JobDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JobsFutureStub extends io.grpc.stub.AbstractStub<JobsFutureStub> {
    private JobsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.ci.v1beta1.JobListResponse> list(
        com.appscode.api.ci.v1beta1.JobListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.ci.v1beta1.JobDescribeResponse> describe(
        com.appscode.api.ci.v1beta1.JobDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> create(
        com.appscode.api.ci.v1beta1.JobCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> copy(
        com.appscode.api.ci.v1beta1.JobCopyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COPY, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> build(
        com.appscode.api.ci.v1beta1.JobBuildRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BUILD, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> delete(
        com.appscode.api.ci.v1beta1.JobDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_DESCRIBE = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_COPY = 3;
  private static final int METHODID_BUILD = 4;
  private static final int METHODID_DELETE = 5;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobsImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(JobsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.appscode.api.ci.v1beta1.JobListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.ci.v1beta1.JobListResponse>) responseObserver);
          break;
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.appscode.api.ci.v1beta1.JobDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.ci.v1beta1.JobDescribeResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.appscode.api.ci.v1beta1.JobCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_COPY:
          serviceImpl.copy((com.appscode.api.ci.v1beta1.JobCopyRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_BUILD:
          serviceImpl.build((com.appscode.api.ci.v1beta1.JobBuildRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.appscode.api.ci.v1beta1.JobDeleteRequest) request,
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
        METHOD_COPY,
        METHOD_BUILD,
        METHOD_DELETE);
  }

}
