package saiworld2;
////Write a java program that tells us that Input number is odd or even?

import java.util.Scanner;

public class SaiClass1 {// class name

    public static void main(String[] args) {// main method
        Scanner s = new Scanner(System.in);// creat object scanner class
        System.out.println("Enter a number :");//print ststement
        int num = s.nextInt();// read user input
        String evenOrOdd =(num % 2 == 0 ? "Even" : "odd" );//method for odd/even
        System.out.println("Input Number" + num + " is " + evenOrOdd); // print ststement
    }

}
