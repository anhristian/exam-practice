package edu.cnm.deepdive.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CreatingDateAndTime {

  public static void main(String[] args) {

    System.out.println(LocalDate.now());
    System.out.println(LocalDateTime.now());
    System.out.println(LocalTime.now());

    LocalDate localDate = LocalDate.of(2020, Month.OCTOBER, 20);
    LocalTime localTime = LocalTime.of(10,30);
    System.out.println(localDate);
    System.out.println(localTime);
    System.out.println(LocalDateTime.of(localDate, localTime));
  }

}
