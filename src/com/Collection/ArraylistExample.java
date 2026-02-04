package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// List <datatype> vaiable  = new Arraylist <>();
		
		List<Object> arrayList =new ArrayList<>();
		arrayList.add(20);
		arrayList.add(49.8);
		arrayList.add("SLS");
		arrayList.add("S");
		
		
		for( int i=0;i<= 3;i++) {
			System.out.println(arrayList.get(i));
		}
		
		//with .size()
		for( int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		
		
	
	}

}
