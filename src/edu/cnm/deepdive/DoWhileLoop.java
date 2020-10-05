package edu.cnm.deepdive;

public class DoWhileLoop {

  public static void main(String[] args) {

    int a = 0;
    do {
      a++;
    } while (false);

    System.out.println("a= " +a);

    // doesn't compile because the statement isn't reached.
//   while (false) {
//      a++;
//    }

    int x = 20;

    while (x > 10) x--;
    System.out.println("x= " + x);

    int x2 = 20;

    do x2--;
    while (x2 > 10);

    System.out.println("x2= " + x2);

    int y = 10;
    int z = 5;

    while (y < 20)
      y++;       // so because no braces just y++ is the body of while and executes just it.

    // y = 20
    z +=2;
    y+=10;
    // y = 30

    System.out.println("x= " + x + " y= " + y + " z= " + z); // x = 10 (previous loop), y = 30, z = 7

    //nested while loops
    int number = 10;

    while (number >10) {
      number--;    //because condition is false, it is never executed.
    }

    do {
      number--;
      //now number = 9
      while (number > 5) {
        number -=2;
        //number = 7
        // again check the loop and print number = 5
      }
    } while (number > 10); //never executes because of false condition (if  number <10 then is is infinite loop)

    System.out.println("number= "+number);
  }

}
