package testNG;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StudentRegistrationForm {
	WebDriver driver;

	@BeforeClass
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void f() throws Exception {
		Actions act = new Actions(driver);
	 	
		WebElement ele  =driver.findElement(By.id("firstName"));
		 //actions.keyDown(element,Keys.SHIFT).sendKeys(TextToBeConvertAndSendInUpperCase).keyUp(Keys.SHIFT).perform();
		act.keyDown(ele,Keys.SHIFT).sendKeys("mallika").perform();
		 Thread.sleep(5000);
		 act.sendKeys(Keys.TAB).perform();
		WebElement element  =driver.findElement(By.id("lastName"));
		element.sendKeys("kaka");
		element.clear();
		act.keyDown(element,Keys.SHIFT).sendKeys("kaka").perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id( "userEmail")).sendKeys( "krmn@gmail.com");
		driver.findElement(By.xpath( "//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("userNumber")).sendKeys("990055000");
		Thread.sleep(5000);
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("03 Nov 2021");
		driver.findElement(By.id( "subjectsContainer")).sendKeys("selenium");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("currentAddress")).sendKeys("1335,ygdjhufuie,vhjcjs,cbjff,blr");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).sendKeys("Haryana");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]")).sendKeys("Karnal");
		Thread.sleep(5000);
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(5000);
			// take screenshot of current window
			String screenshotPath = ".\\screenshots\\"; 
			File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(abc, new File(screenshotPath + "TestResults" ));
	 }
		
  }

