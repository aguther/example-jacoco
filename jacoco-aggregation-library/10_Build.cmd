@echo off

:: change to directory of this script
pushd %~dp0

:: set environment
::call 00_Clean.cmd
::call ..\01_Environment.cmd

:: start build
call mvn clean generate-sources

:: run sonar analysis
call mvn sonar:sonar

:: restore directory
popd
