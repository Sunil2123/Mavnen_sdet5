package com.maven_test;

import org.testng.annotations.Test;

public class MvnTest
{
	@Test(groups="integration")
	public void test()
	{
		System.out.println("maven commond");
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
		
	}
	

}
