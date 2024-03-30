import com.google.protobuf.gradle.*

plugins {
    id("com.google.protobuf")
    id("dev.vlaship.publish")
}

val jakartaAnnotationApiVersion = "1.3.5" // 2+ incompatible - generate javax
//val jakartaAnnotationApiVersion = "2.1.1"

dependencies {
    implementation("io.grpc:grpc-stub")
    implementation("io.grpc:grpc-protobuf")
    compileOnly("jakarta.annotation:jakarta.annotation-api:$jakartaAnnotationApiVersion")
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:${libs.versions.protocVersion.get()}"
    }
    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:${libs.versions.grpcVersion.get()}"
        }
    }
    generateProtoTasks {
        all().forEach {
            it.plugins {
                id("grpc")
            }
        }
    }
}

