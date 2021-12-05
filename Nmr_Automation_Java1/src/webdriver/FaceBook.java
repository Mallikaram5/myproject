package webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FaceBook {
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		 
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
//		maximize the window
		driver.manage().window();
//		type user name and password
		driver.findElement(By.name( "email")).sendKeys( "malli@gmail.com");
		driver.findElement(By.name( "pass")).sendKeys( "afsdfhsd5");
//		click on login button
		driver.findElement( By.name( "login")).click();
//		 Screenshot path
		
		String screenshortpath = ".\\screenshorts\\";
//		FileInputStream fi = new FileInputStream(screenshortpath);
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("YYYY_MMM_DD_HH_MM_SS");
		String Timestamp = df.format(d);
//		Take a screen short 
		File srcfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
//		and move to any folder
		
		
		FileHandler.copy(srcfile, new File(screenshortpath + "Testing"+Timestamp+".PNG"));
		
		driver.quit();
		
	}

}
