package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;

public class WrapperInList {

  public static void main(String[] args) {
    // List<double> doubleList = new ArrayList<>(); //will not compile, because cannot use primitive type with List
    List<Double> doubleList = new ArrayList<>(); // use the wrapper class of primitive double

    doubleList.add(10.5); //autoboxing
    doubleList.add(new Double(55.10));
    doubleList.remove(55.10);
    double first = doubleList.get(0); // unboxing to primitive

    System.out.println(doubleList);
    System.out.println(first);

    List<Integer> numbers = new ArrayList<>();
    numbers.add(null);  // because is wrapper class it can hold null value

    System.out.println(numbers);

  //  int number = numbers.get(0); // shows NullPointerException because primitive int cannot hold null value

    List<Integer> nums = new ArrayList<>();
    nums.add(1); // value 1 at index 0
    nums.add(2); // value 2 at index 1

    nums.remove(1); // removes the value at index 1

    System.out.println(nums); // prints the number 1, because the number 2 was removed above

    nums.remove(new Integer(1)); //removes the actual number 1

    System.out.println(nums);
  }

}
