// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/client.proto

package com.appscode.api.kubernetes.v1beta1;

public interface JobListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.JobListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .appscode.dtypes.Status status = 1;</code>
   */
  boolean hasStatus();
  /**
   * <code>optional .appscode.dtypes.Status status = 1;</code>
   */
  com.appscode.api.dtypes.Status getStatus();
  /**
   * <code>optional .appscode.dtypes.Status status = 1;</code>
   */
  com.appscode.api.dtypes.StatusOrBuilder getStatusOrBuilder();

  /**
   * <code>repeated .appscode.kubernetes.v1beta1.Job jobs = 2;</code>
   */
  java.util.List<com.appscode.api.kubernetes.v1beta1.Job> 
      getJobsList();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.Job jobs = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta1.Job getJobs(int index);
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.Job jobs = 2;</code>
   */
  int getJobsCount();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.Job jobs = 2;</code>
   */
  java.util.List<? extends com.appscode.api.kubernetes.v1beta1.JobOrBuilder> 
      getJobsOrBuilderList();
  /**
   * <code>repeated .appscode.kubernetes.v1beta1.Job jobs = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta1.JobOrBuilder getJobsOrBuilder(
      int index);
}