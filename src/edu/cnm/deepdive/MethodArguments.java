package edu.cnm.deepdive;

import edu.cnm.deepdive.common.Common;

public class MethodArguments {

  int getZero() {  // 0 arguments
    return 0;
  }

  int increment (int number) { // 1 argument (nomadic)
    return number +1;
  }

  int sum(int a, int b) { //2 arguments (dyadic)
    return a + b;
  }

  int plusMinus(int a, int b, int c) { //3 arguments (triadic)
    return a + b - c;
  }

  double average( double a, double b, double c, double d) { // 4 arguments (polyadic) , good to avoid 4+ arguments
    return (a + b + c + d) / 4.0;
  }

 // void  test(int a; int b) {} // does not compile because of the semicolon

  public  void jump1(int... numbers) {}

  public void  jump2(int start, int... numbers){}

  // public void jump3(int... numbers, int start){} //does not compile because vararg have to be last argument

  public void jump4(int[] start, int[] numbers){}



  // from the Common package we can access just publicPrint()

  public static void main(String[] args) {

    Common common = new Common();
    common.publicPrint();

    System.out.println("publicNumber= " + common.publicNumber);
    
   /* System.out.println("protectedNumber " + common.protectedNumber);
    System.out.println("defaultNumber= " + common.defaultNumber);
    System.out.println("privateNumber= " + common.privateNumber);
*/   // does not compile because they are in a different package.
  }
}

