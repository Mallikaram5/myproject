package test_NG;

import org.testng.annotations.Test;

public class Annotaions3_Priority {
	@Test(priority = 2)
	public void abc() {
		System.out.println("abc");
	}

	@Test(priority = 3)
	public void mnp() {
		System.out.println("mnp");
	}

	@Test(priority = 1)
	public void yes() {
		System.out.println("yes");
	}

	@Test(priority = 0)
	public void no() {
		System.out.println("no");
	}
}
