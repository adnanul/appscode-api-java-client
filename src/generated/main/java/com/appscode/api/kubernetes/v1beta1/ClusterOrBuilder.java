// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta1/cluster.proto

package com.appscode.api.kubernetes.v1beta1;

public interface ClusterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta1.Cluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string phid = 1;</code>
   */
  java.lang.String getPhid();
  /**
   * <code>string phid = 1;</code>
   */
  com.google.protobuf.ByteString
      getPhidBytes();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string provider = 3;</code>
   */
  java.lang.String getProvider();
  /**
   * <code>string provider = 3;</code>
   */
  com.google.protobuf.ByteString
      getProviderBytes();

  /**
   * <code>string os = 4;</code>
   */
  java.lang.String getOs();
  /**
   * <code>string os = 4;</code>
   */
  com.google.protobuf.ByteString
      getOsBytes();

  /**
   * <code>string region = 5;</code>
   */
  java.lang.String getRegion();
  /**
   * <code>string region = 5;</code>
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <code>string zone = 6;</code>
   */
  java.lang.String getZone();
  /**
   * <code>string zone = 6;</code>
   */
  com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <code>int64 created_at = 7;</code>
   */
  long getCreatedAt();

  /**
   * <code>map&lt;string, string&gt; links = 8;</code>
   */
  int getLinksCount();
  /**
   * <code>map&lt;string, string&gt; links = 8;</code>
   */
  boolean containsLinks(
      java.lang.String key);
  /**
   * Use {@link #getLinksMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLinks();
  /**
   * <code>map&lt;string, string&gt; links = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLinksMap();
  /**
   * <code>map&lt;string, string&gt; links = 8;</code>
   */

  java.lang.String getLinksOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; links = 8;</code>
   */

  java.lang.String getLinksOrThrow(
      java.lang.String key);

  /**
   * <code>bool do_not_delete = 9;</code>
   */
  boolean getDoNotDelete();

  /**
   * <code>string status = 10;</code>
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 10;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>string status_cause = 11;</code>
   */
  java.lang.String getStatusCause();
  /**
   * <code>string status_cause = 11;</code>
   */
  com.google.protobuf.ByteString
      getStatusCauseBytes();

  /**
   * <code>string gce_project = 12;</code>
   */
  java.lang.String getGceProject();
  /**
   * <code>string gce_project = 12;</code>
   */
  com.google.protobuf.ByteString
      getGceProjectBytes();

  /**
   * <code>string kubelet_version = 13;</code>
   */
  java.lang.String getKubeletVersion();
  /**
   * <code>string kubelet_version = 13;</code>
   */
  com.google.protobuf.ByteString
      getKubeletVersionBytes();

  /**
   * <code>string saltbase_version = 14;</code>
   */
  java.lang.String getSaltbaseVersion();
  /**
   * <code>string saltbase_version = 14;</code>
   */
  com.google.protobuf.ByteString
      getSaltbaseVersionBytes();

  /**
   * <code>string kube_starter_version = 15;</code>
   */
  java.lang.String getKubeStarterVersion();
  /**
   * <code>string kube_starter_version = 15;</code>
   */
  com.google.protobuf.ByteString
      getKubeStarterVersionBytes();

  /**
   * <code>int32 node_count = 16;</code>
   */
  int getNodeCount();

  /**
   * <code>string api_server_url = 17;</code>
   */
  java.lang.String getApiServerUrl();
  /**
   * <code>string api_server_url = 17;</code>
   */
  com.google.protobuf.ByteString
      getApiServerUrlBytes();

  /**
   * <code>string kube_user = 18;</code>
   */
  java.lang.String getKubeUser();
  /**
   * <code>string kube_user = 18;</code>
   */
  com.google.protobuf.ByteString
      getKubeUserBytes();

  /**
   * <code>string kube_password = 19;</code>
   */
  java.lang.String getKubePassword();
  /**
   * <code>string kube_password = 19;</code>
   */
  com.google.protobuf.ByteString
      getKubePasswordBytes();

  /**
   * <code>string ca_cert = 20;</code>
   */
  java.lang.String getCaCert();
  /**
   * <code>string ca_cert = 20;</code>
   */
  com.google.protobuf.ByteString
      getCaCertBytes();

  /**
   * <code>string kube_bearer_token = 21;</code>
   */
  java.lang.String getKubeBearerToken();
  /**
   * <code>string kube_bearer_token = 21;</code>
   */
  com.google.protobuf.ByteString
      getKubeBearerTokenBytes();

  /**
   * <code>.appscode.kubernetes.v1beta1.ClusterSettings settings = 22;</code>
   */
  boolean hasSettings();
  /**
   * <code>.appscode.kubernetes.v1beta1.ClusterSettings settings = 22;</code>
   */
  com.appscode.api.kubernetes.v1beta1.ClusterSettings getSettings();
  /**
   * <code>.appscode.kubernetes.v1beta1.ClusterSettings settings = 22;</code>
   */
  com.appscode.api.kubernetes.v1beta1.ClusterSettingsOrBuilder getSettingsOrBuilder();

  /**
   * <code>string instance_root_password = 23;</code>
   */
  java.lang.String getInstanceRootPassword();
  /**
   * <code>string instance_root_password = 23;</code>
   */
  com.google.protobuf.ByteString
      getInstanceRootPasswordBytes();

  /**
   * <code>string version = 24;</code>
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 24;</code>
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>string sku = 25;</code>
   */
  java.lang.String getSku();
  /**
   * <code>string sku = 25;</code>
   */
  com.google.protobuf.ByteString
      getSkuBytes();

  /**
   * <code>string created_by = 26;</code>
   */
  java.lang.String getCreatedBy();
  /**
   * <code>string created_by = 26;</code>
   */
  com.google.protobuf.ByteString
      getCreatedByBytes();

  /**
   * <code>string default_access_level = 27;</code>
   */
  java.lang.String getDefaultAccessLevel();
  /**
   * <code>string default_access_level = 27;</code>
   */
  com.google.protobuf.ByteString
      getDefaultAccessLevelBytes();
}
