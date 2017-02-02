package com.appscode.api.apprc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Setting {

  @JsonProperty("collect_analytics")
  private boolean collectAnalytics;

  @JsonProperty("time_zone")
  private String timeZone;

  @JsonProperty("time_format")
  private String timeFormat;

  @JsonProperty("date_format")
  private String dateFormat;

  public Setting() {
  }

  public Setting(boolean collectAnalytics, String timeZone, String timeFormat,
      String dateFormat) {
    this.collectAnalytics = collectAnalytics;
    this.timeZone = timeZone;
    this.timeFormat = timeFormat;
    this.dateFormat = dateFormat;
  }

  public boolean isCollectAnalytics() {
    return collectAnalytics;
  }

  public void setCollectAnalytics(boolean collectAnalytics) {
    this.collectAnalytics = collectAnalytics;
  }

  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public String getTimeFormat() {
    return timeFormat;
  }

  public void setTimeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
  }

  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Setting setting = (Setting) o;
    return collectAnalytics == setting.collectAnalytics &&
        Objects.equals(timeZone, setting.timeZone) &&
        Objects.equals(timeFormat, setting.timeFormat) &&
        Objects.equals(dateFormat, setting.dateFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectAnalytics, timeZone, timeFormat, dateFormat);
  }

  @Override
  public String toString() {
    return "Setting{" +
        "collectAnalytics=" + collectAnalytics +
        ", timeZone='" + timeZone + '\'' +
        ", timeFormat='" + timeFormat + '\'' +
        ", dateFormat='" + dateFormat + '\'' +
        '}';
  }
}