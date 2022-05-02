package com.maven_test;

import org.testng.annotations.Test;

public class MavenTest2
{
	@Test(groups="smoke")
	public void test3()
	{
		System.out.println("smoke testing1");
	}
	@Test(groups="regression")
	public void test4()
	{
	System.out.println("regression testing2");	
	}

}
