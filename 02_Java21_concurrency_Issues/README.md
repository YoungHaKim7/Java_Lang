# This lab covers three aspects of the Loom project: virtual threads, structured concurrency, and scoped values.

https://github.com/JosePaumard/JDK20_2023-Loom-Lab

```
// Running the Exercises
// Running the Virtual Threads Exercises

// You can compile your code with the following command, assuming you are using the JDK 20:

$ java --enable-preview --release 20 Main.java
```

<hr>

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

