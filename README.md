<p align="center"><img width=75px src="https://github.com/YoungHaKim7/Cpp_Training/assets/67513038/fcec3be0-0bce-4a55-9853-87e9c3a235e8" /></p>

<hr>

# Link

- <a href="https://github.com/YoungHaKim7/Java_Lang#make-samplejava-linuxos">echo로 .gitignore 넣기</a>

- <a href="https://github.com/YoungHaKim7/Java_Lang#java-gitignore">그냥 넣기 .gitignore 넣기</a>

- <a href="https://github.com/YoungHaKim7/Java_Lang#makefile">Makefile간단히 만들기(간단한 Java실행)</a>

- <a href="https://github.com/YoungHaKim7/Java_Lang#google-java-style-guide">Java Style 가이드</a>

- [언어별 장단점 표로 비교_개발자가 사랑하는 JVM 4대 언어(코틀린, 스칼라, 클로저, 그루비)](#개발자가-사랑하는-jvm-4대-언어코틀린-스칼라-클로저-그루비)

<hr>

# sdkman(Java버젼 관리)[|🔝|](#link)

https://sdkman.io/

```
source "/home/gyoung/.sdkman/bin/sdkman-init.sh"

```
# Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true[|🔝|](#link)
- 오류 해결 하기 ```.bashrc```에 넣어주면 된다.

- ```vi /root/.bashrc```
- or  ```vi .zshrc```
- 난 zshrc에 넣었더니 해결됨.

```
// Scroll Down and COPY / PAST THIS 3 LINES Of COMMAND INTO YOUR .bashrc :
*************

_SILENT_JAVA_OPTIONS="$_JAVA_OPTIONS"
unset _JAVA_OPTIONS
alias java='java "$_SILENT_JAVA_OPTIONS"'

*************
```
출처 :  Permanently Fix Problem : Picked Up _JAVA_OPTIONS | Best Linux
- https://youtu.be/_J4YGeCLzLQ?si=mt9Zp35S4C0GfqnY

- 다른 방법

- .zshrc에 넣어주기

```
export _JAVA_OPTIONS='-Xms64m -Xmx128m -Dawt.useSystemAAFontSettings=lcd'
```
https://stackoverflow.com/questions/9677346/java-system-environment-variable/9677804#9677804

<hr>

# **[Java 21의 Virtual Threads 소개 [48p 슬라이드]](<https://news.hada.io/topic?id=19240&utm_source=discord&utm_medium=bot&utm_campaign=1480>)**[|🔝|](#link)
- Virtual Threads 개요  
  - Virtual Threads (Loom project) 란  
  - Platform Threads vs Virtual Threads - Blocking ?  
  - Platform Threads 작동 방식  
  - Virtual Threads 작동 방식  
- Rules & Best practices  
  - Rule 1 - Create Threads  
  - Rule 2 - Do Not use CompletableFuture  
  -...

<hr />

# Make sample(Java)-LinuxOS[|🔝|](#link)

```
echo "# Result\xa\xa\x60\x60\x60\xa\xa\x60\x60\x60" >> README.md &&

echo "# A collection of useful .gitignore templates " >> .gitignore &&
echo "# https://github.com/github/gitignore\xa" >> .gitignore &&
echo "# General" >> .gitignore &&
echo ".DS_Store" >> .gitignore &&
echo "dir/otherdir/.DS_Store\xa" >> .gitignore &&

echo "r:\xa\x09\x09rm -rf out\xa\x09\x09mkdir out\xa\x09\x09javac -cp src src/Main.java -d out" >> Makefile &&
echo "\x09\x09java -cp out Main\xa" >> Makefile &&
echo "b:\xa\x09\x09javac -cp src src/Main.java -d out" >> Makefile &&
echo "\x09\x09java -cp out Main\xa" >> Makefile &&
echo "d:\xa\x09\x09wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.3/junit-platform-console-standalone-1.9.3.jar\xa" >> Makefile &&
echo "t:\xa\x09\x09java -jar ./junit-platform-console-standalone-1.9.3.jar --class-path out --scan-class-path\xa" >> Makefile &&
echo "clean:" >> Makefile &&
echo "\x09\x09rm -rf *.jar ./out\xa" >> Makefile &&
echo "init:\xa\x09\x09mkdir src" >> Makefile &&
echo "\x09\x09echo \x22public class Main {\x22 >> src/Main.java" >> Makefile &&
echo "\x09\x09echo \x22\x09public static void main(String[] args) {\x22 >> src/Main.java" >> Makefile &&
echo "\x09\x09echo \x22\x09\x09System.out.println(\42Hello World. Java\42);\x22 >> src/Main.java" >> Makefile &&
echo "\x09\x09echo \x22\x09}\x22 >> src/Main.java" >> Makefile &&
echo "\x09\x09echo \x22}\x22 >> src/Main.java" >> Makefile
```


# echo로 Result만 만들기[|🔝|](#link)

```
echo "# Result\xa\xa\x60\x60\x60\xa\xa\x60\x60\x60" >> README.md
```

# Java Makefile(macOS)[|🔝|](#link)
```Makefile
echo "# Result\xa\xa\x60\x60\x60\xa\xa\x60\x60\x60" >> README.md &&

echo "# A collection of useful .gitignore templates " >> .gitignore &&
echo "# https://github.com/github/gitignore\xa" >> .gitignore &&
echo "# General" >> .gitignore &&
echo ".DS_Store" >> .gitignore &&
echo "dir/otherdir/.DS_Store\xa" >> .gitignore &&

echo "r:\xa\x09\x09rm -rf out\xa\x09\x09mkdir out\xa\x09\x09javac -cp src src/Main.java -d out" >> Makefile &&
echo "\x09\x09java -cp out Main\xa" >> Makefile &&
echo "b:\xa\x09\x09javac -cp src src/Main.java -d out" >> Makefile &&
echo "\x09\x09java -cp out Main\xa" >> Makefile &&
echo "d:\xa\x09\x09wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.3/junit-platform-console-standalone-1.9.3.jar\xa" >> Makefile &&
echo "t:\xa\x09\x09java -jar ./junit-platform-console-standalone-1.9.3.jar --class-path out --scan-class-path\xa" >> Makefile &&
echo "clean:" >> Makefile &&
echo "\x09\x09rm -rf *.jar ./out\xa" >> Makefile &&
echo "init:\xa\x09\x09mkdir src" >> Makefile &&
echo "\x09\x09echo \x22public class Main {\x22 >> src/Main.java" >> Makefile &&
echo "\x09\x09echo \x22\x09public static void main(String[] args) {\x22 >> src/Main.java" >> Makefile &&
echo "\x09\x09echo \x22\x09\x09System.out.println(\\\"Hello World. Java\\\");\x22 >> src/Main.java" >> Makefile &&
echo "\x09\x09echo \x22\x09}\x22 >> src/Main.java" >> Makefile &&
echo "\x09\x09echo \x22}\x22 >> src/Main.java" >> Makefile
```

# Makefile[|🔝|](#link)

```Makefile
r:
		rm -rf out
		mkdir out
		javac -cp src src/Main.java -d out
		java -cp out Main

b:
		javac -cp src src/Main.java -d out
		java -cp out Main

d:
		wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.3/junit-platform-console-standalone-1.9.3.jar

t:
		java -jar ./junit-platform-console-standalone-1.9.3.jar --class-path out --scan-class-path

clean:
		rm -rf *.jar ./out

init:
		mkdir src
		echo "public class Main {" >> src/Main.java
		echo "	public static void main(String[] args) {" >> src/Main.java
		echo "		System.out.println(\"Hello World. Java\");" >> src/Main.java
		echo "	}" >> src/Main.java
		echo "}" >> src/Main.java
```

# Java `.gitignore`[|🔝|](#link)

```
# A collection of useful .gitignore templates 
# https://github.com/github/gitignore

# General
.DS_Store
dir/otherdir/.DS_Store

out/

# Compiled class file
*.class

# Log file
*.log

# BlueJ files
*.ctxt

# Mobile Tools for Java (J2ME)
.mtj.tmp/

# Package Files #
*.jar
*.war
*.nar
*.ear
*.zip
*.tar.gz
*.rar

# virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml
hs_err_pid*
replay_pid*
```

<hr>

# Google Java Style Guide[|🔝|](#link)

https://google.github.io/styleguide/javaguide.html


# 스프링 디버깅VSCode❤️Run and debug a Spring Boot project in Visual Studio Code[|🔝|](#link)

https://youtu.be/fTgmRyxCGF0?si=4sSJf4bltg5ex6C3

# Helix Java LSP세팅[|🔝|](#link)

# Helix( Java LSP Install ) jdtls설치하기 그냥 github 땡기고 install하면 설치 된다. 최고..[|🔝|](#link)

https://github.com/eruizc-dev/jdtls-launcher

```
git clone https://github.com/eruizc-dev/jdtls-launcher.git 
Cloning into 'jdtls-launcher'...
remote: Enumerating objects: 241, done.
remote: Counting objects: 100% (85/85), done.
remote: Compressing objects: 100% (52/52), done.
remote: Total 241 (delta 43), reused 50 (delta 28), pack-reused 156
Receiving objects: 100% (241/241), 48.74 KiB | 9.75 MiB/s, done.
Resolving deltas: 100% (125/125), done.


$ cd jdtls-launcher 

 
$ ls
CONTRIBUTING.md  install.sh  jdtls-launcher.sh  LICENSE  README.md


$ ./install.sh 
INFO: Downloading JDTLS-LAUNCHER
-#O=#   #     #
INFO: Extracting JDTLS-LAUNCHER
INFO: Creating symlink at /home/gy/.local/bin/jdtls
Installing jdtls...
jdt-language-server-1.28.0-202309221544 is going to be installed
########################################################################################################################### 100.0%########################################################################################################################### 100.0%
Installing lombok...
########################################################################################################################### 100.0%
Lombok installation succesfull
JDTLS installation succesfull
INFO: Installation successful
INFO: Ensure /home/gy/.local/bin is in path
```


# Helix Debugger-Configurations[|🔝|](#link)

https://github.com/helix-editor/helix/wiki/Debugger-Configurations#configure-debuggers

This page can provide additional debugger configurations beyond [the ones shipped by default in Helix](https://github.com/helix-editor/helix/blob/master/languages.toml).


https://github.com/helix-editor/helix/issues/2510

<hr>

# LSP 이게 젤 큰듯? 역시 Eclipse이클립스[|🔝|](#link)

https://github.com/eclipse-jdtls/eclipse.jdt.ls

- jdtls-launcher 리눅스에 간단히 설치?
  - https://github.com/eruizc-dev/jdtls-launcher

<hr>

# gradle<a href="https://github.com/YoungHaKim7/Java_Lang#link">[🔝]</a>

https://docs.gradle.org/8.1.1/samples/

https://docs.gradle.org/8.1.1/samples/sample_building_java_applications.html

  - maven
    - https://docs.gradle.org/8.1.1/userguide/publishing_maven.html#publishing_maven

# 외부 라이브러리 검색하기[|🔝|](#link)

https://mvnrepository.com/

-build.gradle

```
// https://mvnrepository.com/artifact/junit/junit
testImplementation group: 'junit', name: 'junit', version: '4.13.2'
```
- gradle build

```
gradle build --scan
```


https://kotlinworld.com/321

<hr>

# Eclipse

https://www.eclipse.org/

# Eclipse Vim Setting (.vrapperrc)[|🔝|](#link)

- rust_vim_setting/Eclipse_Vim_settings/

  - https://github.com/YoungHaKim7/rust_vim_setting

  Eclipse __Vim Plug in (vrapper) 

    - Documentation https://vrapper.sourceforge.net/documentation/?topic=configuration#config

    - keymap https://vrapper.sourceforge.net/documentation/index.php?topic=commands

# Eclipse 자주 쓰는 Vim키 정리[|🔝|](#link)

```

// 자동완성
(Control + Space)

빔으로 세팅해서 그런가
Control + I 누르면 바로 밑 선택되고 밑에 내가 원하는 자동 완성은 Control 누른 상태로 알파벳 첫 글짜 선택됨. 그 다음 엔터
Control +y 가 빠르고 좋은데 이거랑 같이 기능은  모르겠음

// Reformat code
To reformat code according to the current code style settings, select Code
| Reformat Code from the main menu or press
⌥   ⌘   L  
option + command + L


// Comment and uncomment code
Use shortcuts to comment and uncomment lines and blocks of code:
  ⌘   /  : for single line comments (  //...  )
  ⌥   ⌘   /  : for block comments (  /*...*/  )

// The Rename refactoring
You can easily rename your classes, methods, and variables with automatic correction of all places where they are used.
Position the caret at the symbol you want to rename, and press
⇧   F6   (Refactor | Rename).
Type the new name and press   ↩ Return  .


// Preview search results
You can use the Preview area of the Find in Files dialog 
(  ⇧   ⌘   F  )
for quicker search without leaving the dialog. The Preview dialog displays the first 100 results. 





```


- 자동정렬(코드 개판으로 치고 fmt 해서 정렬하기 !!! 꼭 필요한 거)

```
On Windows and Linux : Ctrl + Shift + F

On Mac : ⌘ + ⇧ + F

(Alternatively you can press Format in Main Menu > Source)
```
https://stackoverflow.com/questions/15655126/how-to-auto-format-code-in-eclipse

- 나의 .vrapperrc 세팅

```
" ~~~~~ General Settings
imap jk <esc>
set autoindent
set ignorecase
set smartcase
set nonum

"" Content-Assist Mode ~~~~~~~
set contentassistmode 

" ~~~~~~~~~~~~~~
```

<hr>

# The application “Eclipse” can’t be opened. (macOS Monterey)[|🔝|](#link)

```
sudo codesign --force --deep --sign - /Applications/Eclipse.app
```
https://stackoverflow.com/questions/70725347/the-application-eclipse-can-t-be-opened-macos-monterey

# Java Module 설명서[|🔝|](#link)

https://openjdk.org/projects/jigsaw/quick-start

<hr>

# Java Full Course for free ☕(12시간짜리)[|🔝|](#link)

https://youtu.be/xk4_1vDrzzo


# Java Programming - Course for Absolute Beginners | freeCodeCamp.org[|🔝|](#link)

https://youtu.be/GoXwIVyNvX0

<br>

# Java Tutorials Series | freeCodeCamp.org[|🔝|](#link)

https://youtube.com/playlist?list=PLWKjhJtqVAbnRT_hue-3zyiuIYj0OlpyG

# 자바 코딩 무료 강의 (기본편) - 9시간 뒤면 여러분도 개발자가 될 수 있어요 | 나도코딩[|🔝|](#link)

https://youtu.be/NQq0dOoEPUM

# [나우캠퍼스]java[|🔝|](#link)

https://youtube.com/playlist?list=PLEk6DN9YLL6c_Dy-3yJhIKFP0AktqZVeE&si=LKZwqtWBhup8gY1k

<hr>

# Free University of Bolzano/Bozen | Faculty of Computer Science - Bachelor in Applied Computer Science | Bachelor in Production Engineering[|🔝|](#link)

https://www.inf.unibz.it/~calvanese/teaching/06-07-ip/lecture-notes/

<br>

# 한글설명[Java] 자료구조01 : 입출력, 변수, 배열, 반복문[|🔝|](#link)

https://ccomrung-programming.tistory.com/m/39

# 자바의 정석(2020년ver)[|🔝|](#link)

https://youtube.com/playlist?list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp


# 자바FX 강좌[|🔝|](#link)

- 자바FX는 GUI프로그램을 만들 때 사용하는 라이브러리 입니다.

  - https://youtube.com/playlist?list=PLENYGEQnz1xqvOzbiXdnI1IZyTxIe-XsH

<hr>

<br>

# Java tutorials(ORACLE)[|🔝|](#link)

https://docs.oracle.com/javase/tutorial/index.html

<br>

<hr>

# Java for Beginners[|🔝|](#link)

https://www.youtube.com/playlist?list=PLlrxD0HtieHgX3ExVDMlKjdN8LJsks2CM

<br>

# Jave_Lang[|🔝|](#link)

- Learning Java Language - Compiled from StackOverflow Documentation (PDF)

https://riptutorial.com/Download/java-language.pdf

<br>

<hr>

# ORACLE \_\_ Java Tutorials[|🔝|](#link)

https://docs.oracle.com/javase/tutorial/index.html

<br>

# 모든 언어를 무료로 공부할 수 있다.[|🔝|](#link)

출처 : stackoverflow.com 알게 된 링크

역시 갓 스택 오버플로우

https://stackoverflow.com/questions/38683512/why-git-shallow-clone-can-have-more-commits-than-depth/38683775#38683775

Github 주소
https://github.com/EbookFoundation/free-programming-books

EbookFoundation
https://ebookfoundation.github.io/free-programming-books/

# Java Windows Settings

- Java 개발자 기본 세팅

https://skypacific.github.io/2019/01/24/kang.heehun@dev-env-setting.html

```
choco install javaruntime
```

# Java Vim Setting (WindowsOS)[|🔝|](#link)

```
:LspInstall

Installed eclipse-jdt-ls
```

# Install(Eclipse)[|🔝|](#link)

https://www.eclipse.org/downloads/packages/installer

macOS

https://formulae.brew.sh/cask/eclipse-ide
WindowsOS

choco https://community.chocolatey.org/packages/eclipse

# eclipse & tomcat[|🔝|](#link)


```
PS C:\Users\user> choco install tomcat
Chocolatey v1.2.1
Installing the following packages:
tomcat
By installing, you accept licenses for the packages.
Progress: Downloading Tomcat 9.0.74... 100%

Tomcat v9.0.74 [Approved]
tomcat package files install completed. Performing other installation steps.
The package Tomcat wants to run 'chocolateyInstall.ps1'.
Note: If you don't run this script, the installation will fail.
Note: To confirm automatically next time, use '-y' or consider:
choco feature enable -n allowGlobalConfirmation
Do you want to run the script?([Y]es/[A]ll - yes to all/[N]o/[P]rint): a

Extracting 64-bit C:\ProgramData\chocolatey\lib\Tomcat\tools\apache-tomcat-9.0.74-windows-x64.zip to C:\ProgramData\chocolatey\lib\Tomcat\tools...
C:\ProgramData\chocolatey\lib\Tomcat\tools
C:\ProgramData\Tomcat9
Installing the service 'Tomcat9' ...
Using CATALINA_HOME:    "C:\ProgramData\chocolatey\lib\Tomcat\tools\apache-tomcat-9.0.74"
Using CATALINA_BASE:    "C:\ProgramData\Tomcat9"
Using JAVA_HOME:        "C:\Program Files\OpenJDK\jdk-19.0.2"
Using JRE_HOME:         "C:\Program Files\OpenJDK\jdk-19.0.2"
Using JVM:              "C:\Program Files\OpenJDK\jdk-19.0.2\bin\server\jvm.dll"
The service 'Tomcat9' has been installed.
Environment Vars (like PATH) have changed. Close/reopen your shell to
 see the changes (or in powershell/cmd.exe just type `refreshenv`).
 ShimGen has successfully created a shim for tomcat9.exe
 ShimGen has successfully created a shim for tomcat9w.exe
 The install of tomcat was successful.
  Software installed to 'C:\ProgramData\chocolatey\lib\Tomcat\tools'

Chocolatey installed 1/1 packages.
 See the log for details (C:\ProgramData\chocolatey\logs\chocolatey.log).

```

# Apache Tomcat Server Tutorial for Beginners[|🔝|](#link)

https://youtu.be/u_InEBgRVcc


# 개발자가 사랑하는 JVM 4대 언어(코틀린, 스칼라, 클로저, 그루비)[|🔝|](#link)

- 다음 표에서 4개 언어의 전체적인 특징을 간략히 볼 수 있다.
  - https://www.itworld.co.kr/article/4084582

|언어|패러다임|학습 난이도|주요 사용례|핵심 가치|
|-|-|-|-|-|
|코틀린<br />Kotlin|OOP, 함수형<br />(실용적)|쉬움|안드로이드 앱	|실용성, 안전성|
|스칼라<br />Scala|함수형,<br /> OOP(엄격)|보통|빅데이터(스파크)<br />Spark|타입 안전성,<br /> 확장성|
|클로저<br />Clojure|함수형<br />(리스프)|어려움|데이터 중심 API|단순성,<br /> 불변성|
|그루비<br />Groovy|동적,<br /> 스크립팅|쉬움|빌드<br />(그래들)<br />(gradle)|유연성,<br /> 스크립팅|
				

