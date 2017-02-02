package com.appscode.api.apprc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Auth {

  @JsonProperty("env")
  private String environment;

  @JsonProperty("team_id")
  private String teamId;

  private String apiserver;
  private String username;
  private String email;
  private String token;
  private String phid;
  private Setting setttings;
  private Network network;

  public Auth() {
  }

  public Auth(String apiserver, String environment, String teamId, String username,
      String email, String token, String phid, Setting setttings,
      Network network) {
    this.apiserver = apiserver;
    this.environment = environment;
    this.teamId = teamId;
    this.username = username;
    this.email = email;
    this.token = token;
    this.phid = phid;
    this.setttings = setttings;
    this.network = network;
  }

  public String getApiserver() {
    return apiserver;
  }

  public void setApiserver(String apiserver) {
    this.apiserver = apiserver;
  }

  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getPhid() {
    return phid;
  }

  public void setPhid(String phid) {
    this.phid = phid;
  }

  public Setting getSetttings() {
    return setttings;
  }

  public void setSetttings(Setting setttings) {
    this.setttings = setttings;
  }

  public Network getNetwork() {
    return network;
  }

  public void setNetwork(Network network) {
    this.network = network;
  }

  public String getTeamAddress() {
    if (Environment.get().equals("onebox") || Environment.get().equals("boxdev")) {
      return this.getNetwork().getTeamUrls().getBaseAddr();
    } else {
      return this.getTeamId() + "." + this.getNetwork().getTeamUrls().getBaseAddr();
    }
  }

  public String getTeamURL(String... trails) {
    return this.getTeamEndpoint() + "/" + String.join("/", trails) + "/";
  }

  public String getTeamEndpoint() {
    return this.getNetwork().getTeamUrls().getScheme() + "://" + this.getTeamAddress();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth auth = (Auth) o;
    return Objects.equals(apiserver, auth.apiserver) &&
        Objects.equals(environment, auth.environment) &&
        Objects.equals(teamId, auth.teamId) &&
        Objects.equals(username, auth.username) &&
        Objects.equals(email, auth.email) &&
        Objects.equals(token, auth.token) &&
        Objects.equals(phid, auth.phid) &&
        Objects.equals(setttings, auth.setttings) &&
        Objects.equals(network, auth.network);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(apiserver, teamId, username);
  }

  @Override
  public String toString() {
    return "Auth{" +
        "apiserver='" + apiserver + '\'' +
        ", environment='" + environment + '\'' +
        ", teamId='" + teamId + '\'' +
        ", username='" + username + '\'' +
        ", email='" + email + '\'' +
        ", token='" + token + '\'' +
        ", phid='" + phid + '\'' +
        ", setttings=" + setttings +
        ", network=" + network +
        '}';
  }
}