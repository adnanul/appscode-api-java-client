package com.appscode.api.db.v1beta1;

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
    comments = "Source: appscode/api/db/v1beta1/snapshot.proto")
public class SnapshotsGrpc {

  private SnapshotsGrpc() {}

  public static final String SERVICE_NAME = "appscode.db.v1beta1.Snapshots";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.db.v1beta1.SnapshotListRequest,
      com.appscode.api.db.v1beta1.SnapshotListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.db.v1beta1.Snapshots", "List"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.db.v1beta1.SnapshotListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.db.v1beta1.SnapshotListResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.db.v1beta1.SnapshotDescribeRequest,
      com.appscode.api.db.v1beta1.SnapshotDescribeResponse> METHOD_DESCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.db.v1beta1.Snapshots", "Describe"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.db.v1beta1.SnapshotDescribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.db.v1beta1.SnapshotDescribeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.db.v1beta1.BackupScheduleRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_BACKUP_SCHEDULE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.db.v1beta1.Snapshots", "BackupSchedule"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.db.v1beta1.BackupScheduleRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.db.v1beta1.BackupUnscheduleRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_BACKUP_UNSCHEDULE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.db.v1beta1.Snapshots", "BackupUnschedule"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.db.v1beta1.BackupUnscheduleRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.appscode.api.db.v1beta1.SnapshotRestoreRequest,
      com.appscode.api.dtypes.VoidResponse> METHOD_RESTORE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "appscode.db.v1beta1.Snapshots", "Restore"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.db.v1beta1.SnapshotRestoreRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.appscode.api.dtypes.VoidResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SnapshotsStub newStub(io.grpc.Channel channel) {
    return new SnapshotsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SnapshotsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SnapshotsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static SnapshotsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SnapshotsFutureStub(channel);
  }

  /**
   */
  public static abstract class SnapshotsImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(com.appscode.api.db.v1beta1.SnapshotListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.db.v1beta1.SnapshotListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.db.v1beta1.SnapshotDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.db.v1beta1.SnapshotDescribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DESCRIBE, responseObserver);
    }

    /**
     */
    public void backupSchedule(com.appscode.api.db.v1beta1.BackupScheduleRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BACKUP_SCHEDULE, responseObserver);
    }

    /**
     */
    public void backupUnschedule(com.appscode.api.db.v1beta1.BackupUnscheduleRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BACKUP_UNSCHEDULE, responseObserver);
    }

    /**
     */
    public void restore(com.appscode.api.db.v1beta1.SnapshotRestoreRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RESTORE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.db.v1beta1.SnapshotListRequest,
                com.appscode.api.db.v1beta1.SnapshotListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_DESCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.db.v1beta1.SnapshotDescribeRequest,
                com.appscode.api.db.v1beta1.SnapshotDescribeResponse>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            METHOD_BACKUP_SCHEDULE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.db.v1beta1.BackupScheduleRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_BACKUP_SCHEDULE)))
          .addMethod(
            METHOD_BACKUP_UNSCHEDULE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.db.v1beta1.BackupUnscheduleRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_BACKUP_UNSCHEDULE)))
          .addMethod(
            METHOD_RESTORE,
            asyncUnaryCall(
              new MethodHandlers<
                com.appscode.api.db.v1beta1.SnapshotRestoreRequest,
                com.appscode.api.dtypes.VoidResponse>(
                  this, METHODID_RESTORE)))
          .build();
    }
  }

  /**
   */
  public static final class SnapshotsStub extends io.grpc.stub.AbstractStub<SnapshotsStub> {
    private SnapshotsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SnapshotsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnapshotsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SnapshotsStub(channel, callOptions);
    }

    /**
     */
    public void list(com.appscode.api.db.v1beta1.SnapshotListRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.db.v1beta1.SnapshotListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describe(com.appscode.api.db.v1beta1.SnapshotDescribeRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.db.v1beta1.SnapshotDescribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void backupSchedule(com.appscode.api.db.v1beta1.BackupScheduleRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BACKUP_SCHEDULE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void backupUnschedule(com.appscode.api.db.v1beta1.BackupUnscheduleRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BACKUP_UNSCHEDULE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void restore(com.appscode.api.db.v1beta1.SnapshotRestoreRequest request,
        io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RESTORE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SnapshotsBlockingStub extends io.grpc.stub.AbstractStub<SnapshotsBlockingStub> {
    private SnapshotsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SnapshotsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnapshotsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SnapshotsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.appscode.api.db.v1beta1.SnapshotListResponse list(com.appscode.api.db.v1beta1.SnapshotListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.db.v1beta1.SnapshotDescribeResponse describe(com.appscode.api.db.v1beta1.SnapshotDescribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DESCRIBE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse backupSchedule(com.appscode.api.db.v1beta1.BackupScheduleRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BACKUP_SCHEDULE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse backupUnschedule(com.appscode.api.db.v1beta1.BackupUnscheduleRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BACKUP_UNSCHEDULE, getCallOptions(), request);
    }

    /**
     */
    public com.appscode.api.dtypes.VoidResponse restore(com.appscode.api.db.v1beta1.SnapshotRestoreRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RESTORE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SnapshotsFutureStub extends io.grpc.stub.AbstractStub<SnapshotsFutureStub> {
    private SnapshotsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SnapshotsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnapshotsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SnapshotsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.db.v1beta1.SnapshotListResponse> list(
        com.appscode.api.db.v1beta1.SnapshotListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.db.v1beta1.SnapshotDescribeResponse> describe(
        com.appscode.api.db.v1beta1.SnapshotDescribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DESCRIBE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> backupSchedule(
        com.appscode.api.db.v1beta1.BackupScheduleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BACKUP_SCHEDULE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> backupUnschedule(
        com.appscode.api.db.v1beta1.BackupUnscheduleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BACKUP_UNSCHEDULE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.appscode.api.dtypes.VoidResponse> restore(
        com.appscode.api.db.v1beta1.SnapshotRestoreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RESTORE, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_DESCRIBE = 1;
  private static final int METHODID_BACKUP_SCHEDULE = 2;
  private static final int METHODID_BACKUP_UNSCHEDULE = 3;
  private static final int METHODID_RESTORE = 4;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SnapshotsImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(SnapshotsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.appscode.api.db.v1beta1.SnapshotListRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.db.v1beta1.SnapshotListResponse>) responseObserver);
          break;
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.appscode.api.db.v1beta1.SnapshotDescribeRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.db.v1beta1.SnapshotDescribeResponse>) responseObserver);
          break;
        case METHODID_BACKUP_SCHEDULE:
          serviceImpl.backupSchedule((com.appscode.api.db.v1beta1.BackupScheduleRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_BACKUP_UNSCHEDULE:
          serviceImpl.backupUnschedule((com.appscode.api.db.v1beta1.BackupUnscheduleRequest) request,
              (io.grpc.stub.StreamObserver<com.appscode.api.dtypes.VoidResponse>) responseObserver);
          break;
        case METHODID_RESTORE:
          serviceImpl.restore((com.appscode.api.db.v1beta1.SnapshotRestoreRequest) request,
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
        METHOD_BACKUP_SCHEDULE,
        METHOD_BACKUP_UNSCHEDULE,
        METHOD_RESTORE);
  }

}
