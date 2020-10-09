package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;


public class ArrayListEx {

  public static void main(String[] args) {
    ArrayList myList = new ArrayList();
    ArrayList<Object> myList2 = new ArrayList<Object>(); //can hold any type of Object

    ArrayList<String> list0 = new ArrayList<>(); // holds just Strings
    ArrayList<String> list1 = new ArrayList<>();

    List<String> list2 = new ArrayList<>(); // using interface as type

    List<String> list3 = new ArrayList<>(20);


    // List list = new ArrayList(); // these two 21 and 22 are the same declarations
    List<Object> list = new ArrayList<>();
    list.add("dog");
    list.add(5);

    System.out.println(list);

    List<String> pets = new ArrayList<>();
    pets.add("cat");
    System.out.println(pets);

    pets.add(0, "dog"); // first put the index of the element
    System.out.println(pets);

    pets.add(1, "parrot");
    System.out.println(pets);

    pets.add(0, "frog");
    System.out.println(pets);

    pets.add(1, "bird");
    System.out.println(pets);
  }

}
