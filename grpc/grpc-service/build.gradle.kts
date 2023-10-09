plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    id("io.github.lognet.grpc-spring-boot")
    id("lombok")
}

val grpcStarterVersion = "5.1.5"
val snakeyamlVersion = "2.2"

dependencies {
    implementation(project(":grpc-common"))

    implementation("io.github.lognet:grpc-spring-boot-starter:$grpcStarterVersion")
    implementation("org.yaml:snakeyaml:$snakeyamlVersion")

    implementation("io.grpc:grpc-netty-shaded")
    runtimeOnly("io.grpc:grpc-services")
}
