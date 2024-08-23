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

<br>
