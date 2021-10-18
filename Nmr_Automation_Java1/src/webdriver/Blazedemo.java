package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blazedemo {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://blazedemo.com/");
//		 drop down code
		 Select departure = new Select(driver.findElement(By.name("fromPort")));
		 departure.selectByVisibleText("Portland");
		 Select destination  =new Select( driver.findElement(By.name("toPort")));
		 destination.selectByVisibleText("New York");
//		 click on find flights submit button
		 driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		 Thread.sleep(5000);
//		 click on choose the flight
		 driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		 Thread.sleep(5000);
		 driver.findElement( By.name( "inputName")).sendKeys( "malli");
		 driver.findElement( By.name( "address")).sendKeys("123.main");
		 driver.findElement( By.name( "city")).sendKeys( "mangalore");
		 driver.findElement( By.name( "state")).sendKeys("karanataka");
		 driver.findElement( By.name( "zipCode")).sendKeys("560016");
		 Thread.sleep(5000);
//		 drop down code
		 Select cardType = new Select(driver.findElement(By.name("cardType")));
		 Thread.sleep(5000);
		 cardType.selectByValue("amex");
		 Thread.sleep(5000);
		 driver.findElement( By.name( "creditCardNumber")).sendKeys( "1234566979!");
		 driver.findElement(By.name("creditCardMonth")).sendKeys("12");
		 driver.findElement(By.name("creditCardYear")).sendKeys("2021");
		 driver.findElement(By.name("nameOnCard")).sendKeys("malli");
		 Thread.sleep(5000);
//		 click on checkbox
		 driver.findElement(By.name("rememberMe")).click();
		 Thread.sleep(5000);
//		 click on Purchase Flight button
		 driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		 
		 
		 
		 

	}

}
