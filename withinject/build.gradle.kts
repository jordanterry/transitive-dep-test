plugins {
    id("com.android.library")
}

android {
    compileSdk = 33
    namespace = "com.test"
}

dependencies {
    implementation("javax.inject:javax.inject:1")
}