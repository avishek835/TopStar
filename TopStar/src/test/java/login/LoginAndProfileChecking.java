package login;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import utility.UtilityFile;


public class LoginAndProfileChecking extends LoginBase{

		
	@Test()
	public void loginAndProfileChecking() throws InterruptedException
	{
		
		test.log(LogStatus.INFO, "LOGIN AND PROFILE CHECKING ");
		driver.findElement(By.xpath(propX.getProperty("HEADERLOGINBUTTON"))).click();
		test.log(LogStatus.INFO, "Click on Login button from header part ");
		driver.findElement(By.xpath(propX.getProperty("USERID"))).sendKeys(propX.getProperty("USERNAME"));
		driver.findElement(By.xpath(propX.getProperty("USERPASSWORD"))).sendKeys(propX.getProperty("PASSWORD"));
		test.log(LogStatus.INFO, "Provide UserId and Password. ");
		driver.findElement(By.xpath(propX.getProperty("LOGINBUTTON"))).click();
		test.log(LogStatus.INFO, "Click on Login button ");
		
		wait = new WebDriverWait(driver, 20);
		 element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(propX.getProperty("DropDownForSignOut"))));
		
		driver.findElement(By.xpath(propX.getProperty("DropDownForSignOut"))).click();
		test.log(LogStatus.INFO, "Click on drop down for selecting Profile ");
		driver.findElement(By.xpath(propX.getProperty("PROFILEBUTTONFROMDROPDOWN"))).click();
		test.log(LogStatus.INFO, "Click on My Profile button ");
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
			/*wait = new WebDriverWait(driver, 20);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(propX.getProperty("PROFILEPAGECHECKID"))));*/
		wait = new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(propX.getProperty("PROFILEPAGECHECKID"))));
			s=driver.findElement(By.id(propX.getProperty("PROFILEPAGECHECKID"))).getAttribute("value");
		
		if(s!=null) { 
			System.out.println("taylor_swift@mailinator.com mail id is " +s+ "present.");
			test.log(LogStatus.INFO, "taylor_swift@mailinator.com mail id 'UL000000005' is present. ");
		}
		
		s=driver.findElement(By.id(propX.getProperty("PROFILETEXTNAME"))).getAttribute("value");
		
		if(s!=null) { 
			System.out.println("Profile name is " +s);
			test.log(LogStatus.INFO, "Profile name 'Taylor Swift' is present. ");
		}
		
	 s=driver.findElement(By.id(propX.getProperty("PROFILETEXTNAME"))).getAttribute("value");
	 if(s!=null)
	 {
		 System.out.println(s+" Name is present");
	 }
	 driver.findElement(By.id(propX.getProperty("PROFILETEXTNAME"))).sendKeys("TS");
	 System.out.println("TS has been added");
		
	 UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
	test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		s=driver.findElement(By.id(propX.getProperty("CONTACTNUMBER"))).getAttribute("value");
		
		if(s!=null) { 
			System.out.println("Contact number is " + s);
			test.log(LogStatus.INFO, "Contact number '2584568523' is present. ");
		}
		
		s=driver.findElement(By.xpath(propX.getProperty("ABOUTMETEXT"))).getText();
		
		if(s!=null) { 
			System.out.println(s+ " text is present");
			test.log(LogStatus.INFO, "'ABOUT ME' text is present. ");
		}
		
		s=driver.findElement(By.id(propX.getProperty("ABOUTMEVALUE"))).getAttribute("value");
		
		if(s!=null) { 
			System.out.println("About me text is" +s+ "present.");
			test.log(LogStatus.INFO, "About me text 'I am currently singing in my Video Album...' is present. ");
		}
		
		s=driver.findElement(By.xpath(propX.getProperty("PHYSICALDETAILS"))).getText();
		
		if(s!=null) { 
			System.out.println("PHYSICAL DETAILS text  is" +s+ " is present." );
			test.log(LogStatus.INFO, "PHYSICAL DETAILS text  is present. ");
		}
		
		s=driver.findElement(By.id(propX.getProperty("PHYSICALDETAILSVALUE"))).getAttribute("value");
		
		if(s!=null) { 
			System.out.println("Physical Details value " +s+ " is present");
			test.log(LogStatus.INFO, "Physical Details value 'I am a fair lady with golden hair...' is present. ");
		}
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		s=driver.getTitle();
		if(s!=null)
			{
				System.out.println("Title of the page is: " +s);
				test.log(LogStatus.INFO, "Title of the psge 'Top Star Club' is present. ");
			}
		
		s=driver.getCurrentUrl();
		if(s!=null)
		{
			System.out.println("Current URL of the page is: " +s);
			test.log(LogStatus.INFO, "Current URL of the page is 'http://103.94.84.74:7085/TalentDetailsNew/' is present. ");
		}
		
		//s = driver.getCurrentUrl();
		//Assert.assertEquals(s, "http://103.94.84.74:7085/TalentDetailsNew/" );
		
		//String ns = "http://103.94.84.74:7085/TalentDetailsNew/";
		System.out.println( s);
		if(s.equals("http://103.94.84.74:7085/TalentDetailsNew/"))
		{
			System.out.println("Matching");
		} else {
			System.out.println("Not Matching");
		}
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1900);");
		//driver.navigate().refresh();
				
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
	}
	
	

}

