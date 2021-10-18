plugins {
    id(Plugins.AndroidApplication.ID) version Plugins.AndroidApplication.VERSION apply false
    kotlin(Plugins.KotlinAndroid.ID) version Plugins.KotlinAndroid.VERSION apply false
    kotlin(Plugins.KotlinAndroidExtensions.ID) version Plugins.KotlinAndroid.VERSION apply false

    id(Plugins.Ktlint.ID) version Plugins.Ktlint.VERSION
    id(Plugins.Sonarqube.ID) version Plugins.Sonarqube.VERSION
}

buildscript {
    repositories {
        google()
    }
    dependencies {
        classpath("com.google.gms:google-services:4.3.10")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url = uri(RepositoryPaths.JITPACK) }
    }
}

tasks.register(Tasks.CLEAN, Delete::class) {
    delete(rootProject.buildDir)
}
