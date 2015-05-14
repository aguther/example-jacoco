@echo off

:: change to directory of this script
pushd %~dp0

:: environment
::call 00_Clean.cmd
::call 01_Environment.cmd

:: build all parts in the right order
call jacoco-library\10_Build.cmd
call jacoco-application\10_Build.cmd
call jacoco-test\10_Build.cmd
call jacoco-aggregation-application\10_Build.cmd
call jacoco-aggregation-library\10_Build.cmd

:: restore directory
popd
