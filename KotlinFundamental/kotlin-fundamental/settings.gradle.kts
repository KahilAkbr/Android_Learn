plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "kotlin-fundamental"
include("src:main:test")
findProject(":src:main:test")?.name = "test"
include("src:main:resources:untitled")
findProject(":src:main:resources:untitled")?.name = "untitled"
