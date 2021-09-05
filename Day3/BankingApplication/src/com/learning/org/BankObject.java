package com.learning.org;

public class BankObject {
    public static void main(String[] args) {
        XyzBank bank1=new XyzBank();
        System.out.println(bank1);

        XyzBank bank2=new XyzBank("AxisBank","Bangalore",6);
        System.out.println(bank2);

        XyzBank bank3=new XyzBank();
        System.out.println(bank3);
    }
}
