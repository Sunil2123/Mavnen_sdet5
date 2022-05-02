package com.maven_test;

import org.testng.annotations.Test;

public class MavenTest 
{
	@Test(groups="smoke")
public void test1()
{
		System.out.println("smoke 1");
		}
	@Test(groups="regression")
	public void test2()
	{
		System.out.println("regression testing 2");
	}

}
