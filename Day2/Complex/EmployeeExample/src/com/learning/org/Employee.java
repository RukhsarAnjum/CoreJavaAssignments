package com.learning.org;

import java.util.Scanner;

public class Employee {
    private int empId;
    private String name;
    private double salary;


//Default constructor
    public Employee(){
        System.out.println("Default constructor of employee is called");
        empId=0;
        name="";
        salary=0;
    }


    //parameterised  constructor
    public Employee(int empId, String name, double salary) {
        System.out.println("Parameterised constructor of employee is called");
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }


//setter method
    public void setSalary(double salary) {
        this.salary = salary;
    }

// getter method
    public double getSalary() {
        return salary;
    }

    public void acceptEmpDeatils(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter employee ID:");
        empId=Integer.parseInt(s.nextLine());

        System.out.println("Enter employee name:");
        name=s.nextLine();

        System.out.println("Enter employee salary:");
        salary=s.nextDouble();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

//    public void showEmployeeDetails(){
//        System.out.println("Employee details are \n"+" EmpID :- "+empId+" Name :- "+name+" Salary :- "+salary);
//    }
}
