plugins {
    id("org.springframework.boot") version "3.1.4"
    id("io.spring.dependency-management") version "1.1.3"
//    id(libs.git.properties)
    id("com.gorylenko.gradle-git-properties") version "2.4.1"
    id("java-lib")
    id("lombok")
}

group = "vlaship.gql"
version = "0.0.4-SNAPSHOT"

val grpcClientVersion = "0.0.4-SNAPSHOT"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-graphql")
    implementation(libs.snakeyaml)
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation(libs.netty)

    implementation("vlaship.grpc:grpc-client:$grpcClientVersion")

    annotationProcessor(libs.mapstruct.processor)
    implementation(libs.mapstruct)

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.graphql:spring-graphql-test")
}
