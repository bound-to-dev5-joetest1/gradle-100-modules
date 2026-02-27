plugins {
    id("org.sonarqube") version "7.2.2.6593"
}

allprojects {
    group = "com.example"
    version = "1.0.0"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")

    extensions.configure<JavaPluginExtension> {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
}

sonarqube {
    properties {
        property("sonar.projectKey", "gradle-100-modules")
        property("sonar.organization", "joetest1")
        property("sonar.host.url", "https://dev5.sc-dev5.io")
        property("sonar.sourceEncoding", "UTF-8")
    }
}
