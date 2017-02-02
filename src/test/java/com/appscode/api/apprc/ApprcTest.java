package com.appscode.api.apprc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import org.junit.Test;

public class ApprcTest {

  @Test
  public void getActiveAuth() throws Exception {
    Apprc apprc = new ObjectMapper(new JsonFactory())
        .readValue(ApprcHolderTest.APPRC_STRING, Apprc.class);
    URI uri = new URI(apprc.currentAuth().getApiserver());
    assertNotNull(uri.getHost());
    assertNotNull(uri.getPort());
    assertEquals(apprc.getAuths()[0], apprc.currentAuth());
  }

}