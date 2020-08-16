# Pitest

Sample Maven project with unit testing with JUnit, coverage with Jacoco and mutation test with Pitest.

Usage:

`mvn clean install -Pcoverage`: runs unit test and generates coverage report.

`mvn clean install -Pcoverage sonar:sonar`: runs unit test, generates report and sends information to Sonarqube.

`mvn org.pitest:pitest-maven:mutationCoverage`: runs mutation test.