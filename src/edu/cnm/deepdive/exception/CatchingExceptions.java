package edu.cnm.deepdive.exception;

class MuseumClosed extends RuntimeException {

}

class MuseumClosedForLunch extends MuseumClosed {

}

public class CatchingExceptions {

  public static void main(String[] args) {
    try {
      visitMuseum();
    } catch (MuseumClosedForLunch mcl) { //superclass
      System.out.println("Closed for lunch, come back in 2 hours");
    } catch (MuseumClosed mc) { //subclass
      System.out.println("Closed");
    }
    System.out.println(calculate());
  }

  public static String calculate() {
    String result = "";
    String str = null;

    try {
      try {
        result += "start"; //result= start
        str.length();
        result += "end"; //not execute
      } catch (NullPointerException e) {
        result +="npe"; // result = startnpe
        throw new RuntimeException();
      } finally {
        result += "finally"; //result = startnpefinally
        throw new Exception();
      }
    } catch (Exception e) { //gets executed because finally block trows exception
      result += "finished"; // result = startnpefinallyfinished
    }
    return result;
  }

  public static void visitMuseum() {
    boolean b = Math.random() < 0.5;

    if (b) {
      throw new MuseumClosed();
    }
    throw new MuseumClosedForLunch();
  }
}
