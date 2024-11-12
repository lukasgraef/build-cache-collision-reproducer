import java.nio.file.Files

rootProject.name = "collision-reproducer"

//code to create the reproducer subprojects
(1..1000).forEach {
    val projectName = "project$it"
    val projectDir = Files.createDirectories(settings.rootDir.toPath().resolve("subprojects/$projectName"))
    include(":$projectName")
    project(":$projectName").projectDir = projectDir.toFile()
    //Files.copy(settings.rootDir.toPath().resolve("about.html"), projectDir.resolve("about.html"))
}