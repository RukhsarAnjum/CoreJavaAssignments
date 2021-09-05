package com.learning.org;

public class BankMainClass {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        b1.bankMessage("SBI");
        System.out.println("Bank Interst" + b1.getBankInterest());

        b1 = new ICICI();
        b1.bankMessage("ICICI");
        System.out.println("Bank Interst" + b1.getBankInterest());

        b1 = new AXIS();
        b1.bankMessage("AXIS");
        System.out.println("Bank Interst" + b1.getBankInterest());


    }
}
