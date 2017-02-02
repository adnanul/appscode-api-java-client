package com.appscode.api.apprc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class URLBase {

  private String scheme;

  @JsonProperty("base_addr")
  private String baseAddr;

  public URLBase() {
  }

  public URLBase(String scheme, String baseAddr) {
    this.scheme = scheme;
    this.baseAddr = baseAddr;
  }

  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public String getBaseAddr() {
    return baseAddr;
  }

  public void setBaseAddr(String baseAddr) {
    this.baseAddr = baseAddr;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    URLBase urlBase = (URLBase) o;
    return Objects.equals(scheme, urlBase.scheme) &&
        Objects.equals(baseAddr, urlBase.baseAddr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheme, baseAddr);
  }

  @Override
  public String toString() {
    return "URLBase{" +
        "scheme='" + scheme + '\'' +
        ", baseAddr='" + baseAddr + '\'' +
        '}';
  }
}
