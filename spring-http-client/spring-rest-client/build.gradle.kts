import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.springframework.boot") version "3.2.3"
  id("io.spring.dependency-management") version "1.1.4"
  kotlin("jvm") version "1.9.22"
  kotlin("plugin.spring") version "1.9.22"
}

group = "com.sample"
version = "0.0.1-SNAPSHOT"

java {
  sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-webflux")
  implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
  testImplementation("io.projectreactor:reactor-test")

  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.apache.httpcomponents.client5:httpclient5:5.3.1")

  implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs += "-Xjsr305=strict"
    jvmTarget = "17"
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}
