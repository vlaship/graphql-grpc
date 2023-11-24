rootProject.name = "graphql-service"

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    includeBuild("../prj-build-logic")
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
//        mavenLocal()
    }
    includeBuild("../grpc")
}
