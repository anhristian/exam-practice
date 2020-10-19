package edu.cnm.deepdive.classdesign;

public interface Herbivore {

  default void eatPlants() {
    System.out.println("Eating plants");
  }



}
