package com.TestNG;

import org.testng.annotations.Test;

public class GroupingInTestNG {

	@Test(groups="sanity")
	public void test1() {
		System.out.println("this is test 1 success");
	}
	@Test(groups="regression")
	public void test2() {
		System.out.println("this is test2 regression 	 success");
	}
	
	@Test(groups="regression")
	public void test4() {
		System.out.println("this is test4 regression 	 success");
	}
	
	@Test(groups="sanity,regression")
	public void test3() {
		System.out.println("this is  test 3 of sanity and regression");
	}
	
	
}
