plugins {
    kotlin("jvm") version "1.5.30"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.google.devtools.ksp:symbol-processing-api:1.5.30-1.0.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("com.github.tschuchortdev:kotlin-compile-testing:1.4.3")
    testImplementation("com.github.tschuchortdev:kotlin-compile-testing-ksp:1.4.3")
    testImplementation("io.kotest:kotest-assertions-core:4.6.0")

}