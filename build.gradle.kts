buildscript {
    repositories {
        google()
        //se agrego para entrar a facebook
        mavenCentral()
    }
    dependencies{
        classpath("com.google.gms:google-services:4.3.10")

    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    //se añade para conectar a la base de datos
    id("com.google.gms.google-services") version "4.4.2" apply false
}