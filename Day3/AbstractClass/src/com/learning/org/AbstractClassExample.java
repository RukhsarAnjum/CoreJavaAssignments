package com.learning.org;

 abstract class Bike{

    abstract public void run();

    public void showBikeDetails(){
        System.out.println("Bike abstract class showBikeDetails is called");
    }
}

public class AbstractClassExample extends Bike {
    @Override
    public void run() {
        System.out.println("Run implementation inside AbstactClassExample");
    }

    public static void main(String[] args) {
        Bike ab=new AbstractClassExample();
        ab.run();
        ab.showBikeDetails();


//        AbstractClassExample ab=new AbstractClassExample();
//        ab.run();
//        ab.showBikeDetails();
    }
}