package com.appscode.api.mailinglist.v1beta1;

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
    comments = "Source: appscode/api/mailinglist/v1beta1/mailinglist.proto")
public class MailingListGrpc {

  private MailingListGrpc() {}

  public static final String SERVICE_NAME = "appscode.mailinglist.v1beta1.MailingList";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.mailinglist.v1beta1.SendEmailRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_SEND_EMAIL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.mailinglist.v1beta1.MailingList", "SendEmail"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.mailinglist.v1beta1.SendEmailRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.mailinglist.v1beta1.SubscribeRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_SUBSCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.mailinglist.v1beta1.MailingList", "Subscribe"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.mailinglist.v1beta1.SubscribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MailingListStub newStub(io.grpc.Channel channel) {
    return new MailingListStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MailingListBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MailingListBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static MailingListFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MailingListFutureStub(channel);
  }

  /**
   */
  public static abstract class MailingListImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendEmail(com.appscode.api.mailinglist.v1beta1.SendEmailRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_EMAIL, responseObserver);
    }

    /**
     */
    public void subscribe(com.appscode.api.mailinglist.v1beta1.SubscribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SUBSCRIBE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEND_EMAIL,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.mailinglist.v1beta1.SendEmailRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_SEND_EMAIL)))
          .addMethod(
            METHOD_SUBSCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.mailinglist.v1beta1.SubscribeRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_SUBSCRIBE)))
          .build();
    }
  }

  /**
   */
  public static final class MailingListStub extends io.grpc.stub.AbstractStub<MailingListStub> {
    private MailingListStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MailingListStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MailingListStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MailingListStub(channel, callOptions);
    }

    /**
     */
    public void sendEmail(com.appscode.api.mailinglist.v1beta1.SendEmailRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_EMAIL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribe(com.appscode.api.mailinglist.v1beta1.SubscribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SUBSCRIBE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MailingListBlockingStub extends io.grpc.stub.AbstractStub<MailingListBlockingStub> {
    private MailingListBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MailingListBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MailingListBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MailingListBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse sendEmail(com.appscode.api.mailinglist.v1beta1.SendEmailRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_EMAIL, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse subscribe(com.appscode.api.mailinglist.v1beta1.SubscribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SUBSCRIBE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MailingListFutureStub extends io.grpc.stub.AbstractStub<MailingListFutureStub> {
    private MailingListFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MailingListFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MailingListFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MailingListFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> sendEmail(
        com.appscode.api.mailinglist.v1beta1.SendEmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_EMAIL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> subscribe(
        com.appscode.api.mailinglist.v1beta1.SubscribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SUBSCRIBE, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_EMAIL = 0;
  private static final int METHODID_SUBSCRIBE = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MailingListImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(MailingListImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_EMAIL:
          serviceImpl.sendEmail((com.appscode.api.mailinglist.v1beta1.SendEmailRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((com.appscode.api.mailinglist.v1beta1.SubscribeRequest) request,
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
        METHOD_SEND_EMAIL,
        METHOD_SUBSCRIBE);
  }

}
