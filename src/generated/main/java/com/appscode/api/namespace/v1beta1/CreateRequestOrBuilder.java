// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/namespace/v1beta1/team.proto

package com.appscode.api.namespace.v1beta1;

public interface CreateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.namespace.v1beta1.CreateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <code>string email = 3;</code>
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 3;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string user_name = 4;</code>
   */
  java.lang.String getUserName();
  /**
   * <code>string user_name = 4;</code>
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>string password = 5;</code>
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 5;</code>
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
   * <code>string subscription_type = 7;</code>
   */
  java.lang.String getSubscriptionType();
  /**
   * <code>string subscription_type = 7;</code>
   */
  com.google.protobuf.ByteString
      getSubscriptionTypeBytes();

  /**
   * <code>string client_ip = 8;</code>
   */
  java.lang.String getClientIp();
  /**
   * <code>string client_ip = 8;</code>
   */
  com.google.protobuf.ByteString
      getClientIpBytes();

  /**
   * <code>string payment_method_nonce = 9;</code>
   */
  java.lang.String getPaymentMethodNonce();
  /**
   * <code>string payment_method_nonce = 9;</code>
   */
  com.google.protobuf.ByteString
      getPaymentMethodNonceBytes();

  /**
   * <code>map&lt;string, string&gt; options = 10;</code>
   */
  int getOptionsCount();
  /**
   * <code>map&lt;string, string&gt; options = 10;</code>
   */
  boolean containsOptions(
      java.lang.String key);
  /**
   * Use {@link #getOptionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getOptions();
  /**
   * <code>map&lt;string, string&gt; options = 10;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getOptionsMap();
  /**
   * <code>map&lt;string, string&gt; options = 10;</code>
   */

  java.lang.String getOptionsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; options = 10;</code>
   */

  java.lang.String getOptionsOrThrow(
      java.lang.String key);
}
