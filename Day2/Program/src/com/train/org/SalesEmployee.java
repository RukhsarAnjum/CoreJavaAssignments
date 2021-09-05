package com.train.org;

public class SalesEmployee extends Employee {
    private int sales;
    private double commission;
    private double netSalary;


    public SalesEmployee() {
        System.out.println("Default constructor of SalesEmployee is called");
        sales = 0;
        commission = 0;
        netSalary = 0;
    }

    public void calculateSalary(){
        if(sales<5000)
            commission=getSalary()*0.03;
        else if(sales>=5000 && sales<7000)
            commission=getSalary()*0.05;
        else if (sales>=7000 && sales<10000)
            commission=getSalary()*0.10;
        else if(sales>=10000)
            commission=getSalary()*0.15;
        else
            System.out.println("Commission is not applicable");

        netSalary=getSalary()+commission;
    }

    public SalesEmployee(int id, String name, double sal, int sales) {
        super(id, name, sal);
        System.out.println("Parameterised constructor of SalesEmployee is called");
        this.sales = sales;
        this.commission = 0;
        this.netSalary = 0;
    }


    @Override
    public String toString() {
        return super.toString() + "\nSalesEmployee{" +
                "sales=" + sales +
                ", commission=" + commission +
                ", netSalary=" + netSalary +
                '}';
    }
}
