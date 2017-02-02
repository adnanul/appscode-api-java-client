package com.appscode.api.kubernetes.v1beta2;

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
    comments = "Source: appscode/api/kubernetes/v1beta2/client.proto")
public class ClientsGrpc {

  private ClientsGrpc() {}

  public static final String SERVICE_NAME = "appscode.kubernetes.v1beta2.Clients";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta2.ListResourceRequest,
      com.appscode.api.kubernetes.v1beta2.ListResourceResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta2.Clients", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.ListResourceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.ListResourceResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta2.DescribeResourceRequest,
      com.appscode.api.kubernetes.v1beta2.DescribeResourceResponse> METHOD_DESCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta2.Clients", "Describe"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.DescribeResourceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.DescribeResourceResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta2.CreateResourceRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta2.Clients", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.CreateResourceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta2.DeleteResourceRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta2.Clients", "Delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.DeleteResourceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta2.UpdateResourceRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_UPDATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta2.Clients", "Update"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.UpdateResourceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta2.CopyResourceRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_COPY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta2.Clients", "Copy"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.CopyResourceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta2.ConfigMapEditRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_EDIT_CONFIG_MAP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta2.Clients", "EditConfigMap"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.ConfigMapEditRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta2.SecretEditRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_EDIT_SECRET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta2.Clients", "EditSecret"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.SecretEditRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta2.PersistentVolumeRegisterRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_REGISTER_PERSISTENT_VOLUME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta2.Clients", "RegisterPersistentVolume"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.PersistentVolumeRegisterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta2.PersistentVolumeUnRegisterRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_UNREGISTER_PERSISTENT_VOLUME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta2.Clients", "UnregisterPersistentVolume"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.PersistentVolumeUnRegisterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimRegisterRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_REGISTER_PERSISTENT_VOLUME_CLAIM =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta2.Clients", "RegisterPersistentVolumeClaim"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimRegisterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimUnRegisterRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_UNREGISTER_PERSISTENT_VOLUME_CLAIM =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.kubernetes.v1beta2.Clients", "UnregisterPersistentVolumeClaim"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimUnRegisterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientsStub newStub(io.grpc.Channel channel) {
    return new ClientsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClientsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ClientsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClientsFutureStub(channel);
  }

