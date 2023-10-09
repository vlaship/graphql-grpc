rootProject.name = "graphql-service"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven { url = uri("https://repo.spring.io/milestone") }
        maven { url = uri("https://repo.spring.io/snapshot") }
    }
    includeBuild("../prj-build-logic")
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        mavenLocal()
    }
//    includeBuild("../grpc")
}
