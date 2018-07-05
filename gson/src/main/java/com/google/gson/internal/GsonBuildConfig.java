package com.google.gson.internal;

public final class GsonBuildConfig {
  // Based on https://stackoverflow.com/questions/2469922/generate-a-version-java-file-in-maven

  /** This field is automatically populated by Maven when a build is triggered */
  public static final String VERSION = "2.8.5";

  private GsonBuildConfig() { }
}