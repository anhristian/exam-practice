package edu.cnm.deepdive.exception;

public class UsingFinally {

  public static void main(String[] args) {
    String[] array = new String[5];

    try {
      String element = firstToUppercase(array);
      System.out.println("element= " + element);
    } catch (NullPointerException npe) {
      System.out.println("Error message= " +npe.getMessage());
    } finally {
      System.out.println("finally block");
    }

  }

  public static String firstToUppercase(String[] array) {
    return array[0].toUpperCase();
  }

}
