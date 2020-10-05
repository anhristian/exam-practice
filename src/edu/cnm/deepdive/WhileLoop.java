package edu.cnm.deepdive;

public class WhileLoop {

  public static void main(String[] args) {
    int spaceOnHdd = 5;

    while (spaceOnHdd > 0) {
      spaceOnHdd--;
      System.out.println("spaceOnHdd " + spaceOnHdd); //so number will decrement until 0
    }

    int x = 2;
    int y = 5;

    while (x < 10){
      y++;
      x++; //if we have just y++ that is infinite loop.

      // 1. iteration: y=6, x=3;
      // 2. iteration: y=7, x=4;
      // 1. iteration: y=8, x=5;
      // 1. iteration: y=9, x=6;
      // 1. iteration: y=10, x=7;
      // 1. iteration: y=11, x=8;
      // 1. iteration: y=12, x=9;
      // 1. iteration: y=13, x=10; //it stops at x=10, because condition is x<10
    }
    System.out.println("x= " + x + " y= " + y);

    int a = 5;
    int b = 7;

    //this while is here just to confuse us, because a is < 6 whileLoop will not execute
    while (a > 6) {
      b += 2;
      a++;
    }

    a = a > 6 ? a++ : b--;
    //false
    // a = b -> a = 7;
    // b-- -> b = 6
    // a+b = 7 + 6 = 13

    System.out.println(a + ", "+ b + ", " + (a + b));
  }

}
