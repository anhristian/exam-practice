package edu.cnm.deepdive.constructor;

class Dog {

  private String color;

  public Dog(String color) {   // this is a constructor
    System.out.println("constructor");
//    color = color; // here color refer to the parameter
    this.color = color; // using this.color, it refers to the class field
  }

  public void printColor() {
    System.out.println("color= " + color);
  }

  // public dog() {} // does not compile
  // public void Dog(){} //this is not a constructor because it has return type void
}

class Cat {

  private String color;
  private int height;
  private int length;

  public Cat(int length, int theHeight) {
// length = this.length;
    this.length = length;
    height = theHeight;
    color = "white";
  }

  public void printInfo() {
    System.out.println("Cat length= " + length + " height= " + height + " color= " + color);
  }
}

public class ClassConstructors {

  public static void main(String[] args) {
    Dog dog = new Dog("black");  //calling the constructor here
    dog.printColor();

    Cat cat = new Cat(10, 15);
    cat.printInfo();
  }
}
