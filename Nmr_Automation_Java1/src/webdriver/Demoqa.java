package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/alerts");
//		 maximize the window
		 driver.manage().window().maximize();
		 driver.findElement(By.id("alertButton")).click();
//		  Alert code
//		 Switch to alert, click on ok button use Accept() method
		 driver.switchTo().alert().accept();
		 driver.findElement(By.id("timerAlertButton")).click();
//		  Alert code
//		 Switch to alert, click on ok button use Accept() method
		 Thread.sleep(5000);
		 driver.switchTo().alert().accept();
		 Thread.sleep(5000);
		 driver.findElement(By.id("confirmButton")).click();
//		  Alert code
//		 Switch to alert, click on ok button use Accept() method
		 driver.switchTo().alert().accept();
		 driver.findElement(By.id("promtButton")).click();
//			Get the Alert text
		String  confirmResult = driver.switchTo().alert().getText();
			System.out.println(confirmResult);
//		  Alert code
//		 Switch to alert, click on ok button use Accept() method
		 driver.switchTo().alert().accept();
		 
		 driver.quit();
		 
 
		 
		 
	}

}
