#!/bin/bash

javac -cp src src/Main.java -d out
java -cp out Main
