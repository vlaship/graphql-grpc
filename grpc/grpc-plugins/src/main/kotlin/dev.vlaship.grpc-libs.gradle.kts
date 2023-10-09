plugins {
    id("java-library")
}

dependencies {
    val grpcVersion = "1.58.0"
    implementation("io.grpc:grpc-stub:$grpcVersion")
    implementation("io.grpc:grpc-protobuf:$grpcVersion")
    implementation("io.grpc:grpc-netty-shaded:$grpcVersion")
    runtimeOnly("io.grpc:grpc-services:$grpcVersion")
}
