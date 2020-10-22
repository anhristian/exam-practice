package edu.cnm.deepdive.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class UsingDateAndTime {

  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2030, Month.JANUARY, 10);
    System.out.println(date);
    date = date.plusDays(5).plusMonths(2);
    System.out.println(date);

    LocalTime time = LocalTime.of(10, 30);
    System.out.println(time);
    time = time.plusHours(2).plusMinutes(45);
    System.out.println(time);

    LocalDateTime localDateTime = LocalDateTime.of(date, time);
    System.out.println(localDateTime);
    localDateTime = localDateTime.minusHours(10).minusDays(3).plusWeeks(2);
    System.out.println(localDateTime);

  }
}
