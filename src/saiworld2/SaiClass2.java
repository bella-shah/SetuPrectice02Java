package saiworld2;
////Write a java program to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;

public class SaiClass2 {// class name

    public static void main(String[] args) {// main method
        int year;// Instance variable
        System.out.println("Enter the Year  :");//print statement
        Scanner s =new Scanner(System.in);//creat object for scanner class
        year = s.nextInt();// read user input
        if (((year % 4 == 0) && (year % 100 != 0)) ||  (year % 400 == 0));// this is the formula for leap year -- if else condition
        System.out.println("This is a Leap Year ");// print Statement
        System.out.println("This year is not a Leap Year");//print statement


    }



}

