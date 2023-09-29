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

javac -cp src src/Main.java -d dist
java -cp dist Main

```

<br>

- tree 구성

```
tree
.
├── README.md
├── build.sh
├── dist
│   └── Main.class
└── src
    └── Main.java

2 directories, 4 files

```

<br>

# Make 사용법

https://studywithus.tistory.com/22


- Java 최종 make

https://www.cs.swarthmore.edu/~newhall/unixhelp/javamakefiles.html