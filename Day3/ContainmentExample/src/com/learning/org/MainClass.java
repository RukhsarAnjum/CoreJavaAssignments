package com.learning.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;

public class MainClass {
    public static void main(String[] args) {

        Customer cust1=new Customer();
        System.out.println(cust1);

        System.out.println("-------------------------------------------------------------------------");

        Customer cust2=new Customer("regular101","Manish","Bangalore",93454545,new Product("Iphone",98000,new Date()));
        System.out.println(cust2);





//        ArrayList<Customer> custRecord=new ArrayList<Customer>();
//        custRecord.add(new Customer("101","Rukhsar","Bangalore",965768868));
//        custRecord.add(new Customer("102","Soha","delhi",93453356));
//        custRecord.add(new Customer("103","Salim","pingi",976868868));
//        custRecord.add(new Customer("104","Anjum","hydra",986868868));

//        for(Customer c1:custRecord){
//            System.out.println(c1.getcName());
//        }

//        Iterator<Customer> iter=custRecord.iterator();
//        while(iter.hasNext()){
//            System.out.println(iter.hasNext());
//        }

//       ArrayList<String> list= new ArrayList<String>();
//        list.add("Amit");
//        list.add("Pappu");
//        list.add("Sona");
//        list.add("Pari");
//
//        Iterator<String> iter2=list.iterator();
//        while(iter2.hasNext()){
//            String name=iter2.next();
//            if(name.equals("Amit")){
//                iter2.remove();
//            }
//        }
//
//        for(String str:list){
//            System.out.println(str);
//        }


//        ListIterator iter4=list.listIterator();
//        while(iter4.hasNext()){
//            System.out.println(iter4.next());
//        }
//
//        while(iter4.hasPrevious()){
//            System.out.println(iter4.previous());
//        }



    }
}
