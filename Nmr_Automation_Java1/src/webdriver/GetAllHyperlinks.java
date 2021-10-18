package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllHyperlinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/login");
//		maximize the window
		 driver.manage().window().maximize();	 
     List<WebElement>allhyperlinks = driver.findElements(By.tagName("a") );
     System.out.println(allhyperlinks.size());
     
	}

}
