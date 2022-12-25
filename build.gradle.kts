plugins {
    idea
    id("java")
    kotlin("jvm") version "1.7.21"
    id("org.jetbrains.intellij") version "1.11.0"
    id("org.jetbrains.grammarkit") version "2022.3"
}

group = "com.marvelousanything"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(project(mapOf("path" to ":")))
    testImplementation(kotlin("test"))
}

 tasks {
     buildSearchableOptions {
         enabled = true
     }

     patchPluginXml {
         version.set("${project.version}")
         sinceBuild.set("221")
         untilBuild.set("223.*")
     }

     compileKotlin {
         kotlinOptions {
             jvmTarget = "17"
         }
     }

     compileTestKotlin {
         kotlinOptions {
             jvmTarget = "17"
         }
     }

     test {
         useJUnitPlatform()
     }

     generateLexer {
         source.set("src/main/grammars/pascal.flex")
         targetClass.set("com.marvelousanything.pascal.lang.lexer.PascalLexer")
         targetDir.set("src/gen/java/com/marvelousanything/pascal/lang/lexer")
         purgeOldFiles.set(true)
     }

     generateParser {
         source.set("src/main/grammars/pascal.bnf")
         targetRoot.set("src/gen/java")
         pathToParser.set("com/marvelousanything/pascal/lang/parser/PascalParser")
         pathToPsiRoot.set("com/marvelousanything/pascal/lang/psi")
         purgeOldFiles.set(true)
     }

     processResources.configure {
         dependsOn(generateParser, generateLexer)
         sourceSets.add(sourceSets["gen"])
     }
 }

intellij {
    version.set("2022.1.4")
    plugins.set(listOf("com.intellij.java"))
}

idea {
    module {
        generatedSourceDirs.add(file("src/gen"))
    }
}

sourceSets {
    create("gen") {
        java {
            srcDir("src/gen/java")
        }
        compileClasspath += sourceSets["main"].compileClasspath
    }
}

task("printSourceSetInformation") {
    doLast {
        sourceSets.forEach {
            project.logger.quiet("[${it.name}]")
            project.logger.quiet("--> Source directories: ${it.allJava.srcDirs}")
            project.logger.quiet("--> Compile classpath:")
            it.compileClasspath.files.forEach { file ->
                project.logger.quiet("\t|...$file")
            }
            project.logger.quiet("--> Runtime classpath:")
            it.runtimeClasspath.files.forEach { file ->
                project.logger.quiet("\t|...$file")
            }
            project.logger.quiet("--> Output directories: ${it.output.classesDirs.files}")

        }
    }
}