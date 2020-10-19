package edu.cnm.deepdive.classdesign;

public interface Carnivore {

 default void eatMeat() {
   System.out.println("Eating meat");
 }

}
