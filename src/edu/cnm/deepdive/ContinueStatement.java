package edu.cnm.deepdive;

public class ContinueStatement {

  // Continue statement skip the indicated element in the array and moves on with others array's elements.
  // Does not exit from the loop until finishing iteration.

  public static void main(String[] args) {
    String [] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"}; //anonymous array

    for (String animal : animals) {
      System.out.println(animal);
    }

    MY_LOOP:
    for (String animal : animals) {
      if (animal.equals("Cat")) {     // checking if current iteration is equals to "Cat", if it is true then continue with iteration
        continue MY_LOOP;
      }

      System.out.println(animal);
    }

    //confusing example by using animal word as label
    animal:
    for (String animal : animals){
      if (animal.equals("Cat")) {
        continue animal;
      }
      System.out.println(animal);
    }

    // example with no-label; label is optional.
    for (String animal : animals) {
      if (animal.equals("Lizard") || animal.equals("Cat")) {
        continue;
      }
      System.out.println(animal);
    }

    int index = 0;
    while (index < animals.length) {
      String animal = animals[index];
      index++;

      if (animal.equals("Lizard")) {
        continue;
      }
      System.out.println(animal);
    //   index++;  // int his case if the increment index is here then it is an endless loop so need to move it up on line 44.
    }


  }


}
