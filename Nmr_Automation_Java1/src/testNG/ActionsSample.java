package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionsSample {
	WebDriver driver;

	@BeforeClass
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}

	@Test
	public void f() throws Exception {
		Actions act = new Actions(driver);

		// do righclick on element
		WebElement rgtClick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		act.contextClick(rgtClick).perform();

		act.moveToElement(driver.findElement(By.xpath("//body/ul[1]/li[5]"))).perform();
		driver.findElement(By.xpath("//body/ul[1]/li[5]")).click();

		// alert
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// double click on webelement
		WebElement dblClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		act.doubleClick(dblClick).perform();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// alert
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//Drag and Drop 
		driver.navigate().to("https://demoqa.com/droppable");
		
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));			
		WebElement to = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));

		act.dragAndDrop(from, to).perform();
		
		
		
		//move to element
		driver.navigate().to("https://www.platformqedu.com/");
		
		WebElement productsMenu = driver.findElement(By.xpath("//div[contains(text(),'Products')]"));
		act.moveToElement(productsMenu).perform();
		
		
		//send data to GooglSearch box with shift key hold
		driver.navigate().to("https://www.google.com/");	
		WebElement ele  =driver.findElement(By.name("q"));
		ele.sendKeys("Hi All");		
		ele.clear();
		Thread.sleep(6000);
		//actions.keyDown(element,Keys.SHIFT).sendKeys(TextToBeConvertAndSendInUpperCase).keyUp(Keys.SHIFT).perform();
		act.keyDown(ele,Keys.SHIFT).sendKeys("How r u all?").perform();
	}
}
