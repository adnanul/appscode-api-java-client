// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface ListResourceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.ListResourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string cluster = 1;</code>
   */
  java.lang.String getCluster();
  /**
   * <code>string cluster = 1;</code>
   */
  com.google.protobuf.ByteString
      getClusterBytes();

  /**
   * <code>string type = 2;</code>
   */
  java.lang.String getType();
  /**
   * <code>string type = 2;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string namespace = 3;</code>
   */
  java.lang.String getNamespace();
  /**
   * <code>string namespace = 3;</code>
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <code>bool include_metrics = 4;</code>
   */
  boolean getIncludeMetrics();

  /**
   * <code>.appscode.kubernetes.v1beta2.ListResourceRequest.Ancestor ancestor = 5;</code>
   */
  boolean hasAncestor();
  /**
   * <code>.appscode.kubernetes.v1beta2.ListResourceRequest.Ancestor ancestor = 5;</code>
   */
  com.appscode.api.kubernetes.v1beta2.ListResourceRequest.Ancestor getAncestor();
  /**
   * <code>.appscode.kubernetes.v1beta2.ListResourceRequest.Ancestor ancestor = 5;</code>
   */
  com.appscode.api.kubernetes.v1beta2.ListResourceRequest.AncestorOrBuilder getAncestorOrBuilder();

  /**
   * <pre>
   * map type is not supported by grpc-gateway as query params.
   * https://github.com/grpc-ecosystem/grpc-gateway/blob/master/runtime/query.go#L57
   * https://github.com/grpc-ecosystem/grpc-gateway/issues/316
   * map&lt;string, string&gt; label_selector = 6;
   * example label_selector=environment=production,tier=frontend
   * </pre>
   *
   * <code>string label_selector = 7;</code>
   */
  java.lang.String getLabelSelector();
  /**
   * <pre>
   * map type is not supported by grpc-gateway as query params.
   * https://github.com/grpc-ecosystem/grpc-gateway/blob/master/runtime/query.go#L57
   * https://github.com/grpc-ecosystem/grpc-gateway/issues/316
   * map&lt;string, string&gt; label_selector = 6;
   * example label_selector=environment=production,tier=frontend
   * </pre>
   *
   * <code>string label_selector = 7;</code>
   */
  com.google.protobuf.ByteString
      getLabelSelectorBytes();
}
