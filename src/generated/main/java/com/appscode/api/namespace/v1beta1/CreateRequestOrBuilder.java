// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/namespace/v1beta1/team.proto

package com.appscode.api.namespace.v1beta1;

public interface CreateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.namespace.v1beta1.CreateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   * <code>optional string display_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <code>optional string email = 3;</code>
   */
  java.lang.String getEmail();
  /**
   * <code>optional string email = 3;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>optional string user_name = 4;</code>
   */
  java.lang.String getUserName();
  /**
   * <code>optional string user_name = 4;</code>
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>optional string password = 5;</code>
   */
  java.lang.String getPassword();
  /**
   * <code>optional string password = 5;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>repeated string invite_emails = 6;</code>
   */
  java.util.List<java.lang.String>
      getInviteEmailsList();
  /**
   * <code>repeated string invite_emails = 6;</code>
   */
  int getInviteEmailsCount();
  /**
   * <code>repeated string invite_emails = 6;</code>
   */
  java.lang.String getInviteEmails(int index);
  /**
   * <code>repeated string invite_emails = 6;</code>
   */
  com.google.protobuf.ByteString
      getInviteEmailsBytes(int index);

  /**
   * <code>optional string subscription_type = 7;</code>
   */
  java.lang.String getSubscriptionType();
  /**
   * <code>optional string subscription_type = 7;</code>
   */
  com.google.protobuf.ByteString
      getSubscriptionTypeBytes();

  /**
   * <code>optional string client_ip = 8;</code>
   */
  java.lang.String getClientIp();
  /**
   * <code>optional string client_ip = 8;</code>
   */
  com.google.protobuf.ByteString
      getClientIpBytes();
}
