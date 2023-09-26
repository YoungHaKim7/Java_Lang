# Helix( A post-modern text editor.)<a href="https://helix-editor.com/"><img align="left" alt="helix" width="20px" src="https://user-images.githubusercontent.com/67513038/214281307-c7bd5adf-eba9-4f13-9247-7700fb1deff9.png" /></a><a href="https://www.rust-lang.org/"><img align="center" alt="rust1" width="26px" src="https://user-images.githubusercontent.com/67513038/213436632-820a1675-98d9-4626-979d-be63c60cdcb7.png" /></a>

# Eclipse_Vim_Settings

https://github.com/YoungHaKim7/rust_vim_setting

# Helix( Java LSP Install ) jdtls설치하기 그냥 github 땡기고 install하면 설치 된다. 최고..

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

# macOS 기준

- ```brew install jdtls java``` 이거 2개만 설치하면 됨

```
brew search jdtls
==> Formulae
jdtls ✔
brew search java
==> Formulae
google-java-format     java-service-wrapper   javacc                 jslint4java            pdftk-java
java ✔ 
```


# WindowsOS 기준

```
choco install openjdk
```
https://community.chocolatey.org/packages/openjdk
