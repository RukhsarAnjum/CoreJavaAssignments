package com.learning.org;

import java.util.ArrayList;

public class Employee {
    private int empId;
    private String empName;
    private double salary;

    private FamilyDetails familyDetails;
    private ArrayList<Address> addresses;

    public Employee(){
        System.out.println("Default constructor of Employee is called");
        empId=0;
        empName="";
        salary=0;
        familyDetails=new FamilyDetails();  //contained object
        addresses=new ArrayList<Address>();
    }

    public Employee(int empId, String empName, double salary,FamilyDetails familyDetails) {
        System.out.println("Parameterised constructor of Employee is called");
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.familyDetails=familyDetails;
        addresses=new ArrayList<Address>();
    //    addresses.add(address);
    }



    public  Employee(int empId, String empName, double salary, int familyMembers, String fatherName, String surname ){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.familyDetails=new FamilyDetails(familyMembers,fatherName,surname);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                "}\n" +familyDetails.toString();
    }
}
