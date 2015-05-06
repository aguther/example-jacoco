@echo off

:: change to directory of this script
pushd %~dp0

:: environment
call 00_Clean.cmd
call 01_Environment.cmd

:: build all parts in the right order
call jacoco-custom-library\10_Build.cmd
call jacoco-junit-tests\10_Build.cmd
call jacoco-black-box-tests\10_Build.cmd
call jacoco-result-aggregation\10_Build.cmd
call jacoco-result-aggregation-library\10_Build.cmd

:: restore directory
popd