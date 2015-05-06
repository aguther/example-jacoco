@echo off

:: change to directory of this script
pushd %~dp0

:: clear results
call jacoco-aggregation-application\00_Clean.cmd
call jacoco-aggregation-library\00_Clean.cmd
call jacoco-application\00_Clean.cmd
call jacoco-library\00_Clean.cmd
call jacoco-test\00_Clean.cmd

:: restore directory
popd