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
    comments = "Source: appscode/api/auth/v1beta1/project.proto")
public final class ProjectsGrpc {

  private ProjectsGrpc() {}

  public static final String SERVICE_NAME = "appscode.auth.v1beta1.Projects";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.auth.v1beta1.ProjectListRequest,
      com.appscode.api.auth.v1beta1.ProjectListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.auth.v1beta1.Projects", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.auth.v1beta1.ProjectListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.auth.v1beta1.ProjectListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.auth.v1beta1.ProjectMemberListRequest,
      com.appscode.api.auth.v1beta1.ProjectMemberListResponse> METHOD_MEMBERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.auth.v1beta1.Projects", "Members"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.auth.v1beta1.ProjectMemberListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.auth.v1beta1.ProjectMemberListResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectsStub newStub(io.grpc.Channel channel) {
    return new ProjectsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProjectsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProjectsFutureStub(channel);
  }

  /**
   */
  public static abstract class ProjectsImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(com.appscode.api.auth.v1beta1.ProjectListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.ProjectListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void members(com.appscode.api.auth.v1beta1.ProjectMemberListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.ProjectMemberListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MEMBERS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.auth.v1beta1.ProjectListRequest,
                com.appscode.api.auth.v1beta1.ProjectListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_MEMBERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.auth.v1beta1.ProjectMemberListRequest,
                com.appscode.api.auth.v1beta1.ProjectMemberListResponse>(
                  this, METHODID_MEMBERS)))
          .build();
    }
  }

  /**
   */
  public static final class ProjectsStub extends io.grpc.stub.AbstractStub<ProjectsStub> {
    private ProjectsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectsStub(channel, callOptions);
    }

    /**
     */
    public void list(com.appscode.api.auth.v1beta1.ProjectListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.ProjectListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void members(com.appscode.api.auth.v1beta1.ProjectMemberListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.ProjectMemberListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MEMBERS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProjectsBlockingStub extends io.grpc.stub.AbstractStub<ProjectsBlockingStub> {
    private ProjectsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.auth.v1beta1.ProjectListResponse list(com.appscode.api.auth.v1beta1.ProjectListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.auth.v1beta1.ProjectMemberListResponse members(com.appscode.api.auth.v1beta1.ProjectMemberListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MEMBERS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProjectsFutureStub extends io.grpc.stub.AbstractStub<ProjectsFutureStub> {
    private ProjectsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.auth.v1beta1.ProjectListResponse> list(
        com.appscode.api.auth.v1beta1.ProjectListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.auth.v1beta1.ProjectMemberListResponse> members(
        com.appscode.api.auth.v1beta1.ProjectMemberListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MEMBERS, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_MEMBERS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProjectsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.appscode.api.auth.v1beta1.ProjectListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.ProjectListResponse>) responseObserver);
          break;
        case METHODID_MEMBERS:
          serviceImpl.members((com.appscode.api.auth.v1beta1.ProjectMemberListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.auth.v1beta1.ProjectMemberListResponse>) responseObserver);
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

  private static final class ProjectsDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.appscode.api.auth.v1beta1.ProjectProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProjectsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectsDescriptorSupplier())
              .addMethod(METHOD_LIST)
              .addMethod(METHOD_MEMBERS)
              .build();
        }
      }
    }
    return result;
  }
}
