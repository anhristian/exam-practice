package edu.cnm.deepdive;

public class UnaryOperators {

  public static void main(String[] args) {

  // first example of decrement and increment operators; tricky

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

    // second example of decrement and increment operators.
    int g = 6;
    int h = 2;
    int i = ++h + --g * 3 + 2 * g++ - h-- % --g;

    // h = 3, g = 6
    // 3 + --g * 3 + 2 * g++ - h-- % --g;
    // h = 3 g = 5
    // 3 + 5 * 3 + 2 * 5 - h-- % --g;
    // h=2 g=6
    // 3 + 5 * 3 + 2 * 5 - 3 % 5;
    //g=6
    // 3 + 15 + 10 - 3
    // 25

    System.out.println("g = " + g +  " h = " + h + " i = " + i);


  }


}
