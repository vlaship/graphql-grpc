plugins {
    id("org.springframework.boot") version "3.1.4" apply false
    id("io.spring.dependency-management") version "1.1.3" apply false
    id("com.gorylenko.gradle-git-properties") version "2.4.1" apply false
    id("io.github.lognet.grpc-spring-boot") version "5.1.5" apply false
    id("com.google.protobuf") version "0.9.4" apply false
}

val grpcVersion = "1.58.0"

subprojects {
    apply(plugin = ("java"))

    configure<JavaPluginExtension> {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    group = "vlaship.grpc"
    version = "0.0.3-SNAPSHOT"

    configurations {
        "compileOnly" {
            extendsFrom(configurations.named("annotationProcessor").get())
        }
    }

    repositories {
        mavenCentral()
        mavenLocal()
    }

    dependencies {
        "implementation"("io.grpc:grpc-stub:$grpcVersion")
        "implementation"("io.grpc:grpc-protobuf:$grpcVersion")
        "implementation"("io.grpc:grpc-netty-shaded:$grpcVersion")
        "runtimeOnly"("io.grpc:grpc-services:$grpcVersion")
    }
}
