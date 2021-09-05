package com.learning.org;

public class SalesEmployee extends Employee{
    private int sales;
    private double commission;
    private double netSalary;

    private SalesEmployee salesEmployee;

    public SalesEmployee(){
        System.out.println("Default constructor salesemployee is called");
        sales=0;
        commission=0;
        netSalary=0;
        salesEmployee = new SalesEmployee();
    }

    public SalesEmployee(int empId, String empName, int salary,int sales) {
        super(empId,empName,salary);
        System.out.println("Parameterised constructor of SalesEmployee is called");
        this.sales = sales;
        this.commission = 0;
        this.netSalary = 0;
    }

    @Override
    public String toString() {
        return super.toString()+
                "SalesEmployee{" +
                "sales=" + sales +
                ", commission=" + commission +
                ", netSalary=" + netSalary +
                '}';
    }
}
