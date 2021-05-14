package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgClass {
	@Test(description="This is testcase1")
	public void testCase1() 
	{
	System.out.println("in test case 1");
	}

	@Test()
	public void testCase2() {
	System.out.println("in test case 2");
	}

	@Test(enabled=false)
	public void testCase3() {
	System.out.println("Dependent one");
	}

	@BeforeMethod
	public void beforeMethod() {
	System.out.println("in beforeMethod");
	}

	 @AfterMethod
	public void afterMethod() {
	System.out.println("in afterMethod");
	}
	 @AfterClass
	public void afterClass() {
	System.out.println("in afterClass");
	}


	@BeforeClass
	public void Beforeclass() {
	System.out.println("in beforeclass");
	}

	 @BeforeTest
	public void beforeTest() {
	System.out.println("in beforeTest");
	}
	 @AfterTest
	public void afterTest() {
	System.out.println("in afterTest");
	}

	 @BeforeSuite
	public void beforeSuite() {
	System.out.println("in beforeSuite");
	}
	 @AfterSuite
	public void afterSuite() {
	System.out.println("in afterSuite");
	 }
	
}
