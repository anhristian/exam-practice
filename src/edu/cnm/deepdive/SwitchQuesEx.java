package edu.cnm.deepdive;

public class SwitchQuesEx {

  public static void main(String[] args) {

    final char a = 'A', d = 'D';
    char grade = 'B';

    switch (grade) {
      case a:
      case 'B':
        System.out.print("great");
      case 'C':
        System.out.print("good"); break; // output is greatgood
      case d:
      case 'F':
        System.out.println("not good");
    }
  }
}
