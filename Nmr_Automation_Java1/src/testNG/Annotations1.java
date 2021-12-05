package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotations1 {
	@AfterClass // post-condition
	public void afterClass() {
		System.out.println("@AfterClass");
	}
	@BeforeClass // pre-condition
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}
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
}
