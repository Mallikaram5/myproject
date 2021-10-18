package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.seleniumeasy.com/test/generate-file-to-download-demo.html");
//		 maximize the window
		 driver.manage().window().maximize();
//		 implicit wait : page load wait time
		 driver.manage().timeouts().implicitlyWait( 20,  TimeUnit.SECONDS);
 //		 validate the create button enabled or not
		 if (driver.findElement(By.id("create")).isEnabled()) {
			 System.out.println("element is enabled by default");
			
		} 
		 else {
			System.out.println("element is disabled by deafult");
		}
		 driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
//		 maximize the window
		 driver.manage().window().maximize();
//		 implicit wait : page load wait time
		 driver.manage().timeouts().implicitlyWait( 20,  TimeUnit.SECONDS);
 //		 validate the check boxes  selected or not
		 if (driver.findElement(By.name("account.listOption")).isSelected()) {
			 System.out.println(" Enable MyList check boxe is selected or not?");
		}
		 else {
			System.out.println("Enable MyList is not selected by deafult");
		}
		 if (driver.findElement(By.name("account.bannerOption")).isSelected()) {
			 System.out.println(" Enable MyBanner check boxe is selected or not?");
		}
		 else {
			System.out.println("Enable MyBanner is not selected by deafult");
		}
		 driver.get("https://beta.spicejet.com/");
//		 maximize the window
		 driver.manage().window().maximize();
//		 implicit wait : page load wait time
		 driver.manage().timeouts().implicitlyWait( 20,  TimeUnit.SECONDS);
 //		 validate the Return Date displayed or not
		 if (driver.findElement(By.id( "main-container")).isDisplayed()) {
			 System.out.println("Return Date element is Disabled");
		}
		 else {
			System.out.println("Return Date element is not enabled ");
		}
		 

	}

}
