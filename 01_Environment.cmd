@echo off

:: change to directory of this script
pushd %~dp0

:: set environment
set JAVA_HOME=c:\Program Files\Java\jdk1.8.0_40
set MAVEN_HOME=c:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 14.1.1\plugins\maven\lib\maven3\bin
set PATH=%PATH%;%MAVEN_HOME%;

:: restore directory
popd