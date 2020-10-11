package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;

public class StaticInitialization {

  private static final int SIZE;

  private static int one;
  private static final int two;
  private static final int three = 3;

  private static final List<String> NAMES = new ArrayList<>();
  // private static final int four;

  static {
    System.out.println("first static init");
    int rows = 5;
    int columns = 4;
    SIZE = rows * columns;
  }

  static {
    System.out.println("second static init");
    one = 1;
    two = 2;
    one = three; //can reassign because it is not declare as final field.
    // three = 3; //doe not compile because cannot reassign the three, it is declared final
    // two = 2; // cannot reassign because it is final field.
  }

  static {
    System.out.println("third static init");
    NAMES.add("Jimmy");    // cannot reassign, but can add or call on methods on final fields
    NAMES.add("Timmy");
  }

  public static void main(String[] args) {
    System.out.println(NAMES);

  }

}
