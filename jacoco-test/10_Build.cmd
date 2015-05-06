@echo off

:: change to directory of this script
pushd %~dp0

:: environment
call 00_Clean.cmd
call ..\01_Environment.cmd

:: download artifact
call mvn org.apache.maven.plugins:maven-dependency-plugin:2.8:copy -Dartifact=com.company:jacoco-example:1.0-SNAPSHOT -DoutputDirectory=target -Dmdep.useBaseVersion=true
call mvn org.apache.maven.plugins:maven-dependency-plugin:2.8:copy -Dartifact=com.company:jacoco-example-library:1.0-SNAPSHOT -DoutputDirectory=target -Dmdep.useBaseVersion=true

:: clear analysis results
del /q "./target/jacoco-it.exec" 1>nul 2>nul

:: run black-box tests (by starting the application with different parameters)
java -cp ./target/* -javaagent:../tools/jacoco/lib/jacocoagent.jar=destfile=./target/jacoco-it.exec com.company.Main
java -cp ./target/* -javaagent:../tools/jacoco/lib/jacocoagent.jar=destfile=./target/jacoco-it.exec com.company.Main One
java -cp ./target/* -javaagent:../tools/jacoco/lib/jacocoagent.jar=destfile=./target/jacoco-it.exec com.company.Main One Two
java -cp ./target/* -javaagent:../tools/jacoco/lib/jacocoagent.jar=destfile=./target/jacoco-it.exec com.company.Main One Two Three

:: upload result
call mvn install:install-file -DgroupId=com.company -DartifactId=jacoco-example -Dversion=1.0-SNAPSHOT -Dpackaging=exec -Dclassifier=jacoco-it -Dfile=target/jacoco-it.exec

:: restore directory
popd