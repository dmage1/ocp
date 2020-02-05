package section6;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 6: Describing and Using Objects and Classes
Topic: Declare and Instantiate Objects
Sub-Topic: Initializers, Forward References
*/

// For all the examples below, the initializers reference variables
// declared after the blocks.
class Thing {

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
    firstString = this.secondString;
  }

  // Constructor
  Thing() {
    secondString = "b" + secondString;
  }

  public String toString() {
    return firstString + secondString + thirdString;
  }
}

public class ForwardReference {

  public static void main(String[] args) {
    Thing one = new Thing();
    System.out.println(one);
  }
}