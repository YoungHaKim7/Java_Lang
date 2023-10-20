# tree ```make r```

```
$ tree
.
├── Makefile
├── out
│   └── Main.class
└── src
    └── Main.java

3 directories, 3 files
```

```Makefile
r:
		javac -cp src src/Main.java -d out
		java -cp out Main

b:
		javac -cp src src/Main.java -d out

d: 
		wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.3/junit-platform-console-standalone-1.9.3.jar

t:
		java -jar ./junit-platform-console-standalone-1.9.3.jar --class-path dist --scan-class-path

clean:
		rm -rf out
```

# ```make clean```

- delete out folder

# Result

```

```
