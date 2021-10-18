package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollegeweeksignUp {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://collegeweeklive.com/go-signup/");
//		 maximize the window
		 driver.manage().window().maximize();
//		  Type first Name,lastName,email,phoneNumber,password & confirm password in text box for sign up page
		Thread.sleep(8000);
//		 click on submit button
		 driver.findElement( By.id( "submit")).click();
			Thread.sleep(8000);
//			Get the firstNameError
		String  firstNameErrormsg =	driver.findElement(By.id("firstNameError")).getText();
			System.out.println(firstNameErrormsg);
//			Get the lastNameError
		String lastNameErrormsg =	driver.findElement(By.id("lastNameError")).getText();
			System.out.println(lastNameErrormsg);
//			get the emailAddressError
			String  emailAddressErrormsg = driver.findElement(By.id("emailAddressError")).getText();
			System.out.println(emailAddressErrormsg);
//			get the phoneNumberError
		String phoneNumberErrormsg	= driver.findElement(By.id("phoneNumberError")).getText();
			System.out.println(phoneNumberErrormsg);
//			get the phoneNumberError
			String passwordErrormsg = driver.findElement(By.id("passwordError")).getText();
			System.out.println(passwordErrormsg);
//			get the phoneNumberError
			String ConfirmPasswordErrormsg = driver.findElement(By.id("ConfirmPasswordError")).getText();
			System.out.println(ConfirmPasswordErrormsg);
//			get the phoneNumberError
			String nationalityErrormsg = driver.findElement(By.id("nationalityError")).getText();
			System.out.println(nationalityErrormsg);
//			get the phoneNumberError
			String attendeeTypeErrormsg = driver.findElement(By.id("attendeeTypeError")).getText();
			System.out.println(attendeeTypeErrormsg);
	}

}
