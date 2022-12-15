#!/bin/bash

javac -cp src src/ArrayStructures.java -d dist
java -cp dist ArrayStructures
