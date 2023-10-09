import com.google.protobuf.gradle.*

plugins {
    id("com.google.protobuf")
    id("publish")
}

val grpcVersion = "1.58.0"
val protoVersion = "3.24.4"
val jakartaAnnotationApiVersion = "1.3.5" // 2+ incompatible - generate javax
// val =   jakartaAnnotationApiVersion = "2.1.1"

dependencies {
    implementation("io.grpc:grpc-stub")
    implementation("io.grpc:grpc-protobuf")
    compileOnly("jakarta.annotation:jakarta.annotation-api:$jakartaAnnotationApiVersion")
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:$protoVersion"
    }
    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:$grpcVersion"
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

