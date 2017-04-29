package com.appscode.api.apprc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public final  class Network {

  @JsonProperty("cluster_urls")
  private URLBase clusterUrls;

  @JsonProperty("public_urls")
  private URLBase publicUrls;

  @JsonProperty("team_urls")
  private URLBase teamUrls;

  public Network() {
  }

  public URLBase getClusterUrls() {
    return clusterUrls;
  }

  public void setClusterUrls(URLBase clusterUrls) {
    this.clusterUrls = clusterUrls;
  }

  public URLBase getPublicUrls() {
    return publicUrls;
  }

  public void setPublicUrls(URLBase publicUrls) {
    this.publicUrls = publicUrls;
  }

  public Network(URLBase teamUrls) {
    this.teamUrls = teamUrls;
  }

  public URLBase getTeamUrls() {
    return teamUrls;
  }

  public void setTeamUrls(URLBase teamUrls) {
    this.teamUrls = teamUrls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Network network = (Network) o;
    return Objects.equals(clusterUrls, network.clusterUrls) &&
        Objects.equals(publicUrls, network.publicUrls) &&
        Objects.equals(teamUrls, network.teamUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamUrls);
  }

  @Override
  public String toString() {
    return "Network{" +
        "clusterUrls=" + clusterUrls +
        ", publicUrls=" + publicUrls +
        ", teamUrls=" + teamUrls +
        '}';
  }
}
