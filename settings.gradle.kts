pluginManagement {
  repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
  }

  includeBuild("build-logic")
}

dependencyResolutionManagement {
  repositoriesMode = RepositoriesMode.FAIL_ON_PROJECT_REPOS
  repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
  }
}

plugins {
  id("com.gradle.enterprise") version "3.15.1"
}

gradleEnterprise {
  buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
    publishAlways()
  }
}

enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":app", ":hidden-api")

rootProject.name = "LibChecker"
