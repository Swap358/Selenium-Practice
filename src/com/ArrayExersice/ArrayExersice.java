package com.ArrayExersice;

import java.util.Scanner;

public class ArrayExersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to store and display the marks of 5 students using a
		//one-dimensional array.
		
		Scanner sc =new Scanner(System.in);
		
		int marks[] = new int[5];
		
		System.out.println("Enter the marks of 5 Students :");
		for(int i=0;i<=4;i++) {
			marks[i]=sc.nextInt();
		}
		
		System.out.println("Marks of 5 Students is:");
		for(int i=0;i<=4;i++) {
			System.out.println("student " +i+" :" +marks[i]);
		}
	}

}
