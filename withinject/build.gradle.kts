plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdk = 33
    namespace = "com.test"
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("javax.inject:javax.inject:1")
}