package edu.cnm.deepdive.constructor;


class Dog2 {
  private String name;
  private String breed;
  private double weight;

  public Dog2(String name){
//    this.name = name;
//    breed = "husky";
//    weight = 30.0;

//    Dog2(name, "husky"); //does not compile
//    new Dog2(name, "husky"); //compiles but does not do what we need
    this(name, "husky"); //method that calls constructor 2; needs to be first line of code in the constructor
    System.out.println("constructor1");
  }

  public Dog2(String name, String breed) {
//    this.name = name;
//    this.breed = breed;
//    weight = 30.0;
    this(name, breed, 30.0); //calls on the constructor 3;
    System.out.println("constructor2");
  }

  public Dog2(String name, String breed, double weight) {
    this.name = name;
    this.breed = breed;
    this.weight = weight;
    System.out.println("constructor3");
  }

  public void print() {
    System.out.println(name + " " + breed + " " + weight);
  }
}

public class OverloadingConstructors {

  public static void main(String[] args) {

    Dog2 dog2 = new Dog2("Bart");
    dog2.print();

    Dog2 dog3 = new Dog2("Max", "shepard");
    dog3.print();

    Dog2 dog4 = new Dog2("Rex", "german shepard", 40);
    dog4.print();

  }

}
