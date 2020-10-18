package edu.cnm.deepdive.classdesign;

public class Bear extends Animal implements Omnivore{

  @Override
  public int getWeight() {
   return 2000;
  }

  @Override
  protected void printName() {
    System.out.println("Bear");
  }

  @Override
  public void eatMeat() {
    System.out.println("Bear eats meat");

  }

  @Override
  public void eatPlants() {
    System.out.println("Bear eats plants");

  }
}
