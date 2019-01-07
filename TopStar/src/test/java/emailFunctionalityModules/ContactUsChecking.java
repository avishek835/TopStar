package emailFunctionalityModules;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import utility.UtilityFile;


public class ContactUsChecking extends EmailFunctionalityBase {
	
	
	@Test(enabled=false, description= "Checking the functionality of Contact Us" )
	public void contactUs() throws InterruptedException
	{
		test=rep.startTest("CONTACT US CHECKING");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "CONTACT US FUNCTIONALITY ");
		driver.findElement(By.xpath(propX.getProperty("HEADERLOGINBUTTON"))).click();
		test.log(LogStatus.INFO, "Click in header login button ");
		driver.findElement(By.xpath(propX.getProperty("USERID"))).sendKeys("UL000000014");
		driver.findElement(By.xpath(propX.getProperty("USERPASSWORD"))).sendKeys("TopStar@123");
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath(propX.getProperty("LOGINBUTTON"))).click();
		System.out.println("H1");
		test.log(LogStatus.INFO, "Provide UserId and Password and click in Login Button. ");
		wait = new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(propX.getProperty("HeaderContactUs"))));
		
		driver.findElement(By.xpath(propX.getProperty("HeaderContactUs"))).click();
		System.out.println("H2");
		test.log(LogStatus.INFO, "Click on Contact Us menu from header section ");
		driver.findElement(By.xpath(propX.getProperty("ContactUsName"))).sendKeys("Avishek");
		driver.findElement(By.xpath(propX.getProperty("ContactUsEmail"))).sendKeys("avishek5@mailinator.com");
		driver.findElement(By.xpath(propX.getProperty("ConatctUsMobileNumber"))).sendKeys("1234567890");
		driver.findElement(By.xpath(propX.getProperty("ConatctUsMessageBox"))).sendKeys("This is a test message");
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		driver.findElement(By.xpath(propX.getProperty("ContactUsSubmit"))).click();
		System.out.println("H3");
		test.log(LogStatus.INFO, "Provide all the values in the field and click on Submit button ");
		
		
		String s=driver.findElement(By.xpath(propX.getProperty("THANKYOUMESSAGE"))).getText();
		
		test.log(LogStatus.INFO, "Waiting for Thank You Message ");
		if(s.equals("Thank you for contacting with us.")) {
			System.out.println("Thank you for contacting with us. text is present");
			test.log(LogStatus.INFO, "Thank you for contacting with us. text is present ");
		}
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		Thread.sleep(5000);
		
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
	}
	
	@Test
	public void ContactUS()
	{
		test=rep.startTest("CONTACT US PAGE TITLE CHECKING");
		for(int i=0;i<5;i++)
		{
		driver.findElement(By.xpath(propX.getProperty("HeaderContactUs"))).click();
		test.log(LogStatus.PASS, "Click on Contact Us menu from header section ");
		String actualTitle = "Top Star Club - Contact Us";
		s=driver.getTitle();
		System.out.println(s);
		if(s.equals(actualTitle) ) {
			System.out.println("matched");
			test.log(LogStatus.PASS, "Matched ");
		}else
		{
			System.out.println("Not matched");
			test.log(LogStatus.FAIL, "Not Matched ");
		}
		}
		
		// Assert.assertEquals(driver.getTitle(), actualTitle);
		
		 test.log(LogStatus.PASS, "Test PASS");
			rep.endTest(test);
			rep.flush();	
	}
		
}
