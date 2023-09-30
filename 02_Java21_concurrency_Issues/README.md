# maven

- ```sdk install maven 4.0.0-alpha-7```
- ```mvn compile```
- ``` mvn test```

```

❯ sdk install maven 4.0.0-alpha-7

Downloading: maven 4.0.0-alpha-7

In progress...

#################################################################################################### 100.0%
/Users/globalyoung/.sdkman/tmp/hook_post_maven_4.0.0-alpha-7.sh:1: no such file or directory: html
/Users/globalyoung/.sdkman/tmp/hook_post_maven_4.0.0-alpha-7.sh:2: parse error near `<'

Installing: maven 4.0.0-alpha-7
Done installing!


Setting maven 4.0.0-alpha-7 as default.
❯ ls
LICENCE.txt Readme.md   pom.xml     solutions   src         target

❯ mvn
Unable to find the root directory. Create a .mvn directory in the root directory or add the root="true" attribute on the root project's model to identify it.
[INFO] Scanning for projects...
[INFO] ---------------------------------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ---------------------------------------------------------------------------------------------------
[INFO] Total time:  0.054 s
[INFO] Finished at: 2023-09-30T22:04:41+09:00
[INFO] ---------------------------------------------------------------------------------------------------
[ERROR] No goals have been specified for this build. You must specify a valid lifecycle phase or a goal in the format <plugin-prefix>:<goal> or <plugin-group-id>:<plugin-artifact-id>[:<plugin-version>]:<goal>. Available lifecycle phases are: pre-clean, clean, post-clean, validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy, pre-site, site, post-site, site-deploy, wrapper. -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the '-e' switch
[ERROR] Re-run Maven using the '-X' switch to enable verbose output
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/NoGoalSpecifiedException


❯ mvn compile
Unable to find the root directory. Create a .mvn directory in the root directory or add the root="true" attribute on the root project's model to identify it.
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------------------< org.example:JDK20-2023_loom-lab >--------------------------------
[INFO] Building JDK20-2023_loom-lab 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] ----------------------------------------------[ jar ]----------------------------------------------
[WARNING] Version not locked for default bindings plugins [maven-resources-plugin], you should define versions in pluginManagement section of your pom.xml or parent
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ JDK20-2023_loom-lab ---
[INFO] skip non existing resourceDirectory /Users/globalyoung/Documents/test/test/java_lang/JDK20_2023-Loom-Lab/src/main/resources
[INFO] skip non existing resourceDirectory /Users/globalyoung/Documents/test/test/java_lang/JDK20_2023-Loom-Lab/src/main/resources-filtered
[INFO]
[INFO] --- compiler:3.10.1:compile (default-compile) @ JDK20-2023_loom-lab ---
[INFO] Nothing to compile - all classes are up to date
[INFO] ---------------------------------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ---------------------------------------------------------------------------------------------------
[INFO] Total time:  0.277 s
[INFO] Finished at: 2023-09-30T22:05:14+09:00
[INFO] ---------------------------------------------------------------------------------------------------



