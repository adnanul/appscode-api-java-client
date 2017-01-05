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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.2)",
    comments = "Source: appscode/api/namespace/v1beta1/billing.proto")
public class BillingGrpc {

  private BillingGrpc() {}

  public static final String SERVICE_NAME = "appscode.namespace.v1beta1.Billing";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.dtypes.VoidRequest,
      com.appscode.api.namespace.v1beta1.GetSubscriptionResponse> METHOD_GET_SUBSCRIPTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.namespace.v1beta1.Billing", "GetSubscription"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.namespace.v1beta1.GetSubscriptionResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.dtypes.VoidRequest,
      com.appscode.api.namespace.v1beta1.GetQuotaResponse> METHOD_GET_QUOTA =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.namespace.v1beta1.Billing", "GetQuota"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.namespace.v1beta1.GetQuotaResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.dtypes.VoidRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_CHECK_PAYMENT_METHOD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.namespace.v1beta1.Billing", "CheckPaymentMethod"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BillingStub newStub(io.grpc.Channel channel) {
    return new BillingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BillingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BillingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static BillingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BillingFutureStub(channel);
  }

  /**
   */
  public static abstract class BillingImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Checks current subscription of a namespace
     * </pre>
     */
    public void getSubscription(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.namespace.v1beta1.GetSubscriptionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SUBSCRIPTION, responseObserver);
    }

    /**
     */
    public void getQuota(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.namespace.v1beta1.GetQuotaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_QUOTA, responseObserver);
    }

    /**
     */
    public void checkPaymentMethod(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHECK_PAYMENT_METHOD, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_SUBSCRIPTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.dtypes.VoidRequest,
                com.appscode.api.namespace.v1beta1.GetSubscriptionResponse>(
                  this, METHODID_GET_SUBSCRIPTION)))
          .addMethod(
            METHOD_GET_QUOTA,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.dtypes.VoidRequest,
                com.appscode.api.namespace.v1beta1.GetQuotaResponse>(
                  this, METHODID_GET_QUOTA)))
          .addMethod(
            METHOD_CHECK_PAYMENT_METHOD,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.dtypes.VoidRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_CHECK_PAYMENT_METHOD)))
          .build();
    }
  }

  /**
   */
  public static final class BillingStub extends io.grpc.stub.AbstractStub<BillingStub> {
    private BillingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BillingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BillingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Checks current subscription of a namespace
     * </pre>
     */
    public void getSubscription(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.namespace.v1beta1.GetSubscriptionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIPTION, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQuota(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.namespace.v1beta1.GetQuotaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_QUOTA, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkPaymentMethod(com.appscode.api.dtypes.VoidRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHECK_PAYMENT_METHOD, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BillingBlockingStub extends io.grpc.stub.AbstractStub<BillingBlockingStub> {
    private BillingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BillingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BillingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Checks current subscription of a namespace
     * </pre>
     */
    public com.appscode.api.namespace.v1beta1.GetSubscriptionResponse getSubscription(com.appscode.api.dtypes.VoidRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SUBSCRIPTION, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.namespace.v1beta1.GetQuotaResponse getQuota(com.appscode.api.dtypes.VoidRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_QUOTA, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse checkPaymentMethod(com.appscode.api.dtypes.VoidRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHECK_PAYMENT_METHOD, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BillingFutureStub extends io.grpc.stub.AbstractStub<BillingFutureStub> {
    private BillingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BillingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BillingFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Checks current subscription of a namespace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.namespace.v1beta1.GetSubscriptionResponse> getSubscription(
        com.appscode.api.dtypes.VoidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIPTION, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.namespace.v1beta1.GetQuotaResponse> getQuota(
        com.appscode.api.dtypes.VoidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_QUOTA, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> checkPaymentMethod(
        com.appscode.api.dtypes.VoidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHECK_PAYMENT_METHOD, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SUBSCRIPTION = 0;
  private static final int METHODID_GET_QUOTA = 1;
  private static final int METHODID_CHECK_PAYMENT_METHOD = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BillingImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(BillingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SUBSCRIPTION:
          serviceImpl.getSubscription((com.appscode.api.dtypes.VoidRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.namespace.v1beta1.GetSubscriptionResponse>) responseObserver);
          break;
        case METHODID_GET_QUOTA:
          serviceImpl.getQuota((com.appscode.api.dtypes.VoidRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.namespace.v1beta1.GetQuotaResponse>) responseObserver);
          break;
        case METHODID_CHECK_PAYMENT_METHOD:
          serviceImpl.checkPaymentMethod((com.appscode.api.dtypes.VoidRequest) request,
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
        METHOD_GET_SUBSCRIPTION,
        METHOD_GET_QUOTA,
        METHOD_CHECK_PAYMENT_METHOD);
  }

}
