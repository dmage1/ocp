package section2;/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 2: Create an executable Java program
*/

public class PrintArgs { // java -cp target/classes section2.PrintArgs arg1 arg2

  public static void main(String[] args) {

    System.out.println("Printing some arguments in this code: ");

    // Loop through arguments passed and print them to standard output
    for (int i = 0; i < args.length; i++) {
      System.out.println("Argument " + (i + 1) + ": " + args[i]);
    }
  }
}

// Note: Arguements must be seperat by spaces (only)

