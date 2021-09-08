#!/bin/bash
java -jar /usr/local/lib/antlr-4.9.2-complete.jar src/main/java/home/pmyn/antlr/Pmyn.g4 -visitor
./gradlew shadowJar
