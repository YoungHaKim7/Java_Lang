# Java Tutorial

https://docs.oracle.com/javase/tutorial/index.html


<hr>


# Rust for Java Developers | Jeremy Chone

- Rust for Java Developers 1/3 - Introduction - [Beginners] | Jeremy Chone
  - https://youtu.be/iFdh4sPC5Tg
- Rust for Java Developers 2/3 - Java 17 side by side
  - https://youtu.be/_xiPUXMZeyU?si=7AKbPNjVIV2d78aS
- Rust for Java Developers 3/3 - Understanding Ownership
  - https://youtu.be/Vg1LGHuAPP8?si=S9f_iNoNmHlGpr14

<br>

# Java compile

```

$ javac -cp src .\src\Start.java -d dist

$ java -cp dist Start

```

```
$ javac -cp src .\src\Start.java -d dist

PS d:\part1> ls dist

    Directory: part1\dist

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a---        2022-12-03  오후 2:06            422 Start.class

PS d:\part1> ls src

    Directory: part1\src

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a---        2022-12-03  오후 2:06            121 Start.java

PS d:\part1> tree
D:.
├─dist
└─src

PS D:part1> ls

    Directory: D:\part1

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d----        2022-12-03  오후 2:06                dist
d----        2022-12-03  오후 2:06                src

PS D:\part1> java -cp dist Start

Java ! Hello World


```
