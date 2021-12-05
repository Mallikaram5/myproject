package test_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Annotaions4 {
	@Test // Actual Test script
	public void f() {
		System.out.println("@Test f");
	}
	
	@Test // Actual Test script
	public void u() {
		System.out.println("@Test u ");
	}
	
	@Test // Actual Test script
	public void a() {
		System.out.println("@Test a ");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod ");
	}
}
