plugins {
    alias(libs.plugins.agp.app)
}

android {
    namespace = "io.github.a13e300.demo"
    compileSdk = 35

    defaultConfig {
        // rename to the debug target
        // or android studio will not recognize
        applicationId = "io.github.a13e300.demo"
        minSdk = 27
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
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
}

dependencies {
    // this breaks native code indexing, use carefully !
    // implementation(project(":app"))
}