package com.java.app;

public class HelloWorld {

  public static void main(String[] args) {

    // Prints "Hello, World" in the terminal window.
    System.out.println("\nHello, World");

    for (int i = 0; i < args.length; i++) {
      System.out.printf("%narg %s = %s ", i, args[i]);
    }
  }
}
