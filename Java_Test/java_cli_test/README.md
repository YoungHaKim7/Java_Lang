# Result Test


- Test Java

```
$ javac  -d out -cp .\junit-platform-console-standalone-1.9.3.jar .\GreetTest.java

$ java -jar .\junit-platform-console-standalone-1.9.3.jar --class-path out --scan-class-path
```


https://stackoverflow.com/questions/52373469/how-to-launch-junit-5-platform-from-the-command-line-without-maven-gradle/52373592#52373592

```

PS D:\Java_Lang\Java_Test\java_cli_test> javac  -d out -cp .\junit-platform-console-standalone-1.9.3.jar .\GreetTest.java
PS D:\Java_Lang\Java_Test\java_cli_test> ls

    Directory: D:\ava_Lang\Java_Test\java_cli_test

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d----        2023-09-26  오후 4:45                out
-a---        2023-09-26  오후 4:41             81 Greet.java
-a---        2023-09-26  오후 4:45            347 GreetTest.java
-a---        2023-09-26  오후 4:41        2614186 junit-platform-console-standalone-1.9.3.jar
-a---        2023-09-26  오후 3:36            388 README.md

PS D:\Java_Lang\Java_Test\java_cli_test> ls out

    Directory: D:\young_linux\Java_Lang\Java_Test\java_cli_test\out

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a---        2023-09-26  오후 4:45            508 GreetTest.class


PS D:\Java_Lang\Java_Test\java_cli_test> java -jar .\junit-platform-console-standalone-1.9.3.jar --class-path out --scan-class-path

Thanks for using JUnit! Support its development at https://junit.org/sponsoring

.
+-- JUnit Jupiter [OK]
+-- JUnit Vintage [OK]
| '-- GreetTest [OK]
|   '-- test [OK]
'-- JUnit Platform Suite [OK]

Test run finished after 90 ms
[         4 containers found      ]
[         0 containers skipped    ]
[         4 containers started    ]
[         0 containers aborted    ]
[         4 containers successful ]
[         0 containers failed     ]
[         1 tests found           ]
[         0 tests skipped         ]
[         1 tests started         ]
[         0 tests aborted         ]
[         1 tests successful      ]
[         0 tests failed          ]

```


```

Usage: ConsoleLauncher [OPTIONS]
Launches the JUnit Platform for test discovery and execution.
      [@<filename>...]       One or more argument files containing options.

COMMANDS

  -h, --help                 Display help information.
      --list-engines         List all observable test engines.

SELECTORS

      --scan-classpath, --scan-class-path[=PATH]
                             Scan all directories on the classpath or explicit classpath
                               roots. Without arguments, only directories on the system
                               classpath as well as additional classpath entries supplied via
                               -cp (directories and JAR files) are scanned. Explicit classpath
                               roots that are not on the classpath will be silently ignored.
                               This option can be repeated.
      --scan-modules         EXPERIMENTAL: Scan all resolved modules for test discovery.
  -u, --select-uri=URI       Select a URI for test discovery. This option can be repeated.
  -f, --select-file=FILE     Select a file for test discovery. This option can be repeated.
  -d, --select-directory=DIR Select a directory for test discovery. This option can be
                               repeated.
  -o, --select-module=NAME   EXPERIMENTAL: Select single module for test discovery. This
                               option can be repeated.
  -p, --select-package=PKG   Select a package for test discovery. This option can be repeated.
  -c, --select-class=CLASS   Select a class for test discovery. This option can be repeated.
  -m, --select-method=NAME   Select a method for test discovery. This option can be repeated.
  -r, --select-resource=RESOURCE
                             Select a classpath resource for test discovery. This option can
                               be repeated.
  -i, --select-iteration=TYPE:VALUE[INDEX(..INDEX)?(,INDEX(..INDEX)?)*]
                             Select iterations for test discovery (e.g. method:com.acme.Foo#m()
                               [1..2]). This option can be repeated.

FILTERS

  -n, --include-classname=PATTERN
                             Provide a regular expression to include only classes whose fully
                               qualified names match. To avoid loading classes unnecessarily,
                               the default pattern only includes class names that begin with
                               "Test" or end with "Test" or "Tests". When this option is
                               repeated, all patterns will be combined using OR semantics.
                               Default: ^(Test.*|.+[.$]Test.*|.*Tests?)$
  -N, --exclude-classname=PATTERN
                             Provide a regular expression to exclude those classes whose fully
                               qualified names match. When this option is repeated, all
                               patterns will be combined using OR semantics.
      --include-package=PKG  Provide a package to be included in the test run. This option can
                               be repeated.
      --exclude-package=PKG  Provide a package to be excluded from the test run. This option
                               can be repeated.
  -t, --include-tag=TAG      Provide a tag or tag expression to include only tests whose tags
                               match. When this option is repeated, all patterns will be
                               combined using OR semantics.
  -T, --exclude-tag=TAG      Provide a tag or tag expression to exclude those tests whose tags
                               match. When this option is repeated, all patterns will be
                               combined using OR semantics.
  -e, --include-engine=ID    Provide the ID of an engine to be included in the test run. This
                               option can be repeated.
  -E, --exclude-engine=ID    Provide the ID of an engine to be excluded from the test run.
                               This option can be repeated.

RUNTIME CONFIGURATION

      -cp, --classpath, --class-path=PATH
                             Provide additional classpath entries -- for example, for adding
                               engines and their dependencies. This option can be repeated.
      --config=KEY=VALUE     Set a configuration parameter for test discovery and execution.
                               This option can be repeated.

REPORTING

      --fail-if-no-tests     Fail and return exit status code 2 if no tests are found.
      --reports-dir=DIR      Enable report output into a specified local directory (will be
                               created if it does not exist).

CONSOLE OUTPUT

      --disable-ansi-colors  Disable ANSI colors in output (not supported by all terminals).
      --color-palette=FILE   Specify a path to a properties file to customize ANSI style of
                               output (not supported by all terminals).
      --single-color         Style test output using only text attributes, no color (not
                               supported by all terminals).
      --disable-banner       Disable print out of the welcome message.
      --details=MODE         Select an output details mode for when tests are executed. Use
                               one of: none, summary, flat, tree, verbose. If 'none' is
                               selected, then only the summary and test failures are shown.
                               Default: tree.
      --details-theme=THEME  Select an output details tree theme for when tests are executed.
                               Use one of: ascii, unicode. Default is detected based on
                               default character encoding.

For more information, please refer to the JUnit User Guide at
https://junit.org/junit5/docs/current/user-guide/

```
# How to launch JUnit 5 (Platform) from the command line (without Maven/Gradle)?

https://stackoverflow.com/questions/52373469/how-to-launch-junit-5-platform-from-the-command-line-without-maven-gradle/52373592#52373592

# Dynamic Programming with Java – Learn to Solve Algorithmic Problems & Coding Challenges | freeCodeCamp.org

https://youtu.be/oFkDldu3C_4?si=9-OBGChj5ASnq5I0
