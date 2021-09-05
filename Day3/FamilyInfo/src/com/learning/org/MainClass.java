package com.learning.org;

public class MainClass {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        System.out.println(e1);

        Employee e2 = new Employee(101, "Salim", 30000, new FamilyDetails(4, "Rukhsar", "Anjum"));
        System.out.println(e2);

      // Employee e3=new Employee(102,"Rukhsar",40000.00d,5,"ABC","XYZ");
       //System.out.println(e3);
        Employee e3=new Employee(10,"Rukhsar",20000,2,"ABc","hjj");
        System.out.println(e3);
    }
}
