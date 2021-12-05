package test_NG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class FB_RetestingWithDataProvider {
	WebDriver driver;

	@BeforeClass
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "dp")
	public void f(String un, String pswd) throws Exception {
		// Type UserName & Password
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pswd);
		// Click on Login button
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		// validate the error screen has displayed or not?
		if (driver.findElements(By.linkText("Find your account and log in.")).size() > 0 || driver.findElements(By.linkText("Create a new Facebook account.")).size() > 0) {

			System.out.println("Given credentials are invalid");

		} else {
			System.out.println("Given credentials are valid");

		}
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] { "TEioihst123@gmail.com", "asdge*/" },
			new Object[] { "rtuyfEst123@gmail.com", "asdfgs474%fsdge*/" },
			new Object[] { "tyyb23@gmail.com", "a474%fsdge*/" }, };
	}
	
}
