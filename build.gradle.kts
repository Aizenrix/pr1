plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("ksp")
}

android {
    // ...
}

dependencies {
    implementation("androidx.room:room-runtime:2.5.1")
    ksp("androidx.room:room-compiler:2.5.1")

    implementation("androidx.room:room-ktx:2.5.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.0")
    // другие зависимости
}
