package com.learning.org;

public class Bank {
    private String bankName;
    private int accNo;
    private String accType;
    private int bal;

    public Bank(){
        System.out.println("Default constructor of employee is called");
        bankName="";
        accNo=0;
        accType="";
        bal=0;
    }

    public Bank(String bankName, int accNo, String accType, int bal) {
        this.bankName = bankName;
        this.accNo = accNo;
        this.accType = accType;
        this.bal = bal;
    }

    public void showBankDetails(){
        System.out.println("Details are"+bankName+" Account number :- "+accNo+" Account type :- "+accType+" Balance :- "+bal);
    }
}
