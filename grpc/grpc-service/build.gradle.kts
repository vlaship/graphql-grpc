plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    id("io.github.lognet.grpc-spring-boot")
    id("dev.vlaship.lombok")
    alias(libs.plugins.git.properties)
}

dependencies {
    implementation(project(":grpc-common"))

    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation(libs.netty)

    implementation(libs.grpc.starter)
    implementation(libs.snakeyaml)

    implementation("io.grpc:grpc-netty-shaded")
    runtimeOnly("io.grpc:grpc-services")
}

gitProperties {
    dateFormat = "yyyy-MM-dd HH:mm:ssZ"
    dateFormatTimeZone = "GMT"
    keys = arrayListOf("git.branch", "git.commit.id", "git.commit.id.abbrev", "git.commit.time", "git.tags")
}
