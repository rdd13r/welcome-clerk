group = "me.rdd13.th15"
version = "0.1.0"

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
plugins {
    kotlin("multiplatform") apply false
    id("io.gitlab.arturbosch.detekt") version "1.20.0" apply false
    id("org.jetbrains.qodana") version "0.1.13" apply false
}