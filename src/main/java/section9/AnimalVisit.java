package section9;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 9: Reusing Implementations Through Inheritance
Topic: Utilize polymorphism to cast and call methods
Sub-Topic: downcasting
*/

// Animal is our base class
class Creature {

  public void printAnimal() {
    System.out.println("I am an animal");
  }
}

// Dog is a subclass of Animal
class Dog extends Creature {

  public void printDog() {
    System.out.println("I am a dog");
  }
}

// Cat is also a subclass of Animal
class Cat extends Creature {

  public void printCat() {
    System.out.println("I am a cat");
  }
}

