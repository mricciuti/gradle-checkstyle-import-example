plugins {
    id("java")
    id("checkstyle")
}

group = "org.mri.gradle.checkstyle"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = org.gradle.api.JavaVersion.VERSION_1_8
}

checkstyle {
    toolVersion = "8.16"
}

repositories {
    mavenCentral()
}


