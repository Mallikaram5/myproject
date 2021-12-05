package test_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class GroupsSample {
	@Test(groups = "Sanity")
	public void f() {
		System.out.println("@Test f");
	}

	@Test(groups = "Regression")
	public void u() {
		System.out.println("@Test u ");
	}

	@Test(groups = "Retesting")
	public void a() {
		System.out.println("@Test a ");
	}

	@Test(groups = { "Retesting", "Sanity" })
	public void h() {
		System.out.println("@Test h ");
	}

	@Test(groups = { "Retesting", "Sanity" })
	public void p() {
		System.out.println("@Test p ");
	}

}
