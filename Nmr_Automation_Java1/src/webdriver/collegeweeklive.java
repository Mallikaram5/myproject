package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class collegeweeklive {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://collegeweeklive.com/go-signup/");
//		 maximize the window
		 driver.manage().window().maximize();
//		  Type first Name,lastName,email,phoneNumber,password & confirm password in text box for sign up page
		Thread.sleep(8000);
		
		 driver.findElement( By.name( "firstName")).sendKeys( "malli");
		 driver.findElement( By.name( "lastName")).sendKeys("kaka");
		 driver.findElement( By.name( "emailAddress")).sendKeys( "malli@gmail.com");
		 driver.findElement( By.name( "phoneNumber")).sendKeys("9595959599");
		 driver.findElement( By.name( "password")).sendKeys("password5!");
		 driver.findElement( By.name( "ConfirmPassword")).sendKeys( "password5!");
//		 click on check box button
		 driver.findElement( By.name( "questions[q_135]")).click();
		 
//		 click on checkbox button
		 driver.findElement( By.name( "questions[q_136]")).click();
//		 click on checkbox button
		 driver.findElement( By.name( "questions[q_137]")).click();
//		 click on submit button
		 driver.findElement( By.id( "submit")).click();
		 
		 
	}

}
