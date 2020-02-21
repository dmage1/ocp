Test Resources for

OCP Oracle Certified Professional Java SE 11 Programmer I Study Guide: Exam 1Z0-815
OCP Oracle Certified Professional Java SE 11 Programmer II Study Guide: Exam 1Z0-816

1. Compile and Run HelloWorld from C:\workspace\ocps>

javac .\src\main\java\com\java\app\HelloWorld.java -d .\target\classes
java -cp .\target\classes HelloWorld

2. Added environment variables

M2_HOME=C:\Program Files\JetBrains\IntelliJ IDEA 2019.2.3\plugins\maven\lib\maven3
M2=C:\Program Files\JetBrains\IntelliJ IDEA 2019.2.3\plugins\maven\lib\maven3\bin MAVEN_OPTS=-Xms256m -Xmx512m
JAVA_HOME8=C:\Program Files\Amazon Corretto\jdk1.8.0_222
JAVA_HOME11=C:\Program Files\Java\jdk-e11.0.6

Amend Advanced system settings / Environment Variables / JAVA_HOME to switch between 8 and 11

4. Intellij Settings

    Settings / Build, Execution, Deployment / Compiler / Annotation Processors / Enable annotation processing
    Settings / Editor / General / Auto Import / Add unambiguous imports on the fly
    Settings / Editor / General / Auto Import / Optimize imports on the fly (for current project)

5. Create and execute jar files

jar -cf section2.MainTests.jar -C target/classes section2.MainTests.class
java -cp Maintests.jar section2.MainTests

-- with manifest file

jar -cfm section2.MainTests.jar manifest.txt -C target/classes section2.MainTests.class
java -jar section2.MainTests.jar

6. Why Java?

Java is derived from C, C+ but simplified.
Java is Architecture neutral.
Java is Object Orientated Language.
Java is Statically typed.
Java is a dynamic programming language.
Java supports Multi-threaded processing.
Distributed Computing is supported by Java.
Memory management is handled by the Java environment and not the developer.

7.

Primitive values cannot be set to null.

8. Java Modules

java --list-modules
java --describe-module java.sql
jdeps --print-module-deps -m java.sql
jdeps --print-module-deps -module java.sql
jdeps --list-reduced-deps --module java.sql
jdeps --list-deps --module java.sql

java --module-path . --module MyFirstModule