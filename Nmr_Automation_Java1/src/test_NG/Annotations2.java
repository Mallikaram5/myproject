package test_NG;

import org.testng.annotations.Test;

public class Annotations2 {

	@Test(enabled = false)
	public void hello() {
		System.out.println("hello");
	}

	@Test
	public void abc() {
		System.out.println("abc");
	}

	@Test
	public void mnp() {
		System.out.println("mnp");
	}

	@Test
	public void yes() {
		System.out.println("yes");
	}

	@Test
	public void no() {
		System.out.println("no");
	}

}
