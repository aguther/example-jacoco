# jacoco-example

This example demonstrates how integration/black-box test results can be aggregated with unit test results.

For this purpose an application that uses a custom library is used. During the build process of the application and library unit tests are being executed. Additionally the application is being started as a normal application with different paramters to perform black-box/integration tests.

The results are then aggregated into additional projects to show an overall coverage for the application and the library.

## Content

| Directory 						| Comment                               |
| --------------------------------- | ------------------------------------- |
| jacoco-aggregation-application 	| Aggregation of application results    |
| jacoco-aggregation-library 		| Aggregation of library results        |
| jacoco-application 				| Application                           |
| jacoco-library 					| Library used by the Application       |
| jacoco-test 						| Black-Box Tests using the Application |

## Usage

1. Download SonarQube from 'http://www.sonarqube.org/downloads/' and extract it into a directory of your choice
2. Start SonarQube (i.e. on Windows 64-bit '<ROOT>\bin\windows-x86-64\StartSonar.bat')
3. Check if SonarQube is working (with your favorite browser open 'http://localhost:9000')
4. Adapt ```JAVA_HOME``` and ```MAVEN_HOME``` variables in ```01_Environment.cmd``` to your working environment
5. Start ```10_Build.cmd```