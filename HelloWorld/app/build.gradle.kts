plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.helloworld"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.helloworld"
        minSdk = 24
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true // Jetpack Compose 관련 기능과 라이브러리를 사용할 수 있도록 활성화
    }
    composeOptions {
        // Jetpack Compose 컴파일러 확장 버전을 설정
        kotlinCompilerExtensionVersion = "1.5.14"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    // Jetpack Compose에서 ConstraintLayout을 사용할 수 있도록 지원
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.1.0")
    // Jetpack Compose에서 기본 UI 요소를 포함한 Foundation 레벨의 API 제공
    implementation("androidx.compose.foundation:foundation:1.5.0")
    // Jetpack Compose UI 디버깅 및 프리뷰 기능 제공
    implementation("androidx.compose.ui:ui-tooling:1.7.5")
    // Google Material Design 컴포넌트 제공
    implementation("androidx.compose.material3:material3:1.3.1")
    // Jetpack Compose를 Activity에서 사용할 수 있도록 함
    implementation("androidx.activity:activity-compose:1.9.2")
}