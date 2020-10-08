package edu.cnm.deepdive;

public class BreakStatement {

  public static void main(String[] args) {
  //  myLabel:
  //  int[] myArray = {1, 2, 3}; // not a statement for label

    myLabel:
    {
        int[] myArray = {1, 2, 3}; //but not a good practice to use like this, it is confusing
    }

    String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};
    
  }

}
