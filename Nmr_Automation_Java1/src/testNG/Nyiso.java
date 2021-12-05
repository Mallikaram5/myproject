package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Nyiso {
	WebDriver driver;

	@BeforeClass
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://mis.nyiso.com/public/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void f() throws Exception {
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       WebElement  ele = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td"));
		act.contextClick(ele).perform();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 	// do righclick on element
		WebElement rgtClick = driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td/a"));
		act.contextClick(rgtClick).perform();
}
}
