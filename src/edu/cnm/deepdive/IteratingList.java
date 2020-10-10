package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(2);
    numbers.add(4);
    numbers.add(6);

    for (int i = 0; i < numbers.size(); i++) {
      System.out.println("element at index " + i + " is " + numbers.get(i));
      // numbers.remove(2); //index 2 is out of bounds, we cannot modify the list
    }

    for (Integer number : numbers) {
      System.out.println("numbers= " +number);
    //  numbers.remove(2); // cannot remove an element, will get exception concurrent.
    }

    for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
      Integer number = iterator.next();
      System.out.println(number);
      iterator.remove(); //remove the current item
    }
    System.out.println(numbers);

    numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

    for (ListIterator<Integer> listIterator = numbers.listIterator(3); listIterator.hasPrevious(); ) {
      System.out.println(listIterator.previous());
      listIterator.remove();

    }
    System.out.println(numbers);
  }

}
