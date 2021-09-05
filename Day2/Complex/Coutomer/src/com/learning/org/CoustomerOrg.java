package com.learning.org;

public class CoustomerOrg {
    public static void main(String[] args) {
        Coustomer c1=new Coustomer();
        c1.showCoustomerDetails();
        Coustomer c2=new Coustomer(101,"Rukhsar","Bangalore",57867865);
        c2.showCoustomerDetails();
    }
}
