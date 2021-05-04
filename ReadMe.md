## What is this about ?

This is a very basic coding test.

You have :

 - an implementation class where you must fill the blanks
 - a JUnit Test class that tells you what is the expected behavior

The goal is of course to make all unit tests pass !

## How code and run the tests

The project is composed of 2 simple classes (1 for implementation and 1 for test) and the only dependency is JUnit : so it should be very simple to make it run.

### Using Maven

If you have maven installed you can simply type 

    mvn install

This will run the build and the tests.

You can edit the implementation with whatever tool you want.

### Using Eclipse and Maven

If you have maven installed, but prefer to use Eclipse IDE :

generate the Eclipse project :

    mvn eclipse:eclipse

Import the maven project inside Eclipse

    Import > Existing Project into Workspace > select the directory of the project 

### Using Eclipse without Maven

If for some reasons, you dont want to use Maven :

 - create a Java project
 - add JUnit inside your class path
 - import the 2 source files (implementation + tests)

### Using any other IDE

If you use another IDE (IntelliJ, NetBeans ... ), just import the 2 class files and add JUnit in your class path.

## Rules and expected result 

The goal is to have all unit tests passing.

 - Time: this is not a race, but it is clear that implementation should not take more than 1 hour 
 - Implementation: of course, having a rather clean implementation does matter (less than 70 lines are actually needed)
 - Dependencies: you should not need to add any specific dependencies

