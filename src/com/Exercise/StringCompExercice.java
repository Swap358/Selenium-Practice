package com.Exercise;

import java.util.Arrays;

public class StringCompExercice {
	
	public static void main(String[] args) {
		// Program to count the number of caracterin a string.
		String input = "Testing Tools";
		
		int count = input.length();
		System.out.println("number of character is :"+ count);
	
	//remove all starting and ending spaces form string 
		
		String input2 = "  Testing Tools   ";
		
		System.out.println(input2.trim());
		
	//program to convert lower case to upper case
		
		
		System.out.println(input.toUpperCase());
		
	// prog to written starts with "Tes" and end with "he"
		
			System.out.println("Starts with Tes "+input.startsWith("Tes"));
			System.out.println("Ends with Tes "+input.endsWith("he"));
			
		//prog to writen index of "T" in strin g
			
		System.out.println("Index of the T : "+input.indexOf("T"));
	
		// prog to find character of 5 in string .
		
			System.out.println("character at 5 index is  :"+ input.charAt(5));
		//prog to replace S to k in string.
			
			System.out.println("replaced Strig is: "+input.replace("s", "k"));
	
		//prog to return contains "G" in string.
			System.out.println("the string contains G: "+ input.contains("G"));
			System.out.println("the string contains g: "+ input.contains("g"));
		
		//prog to split the string with '@'
			
			String input3="Tes@tin@g To@Ols";
			String[] result=input3.split("@");
			
			System.out.println("splited string with @ : "+Arrays.toString(result));
		//prog to return substirng 
			
			System.out.println(input.substring(0, 5));
			System.out.println(input.substring(8));
	
		// prog to replace all string with manual testing 
			
			System.out.println(input.replaceAll(input,"Manual Testing"));
	}	

}
