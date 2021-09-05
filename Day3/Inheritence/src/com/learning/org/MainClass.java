package com.learning.org;

public class MainClass {
    public static void main(String[] args) {
//        Employee e1=new Employee();
//        //System.out.println(e1);
//
//        Employee e2=new Employee(101);
//        //System.out.println(e2);
//
//        Employee e3=new Employee(101,"Rukhsar");
//        System.out.println(e3);
//
//        Employee e4=new Employee(101,"Rukhsar",10000);
//        System.out.println(e4);

        SalesEmployee s1 = new SalesEmployee();
        System.out.println("sales employee is "+s1);

        SalesEmployee s2 = new SalesEmployee(123,"Rukhsar",100,45);
        System.out.println("sales employee is "+s2);
    }
}
