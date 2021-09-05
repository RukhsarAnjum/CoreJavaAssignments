package com.learning.org;

public class Employee {
    private int empId;
    private String empName;
    private int salary;


    public Employee(){
        System.out.println("Default employee constructor is called");
        empId=0;
        empName="";
        salary=0;
    }

    public Employee(int empId) {
        System.out.println("Parameterised constructor of Employee is called");
        this.empId = empId;
    }

    public Employee(int empId, String empName) {
        System.out.println("Parameterised constructor of Employee is called");
        this.empId = empId;
        this.empName = empName;
    }

    public Employee(int empId, String empName, int salary) {
        System.out.println("Parameterised constructor of Employee is called");
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }

//    public void showDetails(){
//        System.out.println("Employee ID : "+empId+ "Employee name : "+empName+"Salary : "+salary);
//    }
}
