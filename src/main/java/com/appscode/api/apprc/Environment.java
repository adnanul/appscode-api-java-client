package com.appscode.api.apprc;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class Environment {

  private static final Logger logger = Logger.getLogger(Environment.class.getName());

  private Environment() {
  }

  public static String get() {
    logger.info("reading environment variables.");
    if (System.getenv("APPSCODE_ENV") != null) {
      logger.log(Level.INFO, "appscode_env found, returning.");
      String env = System.getenv("APPSCODE_ENV").toLowerCase();
      return env;
    }
/**
 *   If no environment is set returns dev to look for the system.dev.* file.
 */
    logger.log(Level.INFO, "returning dev environment");
    return "dev";
  }
}

