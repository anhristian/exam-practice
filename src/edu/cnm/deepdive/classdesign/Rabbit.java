package edu.cnm.deepdive.classdesign;

public class Rabbit extends Animal {

  public Rabbit () {
  //  super;  // does not compile
  //  super().setAge(3); // does not compile

    super();
   // super.setAge(3);  //all of this are the same code(lines 10-12)
   // this.setAge(3);
    setAge(3);
  }
  public Rabbit(int age) {
   // this(age); // recursive call, calls on itself

    // super();
    // this();
    // setAge(3);
    super(3); //instead of all those methos we could call just super(),
                    // because parent class Animal has de method age()
  }

}
