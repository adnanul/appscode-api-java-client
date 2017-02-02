package com.appscode.api.apprc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Arrays;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Apprc {

  private String context;
  private Auth[] auths;

  public Apprc() {
  }

  public Apprc(String context, Auth[] auths) {
    this.context = context;
    this.auths = auths;
  }

  /**
   * Throw RuntimeException if auth not found
   */
  public Auth currentAuth() {
    if (!this.getContext().equals("")) {
      for (Auth auth : this.getAuths()
          ) {
        if (auth.getTeamAddress().equals(this.getContext())) {
          return auth;
        }
      }
    }
    throw new RuntimeException("auth not found");
  }

  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public Auth[] getAuths() {
    return auths;
  }

  public void setAuths(Auth[] auths) {
    this.auths = auths;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apprc apprc = (Apprc) o;
    return Objects.equals(context, apprc.context) &&
        Arrays.equals(auths, apprc.auths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, auths);
  }

  @Override
  public String toString() {
    return "Apprc{" +
        "context='" + context + '\'' +
        ",auths=" + Arrays.toString(auths) +
        "}";
  }
}
