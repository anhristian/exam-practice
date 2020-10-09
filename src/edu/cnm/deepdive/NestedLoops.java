package edu.cnm.deepdive;

import java.util.Arrays;

public class NestedLoops {

  public static void main(String[] args) {
    for (int hours = 1; hours <= 6; hours++){
      for (int minutes = 0; minutes < 60; minutes++) {
 //       System.out.println(hours + ":" + minutes);
      }
    }

    int[][] myArray = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    System.out.println(myArray);  //prints the address for the array
    System.out.println(Arrays.toString(myArray)); // creates and prints an address for each row of the array

    // need nested loops to print the content of the dimensional array
    OUTER:
    for (int[] rowArray : myArray) {
      INNER:
      for (int i = 0; i < rowArray.length; i++) {
        if (rowArray[i] % 2 == 0){
          //  break INNER;    // at first number that is divided by 2, it breaks the iteration and print new line
          // break OUTER;      // breaks the whole loop at first found number divided by 2.
          // continue INNER; // this skip the element that divides by 2 and go on to next numbers
          continue OUTER; // prints 1 7
        }
        System.out.print(rowArray[i] + " ");
      }
      System.out.println();
    }


  }

}
