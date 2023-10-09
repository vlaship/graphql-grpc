rootProject.name = "grpc-service"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven { url = uri("https://repo.spring.io/milestone") }
        maven { url = uri("https://repo.spring.io/snapshot") }
    }
    includeBuild("../prj-build-logic")
    includeBuild("grpc-plugins")
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

include("grpc-common")
include("grpc-service")
include("grpc-client")

//rootDir.listFiles()?.filter { it.isDirectory && !it.isHidden && !it.name.contains("gradle") }?.forEach {
//    include(it.name)
//}
