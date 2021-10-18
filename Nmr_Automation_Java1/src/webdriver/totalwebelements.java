package webdriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class totalwebelements {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://collegeweeklive.com/go-signup/");
//		 maximize the window
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
//		 Get all checkboxs count
		List<WebElement> checkboxscount = driver.findElements(By.xpath("//input[@type='checkbox' ]"));
		 int checkcount =checkboxscount.size();
		System.out.println("checkboxscount is:" +checkcount );
//		Get all edit text boxes
		Thread.sleep(5000);
		 List<WebElement> editboxes=driver.findElements(By.xpath("//input[@type='text' ]"));
		 int editcount =editboxes.size();
		 System.out.println("editboxes is :" +editcount);
//			Get all dropdowncount
			Thread.sleep(5000);
			 List<WebElement> dropdownboxes=driver.findElements(By.xpath("//select"));
			 int dropdowncount =dropdownboxes.size();
			 System.out.println("dropdowncount is :" +dropdowncount);
//				Get all passwordboxcount
				Thread.sleep(5000);
				 List<WebElement> passwordboxes=driver.findElements(By.xpath("//input[@type='password' ]"));
				 int passwordboxcount =passwordboxes.size();
				 System.out.println("passwordboxcount is :" +passwordboxcount);
//					Get all hiddenboxcount
					Thread.sleep(5000);
					 List<WebElement> hiddenboxes=driver.findElements(By.xpath("//input[@type='hidden' ]"));
					 int hiddenboxcount =hiddenboxes.size();
					 System.out.println("hiddenboxcount is :" +hiddenboxcount);
//						Get all hyperlinkscount
						Thread.sleep(5000);
						 List<WebElement> hyperlinks=driver.findElements(By.xpath("//a"));
						 int hyperlinkscount =hyperlinks.size();
						 System.out.println("hyperlinkscount is :" +hyperlinkscount);
//							Get all buttonboxcount
							Thread.sleep(5000);
							 List<WebElement> buttonboxs=driver.findElements(By.xpath("//button[@type='submit']"));
							 int buttonboxcount =buttonboxs.size();
							 System.out.println("buttonboxcount is :" +buttonboxcount);
 
// Get totalwebelementscount
int totalWebElementscount = checkcount+editcount+dropdowncount+passwordboxcount+hiddenboxcount+hyperlinkscount+buttonboxcount;
		System.out.println("totalWebElementscount is:" +totalWebElementscount); 
						
		
		
		 
}
}
