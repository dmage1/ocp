package section9;

public class DowncastExamples {

  public static void main(String[] args) {
    DowncastExamples dex = new DowncastExamples();

    // We create instances of Dog and Cat but assign them to
    // variables of type Animal
    Creature genericDog = new Dog();
    Creature genericCat = new Cat();

    // We cast now:
    dex.testDog((Dog) genericDog);
    dex.testCat((Cat) genericCat);

    // Try the overloaded methods with
    // specifically typed variables.
    dex.testAnimal((Dog) genericDog);
    dex.testAnimal((Cat) genericCat);

    // Try the overloaded methods with
    // generically typed variables.
    dex.testAnimal(genericDog);
    dex.testAnimal(genericCat);
  }

  //Three Overloaded methods
  public void testAnimal(Creature animal) {
    System.out.println("Executing testAnimal with Animal type");
    animal.printAnimal();
  }

  public void testAnimal(Cat cat) {
    System.out.println("Executing testAnimal with Cat type");
    cat.printAnimal();
  }

  public void testAnimal(Dog dog) {
    System.out.println("Executing testAnimal with Dog type");
    dog.printAnimal();
  }

  // Specifically Typed method calls
  public void testDog(Dog dog) {
    dog.printDog();
  }

  public void testCat(Cat cat) {
    cat.printCat();
  }
}
