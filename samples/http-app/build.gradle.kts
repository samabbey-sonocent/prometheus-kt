import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val ktorVersion = "1.3.2"
val slf4jVersion = "1.7.26"

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile("dev.evo:prometheus-kt-ktor")
    compile("io.ktor:ktor-server-netty:$ktorVersion")
    compile("org.slf4j:slf4j-simple:$slf4jVersion")
}

application {
    mainClassName = "MainKt"
}

tasks.withType<KotlinCompile> {
    kotlinOptions.freeCompilerArgs = listOf(
        "-Xuse-experimental=kotlin.Experimental"
    )
}