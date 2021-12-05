package webdriver;

import java.io.FileInputStream;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewAccount {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
//		maximize the window
		 driver.manage().window().maximize();
			Thread.sleep(8000);
			//  click the Create New Account hyperlink
			driver.findElement(By.linkText("Create New Account")).click();
//		  Type first Name,surName,mobileNumber or email,new password,date of birth, gender and select your pronoun;
		Thread.sleep(8000);
		
		 driver.findElement( By.name( "firstname")).sendKeys( "malli");
		 driver.findElement( By.name( "lastname")).sendKeys("kaka");
		 driver.findElement( By.name( "reg_email__")).sendKeys( "9595959599","malli@gmail.com");
		 Thread.sleep(8000);
		 driver.findElement( By.name( "reg_passwd__")).sendKeys("password5!");
		 driver.findElement( By.name( "birthday_day")).sendKeys( "9");
		 driver.findElement( By.name( "birthday_month")).sendKeys("Jan");
		 driver.findElement(By.name("birthday_year")).sendKeys("1986");
		 Thread.sleep(8000);
		 String screenshortpath = (".\screenshorts");
		 FileInputStream fi = new FileInputStream(screenshortpath);
		 Date di= new Date(0);
		 DateFormat df =  new SimpleDateFormat("YYYY_DD_MMM_HH_MM_SS");
//		 click on  radio1 button 
		  driver.findElement(By.id("u_3_2_fk")).click();
			 
 
		 

	}

}
