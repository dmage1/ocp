package section8;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 8: Applying Encapsulation
Topic: Applying Encapsulation Principles to a class
*/

import section3.Person;

public class PersonTester {

  public static void main(String[] args) {

    // Create some local variables
    StringBuilder address =
        new StringBuilder("2234 Maple Ave, Ralphtown, PA, 19000");
    String age = "45";
    String name = "Ralph";

    // Create instance of person with local variable references
    Person p = new Person(name, address.toString(), age);

    // Change the local variable's data
    address.append("-0005");
    name = "Ralph's Wife";
    age = "40";

    // Create another instance of person with local variable references
    Person p2 = new Person(name, address.toString(), age);
    System.out.println(p);
    System.out.println(p2);
  }
}