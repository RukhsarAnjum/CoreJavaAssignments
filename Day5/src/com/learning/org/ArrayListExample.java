package com.learning.org;

import javafx.beans.binding.ListExpression;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> first=new ArrayList<String>();
        first.add("Rukhsar");
        first.add("Anjum");
        first.add("Soni");
        first.add("zoya");

//        for (String str:first){
//           System.out.println(str);
//            }

//        Iterator itr=first.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

//        Set<String> hash_set=new HashSet<String>();
//        hash_set.add("Pappu");
//        hash_set.add("soya");
//        hash_set.add("ring");
//        hash_set.add("Pappu");
//        System.out.println(hash_set);

        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[]{4,6,3,8,0}));
        System.out.println("A :" +a);

        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[]{24,10,71,53,90,10}));
        System.out.println("B :" +b);

        //Union operation
        Set<Integer> union=new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union is : " +union);

        //Intersection
        Set<Integer> intersection=new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Intersection of two sets"+intersection);


        //To find the symmetric differences
        Set<Integer> diff=new HashSet<Integer>(a);
        diff.removeAll(b);
        System.out.println("Differences of two sets"+diff);
    }
}
