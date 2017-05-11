package com.appscode.api.kubernetes.v1beta1;

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
 * Alert service protobufs for cluster alert incident.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.3.0)",
    comments = "Source: appscode/api/kubernetes/v1beta1/incident.proto")
public final class IncidentsGrpc {

  private IncidentsGrpc() {}

  public static final String SERVICE_NAME = "appscode.kubernetes.v1beta1.Incidents";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.IncidentListRequest,
      com.appscode.api.kubernetes.v1beta1.IncidentListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Incidents", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.IncidentListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.IncidentListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.IncidentDescribeRequest,
      com.appscode.api.kubernetes.v1beta1.IncidentDescribeResponse> METHOD_DESCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Incidents", "Describe"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.IncidentDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.IncidentDescribeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.IncidentNotifyRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_NOTIFY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Incidents", "Notify"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.IncidentNotifyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_CREATE_EVENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Incidents", "CreateEvent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IncidentsStub newStub(io.grpc.Channel channel) {
    return new IncidentsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IncidentsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IncidentsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static IncidentsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IncidentsFutureStub(channel);
  }

  /**
   * <pre>
   * Alert service protobufs for cluster alert incident.
   * </pre>
   */
  public static abstract class IncidentsImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(com.appscode.api.kubernetes.v1beta1.IncidentListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.IncidentListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.kubernetes.v1beta1.IncidentDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.IncidentDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESCRIBE, responseObserver);
    }

    /**
     */
    public void notify(com.appscode.api.kubernetes.v1beta1.IncidentNotifyRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_NOTIFY, responseObserver);
    }

    /**
     */
    public void createEvent(com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_EVENT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.IncidentListRequest,
                com.appscode.api.kubernetes.v1beta1.IncidentListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_DESCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.IncidentDescribeRequest,
                com.appscode.api.kubernetes.v1beta1.IncidentDescribeResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            METHOD_NOTIFY,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.IncidentNotifyRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_NOTIFY)))
          .addMethod(
            METHOD_CREATE_EVENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_CREATE_EVENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Alert service protobufs for cluster alert incident.
   * </pre>
   */
  public static final class IncidentsStub extends io.grpc.stub.AbstractStub<IncidentsStub> {
    private IncidentsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncidentsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncidentsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IncidentsStub(channel, callOptions);
    }

    /**
     */
    public void list(com.appscode.api.kubernetes.v1beta1.IncidentListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.IncidentListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.kubernetes.v1beta1.IncidentDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.IncidentDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void notify(com.appscode.api.kubernetes.v1beta1.IncidentNotifyRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_NOTIFY, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEvent(com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_EVENT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Alert service protobufs for cluster alert incident.
   * </pre>
   */
  public static final class IncidentsBlockingStub extends io.grpc.stub.AbstractStub<IncidentsBlockingStub> {
    private IncidentsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncidentsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncidentsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IncidentsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.IncidentListResponse list(com.appscode.api.kubernetes.v1beta1.IncidentListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.IncidentDescribeResponse describe(com.appscode.api.kubernetes.v1beta1.IncidentDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESCRIBE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse notify(com.appscode.api.kubernetes.v1beta1.IncidentNotifyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_NOTIFY, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse createEvent(com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_EVENT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Alert service protobufs for cluster alert incident.
   * </pre>
   */
  public static final class IncidentsFutureStub extends io.grpc.stub.AbstractStub<IncidentsFutureStub> {
    private IncidentsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncidentsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncidentsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IncidentsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.IncidentListResponse> list(
        com.appscode.api.kubernetes.v1beta1.IncidentListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.IncidentDescribeResponse> describe(
        com.appscode.api.kubernetes.v1beta1.IncidentDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> notify(
        com.appscode.api.kubernetes.v1beta1.IncidentNotifyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NOTIFY, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> createEvent(
        com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_EVENT, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_DESCRIBE = 1;
  private static final int METHODID_NOTIFY = 2;
  private static final int METHODID_CREATE_EVENT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IncidentsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IncidentsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.appscode.api.kubernetes.v1beta1.IncidentListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.IncidentListResponse>) responseObserver);
          break;
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.appscode.api.kubernetes.v1beta1.IncidentDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.IncidentDescribeResponse>) responseObserver);
          break;
        case METHODID_NOTIFY:
          serviceImpl.notify((com.appscode.api.kubernetes.v1beta1.IncidentNotifyRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_CREATE_EVENT:
          serviceImpl.createEvent((com.appscode.api.kubernetes.v1beta1.IncidentEventCreateRequest) request,
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

  private static final class IncidentsDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.appscode.api.kubernetes.v1beta1.IncidentProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (IncidentsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IncidentsDescriptorSupplier())
              .addMethod(METHOD_LIST)
              .addMethod(METHOD_DESCRIBE)
              .addMethod(METHOD_NOTIFY)
              .addMethod(METHOD_CREATE_EVENT)
              .build();
        }
      }
    }
    return result;
  }
}
