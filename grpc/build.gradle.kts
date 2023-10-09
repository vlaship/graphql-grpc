plugins {
    id("org.springframework.boot") version "3.1.4" apply false
    id("io.spring.dependency-management") version "1.1.3" apply false
    id("com.gorylenko.gradle-git-properties") version "2.4.1" apply false
    id("io.github.lognet.grpc-spring-boot") version "5.1.5" apply false
    id("com.google.protobuf") version "0.9.4" apply false
    id("java-lib")
    id("grpc-libs")
}

subprojects {
    apply(plugin = "java-lib")
    apply(plugin = "grpc-libs")
    group = "vlaship.grpc"
    version = "0.0.4-SNAPSHOT"
}
