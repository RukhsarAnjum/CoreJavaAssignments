package com.learning.org;

public class MethodOverloadingExample {
    public void add(int a){};
    public void add(int a,int b){};
    public void add(int a,int b,int c){};

    public void add(int a,double b){};
    public void add(double b,int a){};
}
