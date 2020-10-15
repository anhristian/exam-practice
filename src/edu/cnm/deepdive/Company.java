package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// POJO (Plain Old Java Object)
public class Company {

  private String name;
  private List<String> employees = new ArrayList<>();

  // public Company() {} //default constructor

  public void printSorted() {
    System.out.println("companyName= " + name);
    Collections.sort(employees);
    System.out.println("sorted= " + employees);
  }

  public void setName(String name) {
    if (name == null) {
      System.out.println("name cannot be null");
    } else {
      this.name = name;
    }
  }

  public String getName() {
    return name;
  }

  public void addEmployee(String name) {
    if (name == null) {
      System.out.println("cannot add null employee");
    } else {
      employees.add(name);
    }
  }

}
