rootProject.name = "grpc-service"

pluginManagement {
    repositories {
        gradlePluginPortal()
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