❯ mvn test
Unable to find the root directory. Create a .mvn directory in the root directory or add the root="true" attribute on the root project's model to identify it.
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------------------< org.example:JDK20-2023_loom-lab >--------------------------------
[INFO] Building JDK20-2023_loom-lab 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] ----------------------------------------------[ jar ]----------------------------------------------
[WARNING] Version not locked for default bindings plugins [maven-resources-plugin, maven-surefire-plugin], you should define versions in pluginManagement section of your pom.xml or parent
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ JDK20-2023_loom-lab ---
[INFO] skip non existing resourceDirectory /Users/globalyoung/Documents/test/test/java_lang/JDK20_2023-Loom-Lab/src/main/resources
[INFO] skip non existing resourceDirectory /Users/globalyoung/Documents/test/test/java_lang/JDK20_2023-Loom-Lab/src/main/resources-filtered
[INFO]
[INFO] --- compiler:3.10.1:compile (default-compile) @ JDK20-2023_loom-lab ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ JDK20-2023_loom-lab ---
[INFO] skip non existing resourceDirectory /Users/globalyoung/Documents/test/test/java_lang/JDK20_2023-Loom-Lab/src/test/resources
[INFO] skip non existing resourceDirectory /Users/globalyoung/Documents/test/test/java_lang/JDK20_2023-Loom-Lab/src/test/resources-filtered
[INFO]
[INFO] --- compiler:3.10.1:testCompile (default-testCompile) @ JDK20-2023_loom-lab ---
[INFO] No sources to compile
[INFO]
[INFO] --- surefire:3.1.2:test (default-test) @ JDK20-2023_loom-lab ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.1.2/maven-surefire-common-3.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.1.2/maven-surefire-common-3.1.2.pom (6.1 kB at 40 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.1.2/surefire-api-3.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.1.2/surefire-api-3.1.2.pom (3.5 kB at 441 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.1.2/surefire-logger-api-3.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.1.2/surefire-logger-api-3.1.2.pom (3.3 kB at 466 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.1.2/surefire-shared-utils-3.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.1.2/surefire-shared-utils-3.1.2.pom (4.1 kB at 507 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.1.2/surefire-extensions-api-3.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.1.2/surefire-extensions-api-3.1.2.pom (3.3 kB at 472 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.1.2/surefire-booter-3.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.1.2/surefire-booter-3.1.2.pom (4.5 kB at 495 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.1.2/surefire-extensions-spi-3.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.1.2/surefire-extensions-spi-3.1.2.pom (1.8 kB at 252 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/1.0.0.v20140518/aether-util-1.0.0.v20140518.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/1.0.0.v20140518/aether-util-1.0.0.v20140518.pom (2.2 kB at 274 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether/1.0.0.v20140518/aether-1.0.0.v20140518.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether/1.0.0.v20140518/aether-1.0.0.v20140518.pom (30 kB at 2.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-api/1.0.0.v20140518/aether-api-1.0.0.v20140518.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-api/1.0.0.v20140518/aether-api-1.0.0.v20140518.pom (1.9 kB at 316 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.1/maven-common-artifact-filters-3.1.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.1/maven-common-artifact-filters-3.1.1.pom (5.8 kB at 828 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.2.5/maven-artifact-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.2.5/maven-artifact-3.2.5.pom (2.3 kB at 391 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.2.5/maven-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.2.5/maven-3.2.5.pom (22 kB at 2.8 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.2.5/maven-core-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.2.5/maven-core-3.2.5.pom (8.1 kB at 1.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.2.5/maven-settings-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.2.5/maven-settings-3.2.5.pom (2.2 kB at 362 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.2.5/maven-settings-builder-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.2.5/maven-settings-builder-3.2.5.pom (2.6 kB at 371 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.21/plexus-interpolation-1.21.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.21/plexus-interpolation-1.21.pom (1.5 kB at 257 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.2.5/maven-repository-metadata-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.2.5/maven-repository-metadata-3.2.5.pom (2.2 kB at 372 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.2.5/maven-plugin-api-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.2.5/maven-plugin-api-3.2.5.pom (3.0 kB at 504 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.3.5/org.eclipse.sisu.plexus-0.3.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.3.5/org.eclipse.sisu.plexus-0.3.5.pom (4.3 kB at 714 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-plexus/0.3.5/sisu-plexus-0.3.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-plexus/0.3.5/sisu-plexus-0.3.5.pom (14 kB at 1.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.pom (13 kB at 1.9 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/java/jvnet-parent/3/jvnet-parent-3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/net/java/jvnet-parent/3/jvnet-parent-3.pom (4.8 kB at 684 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/javax/enterprise/cdi-api/1.2/cdi-api-1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/javax/enterprise/cdi-api/1.2/cdi-api-1.2.pom (6.3 kB at 897 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/weld/weld-parent/26/weld-parent-26.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/weld/weld-parent/26/weld-parent-26.pom (32 kB at 4.6 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.3.5/org.eclipse.sisu.inject-0.3.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.3.5/org.eclipse.sisu.inject-0.3.5.pom (2.6 kB at 438 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-inject/0.3.5/sisu-inject-0.3.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-inject/0.3.5/sisu-inject-0.3.5.pom (14 kB at 2.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.2.5/maven-model-builder-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.2.5/maven-model-builder-3.2.5.pom (3.0 kB at 428 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.2.5/maven-aether-provider-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.2.5/maven-aether-provider-3.2.5.pom (4.2 kB at 850 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-spi/1.0.0.v20140518/aether-spi-1.0.0.v20140518.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-spi/1.0.0.v20140518/aether-spi-1.0.0.v20140518.pom (2.1 kB at 342 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-impl/1.0.0.v20140518/aether-impl-1.0.0.v20140518.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-impl/1.0.0.v20140518/aether-impl-1.0.0.v20140518.pom (3.5 kB at 434 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/3.2.3/sisu-guice-3.2.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/3.2.3/sisu-guice-3.2.3.pom (11 kB at 1.8 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-parent/3.2.3/guice-parent-3.2.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-parent/3.2.3/guice-parent-3.2.3.pom (13 kB at 1.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/38/forge-parent-38.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/38/forge-parent-38.pom (19 kB at 2.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/16.0.1/guava-16.0.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/16.0.1/guava-16.0.1.pom (6.1 kB at 763 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/16.0.1/guava-parent-16.0.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/16.0.1/guava-parent-16.0.1.pom (7.3 kB at 1.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.12.0/commons-io-2.12.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.12.0/commons-io-2.12.0.pom (20 kB at 2.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/57/commons-parent-57.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/57/commons-parent-57.pom (83 kB at 5.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.9.2/junit-bom-5.9.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.9.2/junit-bom-5.9.2.pom (5.6 kB at 938 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.1.2/plexus-java-1.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.1.2/plexus-java-1.1.2.pom (5.0 kB at 710 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-languages/1.1.2/plexus-languages-1.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-languages/1.1.2/plexus-languages-1.1.2.pom (4.1 kB at 518 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.4/asm-9.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.4/asm-9.4.pom (2.4 kB at 395 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/ow2/1.5.1/ow2-1.5.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/ow2/1.5.1/ow2-1.5.1.pom (11 kB at 1.6 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0.3/qdox-2.0.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0.3/qdox-2.0.3.pom (17 kB at 2.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.1.2/maven-surefire-common-3.1.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.1.2/maven-surefire-common-3.1.2.jar (306 kB at 19 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.1.2/surefire-api-3.1.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.1.2/surefire-logger-api-3.1.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.1.2/surefire-extensions-api-3.1.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.1.2/surefire-booter-3.1.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.1.2/surefire-extensions-spi-3.1.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.1.2/surefire-api-3.1.2.jar (171 kB at 17 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/1.0.0.v20140518/aether-util-1.0.0.v20140518.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/1.0.0.v20140518/aether-util-1.0.0.v20140518.jar (146 kB at 7.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-api/1.0.0.v20140518/aether-api-1.0.0.v20140518.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.1.2/surefire-logger-api-3.1.2.jar (14 kB at 523 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.1.2/surefire-extensions-spi-3.1.2.jar (8.2 kB at 314 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.1/maven-common-artifact-filters-3.1.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.12.0/commons-io-2.12.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.1.2/surefire-extensions-api-3.1.2.jar (26 kB at 957 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.1.2/plexus-java-1.1.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-api/1.0.0.v20140518/aether-api-1.0.0.v20140518.jar (136 kB at 4.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.4/asm-9.4.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.1.2/surefire-booter-3.1.2.jar (118 kB at 3.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0.3/qdox-2.0.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.1.2/plexus-java-1.1.2.jar (55 kB at 1.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.1.2/surefire-shared-utils-3.1.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.4/asm-9.4.jar (122 kB at 3.2 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.1/maven-common-artifact-filters-3.1.1.jar (61 kB at 1.5 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0.3/qdox-2.0.3.jar (334 kB at 6.2 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.12.0/commons-io-2.12.0.jar (474 kB at 5.1 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.1.2/surefire-shared-utils-3.1.2.jar (2.3 MB at 24 MB/s)
[INFO] ---------------------------------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ---------------------------------------------------------------------------------------------------
[INFO] Total time:  1.158 s
[INFO] Finished at: 2023-09-30T22:05:33+09:00
[INFO] -------------------------------------------------------------------------------

```
https://maven.apache.org/guides/getting-started/index.html

<hr>


# This lab covers three aspects of the Loom project: virtual threads, structured concurrency, and scoped values.

https://github.com/JosePaumard/JDK20_2023-Loom-Lab

```
// Running the Exercises
// Running the Virtual Threads Exercises

// You can compile your code with the following command, assuming you are using the JDK 20:

$ java --enable-preview --release 20 Main.java
```

<hr>

<br>

# Concurrency Issues
```java
Json request        = ContractService.build.ContractRequest(id); // 100ns
String contractJson = ContractService.fetchContract(request);   // 100ms
Contract contract   = Json.unmarshall(contractJson);            // 100ns
```

<table border="1">
    <tr>
    <td colspan="3" align="center">Concurrency Issues</td>
    </tr>
    <tr align="center">
        <td>ns</td>
        <td>ms</td>
        <td>ns</td>
    </tr>
    <tr align="center">
        <td><--></td>
        <td><---------------------------------></td>
        <td><--></td>
    </tr>
</table>

# What Solution?

- Creating several threads
  - As many as needed, that is 1M of them.


## Concurrency for I/O

- A thread is not cheap
  - Thread starup time: ~1ms 
  - Thread memory consumption: 2MB of stack
  - Context switching: ~100us(depends on the OS)

- Having 1 million platform threads is not possible

# What Solution?

1) Give each thread between 1K and 1M tasks <br>This is what reactive frameworks are doing


<hr>

<br>


<table>

</table>


# Java 21: Focus on Virtual Threads and Pattern Matching | IntelliJ IDEA by JetBrains

https://www.youtube.com/live/d_XmNicqC2I?si=_D5bQfXaja3Vei4G

# Project Loom

https://jdk.java.net/loom/


<hr>


# Java 21: Virtual Threads - A different async/await with Code Examples

https://youtu.be/JWZxyrHBppA?si=P0y9vtTffuNaQcNm

