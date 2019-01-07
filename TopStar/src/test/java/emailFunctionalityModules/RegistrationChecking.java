package emailFunctionalityModules;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import utility.UtilityFile;



public class RegistrationChecking extends EmailFunctionalityBase {
	
	@Test(enabled=true)
	public void Registration() throws InterruptedException
	{
				
		test.log(LogStatus.INFO,"JOIN FREE REGISTRATION ");
		driver.findElement(By.xpath(propX.getProperty("JOINFREE"))).click();
		test.log(LogStatus.INFO,"Click on Join Free Button");
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		wait = new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(propX.getProperty("FINDWORKPOPUP"))));
		driver.findElement(By.xpath(propX.getProperty("FINDWORKPOPUP"))).click();
		test.log(LogStatus.INFO,"Click on Find work button from pop up");
		driver.findElement(By.xpath(propX.getProperty("SIGNUPDIRECTORCATEGORY"))).click();
		
		
		test.log(LogStatus.INFO,"Click on Director category from category selection.");
		driver.findElement(By.xpath(propX.getProperty("SIGNUPUSERNAME"))).sendKeys("avishek2");
		driver.findElement(By.xpath(propX.getProperty("SIGNUPPASSWORD"))).sendKeys("123456");
		driver.findElement(By.xpath(propX.getProperty("SIGNUPUSEREMAIL"))).sendKeys("avishek2@mailinator.com");
		driver.findElement(By.xpath(propX.getProperty("SIGNUPDD"))).sendKeys("23");
		driver.findElement(By.xpath(propX.getProperty("SIGNUPMM"))).sendKeys("08");
		driver.findElement(By.xpath(propX.getProperty("SIGNUPYYYY"))).sendKeys("1985");
		test.log(LogStatus.INFO,"Provide UserID, EmailId,Date,Month,Year.");
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		driver.findElement(By.xpath(propX.getProperty("SIGNUPSUBMIT"))).click();
		test.log(LogStatus.INFO,"Click on submit button.");
		wait = new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(propX.getProperty("REGISTRATIONSUCCESSFULMESSAGE"))));
		String s=driver.findElement(By.xpath(propX.getProperty("REGISTRATIONSUCCESSFULMESSAGE"))).getText();
		test.log(LogStatus.INFO,"Wait for registration successful message from the system .");
		
		if(s.equals("Thank you for registering with Top Star Club. Please check your email inbox."))
		{
			System.out.println("Thank you for registering with Top Star Club is present");
			test.log(LogStatus.INFO,"Thank you for registering with Top Star Club message is present.");
		}
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		Thread.sleep(500);
		
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
	}
	
	
}
