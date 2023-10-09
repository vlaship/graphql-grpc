plugins {
    id("org.springframework.boot") version "3.1.4" apply false
    id("io.spring.dependency-management") version "1.1.3" apply false
    id("io.github.lognet.grpc-spring-boot") version "5.1.5" apply false
    id("com.google.protobuf") version "0.9.4" apply false
    id("dev.vlaship.java-lib")
    id("dev.vlaship.grpc-libs")
    id("dev.vlaship.version")
}

subprojects {
    apply(plugin = "dev.vlaship.java-lib")
    apply(plugin = "dev.vlaship.grpc-libs")
    apply(plugin = "dev.vlaship.version")
}
