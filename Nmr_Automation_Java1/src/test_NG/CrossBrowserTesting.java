package test_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class CrossBrowserTesting {
	WebDriver driver;

	// String browserName = "opera";
	// @Optional("chrome")
	@Parameters("browserName")//Chrome
	@BeforeClass
	public void beforeClass(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			// Chrome
			System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			// Edge
			System.setProperty("webdriver.edge.driver", ".\\browserdrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// Firefox
			System.setProperty("webdriver.gecko.driver", ".\\browserdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please enter the browser name in a valid format");
		}
	}

	@Test
	public void f() {
		driver.get("https://en-gb.facebook.com/");
		// Maximize the window
		driver.manage().window().maximize();
		// Type UserName & Password
		driver.findElement(By.name("email")).sendKeys("hiall321334@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("F34324dsF#$");
		// Click on Login button
		driver.findElement(By.name("login")).click();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
