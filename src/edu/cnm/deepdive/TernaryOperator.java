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

    int d = 1;
    int e = 2;
    int f = 3;

    if (d < 10) {
      f = d++ < 1 ? e++ : f++;
      // f = f;
      // d = 2; is incremented from 1 to 2
      // e = 2; stays at 2, because is not executed
      //f  = 3; f stays at 3 forever it is assigned.
    } else{
      f = (d + e) < 2 ? d++ : e++;
    }

    System.out.println(d + ", " + e + ", " + f);

  }

}
