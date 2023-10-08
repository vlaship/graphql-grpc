import com.google.protobuf.gradle.*

plugins {
    id("com.google.protobuf")
    id("maven-publish")
}

val protoVersion = "3.24.4"
val jakartaAnnotationApiVersion = "1.3.5" // 2+ incompatible - generate javax
// val =   jakartaAnnotationApiVersion = "2.1.1"

dependencies {
    implementation("io.grpc:grpc-stub")
    implementation("io.grpc:grpc-protobuf")
    implementation("jakarta.annotation:jakarta.annotation-api:$jakartaAnnotationApiVersion")
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:$protoVersion"
    }
    plugins {
        id("grpc") {
            val grpcVersion = "1.58.0"
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

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}
