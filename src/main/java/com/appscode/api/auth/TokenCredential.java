package com.appscode.api.auth;

import com.google.auth.Credentials;

import java.io.IOException;
import java.net.URI;
import java.util.*;

public final class TokenCredential extends Credentials {
  private String namespace;
  private String token;

  public TokenCredential(String namespace, String token) {
    this.namespace = namespace;
    this.token = token;
  }

  @Override
  public String getAuthenticationType() {
    return null;
  }

  @Override
  public Map<String, List<String>> getRequestMetadata(URI uri) throws IOException {
    HashMap<String, List<String>> authMap = new HashMap<>();
    authMap.put("authorization", Arrays.asList(String.format("Bearer %s:%s", namespace, token)));
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
