package edu.cnm.deepdive.classdesign;

public class Main {

  public static void main(String[] args) {
    Husky husky = new Husky(3);
    husky.printDetails();

    Dog dog = new Dog(5);
    dog.setName("Dill");
    dog.printDetails();
  }

}