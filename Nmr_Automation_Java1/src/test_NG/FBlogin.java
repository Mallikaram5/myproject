package test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBlogin {
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

		// Maximize the window
		driver.manage().window().maximize();

		// Type UserName & Password
		driver.findElement(By.name("email")).sendKeys("hiall321334@gmail.com");
		driver.findElement(By.id("pass123")).sendKeys("F34324dsF#$");

		// Click on Login button
		driver.findElement(By.name("login")).click();
		
		driver.quit();

	}
}
