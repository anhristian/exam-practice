package edu.cnm.deepdive.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class UsingPeriod {

  public static void main(String[] args) {
    LocalDate start = LocalDate.of(2019, Month.JANUARY, 1);
    LocalDate end = LocalDate.of(2019, Month.AUGUST, 30);
    Period period = Period.ofWeeks(1);

    // start.toEpochDay(); //numbers of days since January 1, 1970

    cleanCage(start, end);

    System.out.println(start.plus(period));
    System.out.println(LocalDateTime.now().plus(period));
  //   System.out.println(LocalTime.now().plus(period)); // exception: unsupported unit day
  }

  public static void cleanCage(LocalDate start, LocalDate end) {
    while (start.isBefore(end)){
      System.out.println("Need to clean the cage on date= " + start);
      start = start.plusMonths(1); // adding 1 month
    }
  }

}
