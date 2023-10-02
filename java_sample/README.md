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

- tree 구성

```
tree
.
├── README.md
├── build.sh
├── out
│   └── Main.class
└── src
    └── Main.java

2 directories, 4 files

```

# Makefile Sample

- Trying Kotlin for the First Time (38:50) Makefile 나옴 
  - https://youtu.be/Q4VWCOgk6wc?si=Dzx903uB03CQFgcT 


```Makefile
run :
		javac -cp src src/Main.java -d out
		java -cp out Main
Main.class: ./src/Main.java
	  javac -cp src src/Main.java -d out

Main.class: ./out/Main.class
		java -cp out Main

clean:
		rm -rf out

    
```

<br>

# Make 사용법

https://studywithus.tistory.com/22


- Java 최종 make

https://www.cs.swarthmore.edu/~newhall/unixhelp/javamakefiles.html


# make file 기초 
