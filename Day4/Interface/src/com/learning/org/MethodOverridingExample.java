package com.learning.org;


class GrandParent{
    void fun(){
        System.out.println("Grand parend fun called");
    }
}

class Parent1 extends GrandParent{
    void fun(){
        System.out.println(" parend 1 fun  called");
    }
}

class Parent2 extends GrandParent{
    void fun(){
        System.out.println("parent 2 fun called");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Parent2 p1 = new Parent2();  //correct
        p1.fun();

        Parent1 p2=new Parent1();    //correct
        p2.fun();

       // Parent2 p3=new Parent1();     //not correct

    }
}
