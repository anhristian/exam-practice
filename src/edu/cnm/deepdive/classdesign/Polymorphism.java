package edu.cnm.deepdive.classdesign;

public class Polymorphism {

  public static void main(String[] args) {
    Husky husky = new Husky(5);
    husky.setName("Bon");

    Dog dog = husky; // this is another reference to Husky object in memory
    dog.printDetails();

    CanRun canRun = husky;
    canRun.run(5);

    Animal animal = husky;
        animal.printDetails();

        Object object = husky;

        Animal cat = new Cat(2);
        Cat myCat = (Cat)cat;
       myCat.getSpeed();
  }

  // If we have a class that has just 2 references , to itself and to the Object class it is not polymorphic
  // If we have a class that has 3 or more references, than it is polymorphic, ex: Dog, Cat, Bear, Rabbit they are polymorphic
  //because they refer to Object, to itself, and to the Animal class.
}
