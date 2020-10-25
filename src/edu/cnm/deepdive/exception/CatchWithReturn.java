package edu.cnm.deepdive.exception;

public class CatchWithReturn {

  public static void main(String[] args) {
    System.out.println(calculate());
  }

  public static int calculate() {
    try {
      return 10/0;
    } catch (ArithmeticException e) {
      System.out.println("error");
      return 1;
    } finally {
      System.out.println("finally");
      return 0;
    }
  }

}
