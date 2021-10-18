package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class justrechargeitlogin {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.justrechargeit.com/SignIn.aspx");
//		 maximize the window
		 driver.manage().window().maximize();
//		 Type username & password
		 driver.findElement( By.name( "txtUserName")).sendKeys( "malli@gmail.com");
		 driver.findElement( By.id( "txtPasswd")).sendKeys("Frien123");
//		 click on secure sign in button
		 driver.findElement( By.name( "imgbtnSignin"));
		 
	}

}
