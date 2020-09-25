package edu.cnm.deepdive;

public class ObjectEquality {

  public static void main(String[] args) {
    //comparing objects
    Integer firstInteger = 127;
    Integer secondInteger = 127;

    System.out.println(firstInteger == secondInteger); // true

    System.out.println("128 == 128: " + (128 == 128)); //true

    firstInteger = 128;
    secondInteger = 128;

    System.out.println("firstInteger= " + firstInteger);
    System.out.println("secondInteger= " + secondInteger);
    System.out.println(firstInteger == secondInteger); //false
  }

}
