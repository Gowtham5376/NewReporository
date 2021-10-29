package org.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestingJunit {
	@After
	public void test1() {
		System.out.println("1");

	}
    @AfterClass 
	public static void test2() {
	 
		System.out.println("2");
		}
    @Before
    public void test3() {
    	System.out.println("3");

	}
	@BeforeClass
    public static void test4() {
    	System.out.println("4");
	}
	@Test
    public void test5() {
    	System.out.println("5");

	}
	@After
	public void test6() {
		System.out.println("6");

	}
	@AfterClass
	public static void test7() {
		System.out.println("7");

	}
	
	
}
