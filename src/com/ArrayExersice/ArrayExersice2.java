package com.ArrayExersice;

import java.util.Scanner;

public class ArrayExersice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to store and display the marks of 3 students in 3
		//subjects using a two-dimensional array.
		
		int Marks[][] =new int [3][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks and subject of the studnet");
		for(int i =0;i<3;i++) {
			 System.out.println("Student " + (i + 1) + ":");
			for(int j=0;j<3;j++) {
				 System.out.println("   Subject " + (i + 1) + ":");
				Marks[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Marks of the student :");

		for(int i=0;i<3;i++) {
			 System.out.println("Student " + (i + 1) + ":");
			for(int j=0;j<3;j++) {
				 System.out.println("   Subject " + (i + 1) + ":");
				System.out.println("          " +   Marks[i][j]);
			}
		}
		
		
		
	}

}
