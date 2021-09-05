package com.train.org;

public class MainEmpClass {
    public static void main(String[] args) {

        SalesEmployee s1=new SalesEmployee(101,"Eshan",10000,5000);
        s1.calculateSalary();
        System.out.println(s1);

//        Employee e1=new Employee();
//        System.out.println(e1);
//
//        Employee e4=new Employee(101,"Aman",10000);
//        System.out.println(e4);
    }
}

