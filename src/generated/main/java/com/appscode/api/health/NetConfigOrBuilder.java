// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/health/health.proto

package com.appscode.api.health;

public interface NetConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.health.NetConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string team_addr = 1;</code>
   */
  java.lang.String getTeamAddr();
  /**
   * <code>string team_addr = 1;</code>
   */
  com.google.protobuf.ByteString
      getTeamAddrBytes();

  /**
   * <code>.appscode.health.URLBase public_urls = 2;</code>
   */
  boolean hasPublicUrls();
  /**
   * <code>.appscode.health.URLBase public_urls = 2;</code>
   */
  com.appscode.api.health.URLBase getPublicUrls();
  /**
   * <code>.appscode.health.URLBase public_urls = 2;</code>
   */
  com.appscode.api.health.URLBaseOrBuilder getPublicUrlsOrBuilder();

  /**
   * <code>.appscode.health.URLBase team_urls = 3;</code>
   */
  boolean hasTeamUrls();
  /**
   * <code>.appscode.health.URLBase team_urls = 3;</code>
   */
  com.appscode.api.health.URLBase getTeamUrls();
  /**
   * <code>.appscode.health.URLBase team_urls = 3;</code>
   */
  com.appscode.api.health.URLBaseOrBuilder getTeamUrlsOrBuilder();

  /**
   * <code>.appscode.health.URLBase cluster_urls = 4;</code>
   */
  boolean hasClusterUrls();
  /**
   * <code>.appscode.health.URLBase cluster_urls = 4;</code>
   */
  com.appscode.api.health.URLBase getClusterUrls();
  /**
   * <code>.appscode.health.URLBase cluster_urls = 4;</code>
   */
  com.appscode.api.health.URLBaseOrBuilder getClusterUrlsOrBuilder();

  /**
   * <code>.appscode.health.URLBase in_cluster_urls = 5;</code>
   */
  boolean hasInClusterUrls();
  /**
   * <code>.appscode.health.URLBase in_cluster_urls = 5;</code>
   */
  com.appscode.api.health.URLBase getInClusterUrls();
  /**
   * <code>.appscode.health.URLBase in_cluster_urls = 5;</code>
   */
  com.appscode.api.health.URLBaseOrBuilder getInClusterUrlsOrBuilder();

  /**
   * <code>.appscode.health.URLBase URL_shortener_urls = 6;</code>
   */
  boolean hasURLShortenerUrls();
  /**
   * <code>.appscode.health.URLBase URL_shortener_urls = 6;</code>
   */
  com.appscode.api.health.URLBase getURLShortenerUrls();
  /**
   * <code>.appscode.health.URLBase URL_shortener_urls = 6;</code>
   */
  com.appscode.api.health.URLBaseOrBuilder getURLShortenerUrlsOrBuilder();

  /**
   * <code>.appscode.health.URLBase file_urls = 7;</code>
   */
  boolean hasFileUrls();
  /**
   * <code>.appscode.health.URLBase file_urls = 7;</code>
   */
  com.appscode.api.health.URLBase getFileUrls();
  /**
   * <code>.appscode.health.URLBase file_urls = 7;</code>
   */
  com.appscode.api.health.URLBaseOrBuilder getFileUrlsOrBuilder();
}
