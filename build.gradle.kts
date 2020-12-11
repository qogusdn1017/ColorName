plugins {
    kotlin("jvm") version "1.4.21"
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

group = "works.baehyeonwoo.colorname"
version = "0.1"

repositories {
    maven("https://papermc.io/repo/repository/maven-public/")
    maven("https://jitpack.io/")
    mavenCentral()
}

dependencies {
    implementation("com.destroystokyo.paper:paper-api:1.13.2-R0.1-SNAPSHOT")
    implementation(kotlin("stdlib-jdk8"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    processResources {
        filesMatching("**/*.yml") {
            expand(project.properties)
        }
    }
}