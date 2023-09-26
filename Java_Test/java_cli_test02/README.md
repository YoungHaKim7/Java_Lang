# Test


- Compile 먼저 

```

$ javac -cp src src/Main.java -d dist

$ java -cp dist Main

Hello, Hello

  
```

- Compile 한거에 Test 해야한다. 

```

$ java -jar ../java_cli_test/junit-platform-console-standalone-1.9.3.jar --class-path dist --scan-class-path

Thanks for using JUnit! Support its development at https://junit.org/sponsoring

╷
├─ JUnit Jupiter ✔
├─ JUnit Vintage ✔
└─ JUnit Platform Suite ✔

Test run finished after 17 ms
[         3 containers found      ]
[         0 containers skipped    ]
[         3 containers started    ]
[         0 containers aborted    ]
[         3 containers successful ]
[         0 containers failed     ]
[         0 tests found           ]
[         0 tests skipped         ]
[         0 tests started         ]
[         0 tests aborted         ]
[         0 tests successful      ]
[         0 tests failed          ]

  
```
