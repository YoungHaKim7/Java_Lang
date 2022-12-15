#!/bin/bash

javac Test.java
CLASSPATH=".:junit.jar:"
java -cp $CLASSPATH org.junit.runner.JUnitCore Test
