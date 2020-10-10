package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingList {

  public static void main(String[] args) {
    List<String> numsList = new ArrayList<>();
    numsList.add("500");
    numsList.add("10");
    numsList.add("9");
    numsList.add("50");
    numsList.add("40");

    System.out.println(numsList);
    Collections.sort(numsList);  // sorted alphabetically: [10, 40, 50, 500, 9]
    System.out.println(numsList);

    List<Integer> numbers = Arrays.asList(5, 4, 8, 10, 11, 7, 3);
    System.out.println(numbers);

    Collections.sort(numbers); // arranged from small to big
    System.out.println(numbers);



    // to search in a list, the array needs to be sorted

    int index = Collections.binarySearch(numsList, "10");
    System.out.println(index); // we got index 0, because the list was sorted

    index = Collections.binarySearch(numbers, 5);
    System.out.println(index); // we got index 2 because it is sorted .
  }
}
