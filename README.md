# gradle

https://docs.gradle.org/8.1.1/samples/

https://docs.gradle.org/8.1.1/samples/sample_building_java_applications.html

  - maven
    - https://docs.gradle.org/8.1.1/userguide/publishing_maven.html#publishing_maven

# 외부 라이브러리 검색하기

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

# Eclipse Vim Setting (.vrapperrc)

- rust_vim_setting/Eclipse_Vim_settings/

  - https://github.com/YoungHaKim7/rust_vim_setting

  Eclipse __Vim Plug in (vrapper) 

    - Documentation https://vrapper.sourceforge.net/documentation/?topic=configuration#config

    - keymap https://vrapper.sourceforge.net/documentation/index.php?topic=commands

# Eclipse 자주 쓰는 Vim키 정리

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

# The application “Eclipse” can’t be opened. (macOS Monterey)

```
sudo codesign --force --deep --sign - /Applications/Eclipse.app
```
https://stackoverflow.com/questions/70725347/the-application-eclipse-can-t-be-opened-macos-monterey

# Java Module 설명서

https://openjdk.org/projects/jigsaw/quick-start

# Java Full Course for free ☕(12시간짜리)

https://youtu.be/xk4_1vDrzzo


# Java Programming - Course for Absolute Beginners | freeCodeCamp.org

https://youtu.be/GoXwIVyNvX0

<br>

# Java Tutorials Series | freeCodeCamp.org

https://youtube.com/playlist?list=PLWKjhJtqVAbnRT_hue-3zyiuIYj0OlpyG


# Free University of Bolzano/Bozen | Faculty of Computer Science - Bachelor in Applied Computer Science | Bachelor in Production Engineering

https://www.inf.unibz.it/~calvanese/teaching/06-07-ip/lecture-notes/

<br>

# 한글설명[Java] 자료구조01 : 입출력, 변수, 배열, 반복문 

https://ccomrung-programming.tistory.com/m/39

# 자바의 정석(2020년ver)

https://youtube.com/playlist?list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp


# 자바FX 강좌

- 자바FX는 GUI프로그램을 만들 때 사용하는 라이브러리 입니다.

  - https://youtube.com/playlist?list=PLENYGEQnz1xqvOzbiXdnI1IZyTxIe-XsH

<hr>

<br>

# Java tutorials(ORACLE)

https://docs.oracle.com/javase/tutorial/index.html

<br>

<hr>

# Java for Beginners

https://www.youtube.com/playlist?list=PLlrxD0HtieHgX3ExVDMlKjdN8LJsks2CM

<br>

# Jave_Lang

- Learning Java Language - Compiled from StackOverflow Documentation (PDF)

https://riptutorial.com/Download/java-language.pdf

<br>

<hr>

# ORACLE \_\_ Java Tutorials

https://docs.oracle.com/javase/tutorial/index.html

<br>

# 모든 언어를 무료로 공부할 수 있다.

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

# Java Vim Setting (WindowsOS)

```
:LspInstall

Installed eclipse-jdt-ls
```

# Install(Eclipse)

https://www.eclipse.org/downloads/packages/installer

macOS

https://formulae.brew.sh/cask/eclipse-ide
WindowsOS

choco https://community.chocolatey.org/packages/eclipse

# eclipse & tomcat


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

# Apache Tomcat Server Tutorial for Beginners

https://youtu.be/u_InEBgRVcc
