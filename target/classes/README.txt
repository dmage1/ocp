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

jar -cf MainTests.jar -C target/classes MainTests.class
java -cp Maintests.jar MainTests

-- with manifest file

jar -cfm MainTests.jar manifest.txt -C target/classes MainTests.class
java -jar MainTests.jar
