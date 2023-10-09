plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    id("io.github.lognet.grpc-spring-boot")
    id("lombok")
}

dependencies {
    implementation(project(":grpc-common"))

    implementation(libs.grpc.starter)
    implementation(libs.snakeyaml)

    implementation("io.grpc:grpc-netty-shaded")
    runtimeOnly("io.grpc:grpc-services")
}
