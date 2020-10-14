package edu.cnm.deepdive;

public class DataEncapsulation {

  public static void main(String[] args) {
    Company company = new Company();
    company.name = "MyCompany";
    company.employees.add("John");
    company.employees.add("Anthony");

    company.printSorted();

    company.employees = null;
  }

}
