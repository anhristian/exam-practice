package edu.cnm.deepdive;

public class BreakStatement {
  // Break statement breaks the loop at the indicated element of the array, and moves on with the program execution.

  public static void main(String[] args) {
    //  myLabel:
    //  int[] myArray = {1, 2, 3}; // not a statement for label

    myLabel:
    {
      int[] myArray = {1, 2, 3}; //but not a good practice to use like this, it is confusing
    }

    String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

    for (String animal : animals) {
      System.out.println(animal); // it prints the entire array with animals
    }

    MY_LOOP:
    for (String animal : animals) {
      if (animal.equals("Cat")) {
        break MY_LOOP; // could be used just break.
      }

      System.out.println(animal);
    }

    // used animal as label to create confusion in the example.
    animal:
    for (String animal : animals) {
      if (animal.equals("Cat")) {
        break animal;
      }
    }

    for (String animal : animals) {
      if (animal.equals("Cat")) {
        break;
      }

      System.out.println(animal);
    }

    // using break in while loop.
    int index = 0;
    while (index < animals.length) {
      String animal = animals[index];

      if (animal.equals("Lizard")) {
        break;
      }

      System.out.println(animal);
      index++;
    }

  }

}
