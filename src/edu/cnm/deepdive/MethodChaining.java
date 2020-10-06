package edu.cnm.deepdive;

public class MethodChaining {

  public static void main(String[] args) {
    String start = " Java  ";

    String trimmed = start.trim();
    System.out.println("trimmed= " + trimmed);

    String lowerCase = trimmed.toLowerCase();
    System.out.println("lowerCase " + lowerCase);

    String result = lowerCase.replace('j', 'J');
    System.out.println("result= " + result);

    String anotherResult = "  Java  ".trim().toLowerCase().replace('j', 'J');
    System.out.println("anotherResult= " + anotherResult);
    System.out.println(result.equals(anotherResult));

    String a = "abc";
    String b = a.toUpperCase(); //produce a new string does not change the variable a
    String c = b.replace('B', 'b').replace('C', 'c'); // produce a new string

    System.out.println("a= " + a);
    System.out.println("b= " + b);
    System.out.println("c= " + c);

    if (a.equalsIgnoreCase(b)) {
      System.out.println("String are equal");
    }

    if (a.toLowerCase().trim().equals(b.toLowerCase().trim())) {
      System.out.println("Equals");
    }
  }

}
