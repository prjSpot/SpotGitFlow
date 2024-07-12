// Top-level build file where you can add configuration options common to all sub-projects/modules.
// Kotlin 플러그인: plugins 블록을 사용하여 Kotlin Gradle Plugin을 선언
// 버전 정보는 각 모듈의 build.gradle.kts 파일에서 지정하기
plugins {
    id("com.android.application") version "8.1.0" apply false
    kotlin("android") version "1.8.0" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
