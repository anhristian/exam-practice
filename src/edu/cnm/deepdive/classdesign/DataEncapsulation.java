package edu.cnm.deepdive.classdesign;

public class DataEncapsulation {

  public static void main(String[] args) {
    Company company = new Company();
    company.setName("MyCompany");
    company.addEmployee("John");
    company.addEmployee("Anthony");
    company.addEmployee(null); // get point null exception, cannot sort list with null

    company.setName(null);

    company.printSorted();

   // company.employees = null;

   //  company.employees.add("Jimmy");
  //  company.printSorted();
  }

}
