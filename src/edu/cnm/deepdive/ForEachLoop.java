package edu.cnm.deepdive;

public class ForEachLoop {

  public static void main(String[] args) {
    String[] names = {"Jimmy", "John", "Tom", "Antony"};

    for(int i = 0; i < names.length; i++) {
      System.out.println("name= " + names[i]);
    }

    for (String name : names) {
      System.out.println("name= " + name);
    }

    StringBuilder[] builders = {
        new StringBuilder("For"),
        new StringBuilder("Loop")
    };

    for (StringBuilder builder : builders) {
      builder.append("123");
    }

    for (StringBuilder builder : builders) {
      System.out.println(builder);

      String pets = "Parrot";

     // for (String pet : pets){}  // does not compile because it is not declared as an array

      for (char c : pets.toCharArray()){
        System.out.println(c); // this is the method to print each char from the String "Parrot"/ converted String cu CharArray
      }
    }
  }

}
