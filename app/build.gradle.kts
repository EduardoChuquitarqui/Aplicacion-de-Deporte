plugins {
    //alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    //se añade para comunicar con firebase
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.eduardorchv.deporte"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.eduardorchv.deporte"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.play.services.maps)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    //**se añade para comunicar con firebase
    implementation(platform("com.google.firebase:firebase-bom:33.4.0"))
    implementation("com.google.firebase:firebase-analytics")
    //**a partir de aqui se añade del wildrunning
    /*se añade libreria antigua del profe unidad23-video282 para inicio de sesion*/
    implementation("com.google.firebase:firebase-auth:21.0.2")
    /*se añade libreria del profe para manipular base de datos*/
    implementation("com.google.firebase:firebase-database:20.0.4")
    implementation("com.google.firebase:firebase-firestore:24.0.2")
    /*se añade libreria para entrar sesion con google*/
    //implementation(platform("com.google.firebase:firebase-bom:32.8.0")) ya existe
    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.android.gms:play-services-auth:21.0.0")
    /*se añade libreria para entrar sesion con facebook*/
    implementation("com.facebook.android:facebook-login:latest.release")
    /*se añade del profe para facebook*/
    //implementation("com.facebook.android:facebook-android-sdk:9.1.1") antigua
    implementation("com.facebook.android:facebook-android-sdk:16.0.0")

    //unidad 25
    implementation("androidx.drawerlayout:drawerlayout:1.1.1")
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0")
    //seekbar circle, doc oficial https://github.com/tankery/CircularSeekBar
    implementation("me.tankery.lib:circularSeekBar:1.3.2")
    //se añade unidad 31
    //implementation("com.google.android.gms:play-services-location:17.0.0")

    implementation("com.google.android.gms:play-services-location:21.3.0")

}