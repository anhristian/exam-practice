package edu.cnm.deepdive;

public class TernaryOperator {

  public static void main(String[] args) {
    int x = 10;
    int y;

    if (x > 5)
      y = 2 * x;
    else y = 4 * x;

    System.out.println("y= " + y);
    //ternary operator
    y = (x > 5)  ? (2 * x) : (4 * x);

    System.out.println("y= " + y);

    int a = 1;
    int b = 1;
    int c = a < 10 ? a++ : b++;
    // c = a - 1;
    // a = 2;
    System.out.println(a + ", " + b + ", " + c);

  }

}
