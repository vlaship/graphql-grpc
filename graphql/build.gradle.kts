plugins {
    id("org.springframework.boot") version "3.1.4"
    id("io.spring.dependency-management") version "1.1.3"
    id("com.gorylenko.gradle-git-properties") version "2.4.1"
    id("java-lib")
    id("lombok")
}

group = "vlaship.gql"
version = "0.0.4-SNAPSHOT"

val grpcClientVersion = "0.0.4-SNAPSHOT"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-graphql")
    implementation("org.yaml:snakeyaml:2.2")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("io.netty:netty-handler:4.1.99.Final")

    implementation("vlaship.grpc:grpc-client:$grpcClientVersion")

    val mapstructVersion = "1.5.5.Final"
    annotationProcessor("org.mapstruct:mapstruct-processor:$mapstructVersion")
    implementation("org.mapstruct:mapstruct:$mapstructVersion")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.graphql:spring-graphql-test")
}
