import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.springframework.boot") version "2.7.1"
  id("io.spring.dependency-management") version "1.0.11.RELEASE"
  kotlin("jvm") version "1.6.21"
  kotlin("plugin.spring") version "1.6.21"
  kotlin("plugin.jpa") version "1.6.21"
  kotlin("plugin.noarg") version "1.6.21"
}

allOpen {
  annotation("javax.persistence.Entity")
  annotation("javax.persistence.Embeddable")
  annotation("javax.persistence.MappedSuperclass")
}

noArg {
  annotation("javax.persistence.Entity")
  annotation("javax.persistence.Embeddable")
}

group = "com.toy"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
  mavenCentral()
}

dependencies {
  val jdslVersion = "2.0.4.RELEASE"
  implementation("com.linecorp.kotlin-jdsl:spring-data-kotlin-jdsl-starter:$jdslVersion")
  implementation("org.springframework.boot:spring-boot-starter-data-jpa")

  implementation("org.springframework.boot:spring-boot-starter-security")
  implementation("com.nimbusds:nimbus-jose-jwt:9.23")
  implementation("com.google.crypto.tink:tink:1.6.1")
  implementation("org.springdoc:springdoc-openapi-webflux-ui:1.6.9")
  implementation("io.projectreactor.tools:blockhound:1.0.6.RELEASE")

  val coroutineVersion = "1.6.3"
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:$coroutineVersion")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactive:$coroutineVersion")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutineVersion")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:$coroutineVersion")

  // hibernate reactive
  implementation("com.linecorp.kotlin-jdsl:spring-data-kotlin-jdsl-hibernate-reactive:$jdslVersion")
  implementation("org.springframework.data:spring-data-commons")
  implementation("org.hibernate.reactive:hibernate-reactive-core:1.1.6.Final")
  implementation("io.smallrye.reactive:mutiny-kotlin:1.6.0")

  // db reactive
  implementation("io.agroal:agroal-pool:2.0")
  implementation("com.h2database:h2")
  implementation("io.vertx:vertx-jdbc-client:4.3.1")
  implementation("org.mariadb.jdbc:mariadb-java-client")

  implementation("org.springframework.boot:spring-boot-starter-webflux")
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  testImplementation("org.springframework.boot:spring-boot-starter-test")

  implementation("io.netty:netty-resolver-dns-native-macos:4.1.68.Final:osx-aarch_64")
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs = listOf("-Xjsr305=strict")
    jvmTarget = "17"
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}
