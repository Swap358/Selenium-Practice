package com.variables;

public class Variables {
	
	static	int g = 70;
	int engineering= 40;
	
	public static void institute(String fname,String lname) {
		System.out.println("first name is: "+fname +" " + "lastname name is: " + lname);
	}
	
	
	public static void main(String[] args) {
		//using global variable is static o/p is value of g - is 70.
		
		String fname ="Swapnil",lname="Sansare";
		
		int engineering= 30;
		System.out.println("value of g is " +g);
		
		Variables v=new Variables();
		System.out.println("value of engineering " + v.engineering);
		
		System.out.println("value of engineering " + engineering);
		
		institute("java","CoreJava");
		institute("automation","Seleium");
		institute("Testing ","Manual Testing ");
		institute("java","CoreJava");
		
	}

}
