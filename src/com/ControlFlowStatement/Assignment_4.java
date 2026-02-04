package com.ControlFlowStatement;

import java.util.Scanner;

public class Assignment_4 {

    public static void main(String[] args) {
//Write a program to check if a number is positive and even 
 // using nested if.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        if(n >0) {
        	System.out.println(n+" number is positive .");
        	if(n%2 ==0) {
        		System.out.println(n+" number is Even ");
        	}else {
        		System.out.println("number is Odd");
        	}
        }else System.out.println("number is negative.");

        sc.close();
    }
}
