// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/ssh/v1beta1/ssh.proto

package com.appscode.api.ssh.v1beta1;

public interface SSHKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.ssh.v1beta1.SSHKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes public_key = 1;</code>
   */
  com.google.protobuf.ByteString getPublicKey();

  /**
   * <code>bytes private_key = 2;</code>
   */
  com.google.protobuf.ByteString getPrivateKey();

  /**
   * <code>string aws_fingerprint = 3;</code>
   */
  java.lang.String getAwsFingerprint();
  /**
   * <code>string aws_fingerprint = 3;</code>
   */
  com.google.protobuf.ByteString
      getAwsFingerprintBytes();

  /**
   * <code>string openssh_fingerprint = 4;</code>
   */
  java.lang.String getOpensshFingerprint();
  /**
   * <code>string openssh_fingerprint = 4;</code>
   */
  com.google.protobuf.ByteString
      getOpensshFingerprintBytes();
}
