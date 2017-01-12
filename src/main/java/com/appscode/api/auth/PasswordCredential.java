package com.appscode.api.auth;

import com.google.auth.Credentials;

import java.io.IOException;
import java.net.URI;
import java.util.*;

public final class PasswordCredential extends Credentials {
  private String namespace;
  private String username;
  private String password;

  public PasswordCredential(String namespace, String username, String password) {
    this.namespace = namespace;
    this.username = username;
    this.password = password;
  }

  @Override
  public String getAuthenticationType() {
    return null;
  }

  @Override
  public Map<String, List<String>> getRequestMetadata(URI uri) throws IOException {
    HashMap<String, List<String>> authMap = new HashMap<>();
    String secret = String.format("%s.%s:%s", namespace, username, password);
    authMap.put("authorization",
        Arrays.asList("Basic " + Base64.getEncoder().encodeToString(secret.getBytes())));
    return authMap;
  }

  @Override
  public boolean hasRequestMetadata() {
    return false;
  }

  @Override
  public boolean hasRequestMetadataOnly() {
    return false;
  }

  @Override
  public void refresh() throws IOException {
  }
}
