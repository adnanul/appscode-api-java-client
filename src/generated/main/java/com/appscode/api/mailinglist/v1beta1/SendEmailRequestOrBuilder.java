// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/mailinglist/v1beta1/mailinglist.proto

package com.appscode.api.mailinglist.v1beta1;

public interface SendEmailRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.mailinglist.v1beta1.SendEmailRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string sender_name = 1;</code>
   */
  java.lang.String getSenderName();
  /**
   * <code>optional string sender_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getSenderNameBytes();

  /**
   * <code>optional string sender_email = 2;</code>
   */
  java.lang.String getSenderEmail();
  /**
   * <code>optional string sender_email = 2;</code>
   */
  com.google.protobuf.ByteString
      getSenderEmailBytes();

  /**
   * <code>optional string subject = 3;</code>
   */
  java.lang.String getSubject();
  /**
   * <code>optional string subject = 3;</code>
   */
  com.google.protobuf.ByteString
      getSubjectBytes();

  /**
   * <code>optional string body = 4;</code>
   */
  java.lang.String getBody();
  /**
   * <code>optional string body = 4;</code>
   */
  com.google.protobuf.ByteString
      getBodyBytes();

  /**
   * <code>optional string receiver_email = 5;</code>
   */
  java.lang.String getReceiverEmail();
  /**
   * <code>optional string receiver_email = 5;</code>
   */
  com.google.protobuf.ByteString
      getReceiverEmailBytes();
}