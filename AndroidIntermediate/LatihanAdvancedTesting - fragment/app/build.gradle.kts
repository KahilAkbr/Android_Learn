plugins {
    alias(libs.plugins.android.application)
    id("kotlin-android")
    id("com.google.devtools.ksp")
    id("kotlin-parcelize")
}

android {
    namespace = "com.dicoding.newsapp"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.dicoding.newsapp"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
        buildConfigField("String", "API_KEY", "\"db874e166f4c473e9132d19a45135274\"")
    }
    buildTypes {
        named("release") {
            isMinifyEnabled = false
            setProguardFiles(listOf(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"))
        }
    }
    buildFeatures {
        viewBinding = true
        buildConfig = true
    }
    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    testOptions {
        animationsDisabled = true
    }
}

dependencies {
    //desugaring
    coreLibraryDesugaring(libs.desugar.jdk.libs)

    // ui
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.recyclerview)

    implementation(libs.glide)
    implementation(libs.androidx.viewpager2)
    implementation(libs.androidx.fragment.ktx)

    //testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //room
    implementation(libs.androidx.room.runtime)
    ksp(libs.room.compiler)

    //retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.logging.interceptor)

    //coroutine support
    implementation(libs.androidx.lifecycle.viewmodel.ktx) //viewModelScope
    implementation(libs.androidx.lifecycle.livedata.ktx) //liveData
    implementation(libs.androidx.room.ktx)

    //mockito
    testImplementation(libs.mockito.core)
    testImplementation(libs.mockito.inline)

    //special testing
    testImplementation(libs.androidx.core.testing) // InstantTaskExecutorRule
    testImplementation(libs.kotlinx.coroutines.test) //TestCoroutineDispatcher

    //special instrumentation testing
    androidTestImplementation(libs.androidx.core.testing) // InstantTaskExecutorRule
    androidTestImplementation(libs.kotlinx.coroutines.test) //TestDispatcher

    //fragment testing (use atleast version 1.7.1 to use launchFragmentInContainer for android API 34)
    //TestCoroutineDispatcher
    debugImplementation("androidx.fragment:fragment-testing:1.7.1") //launchFragmentInContainer

    //mock web server
    androidTestImplementation("com.squareup.okhttp3:mockwebserver:4.9.3")
    androidTestImplementation("com.squareup.okhttp3:okhttp-tls:4.9.3")

    //rv test
    androidTestImplementation("com.android.support.test.espresso:espresso-contrib:3.0.2") //RecyclerViewActions

    implementation("androidx.test.espresso:espresso-idling-resource:3.4.0")

    //stackoverflow smh
    /*
    Caused by: java.lang.ClassNotFoundException: Didn't find class "androidx.test.platform.io.PlatformTestStorageRegistry"
     */
    debugImplementation ("androidx.test:monitor:1.6.1")

    //idling resource espresso
    implementation("androidx.test.espresso:espresso-idling-resource:3.4.0")
}
