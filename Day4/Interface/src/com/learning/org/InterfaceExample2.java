package com.learning.org;
//------------------------------------multiple inheritence---------------
interface AnimalEat{
    public void eat();
}

interface AnimalTravel {
    //public void eat();
    public void travel();
}

class Animal implements AnimalEat,AnimalTravel{
    @Override
    public void eat() {
        System.out.println("Eat is called");
    }

    @Override
    public void travel() {
        System.out.println("Travel is called");
    }
}

public class InterfaceExample2 {
    public static void main(String[] args) {
        AnimalEat a1=new Animal();
        a1.eat();
       // a1.travel(); //is not allowed

        AnimalTravel a2=new Animal();
        a2.travel();
        //a2.eat();     // is not allowed
    }
}
