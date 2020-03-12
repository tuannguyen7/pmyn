#!/bin/zsh
alias antlr4=java -jar /usr/local/lib/antlr-4.8-complete.jar
antlr4 src/main/java/home/pmyn/antlr/Pmyn.g4 -o src/main/java/home/pmyn/antlr/ -visitor
