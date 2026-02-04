package com.ControlFlowStatement;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		
		//Write a program to display the name of a month based on its number using
		//switch.
	
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of month :");
		int n = sc.nextInt();
		
		switch(n) {
		case 1:System.out.println("January");
				break;
		case 2:System.out.println("February");
		break;
		case 3:System.out.println("March");
		break;
		case 4:System.out.println("April");
		break;
		case 5:System.out.println("May");
		break;
		case 6:System.out.println("Jun");
		break;
		case 7:System.out.println("July");
		break;
		case 8:System.out.println("Augst");
		break;
		case 9:System.out.println("September");
		break;
		case 10:System.out.println("Octomber");
		break;
		case 11:System.out.println("November");
		break;
		case 12:System.out.println("Deecember");
		break;
		
		default:System.out.println("enter the right number between 1-12");
		
		}
	sc.close();
	}

}
