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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.2)",
    comments = "Source: appscode/api/kubernetes/v1beta1/event.proto")
public class EventsGrpc {

  private EventsGrpc() {}

  public static final String SERVICE_NAME = "appscode.kubernetes.v1beta1.Events";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.EventRequest,
      com.appscode.api.kubernetes.v1beta1.EventResponse> METHOD_CONSTRUCTIVE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Events", "Constructive"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.EventRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.EventResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.EventRequest,
      com.appscode.api.kubernetes.v1beta1.EventResponse> METHOD_DESTRUCTIVE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Events", "Destructive"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.EventRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.EventResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventsStub newStub(io.grpc.Channel channel) {
    return new EventsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EventsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static EventsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EventsFutureStub(channel);
  }

  /**
   */
  public static abstract class EventsImplBase implements io.grpc.BindableService {

    /**
     */
    public void constructive(com.appscode.api.kubernetes.v1beta1.EventRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.EventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CONSTRUCTIVE, responseObserver);
    }

    /**
     */
    public void destructive(com.appscode.api.kubernetes.v1beta1.EventRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.EventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESTRUCTIVE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CONSTRUCTIVE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.EventRequest,
                com.appscode.api.kubernetes.v1beta1.EventResponse>(
                  this, METHODID_CONSTRUCTIVE)))
          .addMethod(
            METHOD_DESTRUCTIVE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.EventRequest,
                com.appscode.api.kubernetes.v1beta1.EventResponse>(
                  this, METHODID_DESTRUCTIVE)))
          .build();
    }
  }

  /**
   */
  public static final class EventsStub extends io.grpc.stub.AbstractStub<EventsStub> {
    private EventsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventsStub(channel, callOptions);
    }

    /**
     */
    public void constructive(com.appscode.api.kubernetes.v1beta1.EventRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.EventResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CONSTRUCTIVE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void destructive(com.appscode.api.kubernetes.v1beta1.EventRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.EventResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESTRUCTIVE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EventsBlockingStub extends io.grpc.stub.AbstractStub<EventsBlockingStub> {
    private EventsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.EventResponse constructive(com.appscode.api.kubernetes.v1beta1.EventRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CONSTRUCTIVE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.EventResponse destructive(com.appscode.api.kubernetes.v1beta1.EventRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESTRUCTIVE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EventsFutureStub extends io.grpc.stub.AbstractStub<EventsFutureStub> {
    private EventsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.EventResponse> constructive(
        com.appscode.api.kubernetes.v1beta1.EventRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CONSTRUCTIVE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.EventResponse> destructive(
        com.appscode.api.kubernetes.v1beta1.EventRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESTRUCTIVE, getCallOptions()), request);
    }
  }

  private static final int METHODID_CONSTRUCTIVE = 0;
  private static final int METHODID_DESTRUCTIVE = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventsImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(EventsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONSTRUCTIVE:
          serviceImpl.constructive((com.appscode.api.kubernetes.v1beta1.EventRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.EventResponse>) responseObserver);
          break;
        case METHODID_DESTRUCTIVE:
          serviceImpl.destructive((com.appscode.api.kubernetes.v1beta1.EventRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.EventResponse>) responseObserver);
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
        METHOD_CONSTRUCTIVE,
        METHOD_DESTRUCTIVE);
  }

}
