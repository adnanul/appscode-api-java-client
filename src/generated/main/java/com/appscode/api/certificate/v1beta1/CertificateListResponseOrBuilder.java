// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/certificate/v1beta1/certificate.proto

package com.appscode.api.certificate.v1beta1;

public interface CertificateListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.certificate.v1beta1.CertificateListResponse)
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
   * <code>repeated .appscode.certificate.v1beta1.Certificate certificates = 2;</code>
   */
  java.util.List<com.appscode.api.certificate.v1beta1.Certificate> 
      getCertificatesList();
  /**
   * <code>repeated .appscode.certificate.v1beta1.Certificate certificates = 2;</code>
   */
  com.appscode.api.certificate.v1beta1.Certificate getCertificates(int index);
  /**
   * <code>repeated .appscode.certificate.v1beta1.Certificate certificates = 2;</code>
   */
  int getCertificatesCount();
  /**
   * <code>repeated .appscode.certificate.v1beta1.Certificate certificates = 2;</code>
   */
  java.util.List<? extends com.appscode.api.certificate.v1beta1.CertificateOrBuilder> 
      getCertificatesOrBuilderList();
  /**
   * <code>repeated .appscode.certificate.v1beta1.Certificate certificates = 2;</code>
   */
  com.appscode.api.certificate.v1beta1.CertificateOrBuilder getCertificatesOrBuilder(
      int index);
}
