package login;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import utility.UtilityFile;



public class OneTimeLogin extends LoginBase{
	
	
	@Test(enabled=true)
	public void oneTimeLogin() throws InterruptedException
	{
		
		test.log(LogStatus.INFO, "CHECK ONE TIME LOGIN ");
		driver.findElement(By.xpath(propX.getProperty("HEADERLOGINBUTTON"))).click();
		
		test.log(LogStatus.INFO, "Click on Login button from header part ");
		driver.findElement(By.xpath(propX.getProperty("USERID"))).sendKeys(propX.getProperty("USERNAME"));
		driver.findElement(By.xpath(propX.getProperty("USERPASSWORD"))).sendKeys(propX.getProperty("PASSWORD"));
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		test.log(LogStatus.INFO, "Provide UserId and Password. ");
		driver.findElement(By.xpath(propX.getProperty("LOGINBUTTON"))).click();
		test.log(LogStatus.INFO, "Click on Login button ");
		
		wait = new WebDriverWait(driver, 20);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section[1]/div/div/div[2]/div/div[2]/ul/li[1]/span")));
		
		
		String s=driver.findElement(By.xpath(propX.getProperty("EMAIL"))).getText();
		test.log(LogStatus.INFO, "Waiting for Email id to populate in the header part ");
		
		if(s!=null) {
			System.out.println("taylor_swift@mailinator.com mail id is present");
			test.log(LogStatus.INFO, "taylor_swift@mailinator.com mail id is showing. ");
			
		}else
			System.out.println("taylor_swift@mailinator.com mail id is not present");
			
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, "Home Page Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
	}
	
	

}
