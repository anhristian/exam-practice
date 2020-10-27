package edu.cnm.deepdive.lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Animal {

  private String type;
  private boolean canJump;
  private boolean canSwim;

  public Animal(String type, boolean canJump, boolean canSwim) {
    this.type = type;
    this.canJump = canJump;
    this.canSwim = canSwim;
  }

  public boolean canJump() {
    return canJump;
  }

  public boolean isCanSwim() {
    return canSwim;
  }

  public String getType() {
    return type;
  }
}
    interface CheckAnimal {     //functional interface(one method)
      boolean check (Animal animal);
    }
    class CheckCanJump implements CheckAnimal {

      @Override
      public boolean check(Animal animal) {
        return animal.canJump();
      }
    }

public class LambdaExpressions {

  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();
    animals.add(new Animal("fish", false, true ));
    animals.add(new Animal("rabbit", true, false));
    animals.add(new Animal("dog", true, true));

   // print(animals, new CheckCanJump());

    print(animals, animal -> animal.canJump());
    print(animals, animal -> !animal.canJump());

    print(animals, (Animal animal) -> {
      return animal.canJump();
    });

    print(animals, (Animal animal) -> {
  //    Animal animal = new Animal("cat", true, false) //doesn't compile because the name is same (animal)
      System.out.println("checking animal= " + animal);
      return animal.canJump();
    });

    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Anthony");
    names.add("Jimmy");
    names.add("Timmy");

    System.out.println("names = " + names);

    names.removeIf(name -> name.charAt(0) == 'J');
    System.out.println("after filter names=" +names);

  }

  private static void print(List<Animal> animals, Predicate<Animal> filter) {
    for (Animal animal : animals) {
      if (filter.test(animal)) {
        System.out.println(animal.getType());
      }
    }
    System.out.println();
  }
}
