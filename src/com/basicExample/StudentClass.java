package com.basicExample;

public class StudentClass {
	
	int id ;
	String name;
	String addr;
	String course;
	int fees;
	public void displayStudent() {
		
		System.out.println(id+"  |" + name +" |"+ addr +"   |"+ course +" |" + fees +"|");
	}
	public static void main(String[] args) {
		
		//object creating 
		StudentClass s1 = new StudentClass();
		StudentClass s2 = new StudentClass();
		
		s1.id=01; s1.name="Swapnil S.";
		s1.addr="Manmad"; s1.course="Software Testing";
		s1.fees=14000;
		
		s2.id=01; s2.name="Swapnil S.";
		s2.addr="Manmad"; s2.course="Software Testing";
		s2.fees=14000;
		
		
		System.out.println("id |" + " name      |" +"  addr   |"+" course "+" 	   |fees |");
		s1.displayStudent();
		s2.displayStudent();		
		
		
		

	}

}
