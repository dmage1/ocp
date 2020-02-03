package section3;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Create and Manipulate Strings
Sub-Topic: Concatenation Operator
*/

public class StringConcat {

  public static void main(String[] args) {
    String helloString = "hello";
    String worldString = "world";

    // firstString will be “hello world”, concats 3 literals..
    String firstString = helloString + " " + worldString;
    System.out.println("firstString = " + firstString); // firstString = hello world

    Object nullObject = null;
    // secondString will be “null hello"
    String secondString = nullObject + " " + helloString;
    System.out.println("secondString = " + secondString); // secondString = null hello

    int i = 10;
    // thirdString will be “10 hello"
    String thirdString = i + " " + helloString;
    System.out.println("thirdString = " + thirdString); // thirdString = 10 hello

    // concatenating to an object (not null)
    Object ourObject = new OurSimpleClass();

    // fourthString will be "hello Our Simple Class"
    String fourthString = helloString + " " + ourObject;
    System.out.println("fourthString = " + fourthString); // fourthString = hello Our Simple Class

    int j = 10;
    String resultString = i + j + " = " + i + j;
    System.out.println("resultString is: " + resultString); // resultString is: 20 = 1010

    String resultStringCorrectedForIntegerMath = i + j + " = " + (i + j);
    String resultStringCorrectedForStringConcat = "" + i + j + " = " + i + j;
    System.out.println("resultStringCorrectedForIntegerMath is: " +
        resultStringCorrectedForIntegerMath); // resultStringCorrectedForIntegerMath is: 20 = 20
    System.out.println("resultStringCorrectedForStringConcat is: " +
        resultStringCorrectedForStringConcat); // resultStringCorrectedForStringConcat is: 1010 = 1010
  }
}

class OurSimpleClass {

  public String toString() {
    return "Our Simple Class";
  }
}
