public class Test {

  static int testVariable;

  public static void main(String[] args) {

    int[] aArray = new int[3];
    Integer[] bArray = new Integer[3];
    aArray[2] = 1;
    bArray[0] = 1;  // Line 1

    for (int a : aArray) {
      System.out.print(a + " ");
    }
    System.out.println("");
    for (int b : bArray) {  // Line 2
      System.out.print(b + " ");  // Line 3
    }
  }

  public static void main2(String[] args) {
    byte i, j;
    for (i = 100, j = 0; i <= 300; i += 90, j++) { // Line 1
      testVariable = i % 50;   //  Line 2
      System.out.print(testVariable + " "); // Line 3
    }
    System.out.println(j);
  }


}