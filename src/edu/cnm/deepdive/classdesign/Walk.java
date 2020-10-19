package edu.cnm.deepdive.classdesign;

public interface Walk extends Run{

  default int getSpeed() {
    return 5;
  }

}
