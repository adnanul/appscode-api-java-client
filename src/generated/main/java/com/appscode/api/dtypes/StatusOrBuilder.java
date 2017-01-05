// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/dtypes/types.proto

package com.appscode.api.dtypes;

public interface StatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.dtypes.Status)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Response status code
   * </pre>
   *
   * <code>optional string code = 1;</code>
   */
  java.lang.String getCode();
  /**
   * <pre>
   * Response status code
   * </pre>
   *
   * <code>optional string code = 1;</code>
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <pre>
   * Response status code string.
   * </pre>
   *
   * <code>optional string status = 2;</code>
   */
  java.lang.String getStatus();
  /**
   * <pre>
   * Response status code string.
   * </pre>
   *
   * <code>optional string status = 2;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <pre>
   * User facing message.
   * </pre>
   *
   * <code>optional string message = 3;</code>
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * User facing message.
   * </pre>
   *
   * <code>optional string message = 3;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * Optional. Help link if there is an error.
   * </pre>
   *
   * <code>optional .appscode.dtypes.Help help = 4;</code>
   */
  boolean hasHelp();
  /**
   * <pre>
   * Optional. Help link if there is an error.
   * </pre>
   *
   * <code>optional .appscode.dtypes.Help help = 4;</code>
   */
  com.appscode.api.dtypes.Help getHelp();
  /**
   * <pre>
   * Optional. Help link if there is an error.
   * </pre>
   *
   * <code>optional .appscode.dtypes.Help help = 4;</code>
   */
  com.appscode.api.dtypes.HelpOrBuilder getHelpOrBuilder();

  /**
   * <pre>
   * A list of messages that carry the error details.  There will be a
   * common set of message types for APIs to use.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any details = 5;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getDetailsList();
  /**
   * <pre>
   * A list of messages that carry the error details.  There will be a
   * common set of message types for APIs to use.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any details = 5;</code>
   */
  com.google.protobuf.Any getDetails(int index);
  /**
   * <pre>
   * A list of messages that carry the error details.  There will be a
   * common set of message types for APIs to use.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any details = 5;</code>
   */
  int getDetailsCount();
  /**
   * <pre>
   * A list of messages that carry the error details.  There will be a
   * common set of message types for APIs to use.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any details = 5;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getDetailsOrBuilderList();
  /**
   * <pre>
   * A list of messages that carry the error details.  There will be a
   * common set of message types for APIs to use.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any details = 5;</code>
   */
  com.google.protobuf.AnyOrBuilder getDetailsOrBuilder(
      int index);
}
