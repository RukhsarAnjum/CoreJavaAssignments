package com.learn.org;

public class Employee {
    private int empId;
    private String empName;
    private double salary;

    public Employee(){
        System.out.println("Default constructor of Employee is called");
        empId=0;
        empName="";
        salary=0;
    }

    public Employee(int empId, String empName, double salary) {
        System.out.println("Parameterised constructor of Employee is called");
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
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
                '}';
    }
}
