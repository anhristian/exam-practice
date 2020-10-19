package edu.cnm.deepdive.classdesign;

public class Main {

  public static void main(String[] args) {
    Husky husky = new Husky(3);
    husky.printDetails();

    Dog dog = new Dog(5);
    dog.setName("Dill");
    dog.printDetails();

    husky.eat();
    System.out.println("avg= " + husky.getAverageWeight());

    Bear bear = new Bear();
    bear.setName("Misha");
    bear.setAge(10);
    bear.eatMeat();
    bear.eatPlants();
    bear.printDetails();

    Rabbit rabbit = new Rabbit();
    rabbit.eatPlants();
    rabbit.printDetails();

    Cat cat = new Cat(3);
    int speed = cat.getSpeed();
    System.out.println("Cat speed is= " + speed);

  }

}
