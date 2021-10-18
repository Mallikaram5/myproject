package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tirupatibalaji {

	public static void main(String[] args) throws Exception {
		 
			System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://tirupatibalaji.ap.gov.in/#/login");
//			click on Sign Up Hyperlink
			Thread.sleep(8000);
			driver.findElement(By.linkText("#/registration")).click();
			Thread.sleep(8000);
//			  Type first Name,lastName  in text box for sign up page
	 
			
			 driver.findElement( By.name( "fName")).sendKeys( "malli");
			 driver.findElement( By.name( "lName")).sendKeys("kaka");
			  
			
			
	}

}
