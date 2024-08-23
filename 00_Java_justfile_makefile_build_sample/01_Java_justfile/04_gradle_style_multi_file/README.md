# justfile(다수의 파일 컴파일)

```justfile
target_folder := "out"
source_root_folder := "src/main/java/com/"
test_source_root_folder := "src/test/java/com/"
project_folder := "sequential"
entry_file_name := "Main"
source_file := source_root_folder+project_folder+"/"+entry_file_name+".java"
test_source_file := test_source_root_folder+project_folder+"/MainTest.java"

link_file := source_root_folder+project_folder+"/SequentialExecutionDemo.java"

r:
	rm -rf {{target_folder}}
	mkdir {{target_folder}}
	javac -cp src {{source_file}} {{link_file}} -d {{target_folder}}
	java -cp {{target_folder}} {{project_folder}}.{{entry_file_name}}

b:
	javac -cp src {{source_file}} -d {{target_folder}}
	java -cp {{target_folder}} {{project_folder}}.{{entry_file_name}}

d:
	wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.3/junit-platform-console-standalone-1.9.3.jar

t:
	java -jar ./junit-platform-console-standalone-1.9.3.jar --class-path out --scan-class-path

clean:
	rm -rf *.jar ./{{target_folder}}

init:
	mkdir -p {{source_root_folder}}{{project_folder}}
	mkdir -p {{test_source_root_folder}}{{project_folder}}
	echo "public class {{entry_file_name}} {" >> {{source_file}}
	echo "	public static void main(String[] args) {" >> {{source_file}}
	echo "		System.out.println(\42Hello World. Java\42);" >> {{source_file}}
	echo "	}" >> {{source_file}}
	echo "}" >>  {{source_file}}
```
