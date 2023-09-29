#!/bin/bash

javac -cp src src/Main.java -d dist
java -cp dist Main
