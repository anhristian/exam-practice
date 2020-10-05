package edu.cnm.deepdive;

public class QuestionExample1 {

  public static void main(String[] args) {

    int m = 9, n = 1, x = 0;

    while (m > n) {  //1. iteration (m>n) -> (9>1) -> true
      m--; //m = 8
      n += 2; // n = 3
      x += m + n; // x=x+m+n=0+8+3=11
      //will be 3 iterations totally until m>n; m = 7, m=6
    }
    System.out.println(x);
  }

}
