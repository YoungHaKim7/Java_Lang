# 내가 공부하려 정리중(VScode에서 디버깅가능)

- https://github.com/YoungHaKim7/Java_Lang

# Multithreading for Beginners freeCodeCamp.org (Java예제) 
- https://youtu.be/gvQGKRlgop4?si=lQ-llkrjxtkrdON5


<hr>

# justfile(초간단java)

```justfile
target := "out"

r:
	rm -rf {{target}}
	mkdir {{target}}
	javac -cp src src/Main.java -d {{target}}
	java -cp {{target}} Main

b:
	javac -cp src src/Main.java -d {{target}}
	java -cp {{target}} Main

d:
	wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.3/junit-platform-console-standalone-1.9.3.jar
	java -jar ./junit-platform-console-standalone-1.9.3.jar --class-path out --scan-class-path

clean:
    rm -rf *.jar ./{{target}}

init:
	mkdir src
	echo "public class Main {" >> src/Main.java
	echo "	public static void main(String[] args) {" >> src/Main.java
	echo "		System.out.println(\42Hello World. Java\42);" >> src/Main.java
	echo "	}" >> src/Main.java
	

```


# justfile(gradle sytle)

```justfile
target_folder := "out"
source_root_folder := "src/main/java/com/"
test_source_root_folder := "src/test/java/com/"
project_folder := "testsrc"
source_file := source_root_folder+project_folder+"/Main.java"
test_source_file := test_source_root_folder+project_folder+"/MainTest.java"

r:
	rm -rf {{target_folder}}
	mkdir {{target_folder}}
	javac -cp src {{source_file}} -d {{target_folder}}
	java -cp {{target_folder}} Main

b:
	javac -cp src {{source_file}} -d {{target_folder}}
	java -cp {{target_folder}} Main

d:
	wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.3/junit-platform-console-standalone-1.9.3.jar

t:
	java -jar ./junit-platform-console-standalone-1.9.3.jar --class-path out --scan-class-path

clean:
	rm -rf *.jar ./{{target_folder}}

init:
	mkdir -p {{source_root_folder}}{{project_folder}}
	mkdir -p {{test_source_root_folder}}{{project_folder}}
	echo "public class Main {" >> {{source_file}}
	echo "	public static void main(String[] args) {" >> {{source_file}}
	echo "		System.out.println(\42Hello World. Java\42);" >> {{source_file}}
	echo "	}" >> {{source_file}}
	echo "}" >>  {{source_file}}
```

# sdkman(fishshell install)

- https://github.com/reitzig/sdkman-for-fish
  - https://github.com/reitzig/sdkman-for-fish/issues/34
    - https://github.com/reitzig/sdkman-for-fish/blob/c9fd8d58f2972c8664db6645ea37a3e35f2f5afb/conf.d/sdk.fish#L10

# gradle setting(FishShell)
- gradle and react-native with fish shell
  - https://stackoverflow.com/questions/34575272/gradle-and-react-native-with-fish-shell


# Java, Kotlin,gradle,android, maven Setting(FishShell)
- https://gist.github.com/guilherfp/068f15bb9aa195c844aa5cd6341ee7a4

- `config.fish`


```fish
alias unset 'set --erase'
alias rmraf 'rm -rf'
alias faker 'faker-cli --locale pt_BR'
alias clipboard 'copy-paste copy'
alias docker-minikube 'eval (minikube docker-env)'
alias make-all-mine 'sudo chown guilherfp:guilherfp'
alias listen-ports 'sudo lsof -i -P -n | grep LISTEN'
# Java
set -gx JAVA_HOME /home/guilherfp/.sdkman/candidates/java/current
set -gx PATH $JAVA_HOME/bin $PATH
# Android
set -gx ANDROID_HOME /home/guilherfp/Android/Sdk
set -gx PATH $ANDROID_HOME/platform-tools $PATH
set -gx PATH $ANDROID_HOME/tools $PATH
# Maven
set -gx MAVEN_OPTS '-XX:+TieredCompilation -XX:TieredStopAtLevel=1'
set -gx MAVEN_HOME /home/guilherfp/.sdkman/candidates/maven/current
set -gx PATH $MAVEN_HOME/bin $PATH
# Gradle
set -gx GRADLE_HOME /home/guilherfp/.sdkman/candidates/gradle/current
set -gx PATH $GRADLE_HOME/bin $PATH
# Kotlin
set -gx KOTLIN_HOME /home/guilherfp/.sdkman/candidates/kotlin/current
set -gx PATH $KOTLIN_HOME/bin $PATH

```
