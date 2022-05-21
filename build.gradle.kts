description = "jar_runner"
version = "1.0.0"
group = "xyz.srnyx"

plugins {
    java
}

tasks {
    jar {
        manifest {
            attributes(mutableMapOf("Main-Class" to "xyz.srnyx.jar_runner.Main"))
        }
    }

    compileJava {
        options.encoding = "UTF-8"
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
    }
}