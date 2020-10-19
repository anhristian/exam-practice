package edu.cnm.deepdive.classdesign;

public class Cat extends Animal implements Run {

  public Cat(int age) {
    super(age);
    System.out.println("Cat");
  }

  @Override
  public int getWeight() {
    return 5;
  }

  @Override
  protected void printName() {
  }

  @Override
  public int getSpeed() {
    return 15;
  }
}
