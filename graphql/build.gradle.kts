plugins {
    java
    id("org.springframework.boot") version "3.1.4"
    id("io.spring.dependency-management") version "1.1.3"
    id("com.gorylenko.gradle-git-properties") version "2.4.1"
}

group = "vlaship.gql"
version = "0.0.3-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

val mapstructVersion = "1.5.5.Final"
val grpcClientVersion = "0.0.3-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    implementation("org.springframework.boot:spring-boot-starter-graphql")
    implementation("org.springframework.boot:spring-boot-starter-webflux")

    implementation("vlaship.grpc:grpc-client:$grpcClientVersion")

    annotationProcessor("org.mapstruct:mapstruct-processor:$mapstructVersion")
    implementation("org.mapstruct:mapstruct:$mapstructVersion")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.graphql:spring-graphql-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
