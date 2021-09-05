package com.train.org;

public class WageEmployee extends Employee{
    private String month;
    private int year;
    private double noOfWorkHours;
    private double wages;

    public WageEmployee(){
        System.out.println("Default constructor");
        month="";
        year=0;
        noOfWorkHours=0;
        wages=0;
    }

    public WageEmployee(int empId,String name,double salary,String month, int year) {
        super(empId,name,salary);
        System.out.println("Parameterised constructor of WageEmployee is called");
        this.month = month;
        this.year = year;
        this.noOfWorkHours = 0;
        this.wages = 0;
    }


    public void setMonth(String month) {
        this.month = month;
    }
    public String getMonth() {
        return month;
    }

    public void calculateDays(){
        if(year%4==0)
    }


    public void calculateSalary(){
        System.out.println("Calculating of salary of WageEmployee is called");




    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "month='" + month + '\'' +
                ", year=" + year +
                ", noOfWorkHours=" + noOfWorkHours +
                ", wages=" + wages +
                '}';
    }
}
