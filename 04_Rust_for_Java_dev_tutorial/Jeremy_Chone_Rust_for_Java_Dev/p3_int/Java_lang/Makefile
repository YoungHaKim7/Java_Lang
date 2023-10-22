r:
		javac -cp src src/Main.java -d dist
		java -cp dist Main

b:
		javac -cp src src/Main.java -d dist

d: 
		wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.3/junit-platform-console-standalone-1.9.3.jar

t:
		java -jar ./junit-platform-console-standalone-1.9.3.jar --class-path dist --scan-class-path

clean:
		rm -rf dist

init:
		mkdir src
		echo public class Main { >> src/Main.java
		echo     public static void main(String[] args) { >> src/Main.java
		echo         System.out.println("Hello World. Java"); >> src/Main.java
		echo     } >> src/Main.java
		echo } >> src/Main.java