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
    comments = "Source: appscode/api/kubernetes/v1beta1/metadata.proto")
public class MetadataGrpc {

  private MetadataGrpc() {}

  public static final String SERVICE_NAME = "appscode.kubernetes.v1beta1.Metadata";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.RegionListRequest,
      com.appscode.api.kubernetes.v1beta1.RegionListResponse> METHOD_LIST_REGIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Metadata", "ListRegions"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.RegionListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.RegionListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.ZoneListRequest,
      com.appscode.api.kubernetes.v1beta1.ZoneListResponse> METHOD_LIST_ZONES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Metadata", "ListZones"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ZoneListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.ZoneListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta1.BucketListRequest,
      com.appscode.api.kubernetes.v1beta1.BucketListResponse> METHOD_LIST_BUCKETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta1.Metadata", "ListBuckets"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.BucketListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta1.BucketListResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetadataStub newStub(io.grpc.Channel channel) {
    return new MetadataStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetadataBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MetadataBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static MetadataFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MetadataFutureStub(channel);
  }

  /**
   */
  public static abstract class MetadataImplBase implements io.grpc.BindableService {

    /**
     */
    public void listRegions(com.appscode.api.kubernetes.v1beta1.RegionListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.RegionListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_REGIONS, responseObserver);
    }

    /**
     */
    public void listZones(com.appscode.api.kubernetes.v1beta1.ZoneListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ZoneListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_ZONES, responseObserver);
    }

    /**
     */
    public void listBuckets(com.appscode.api.kubernetes.v1beta1.BucketListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.BucketListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_BUCKETS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_REGIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.RegionListRequest,
                com.appscode.api.kubernetes.v1beta1.RegionListResponse>(
                  this, METHODID_LIST_REGIONS)))
          .addMethod(
            METHOD_LIST_ZONES,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.ZoneListRequest,
                com.appscode.api.kubernetes.v1beta1.ZoneListResponse>(
                  this, METHODID_LIST_ZONES)))
          .addMethod(
            METHOD_LIST_BUCKETS,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta1.BucketListRequest,
                com.appscode.api.kubernetes.v1beta1.BucketListResponse>(
                  this, METHODID_LIST_BUCKETS)))
          .build();
    }
  }

  /**
   */
  public static final class MetadataStub extends io.grpc.stub.AbstractStub<MetadataStub> {
    private MetadataStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataStub(channel, callOptions);
    }

    /**
     */
    public void listRegions(com.appscode.api.kubernetes.v1beta1.RegionListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.RegionListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_REGIONS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listZones(com.appscode.api.kubernetes.v1beta1.ZoneListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ZoneListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_ZONES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBuckets(com.appscode.api.kubernetes.v1beta1.BucketListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.BucketListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_BUCKETS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MetadataBlockingStub extends io.grpc.stub.AbstractStub<MetadataBlockingStub> {
    private MetadataBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.RegionListResponse listRegions(com.appscode.api.kubernetes.v1beta1.RegionListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_REGIONS, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.ZoneListResponse listZones(com.appscode.api.kubernetes.v1beta1.ZoneListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_ZONES, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta1.BucketListResponse listBuckets(com.appscode.api.kubernetes.v1beta1.BucketListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_BUCKETS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MetadataFutureStub extends io.grpc.stub.AbstractStub<MetadataFutureStub> {
    private MetadataFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.RegionListResponse> listRegions(
        com.appscode.api.kubernetes.v1beta1.RegionListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_REGIONS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.ZoneListResponse> listZones(
        com.appscode.api.kubernetes.v1beta1.ZoneListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_ZONES, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta1.BucketListResponse> listBuckets(
        com.appscode.api.kubernetes.v1beta1.BucketListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_BUCKETS, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_REGIONS = 0;
  private static final int METHODID_LIST_ZONES = 1;
  private static final int METHODID_LIST_BUCKETS = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetadataImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(MetadataImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_REGIONS:
          serviceImpl.listRegions((com.appscode.api.kubernetes.v1beta1.RegionListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.RegionListResponse>) responseObserver);
          break;
        case METHODID_LIST_ZONES:
          serviceImpl.listZones((com.appscode.api.kubernetes.v1beta1.ZoneListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.ZoneListResponse>) responseObserver);
          break;
        case METHODID_LIST_BUCKETS:
          serviceImpl.listBuckets((com.appscode.api.kubernetes.v1beta1.BucketListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta1.BucketListResponse>) responseObserver);
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
        METHOD_LIST_REGIONS,
        METHOD_LIST_ZONES,
        METHOD_LIST_BUCKETS);
  }

}
