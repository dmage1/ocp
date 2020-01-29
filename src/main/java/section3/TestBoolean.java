package section3;

public class TestBoolean {

  public static void main(String[] args) {
    boolean input1 = true, input2 = false;
    System.out.println(input1 + " " + input2); // t f

    boolean result1 = input1 = !input1; // f f f
    System.out.println(input1 + " " + input2 + " " + result1);

    boolean result2 = input2 = input1;
    System.out.println(input1 + " " + input2 + " " + result2);

    boolean result3 = input1 == (result1 = !input2);
    System.out.println(input1 + " " + input2 + " " + result2 + " " + result3);
  }
}
