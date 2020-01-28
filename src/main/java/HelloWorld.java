import lombok.extern.java.Log;

@Log
public class HelloWorld { // java -cp target/classes HelloWorld

  public static void main(String[] args) {

    // Prints "Hello, World" in the terminal window.
    log.info("Hello, World");

    for (int i = 0; i < args.length; i++) {
      log.info(String.format("%narg %s = %s ", i, args[i]));
    }
  }
}
