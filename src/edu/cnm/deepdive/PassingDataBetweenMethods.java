package edu.cnm.deepdive;

public class PassingDataBetweenMethods {

  public static void main(String[] args) {
    int number = 4;
    System.out.println("number= " + number);
    newNumber(number);
    System.out.println("number= " +number);

    String name = "Andy";
    System.out.println("name= " + name);
    newName(name);
    System.out.println("name= " + name);

    StringBuilder sb = new StringBuilder();

//    StringBuilder s = sb;
//   s.append("Anthony");

    build(sb);
//  System.out.println("s= " + s);
    System.out.println("stringBuilder= " + sb);

  }

  public static void newNumber(int number) {
    System.out.println("in newNumber number=" + number);
    number = 10;
    System.out.println("in newNumber number= " + number);
  }

  public static void newName(String name) {
    System.out.println("in newName name= " + name );
    name = "Tony";

    System.out.println("in newName name= " + name);
  }

  public static void build(StringBuilder s) {
   //  s = new StringBuilder(); //here it is reassign to a new value so it is different than sb now
    s.append("Tom"); // the string "s" is a copy of "sb" so they point to the same reference
                      // (have same value and sb take the value Tom)

  }

}
