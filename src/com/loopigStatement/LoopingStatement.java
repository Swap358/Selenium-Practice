package com.loopigStatement;

public class LoopingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For Loop -when you know how many time loop this 
		
		
		for ( int i =0;i<=10;i++) {
			System.out.println(i);
		}
		for(int j=1;j<=7;j++) {
			System.out.print(j);
		}
		
		for(int k=2;k<=20;k=k+3) {
			System.out.println(2);
		}
		
		for(int a=1;a<8;a=a+2) {
			System.out.println(a);
		}
		
		
		
		
		
		//While loop -
		
		System.out.println("--------------While--------------");
	int i=0;
	while(i<=10) {
		System.out.print("  "+i);
		i++;
	}
	
	
	System.out.println();
	//dowhile loop 
	System.out.println("--------------Do -While--------------");
	int j=0;
	do {
		System.out.print("  "+i);
		j++;
	}while(j<10);
	
		
		
	
	//Nested For loop
	System.out.println();
	System.out.println("---------------nested ForLoop--------------");
	for(int week=1;week<3;week++) {
		System.out.println("week :"+ week);
		for(int day=1;day<=7;day++) {
			System.out.println("day:"+day);
		}
	}
	
	
	}

}
