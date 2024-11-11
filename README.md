# Chapter 5: Capturing Application State with Logging Frameworks 

This repository contains the code from the book for Chapter 5, Capturing Application State with Logging Frameworks. See the [main book page](https://github.com/realworldjava) for the list of all chapter specific repositories.

# How this repository is organized

In this repository, all code is in the main branch. There are seven folders: 
| Folder Name  | Contents |
| ------------- | ------------- |
|  println | Logging without a framework |
|  java-util-logging | Java Util Logging examples |
|  log4J | Log4j examples |
|  logback | Logback examples |
|  slf4j-no-library-connfigured | SLF4J example without a library. | 
|  slf4j-with-simple | SLF4J example with slf4j-simple configured|
|  slf4j-conversion| SLF4J example with log4j configured|

Note that many configuration files are supplied. If you want to run with the defaults, please delete these files from src/main/resources of that example.

# How to run the examples in this chapter
If you want to use an IDE, import the directory you want as a Maven project so you have the proper logging dependencies.

If you want to use the command line, cd to the directory for that example and run 
```
mvn verify
```

## Java Util Logging

To run using the system property from the command line example, run the following from the Ch05-Logging/java-util-logging directory:

```
java -Djava.util.logging.config.file=src/main/resources/logging-warning.properties src/main/java/com/wiley/realworldjava/logging/jul/BasicConfigCommandLine.java
```

The other examples include the System property in Java code to make it easier to run the examples

# If IntelliJ complains about a target/production directory

Open your .idea/*.iml file and change the inherit-compiler-output value to false

# Clickable Links from the Further References Section

Java Util Logging
* [Documentation for Java Util Logging](https://docs.oracle.com/en/java/javase/21/core/java-logging-overview.html)
* [For customizing log configuration in Java Util Logging](https://docs.oracle.com/en/java/javase/21/docs/api/java.logging/java/util/logging/LogManager.html)
* [For configuring file logging](https://docs.oracle.com/en/java/javase/21/docs/api/java.logging/java/util/logging/FileHandler.html)
* [For customizing log message format](https://docs.oracle.com/en/java/javase/21/docs/api/java.logging/java/util/logging/SimpleFormatter.html)
* [Formatter syntax](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Formatter.html)

Log4j
* [Documentation for Log4j](https://logging.apache.org/log4j/2.x/javadoc/log4j-api/index.html)
* [Full documentation of appenders](https://logging.apache.org/log4j/2.x/manual/appenders.html)
* [Full documentation for layouts](https://logging.apache.org/log4j/2.x/manual/layouts.html)

SLF4J
* [Documentation for SLF4J](https://www.SLF4J.org/manual.html)
* [System properties if want to configure slf4j-simple](https://www.SLF4J.org/api/org/slf4j/simple/SimpleLogger.html)

Logback
* [Documentation for Logback](https://logback.qos.ch/manual)
* [Full documentation for appenders](https://logback.qos.ch/manual/appenders.html)
* [Full documentation for layouts](https://logback.qos.ch/manual/layouts.html)
