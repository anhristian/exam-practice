package edu.cnm.deepdive;

public class UnaryOperators {

  public static void main(String[] args) {


    int e = 3;
    int f = ++e * 5 / e-- + --e;

    // e=3;
    // 4 * 5 / e-- + --e; -> e=3 -> ++3 -> e=4
    // 4 * 5 / 4 + --e; -> e-- -> 4-- ->3
    // 4 * 5 / 4 + 2; --3 -> e=2
    // 20/4+2
    //5+2
    //7
    System.out.println("e = " + e + " f = " + f);
  }


}
