package edu.cnm.deepdive;

public class TernaryOperatorQuesEx {

  public static void main(String[] args) {

    int x = 5;
    System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7); //output is 8
  }
  // explicit written form for ternary is:
  // ((x > 2) ? ((x < 4) ? 10 : 8) : 7) // x < 4 -> false -> 8
  //((x>2) ? 8 : 7)//x > 2 -> true -> 8 ->printed output
}
