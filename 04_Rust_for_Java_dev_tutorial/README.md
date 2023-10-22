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


# Java vs Rust

<br>

<table border="1">
    <tr>
    <td colspan="3" align="center">Java vs Rust(integers)</td>
    </tr>
    <tr align="center">
        <td></td>
        <td>Java</td>
        <td>Rust</td>
    </tr>
    <tr align="center">
        <td>Length</td>
        <td>signed*</td>
        <td>Signed/ Unsigned</td>
    </tr>
    <tr align="center">
        <td>8-bit</td>
        <td>bytes</td>
        <td>i8 / u8</td>
    </tr>
    <tr align="center">
        <td>16-bit</td>
        <td>short</td>
        <td>i16 / u16</td>
    </tr>
    <tr align="center">
        <td>32-bit</td>
        <td>int</td>
        <td>i32 / u32</td>
    </tr>
    <tr align="center">
        <td>64-bit</td>
        <td>long</td>
        <td>i64 / u64</td>
    </tr>
    <tr align="center">
        <td>128-bit</td>
        <td></td>
        <td>i128 / u128</td>
    </tr>
    <tr align="center">
        <td>arch</td>
        <td></td>
        <td>isize / usize</td>
    </tr>
</table>

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

# Rust vs Java: A Staff Engineer's perspective | Security Union

https://youtu.be/-JwgfNGx_V8?si=VVmlNmSjLQbjC1yG

