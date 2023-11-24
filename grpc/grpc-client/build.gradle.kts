plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    id("dev.vlaship.publish")
    id("dev.vlaship.lombok")
}

dependencies {
    api(project(":grpc-common"))

    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

    implementation("org.springframework.boot:spring-boot-autoconfigure")
    implementation("org.slf4j:slf4j-api")
}
