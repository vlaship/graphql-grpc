plugins {
    id("org.springframework.boot") version "3.2.0"
    id("io.spring.dependency-management") version "1.1.4"
    id("dev.vlaship.java-lib")
    id("dev.vlaship.lombok")
    alias(libs.plugins.git.properties)
}

group = "dev.vlaship.gql"
version = "0.0.6-SNAPSHOT"

val grpcClientVersion = "0.0.6-SNAPSHOT"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    implementation("org.springframework.boot:spring-boot-starter-graphql")
    implementation(libs.snakeyaml)
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation(libs.netty)

    implementation("dev.vlaship.grpc:grpc-client:$grpcClientVersion")

    annotationProcessor(libs.mapstruct.processor)
    implementation(libs.mapstruct)

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.graphql:spring-graphql-test")
}

gitProperties {
    dateFormat = "yyyy-MM-dd HH:mm:ssZ"
    dateFormatTimeZone = "GMT"
    keys = arrayListOf("git.branch", "git.commit.id", "git.commit.id.abbrev", "git.commit.time", "git.tags")
}
