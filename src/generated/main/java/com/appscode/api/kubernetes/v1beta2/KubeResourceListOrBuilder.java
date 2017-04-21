// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/kubernetes/v1beta2/client.proto

package com.appscode.api.kubernetes.v1beta2;

public interface KubeResourceListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appscode.kubernetes.v1beta2.KubeResourceList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string type = 1;</code>
   */
  java.lang.String getType();
  /**
   * <code>optional string type = 1;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.ConfigMaps config_maps = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.ConfigMaps getConfigMaps();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.ConfigMaps config_maps = 2;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.ConfigMapsOrBuilder getConfigMapsOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.DaemonSets daemon_sets = 3;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.DaemonSets getDaemonSets();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.DaemonSets daemon_sets = 3;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.DaemonSetsOrBuilder getDaemonSetsOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Deployments deployments = 4;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.Deployments getDeployments();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Deployments deployments = 4;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.DeploymentsOrBuilder getDeploymentsOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Jobs jobs = 5;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.Jobs getJobs();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Jobs jobs = 5;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.JobsOrBuilder getJobsOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Namespaces namespaces = 6;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.Namespaces getNamespaces();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Namespaces namespaces = 6;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.NamespacesOrBuilder getNamespacesOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Nodes nodes = 7;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.Nodes getNodes();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Nodes nodes = 7;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.NodesOrBuilder getNodesOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.StatefulSets stateful_sets = 8;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.StatefulSets getStatefulSets();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.StatefulSets stateful_sets = 8;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.StatefulSetsOrBuilder getStatefulSetsOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Pods pods = 9;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.Pods getPods();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Pods pods = 9;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.PodsOrBuilder getPodsOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.ReplicaSets replica_sets = 10;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.ReplicaSets getReplicaSets();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.ReplicaSets replica_sets = 10;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.ReplicaSetsOrBuilder getReplicaSetsOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Services services = 11;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.Services getServices();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Services services = 11;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.ServicesOrBuilder getServicesOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Secrets secrets = 12;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.Secrets getSecrets();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Secrets secrets = 12;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.SecretsOrBuilder getSecretsOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.ReplicationControllers replication_controllers = 13;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.ReplicationControllers getReplicationControllers();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.ReplicationControllers replication_controllers = 13;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.ReplicationControllersOrBuilder getReplicationControllersOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.StorageClasses storage_classes = 14;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.StorageClasses getStorageClasses();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.StorageClasses storage_classes = 14;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.StorageClassesOrBuilder getStorageClassesOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.PersistentVolumes persistent_volumes = 15;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.PersistentVolumes getPersistentVolumes();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.PersistentVolumes persistent_volumes = 15;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.PersistentVolumesOrBuilder getPersistentVolumesOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.PersistentVolumeClaims persistent_volume_claims = 16;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.PersistentVolumeClaims getPersistentVolumeClaims();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.PersistentVolumeClaims persistent_volume_claims = 16;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.PersistentVolumeClaimsOrBuilder getPersistentVolumeClaimsOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Alerts alerts = 17;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.Alerts getAlerts();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Alerts alerts = 17;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.AlertsOrBuilder getAlertsOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Roles roles = 18;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.Roles getRoles();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Roles roles = 18;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.RolesOrBuilder getRolesOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.ClusterRoles cluster_roles = 19;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.ClusterRoles getClusterRoles();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.ClusterRoles cluster_roles = 19;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.ClusterRolesOrBuilder getClusterRolesOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.RoleBindings role_bindings = 20;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.RoleBindings getRoleBindings();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.RoleBindings role_bindings = 20;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.RoleBindingsOrBuilder getRoleBindingsOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.ClusterRoleBindings cluster_role_bindings = 21;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.ClusterRoleBindings getClusterRoleBindings();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.ClusterRoleBindings cluster_role_bindings = 21;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.ClusterRoleBindingsOrBuilder getClusterRoleBindingsOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Certificates certificates = 22;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.Certificates getCertificates();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Certificates certificates = 22;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.CertificatesOrBuilder getCertificatesOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.CronJobs cron_jobs = 23;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.CronJobs getCronJobs();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.CronJobs cron_jobs = 23;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.CronJobsOrBuilder getCronJobsOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Backups backups = 24;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.Backups getBackups();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Backups backups = 24;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.BackupsOrBuilder getBackupsOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Postgreses postgreses = 25;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.Postgreses getPostgreses();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Postgreses postgreses = 25;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.PostgresesOrBuilder getPostgresesOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Elastics elastics = 26;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.Elastics getElastics();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.Elastics elastics = 26;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.ElasticsOrBuilder getElasticsOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.DeletedDatabases deleted_databases = 27;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.DeletedDatabases getDeletedDatabases();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.DeletedDatabases deleted_databases = 27;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.DeletedDatabasesOrBuilder getDeletedDatabasesOrBuilder();

  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.DatabaseSnapshots database_snapshots = 28;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.DatabaseSnapshots getDatabaseSnapshots();
  /**
   * <code>optional .appscode.kubernetes.v1beta2.KubeResourceList.DatabaseSnapshots database_snapshots = 28;</code>
   */
  com.appscode.api.kubernetes.v1beta2.KubeResourceList.DatabaseSnapshotsOrBuilder getDatabaseSnapshotsOrBuilder();

  public com.appscode.api.kubernetes.v1beta2.KubeResourceList.ResourceCase getResourceCase();
}
