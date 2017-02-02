package com.appscode.api.apprc;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class AuthTest {

  private static Map<String, String> oldEnv;
  private final String baseAddr = "example.com";
  private final String scheme = "http";
  private final String APPSCODE_ENV = "APPSCODE_ENV";
  private Auth auth;

  private static void setEnv(String key, String value) {
    HashMap<String, String> newEnv = new HashMap<>();
    newEnv.put(key, value);
    setEnv(newEnv);
  }

  private static void resetEnv() {
    setEnv(oldEnv);
  }

  //http://stackoverflow.com/questions/318239/how-do-i-set-environment-variables-from-java/7201825#7201825
  private static void setEnv(Map<String, String> newenv) {
    try {
      Class<?> processEnvironmentClass = Class.forName("java.lang.ProcessEnvironment");
      Field theEnvironmentField = processEnvironmentClass.getDeclaredField("theEnvironment");
      theEnvironmentField.setAccessible(true);
      Map<String, String> env = (Map<String, String>) theEnvironmentField.get(null);
      env.putAll(newenv);
      Field theCaseInsensitiveEnvironmentField = processEnvironmentClass
          .getDeclaredField("theCaseInsensitiveEnvironment");
      theCaseInsensitiveEnvironmentField.setAccessible(true);
      Map<String, String> cienv = (Map<String, String>) theCaseInsensitiveEnvironmentField
          .get(null);
      cienv.putAll(newenv);
    } catch (NoSuchFieldException e) {
      try {
        Class[] classes = Collections.class.getDeclaredClasses();
        Map<String, String> env = System.getenv();
        for (Class cl : classes) {
          if ("java.util.Collections$UnmodifiableMap".equals(cl.getName())) {
            Field field = cl.getDeclaredField("m");
            field.setAccessible(true);
            Object obj = field.get(env);
            Map<String, String> map = (Map<String, String>) obj;
            map.clear();
            map.putAll(newenv);
          }
        }
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    } catch (Exception e1) {
      e1.printStackTrace();
    }
  }

  @Before
  public void setUp() {
    oldEnv = System.getenv();
    auth = new Auth();
    auth.setTeamId(Environment.get());
    auth.setNetwork(new Network(new URLBase(scheme, baseAddr)));
  }

  @Test
  public void getTeamAddress() throws Exception {
    preset("onebox", "dev", "http");
    assertEquals(baseAddr, auth.getTeamAddress());

    preset("boxdev", "dev", "http");
    assertEquals(baseAddr, auth.getTeamAddress());

    preset("dev", "dev", "http");
    assertEquals("dev." + baseAddr, auth.getTeamAddress());

    preset("qa", "example", "http");
    assertEquals("example." + baseAddr, auth.getTeamAddress());
    resetEnv();
  }

  @Test
  public void getTeamURL() throws Exception {
    preset("onebox", "devapp", "http");
    assertEquals("http://" + baseAddr + "/org/teamname/", auth.getTeamURL("org", "teamname"));

    preset("prod", "example", "https");
    assertEquals("https://example." + baseAddr + "/org/teamname/",
        auth.getTeamURL("org", "teamname"));
    resetEnv();
  }

  @Test
  public void getTeamEndpoint() throws Exception {
    preset("boxdev", "devapp", "http");
    assertEquals("http://" + baseAddr, auth.getTeamEndpoint());

    preset("prod", "example", "https");
    assertEquals("https://example." + baseAddr, auth.getTeamEndpoint());
  }

  private void preset(String env, String teamId, String scheme) {
    setEnv(APPSCODE_ENV, env);
    auth.getNetwork().getTeamUrls().setScheme(scheme);
    auth.setTeamId(teamId);
  }
}