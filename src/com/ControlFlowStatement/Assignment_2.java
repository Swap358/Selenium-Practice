package com.ControlFlowStatement;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		//programm to check person is eligible to vote if his ageis >18
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the Age:");
		int age = sc.nextInt();
		
		if( age >18) {
			System.out.println("your are Eligble for Vote :");
		}else {
			System.out.println("Your not Eligible for voting :");
		}
	sc.close();	
	}

}
