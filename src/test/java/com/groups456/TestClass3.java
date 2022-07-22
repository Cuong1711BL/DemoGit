package com.groups456;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass3 {
	@Test(dependsOnMethods = {"TestClass3_2","TestClass3_3"})
	public void TestClass3_1() {
		int a = 2;
		Assert.assertEquals(2, a);
	}

	@Test
	public void TestClass3_2() {
		int a = 2;
		Assert.assertEquals(2, a);
	}

	@Test
	public void TestClass3_3() {
		int a = 2;
		Assert.assertEquals(2, a);
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest3");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest3");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass3");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass3");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod3");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod3");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}

}
