package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DroganddropAssignments {
	WebDriver driver;

	@BeforeClass
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	}

	@Test
	public void f() throws Exception {
		Actions act = new Actions(driver);
		//Drag and Drop 
				 	
				WebElement from = driver.findElement(By.xpath("//*[@id=\"credit\"]/a"));			
				WebElement to = driver.findElement(By.xpath("//*[@id=\"bank\"]"));
				act.dragAndDrop(from, to).perform();
				Thread.sleep(5000);
	}
	@Test
	public void f1() throws Exception {
		Actions act = new Actions(driver);
		//Drag and Drop 
	
				WebElement from = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));			
				WebElement to = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
				act.dragAndDrop(from, to).perform();
				Thread.sleep(5000);
	}
	@Test
	public void f2() throws Exception {
		Actions act = new Actions(driver);
		//Drag and Drop 
				 
				WebElement from = driver.findElement(By.xpath("//*[@id=\"credit\"]/a"));			
				WebElement to = driver.findElement(By.xpath("//*[@id=\"bank\"]"));
				act.dragAndDrop(from, to).perform();
				Thread.sleep(5000);
				
	}
	@Test
	public void f3() throws Exception {
		Actions act = new Actions(driver);
		//Drag and Drop 
				 
				WebElement from = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));			
				WebElement to = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
				act.dragAndDrop(from, to).perform();
				Thread.sleep(5000);
				
 
	  
	  
  }
  
}
