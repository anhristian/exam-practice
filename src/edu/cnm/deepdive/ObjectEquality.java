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

    Integer int1 = new Integer(1);
    Integer int2 = new Integer(1);
    Integer int3 = 1;

    System.out.println("int1==int2: " +(int1 == int2)); // false
    System.out.println("int1==int3: " +(int1 == int3)); // false
    System.out.println("int2==int3: " +(int2 == int3)); // false //checking the memory address

    System.out.println("int1.equals(int2): " + int1.equals(int2)); // true
    System.out.println("int1.equals(int3): " + int1.equals(int3)); // true
    System.out.println("int2.equals(int3): " + int2.equals(int3)); // true   //check internal data, are the numbers inside same?yes, they are

    System.out.println("int1 hash= " + System.identityHashCode(int1));
    System.out.println("int2 hash= " + System.identityHashCode(int2));
    System.out.println("int3 hash= " + System.identityHashCode(int3));  // all 3 will have different hash codes so when calling the == we compare that hash that is different for all// of them

  }

}
