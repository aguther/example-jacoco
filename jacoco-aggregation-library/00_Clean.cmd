@echo off

:: change to directory of this script
pushd %~dp0

:: clear results
rd /s /q .sonar 1>nul 2>nul
rd /s /q target 1>nul 2>nul

:: restore directory
popd