import com.github.gradle.node.yarn.task.YarnTask

plugins {
    id("com.github.node-gradle.node")
}

/*
Please reference the plugin maintainer's repo,
or best fork and contribute ;)
https://github.com/node-gradle/gradle-node-plugin/blob/master/src/test/resources/fixtures/kotlin/build.gradle.kts
 */

node {
    version.set("18.1.0")
    npmVersion.set("8.8.0")
    yarnVersion.set("1.22.15")
    download.set(true)
}


tasks {
    named<YarnTask>("yarn_install") {
        dependsOn("yarn_cache_clean")
    }

    create<YarnTask>("yarnBuild") {
        dependsOn("yarn_install")
        args.set(listOf("build", "--mode", "development", "--modern"))
    }

    create<YarnTask>("yarnBuildProd") {
        dependsOn("yarn_install")
        args.set(listOf("build", "--modern"))
    }
}