  /**
   */
  public static abstract class ClientsImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(com.appscode.api.kubernetes.v1beta2.ListResourceRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta2.ListResourceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.kubernetes.v1beta2.DescribeResourceRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta2.DescribeResourceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESCRIBE, responseObserver);
    }

    /**
     */
    public void create(com.appscode.api.kubernetes.v1beta2.CreateResourceRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.kubernetes.v1beta2.DeleteResourceRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     */
    public void update(com.appscode.api.kubernetes.v1beta2.UpdateResourceRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE, responseObserver);
    }

    /**
     */
    public void copy(com.appscode.api.kubernetes.v1beta2.CopyResourceRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COPY, responseObserver);
    }

    /**
     * <pre>
     * Followings are type specific actions api, that can be applied upon fixed resources.
     * TODO: (&#64;sadlil) Consider seperating them.
     * </pre>
     */
    public void editConfigMap(com.appscode.api.kubernetes.v1beta2.ConfigMapEditRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EDIT_CONFIG_MAP, responseObserver);
    }

    /**
     */
    public void editSecret(com.appscode.api.kubernetes.v1beta2.SecretEditRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EDIT_SECRET, responseObserver);
    }

    /**
     */
    public void registerPersistentVolume(com.appscode.api.kubernetes.v1beta2.PersistentVolumeRegisterRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_PERSISTENT_VOLUME, responseObserver);
    }

    /**
     */
    public void unregisterPersistentVolume(com.appscode.api.kubernetes.v1beta2.PersistentVolumeUnRegisterRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UNREGISTER_PERSISTENT_VOLUME, responseObserver);
    }

    /**
     */
    public void registerPersistentVolumeClaim(com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimRegisterRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_PERSISTENT_VOLUME_CLAIM, responseObserver);
    }

    /**
     */
    public void unregisterPersistentVolumeClaim(com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimUnRegisterRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UNREGISTER_PERSISTENT_VOLUME_CLAIM, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta2.ListResourceRequest,
                com.appscode.api.kubernetes.v1beta2.ListResourceResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_DESCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta2.DescribeResourceRequest,
                com.appscode.api.kubernetes.v1beta2.DescribeResourceResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta2.CreateResourceRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta2.DeleteResourceRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta2.UpdateResourceRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            METHOD_COPY,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta2.CopyResourceRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_COPY)))
          .addMethod(
            METHOD_EDIT_CONFIG_MAP,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta2.ConfigMapEditRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_EDIT_CONFIG_MAP)))
          .addMethod(
            METHOD_EDIT_SECRET,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta2.SecretEditRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_EDIT_SECRET)))
          .addMethod(
            METHOD_REGISTER_PERSISTENT_VOLUME,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta2.PersistentVolumeRegisterRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_REGISTER_PERSISTENT_VOLUME)))
          .addMethod(
            METHOD_UNREGISTER_PERSISTENT_VOLUME,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta2.PersistentVolumeUnRegisterRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_UNREGISTER_PERSISTENT_VOLUME)))
          .addMethod(
            METHOD_REGISTER_PERSISTENT_VOLUME_CLAIM,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimRegisterRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_REGISTER_PERSISTENT_VOLUME_CLAIM)))
          .addMethod(
            METHOD_UNREGISTER_PERSISTENT_VOLUME_CLAIM,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimUnRegisterRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_UNREGISTER_PERSISTENT_VOLUME_CLAIM)))
          .build();
    }
  }

  /**
   */
  public static final class ClientsStub extends io.grpc.stub.AbstractStub<ClientsStub> {
    private ClientsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientsStub(channel, callOptions);
    }

    /**
     */
    public void list(com.appscode.api.kubernetes.v1beta2.ListResourceRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta2.ListResourceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.kubernetes.v1beta2.DescribeResourceRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta2.DescribeResourceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(com.appscode.api.kubernetes.v1beta2.CreateResourceRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.appscode.api.kubernetes.v1beta2.DeleteResourceRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.appscode.api.kubernetes.v1beta2.UpdateResourceRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void copy(com.appscode.api.kubernetes.v1beta2.CopyResourceRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COPY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Followings are type specific actions api, that can be applied upon fixed resources.
     * TODO: (&#64;sadlil) Consider seperating them.
     * </pre>
     */
    public void editConfigMap(com.appscode.api.kubernetes.v1beta2.ConfigMapEditRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EDIT_CONFIG_MAP, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editSecret(com.appscode.api.kubernetes.v1beta2.SecretEditRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EDIT_SECRET, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerPersistentVolume(com.appscode.api.kubernetes.v1beta2.PersistentVolumeRegisterRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_PERSISTENT_VOLUME, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unregisterPersistentVolume(com.appscode.api.kubernetes.v1beta2.PersistentVolumeUnRegisterRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UNREGISTER_PERSISTENT_VOLUME, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerPersistentVolumeClaim(com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimRegisterRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_PERSISTENT_VOLUME_CLAIM, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unregisterPersistentVolumeClaim(com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimUnRegisterRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UNREGISTER_PERSISTENT_VOLUME_CLAIM, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClientsBlockingStub extends io.grpc.stub.AbstractStub<ClientsBlockingStub> {
    private ClientsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta2.ListResourceResponse list(com.appscode.api.kubernetes.v1beta2.ListResourceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.kubernetes.v1beta2.DescribeResourceResponse describe(com.appscode.api.kubernetes.v1beta2.DescribeResourceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESCRIBE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse create(com.appscode.api.kubernetes.v1beta2.CreateResourceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse delete(com.appscode.api.kubernetes.v1beta2.DeleteResourceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse update(com.appscode.api.kubernetes.v1beta2.UpdateResourceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse copy(com.appscode.api.kubernetes.v1beta2.CopyResourceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COPY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Followings are type specific actions api, that can be applied upon fixed resources.
     * TODO: (&#64;sadlil) Consider seperating them.
     * </pre>
     */
    public com.appscode.api.dtypes.VoidResponse editConfigMap(com.appscode.api.kubernetes.v1beta2.ConfigMapEditRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EDIT_CONFIG_MAP, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse editSecret(com.appscode.api.kubernetes.v1beta2.SecretEditRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EDIT_SECRET, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse registerPersistentVolume(com.appscode.api.kubernetes.v1beta2.PersistentVolumeRegisterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_PERSISTENT_VOLUME, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse unregisterPersistentVolume(com.appscode.api.kubernetes.v1beta2.PersistentVolumeUnRegisterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UNREGISTER_PERSISTENT_VOLUME, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse registerPersistentVolumeClaim(com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimRegisterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_PERSISTENT_VOLUME_CLAIM, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse unregisterPersistentVolumeClaim(com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimUnRegisterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UNREGISTER_PERSISTENT_VOLUME_CLAIM, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClientsFutureStub extends io.grpc.stub.AbstractStub<ClientsFutureStub> {
    private ClientsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta2.ListResourceResponse> list(
        com.appscode.api.kubernetes.v1beta2.ListResourceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.kubernetes.v1beta2.DescribeResourceResponse> describe(
        com.appscode.api.kubernetes.v1beta2.DescribeResourceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> create(
        com.appscode.api.kubernetes.v1beta2.CreateResourceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> delete(
        com.appscode.api.kubernetes.v1beta2.DeleteResourceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> update(
        com.appscode.api.kubernetes.v1beta2.UpdateResourceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> copy(
        com.appscode.api.kubernetes.v1beta2.CopyResourceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COPY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Followings are type specific actions api, that can be applied upon fixed resources.
     * TODO: (&#64;sadlil) Consider seperating them.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> editConfigMap(
        com.appscode.api.kubernetes.v1beta2.ConfigMapEditRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EDIT_CONFIG_MAP, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> editSecret(
        com.appscode.api.kubernetes.v1beta2.SecretEditRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EDIT_SECRET, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> registerPersistentVolume(
        com.appscode.api.kubernetes.v1beta2.PersistentVolumeRegisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_PERSISTENT_VOLUME, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> unregisterPersistentVolume(
        com.appscode.api.kubernetes.v1beta2.PersistentVolumeUnRegisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UNREGISTER_PERSISTENT_VOLUME, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> registerPersistentVolumeClaim(
        com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimRegisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_PERSISTENT_VOLUME_CLAIM, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> unregisterPersistentVolumeClaim(
        com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimUnRegisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UNREGISTER_PERSISTENT_VOLUME_CLAIM, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_DESCRIBE = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_COPY = 5;
  private static final int METHODID_EDIT_CONFIG_MAP = 6;
  private static final int METHODID_EDIT_SECRET = 7;
  private static final int METHODID_REGISTER_PERSISTENT_VOLUME = 8;
  private static final int METHODID_UNREGISTER_PERSISTENT_VOLUME = 9;
  private static final int METHODID_REGISTER_PERSISTENT_VOLUME_CLAIM = 10;
  private static final int METHODID_UNREGISTER_PERSISTENT_VOLUME_CLAIM = 11;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClientsImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ClientsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.appscode.api.kubernetes.v1beta2.ListResourceRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta2.ListResourceResponse>) responseObserver);
          break;
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.appscode.api.kubernetes.v1beta2.DescribeResourceRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.kubernetes.v1beta2.DescribeResourceResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.appscode.api.kubernetes.v1beta2.CreateResourceRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.appscode.api.kubernetes.v1beta2.DeleteResourceRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.appscode.api.kubernetes.v1beta2.UpdateResourceRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_COPY:
          serviceImpl.copy((com.appscode.api.kubernetes.v1beta2.CopyResourceRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_EDIT_CONFIG_MAP:
          serviceImpl.editConfigMap((com.appscode.api.kubernetes.v1beta2.ConfigMapEditRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_EDIT_SECRET:
          serviceImpl.editSecret((com.appscode.api.kubernetes.v1beta2.SecretEditRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_REGISTER_PERSISTENT_VOLUME:
          serviceImpl.registerPersistentVolume((com.appscode.api.kubernetes.v1beta2.PersistentVolumeRegisterRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_UNREGISTER_PERSISTENT_VOLUME:
          serviceImpl.unregisterPersistentVolume((com.appscode.api.kubernetes.v1beta2.PersistentVolumeUnRegisterRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_REGISTER_PERSISTENT_VOLUME_CLAIM:
          serviceImpl.registerPersistentVolumeClaim((com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimRegisterRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_UNREGISTER_PERSISTENT_VOLUME_CLAIM:
          serviceImpl.unregisterPersistentVolumeClaim((com.appscode.api.kubernetes.v1beta2.PersistentVolumeClaimUnRegisterRequest) request,
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
        METHOD_DELETE,
        METHOD_UPDATE,
        METHOD_COPY,
        METHOD_EDIT_CONFIG_MAP,
        METHOD_EDIT_SECRET,
        METHOD_REGISTER_PERSISTENT_VOLUME,
        METHOD_UNREGISTER_PERSISTENT_VOLUME,
        METHOD_REGISTER_PERSISTENT_VOLUME_CLAIM,
        METHOD_UNREGISTER_PERSISTENT_VOLUME_CLAIM);
  }

}
