package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustreschargeitForwordBackandRefresh {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.justrechargeit.com/");
//		 maximize the window
		 driver.manage().window().maximize();
Thread.sleep(4000);
// click on justrechargeit button
driver.findElement(By.id("imgbtnMobileRecharge")).click();
//  Get Title(): Automation will get the current title of web page
    String mycurrenttitle=driver.getTitle();
 System.out.println("Before refresh click,the URL is:" +mycurrenttitle);
 Thread.sleep(4000);
// click on refresh icon of the web page
 driver.navigate().refresh();
 Thread.sleep(4000);
// click on sign in Hyperlink
driver.findElement(By.id("jriTop_signin9"));
 Thread.sleep(4000);
// click on Back icon of the web page
 driver.navigate().back();
 Thread.sleep(4000);
// GET CurrentURL(): Automation we get the currentURL of web page
 String mycurrentURL =driver.getCurrentUrl();
 System.out.println("Before forword icon click,the URL is:"+mycurrentURL);
// click on forword icon of the page
 driver.navigate().forward();
 Thread.sleep(4000);
//	get the page titile of the web page
			String jrcurrenttitle = driver.getTitle();
		System.out.println("After forword icon click,the URL title is :"+jrcurrenttitle );
 


	}

}
