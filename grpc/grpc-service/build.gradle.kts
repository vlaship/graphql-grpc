plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    id("io.github.lognet.grpc-spring-boot")
}

val grpcStarterVersion = "5.1.5"

dependencies {
    implementation(project(":grpc-common"))

    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    implementation("io.github.lognet:grpc-spring-boot-starter:$grpcStarterVersion")

    implementation("io.grpc:grpc-netty-shaded")
    runtimeOnly("io.grpc:grpc-services")
}
