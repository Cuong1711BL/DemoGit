package com.groups123;

import org.testng.Assert;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass2 {
	@Test(description = "This is a testcase")
	@Parameters({"a","b"})
	public void TestClass2_1(@Optional("1") int a,@Optional("2") int b) {
//		int a = 2;
		Assert.assertEquals(6, a*b);
	}

	@Test
	public void TestClass2_2() {
		int a = 2;
		Assert.assertEquals(2, a);
	}

	@Test
	public void TestClass2_3() {
		int a = 2;
		Assert.assertEquals(2, a);
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest2");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest2");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass2");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod2");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod2");
	}
}
