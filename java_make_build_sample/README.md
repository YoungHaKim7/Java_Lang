# jar파일 인위적으로 추가해서 넣기 cli
https://stackoverflow.com/questions/9395207/how-to-include-jar-files-with-java-file-and-compile-in-command-prompt

# javac & java 자동으로 ㅋ

build.sh
```
$ ./build.sh

Java ! Hello World

```

<br>

- build.sh 
```
#!/bin/bash

javac -cp src src/Main.java -d out
java -cp out Main

```

<br>

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
# Makefile Sample

- Trying Kotlin for the First Time (38:50) Makefile 나옴 
  - https://youtu.be/Q4VWCOgk6wc?si=Dzx903uB03CQFgcT 

<br>

# Make 사용법

https://studywithus.tistory.com/22


- Java 최종 make

https://www.cs.swarthmore.edu/~newhall/unixhelp/javamakefiles.html


# make file 기초 
