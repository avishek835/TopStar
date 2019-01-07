package emailFunctionalityModules;



import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import utility.UtilityFile;




public class ChangePasswordChecking extends EmailFunctionalityBase{
	
	
	
	
	@Test(enabled=true)
	public void changePassword() throws InterruptedException
	{
		
		test.log(LogStatus.INFO, "CHANGE PASSWORD.");
		driver.findElement(By.xpath(propX.getProperty("HEADERLOGINBUTTON"))).click();
		test.log(LogStatus.INFO, "Click on header login button.");
		driver.findElement(By.xpath(propX.getProperty("USERID"))).sendKeys("UL000000005");
		driver.findElement(By.xpath(propX.getProperty("USERPASSWORD"))).sendKeys("TopStar@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath(propX.getProperty("LOGINBUTTON"))).click();
		test.log(LogStatus.INFO, "Provide the userid and password and click on Login Button.");
		Thread.sleep(3000);
		driver.findElement(By.xpath(propX.getProperty("HEADERACCOUNTICON"))).click();
		driver.findElement(By.xpath(propX.getProperty("ACCOUNTSETTINGS"))).click();
		test.log(LogStatus.INFO, "Click on Account settings button from drop down for changing password.");
		driver.findElement(By.xpath(propX.getProperty("OLDPASSWORD"))).sendKeys("TopStar@123");
		driver.findElement(By.xpath(propX.getProperty("NEWPASSWORD"))).sendKeys("TopStar@123");
		driver.findElement(By.xpath(propX.getProperty("CONFIRMPASSWORD"))).sendKeys("TopStar@123");
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(propX.getProperty("SAVE"))).click();
		test.log(LogStatus.INFO, "Provide old password, new and confirm password");
		String s=driver.findElement(By.xpath(propX.getProperty("CHANGEPASSWORDSUCCESSFULMESSAGE"))).getText();
		test.log(LogStatus.INFO,"Wait for Change Password successful message from the system .");
		
		if(s.equals("Your password has been successfully changed."))
		{
			System.out.println("Your password has been successfully changed.");
			test.log(LogStatus.INFO,"Your password has been successfully changed.");
		}
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		Thread.sleep(500);
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
	}
	

}
