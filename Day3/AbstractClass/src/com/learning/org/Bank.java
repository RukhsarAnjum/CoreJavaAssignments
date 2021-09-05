package com.learning.org;

abstract public class Bank {
    abstract public int getBankInterest();
    public void bankMessage(String bankName){
        System.out.println("bankMessage is called"+bankName);
    }
}

class SBI extends Bank{
    @Override
    public int getBankInterest() {
        return 6;
    }
}

class AXIS extends Bank{
    @Override
    public int getBankInterest() {
        return 8;
    }
}

class ICICI extends Bank{

    @Override
    public int getBankInterest() {
        return 7;
    }
}

