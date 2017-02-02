package com.appscode.api.apprc;

import static org.junit.Assert.assertEquals;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.StringReader;
import org.junit.Test;


public class ApprcHolderTest {

  public static String APPRC_STRING = "{\n"
      + "  \"context\": \"devteam.example.dev\",\n"
      + "  \"auths\": [\n"
      + "    {\n"
      + "      \"apiserver\": \"http://127.0.0.1:10000\",\n"
      + "      \"env\": \"dev\",\n"
      + "      \"team_id\": \"devteam\",\n"
      + "      \"username\": \"user\",\n"
      + "      \"email\": \"user@example.com\",\n"
      + "      \"token\": \"generated-api-token\",\n"
      + "      \"phid\": \"generated-phid\",\n"
      + "      \"settings\": {\n"
      + "        \"collect_analytics\": false\n"
      + "      },\n"
      + "      \"network\": {\n"
      + "        \"team_urls\": {\n"
      + "          \"scheme\": \"http\",\n"
      + "          \"base_addr\": \"example.dev\"\n"
      + "        }\n"
      + "      }\n"
      + "    },\n"
      + "    {\n"
      + "      \"apiserver\": \"https://example.com:20000\",\n"
      + "      \"env\": \"prod\",\n"
      + "      \"team_id\": \"prod_team\",\n"
      + "      \"username\": \"user1\",\n"
      + "      \"email\": \"user1@example.com\",\n"
      + "      \"token\": \"generated-custom-token\",\n"
      + "      \"phid\": \"generated-custom-phid\",\n"
      + "      \"settings\": {\n"
      + "        \"collect_analytics\": true\n"
      + "      },\n"
      + "      \"network\": {\n"
      + "        \"team_urls\": {\n"
      + "          \"scheme\": \"https\",\n"
      + "          \"base_addr\": \"example.com\"\n"
      + "        }\n"
      + "      }\n"
      + "    }\n"
      + "  ]\n"
      + "} ";

  @Test
  public void readSystemApprc() {
    try {
      Apprc expected = new ObjectMapper(new JsonFactory()).readValue(APPRC_STRING, Apprc.class);
      Apprc actual = ApprcHolder.readUserApprc(new StringReader(APPRC_STRING));
      assertEquals(expected, actual);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}