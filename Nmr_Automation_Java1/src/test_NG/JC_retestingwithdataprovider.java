package test_NG;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class JC_retestingwithdataprovider {
  @Test(dataProvider = "dp")
  public void f(String un,String mobi, String email,String psw) {
  System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.gecko.driver", "./browserdrivers/geckodriver.exe");
//			WebDriver driver = new FirefoxDriver();
			// Edge
//			System.setProperty("webdriver.edge.driver", ".\\browserdrivers\\msedgedriver.exe");
//			driver = new EdgeDriver();
				driver.get("https://www.justrechargeit.com/SignUp.aspx");
				 driver.manage().window().maximize();
			
	  
	  driver.manage().timeouts().implicitlyWait( 20,  TimeUnit.SECONDS);
//		 Type namae mobile email and password
		 driver.findElement( By.name( "signup_name")).sendKeys( un);
		 driver.findElement(By.name("signup_mobileno")).sendKeys(mobi);
		 driver.findElement(By.id("signup_email")).sendKeys(email);
		 driver.findElement( By.id( "signup_password")).sendKeys(psw);
//		 click on create Account in button
		 driver.findElement( By.name( "imgbtnSubmit"));
//		 implicit wait : page load wait time
		 driver.manage().timeouts().implicitlyWait( 20,  TimeUnit.SECONDS);
//			Get the createaccountErrormsg
		String createaccountErrormsg =	driver.findElement(By.id("tdcondition")).getText();
			System.out.println(createaccountErrormsg);
			// click on refresh icon of the web page
			 driver.navigate().refresh();
		 
		 
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	new Object[] {"silcky","9985558912", "silcky123@gmail.com", " 1234" },
    	new Object[] {"pincky","9985558913", "pincky1234@gmail.com", "1235*" },
    	new Object[] {"lucky","9985458914", "lucky12345@gmail.com", "9534" },
    	new Object[] {"smoothy","9985658915", "smoothy1259@gmail.com", "55555"},
    	new Object[] {"ramky","9985533916", "ramky5123@gmail.com", "99999" },
    };
  }
}

