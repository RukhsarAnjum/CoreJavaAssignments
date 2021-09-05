package com.learning.org;

public class XyzBank {
    private String bankName;
    private String bankAddress;
    private int noOfEmp;

    public XyzBank(){
        System.out.println("Default constructor is called");
        bankName=" ";
        bankAddress=" ";
        noOfEmp=0;
    }

    public XyzBank(String bankName, String bankAddress, int noOfEmployees) {
        System.out.println("Parameterised constructor of XYZBank is called");
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.noOfEmp = noOfEmployees;
    }
    public String toString(){
        return "Bank Details are "+bankName+" Address "+bankAddress+" NoOfEmployees"+noOfEmp;
    }
}


