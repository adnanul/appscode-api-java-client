package com.appscode.api.apprc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public final  class Network {

  @JsonProperty("team_urls")
  private URLBase teamUrls;

  public Network() {
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
    return Objects.equals(teamUrls, network.teamUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamUrls);
  }

  @Override
  public String toString() {
    return "Network{" +
        "teamUrls=" + teamUrls +
        '}';
  }
}