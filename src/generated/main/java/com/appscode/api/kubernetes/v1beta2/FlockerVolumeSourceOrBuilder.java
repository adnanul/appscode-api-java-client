// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface FlockerVolumeSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.FlockerVolumeSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required: the volume name. This is going to be store on metadata -&gt; name on the payload for Flocker
   * </pre>
   *
   * <code>optional string datasetName = 1;</code>
   */
  java.lang.String getDatasetName();
  /**
   * <pre>
   * Required: the volume name. This is going to be store on metadata -&gt; name on the payload for Flocker
   * </pre>
   *
   * <code>optional string datasetName = 1;</code>
   */
  com.google.protobuf.ByteString
      getDatasetNameBytes();
}
