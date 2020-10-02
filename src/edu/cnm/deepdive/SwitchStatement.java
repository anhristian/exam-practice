package edu.cnm.deepdive;

import java.util.Random;

public class SwitchStatement {

  public static void main(String[] args) {

    Random random = new Random();
    int c= random.nextInt(26) + 'a'; // adding offset to produce lower case letters
    System.out.println((char) c + ", " + c + ": ");

    switch (c) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        System.out.println("vowel");
        break;
      case 'y':
      case 'x':
        System.out.println("Sometimes a vowel");
      default:
        System.out.println("consonant");
    }

  }
}
