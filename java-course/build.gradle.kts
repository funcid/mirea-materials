subprojects {
  apply(plugin = "java")
  apply(plugin = "application")

  group = "ru.mirea.java"
  version = "1.0.0-SNAPSHOT"

  repositories {
    mavenCentral()
  }

  extensions.configure<JavaPluginExtension> {
    toolchain {
      languageVersion.set(JavaLanguageVersion.of(21))
    }
  }

  dependencies {
    add("testImplementation", "org.junit.jupiter:junit-jupiter:5.11.4")
    add("testRuntimeOnly", "org.junit.platform:junit-platform-launcher")
  }

  tasks.withType<Test>().configureEach {
    useJUnitPlatform()
  }
}
