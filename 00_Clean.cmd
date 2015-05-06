@echo off

:: change to directory of this script
pushd %~dp0

:: clear results
call jacoco-custom-library\00_Clean.cmd
call jacoco-junit-tests\00_Clean.cmd
call jacoco-black-box-tests\00_Clean.cmd
call jacoco-result-aggregation\00_Clean.cmd
call jacoco-result-aggregation-library\00_Clean.cmd

:: restore directory
popd