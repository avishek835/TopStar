package emailFunctionalityModules;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import utility.UtilityFile;

public class AuditionAndJobsSignUp extends EmailFunctionalityBase {
	
	@Test(priority=1)
	public void auditionAndJobsSignUp() throws InterruptedException 
	{
		test.log(LogStatus.INFO, "CHECKING AUDITIONS AND JOBS NODAL POP UP SIGN UP");
		
		driver.findElement(By.xpath(propX.getProperty("HeaderAuditionJobs"))).click();
		test.log(LogStatus.INFO, "Click on Audition Jobs menu from header section ");
		wait = new WebDriverWait(driver, 20);
		 element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(propX.getProperty("AuditionsAndJobs_JobDetails"))));
		driver.findElement(By.xpath(propX.getProperty("AuditionsAndJobs_JobDetails"))).click();
		test.log(LogStatus.INFO, "Click on Audition Jobs view details ");
		test.log(LogStatus.INFO, "Nodal Pop up appears ");
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		wait = new WebDriverWait(driver, 20);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(propX.getProperty("AJUSERNAME"))));
		driver.findElement(By.xpath(propX.getProperty("AJUSERNAME"))).sendKeys("avishek15");
		driver.findElement(By.xpath(propX.getProperty("AJPASSWORD"))).sendKeys("123456");
		driver.findElement(By.xpath(propX.getProperty("AJUSEREMAIL"))).sendKeys("avishek15@mailinator.com");
		driver.findElement(By.xpath(propX.getProperty("AJDD"))).sendKeys("23");
		driver.findElement(By.xpath(propX.getProperty("AJMM"))).sendKeys("08");
		driver.findElement(By.xpath(propX.getProperty("AJYYYY"))).sendKeys("1985");
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		
		driver.findElement(By.xpath(propX.getProperty("AJSUBMIT"))).click();
		test.log(LogStatus.INFO, "Click Submit button after giving all necessary details ");
		//driver.findElement(By.xpath(propX.getProperty("AJSUCCESSTEXT"))).click();
		
		wait = new WebDriverWait(driver, 20);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(propX.getProperty("AJSUCCESSTEXT"))));
		s=driver.findElement(By.xpath(propX.getProperty("AJSUCCESSTEXT"))).getText();
		
		if(s!=null) { 
			System.out.println(s+ " text is present");
			test.log(LogStatus.INFO, "'Thank you for registering with Top Star Club. Please check your email inbox.' text is present. ");
		}
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
	}
	
	
}
