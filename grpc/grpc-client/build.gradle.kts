plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    id("maven-publish")
}

dependencies {
    implementation(project(":grpc-common"))

    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

    implementation("org.springframework.boot:spring-boot-autoconfigure")
    implementation("org.slf4j:slf4j-api")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}
