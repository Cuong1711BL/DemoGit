package com.groups123;

import org.testng.Assert;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass1 {
	@Test
	@Parameters({"a","b"})
	public void TestClass1_1(int a, int b) {
//		int a = 2;
		Assert.assertEquals(5, a+b);
	}

	@Test(groups = {"GroupA"})
	public void TestClass1_2() {
		int a = 2;
		Assert.assertEquals(2, a);
	}

	@Test(groups = {"GroupA"})
	public void TestClass1_3() {
		int a = 2;
		Assert.assertEquals(3, a);
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest1");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest1");
	}
	
	@BeforeGroups("GroupA")
	public void beforeGroup() {
		System.out.println("BeforeGroup1");
	}
	@AfterGroups("GroupA")
	public void AfterGroup() {
		System.out.println("AfterGroup1");
	}
	
}
