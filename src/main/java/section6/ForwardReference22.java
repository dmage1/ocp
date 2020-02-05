package section6;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 6: Describing and Using Objects and Classes
Topic: Declare and Instantiate Objects
Sub-Topic: Initializers, Forward References
*/

// For all the examples below, the initializers reference variables
// declared after the blocks.
class Thing22 {

  // static variable
  static String thirdString;

  // Static Initializer
  static {
//        System.out.println(thirdString);
    thirdString = "c";
  }

  // Two instance variables
  String firstString;
  String secondString;

  // Initializer
  {
    firstString = "a";
  }

  // Constructor
  Thing22() {
    secondString = "b";
  }

  public String toString() {
    return firstString + secondString + thirdString;
  }
}

public class ForwardReference22 {

  public static void main(String[] args) {
    Thing22 one = new Thing22();
    System.out.println(one);
  }
}