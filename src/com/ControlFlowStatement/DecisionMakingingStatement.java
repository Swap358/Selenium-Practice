package com.ControlFlowStatement;

public class DecisionMakingingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if Statement - if the condition is true then 
		//it will print the next line other wise it will terminates.
		
		int a =20;
		int b=10;
		
		if(a>b) {
			System.out.println(" A is greater than B");
		}
		
		
		//if else
		b=30;
		int c =50;
		if(a>b) {
			System.out.println(" A is greater than B");
		}else {
			System.out.println(" A is Less  than B");
		}
		
		
		// if else if 
		// it use when multiple condition like  true ,false true  then it is use 
		
		if((a>b) && (a>c)) {
			System.out.println(" A is greater than B and a is Greater than c");
		}else if (b>c) {
			System.out.println(" b is greater than c");
		}else {
			System.out.println(" c is greater than A and B");
		}
		
		
		
		//Nested IF statemetn - if block inside if block that called nested if blocks
		
//		if(a>b) {
//			
//			System.out.println("manual Testing ");
//			if(a>c) {
//				System.out.println("Automation testing ");
//			}
//			System.out.println("Core Java");
//		}
//		
		
		
		//Switch Statement - it work like 
		
		
		int weekday=6;
		switch(weekday) {
		case 1:System.out.println("monday");
			break;
		case 2:System.out.println("tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		
		case 7:System.out.println("Sunday");
		break;
		
		default:
				System.out.println("Aoove cases is not matching..");
				break;
		}
		
				
		//end of main 
	}

}
