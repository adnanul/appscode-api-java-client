package com.appscode.api.apprc;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Throwables;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApprcHolder {

  private static final String apprcFile =
      System.getProperty("user.home") + "/.appscode/apprc.json";
  private static final Logger logger = Logger.getLogger(ApprcHolder.class.getName());

  private ApprcHolder() {
  }

  public static Apprc get() {
    return ApprcHolder.LazyHolder.instance;
  }

  private static Apprc readUserApprc() {
    try {
      return readUserApprc(apprcFile);
    } catch (FileNotFoundException e) {
      throw new RuntimeException("No files to read system apprc");
    }
  }

  public static Apprc readUserApprc(String apprcFileURI) throws FileNotFoundException {
    return readUserApprc(new FileReader(Paths.get(apprcFileURI).toFile()));
  }

  public static Apprc readUserApprc(Reader reader) {
    return read(reader, new JsonFactory());
  }

  private static Apprc read(Reader reader, JsonFactory factory) {
    final ObjectMapper mapper = new ObjectMapper(factory);
    logger.log(Level.INFO, "reading file type " + factory.getClass().getSimpleName());
    try {
      return mapper.readValue(reader, Apprc.class);
    } catch (IOException e) {
      logger.info("exception parsing file");
      throw Throwables.propagate(e);
    }
  }

  /**
   * Thread-safe lockless lazy singleton
   * Pattern: https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
   */
  private static class LazyHolder {

    private static final Apprc instance = ApprcHolder.readUserApprc();
  }

}
