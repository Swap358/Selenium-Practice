package com.variables;

import java.util.Arrays;

public class StirngCompEx {

	public static void main(String[] args) {
		
		String s1="hello",s2="Swapnil@gmail.com";
	
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+s2);
		
		String s3="hello";
		String s4 =new String("HEllo");
		
		
		String s5="hello";
		String s6 =new String("HEllo");
		
		
		System.out.println(s3 == s5);
		
		System.out.println(s4==s6);
		
		System.out.println(s3 == s4);
		
		System.out.println(s5 == s6);
		
		
		// with Equals method  
		
		System.out.println(s3.equals(s5));
		

		String s7= "Hello World";
		String s8= "HELLO World";
		//Equals ingonre case 
		System.out.println(s7.equalsIgnoreCase(s8));
		
		
		//Contains
		System.out.println(s7.contains("r"));
		//Starts with 
		System.out.println(s7.startsWith("H"));
		System.out.println(s7.startsWith("D"));
		
		//endswith method 
		System.out.println(s7.endsWith("d"));
		System.out.println(s7.startsWith("C"));
		
		//length 
		System.out.println("legth of the string S7 " +s7.length());
	
	
		//trim Method (both left and right side is remove but middle is not remove)
		
		String s9 ="  Hello World    ";
		System.out.println(s9.length());
		System.out.println(s9.trim().length());
		System.out.println();
		
		//tolower case
		System.out.println(s8.toLowerCase());
		System.out.println(s9.toLowerCase());
	
		//toupper case 
		System.out.println(s9.toUpperCase());
		System.out.println(s2.toUpperCase());
		//indexOf() method 
		
		
		System.out.println(s7.indexOf("l"));
		System.out.println(s7.lastIndexOf("l"));
		System.out.println(s2.lastIndexOf("m"));
	
		//Substring method 
		
		System.out.println(s7.substring(2,5));
		System.out.println(s7.substring(4));
	
		//CharAt() method 
		
		System.out.println(s2.charAt(4));
		
		//split - divide character inmultiple part 
		
		String s10="Th@is i@s my c@la@ss";
		
		System.out.println(s10.split("\\@"));
		System.out.println(Arrays.toString(s10.split("@")));
	
		//replace method
		
		System.out.println(s10.replace("s","n"));
		
		//replace method - entire string is converted to nre 
		
		System.out.println(s10.replaceAll(s10, s6) );
		
	
	
	}

}
