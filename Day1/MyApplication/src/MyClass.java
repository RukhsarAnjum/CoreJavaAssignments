import javax.swing.*;
import java.util.Scanner;

import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
//          int num1=100;
////        float num2= 12.12f;
////        double num3= 23.12d;
////        System.out.println("This is my class" +num1+" "+num2+" "+num3);


//        Scanner s= new Scanner(System.in);
//        int n = s.nextInt();
//        int th,h,t,o;
//        th=(n/1000)*1000;
//        System.out.println(th);

        //3rd way to accept value GUI

        String message=JOptionPane.showInputDialog(null,"Broccoli is good for health","Green Food",JOptionPane.INFORMATION_MESSAGE);
        String [] options={"ABC","PQR"};
        ImageIcon icon=new ImageIcon("");
        String res=(String)JOptionPane.showInputDialog(null,"Do you want more options","message",JOptionPane.QUESTION_MESSAGE,icon,options,options[0]);

        int id=Integer.parseInt(JOptionPane.showInputDialog("Enter id here"));
        System.out.println("ID is "+id);

        String name= JOptionPane.showInputDialog("Enter name here");
        System.out.println("Name is "+name);

        double salary=Double.parseDouble(JOptionPane.showInputDialog("Enter salary here"));
        System.out.println("Salary is "+salary);


    }
}
