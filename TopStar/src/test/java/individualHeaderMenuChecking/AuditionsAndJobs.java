package individualHeaderMenuChecking;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import utility.UtilityFile;



public class AuditionsAndJobs  extends IndividualBase {
	
	
	@Test(priority=1)
	public void employerDetails() throws InterruptedException 
	{
		test.log(LogStatus.INFO, "CHECKING AUDITIONS AND JOBS ");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(propX.getProperty("HeaderAuditionJobs"))).click();
		test.log(LogStatus.INFO, "Click on Audition Jobs menu from header section ");
		Thread.sleep(100);
		driver.findElement(By.xpath(propX.getProperty("AuditionsAndJobs_JobDetails"))).click();
		test.log(LogStatus.INFO, "Click on Audition Jobs view details ");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(propX.getProperty("UserName"))).sendKeys("UL000000005");
		driver.findElement(By.xpath(propX.getProperty("Password"))).sendKeys("TopStar@123");
		test.log(LogStatus.INFO, "Provide the Username and Password in the respective fields ");
		Thread.sleep(1000);
		driver.findElement(By.xpath(propX.getProperty("Login"))).click();
		test.log(LogStatus.INFO, "Click on Login button ");
		
		System.out.println("Hi");
		driver.findElement(By.xpath(propX.getProperty("AuditionsAndJobs_JobDetails"))).click();
		test.log(LogStatus.INFO, "Click on Audition Jobs view details ");
		Thread.sleep(1000);
		System.out.println("Hi1");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250);");
		System.out.println("H2");
		driver.findElement(By.xpath(propX.getProperty("JobDetails_BackButton"))).click();
		test.log(LogStatus.INFO, "Click on close button ");
		Thread.sleep(500);
		
		
		
		s=driver.findElement(By.xpath(propX.getProperty("ApplyJob"))).getText();
		System.out.println(s);
		if(s.equals("ALREADY APPLIED"))
				{
					System.out.println(s);
					test.log(LogStatus.INFO, "Already applied button is showing ");
					UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
					test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
					
				}else if(s.equals("APPLY JOB"))
				{
		driver.findElement(By.xpath(propX.getProperty("ApplyJob"))).click();
		test.log(LogStatus.INFO, "Click on Apply Job button ");
		wait = new WebDriverWait(driver, 20);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"confirmApplyJobModal\"]/div/div/div[3]/button[1]")));
		driver.findElement(By.xpath("//*[@id=\"confirmApplyJobModal\"]/div/div/div[3]/button[1]")).click();
		test.log(LogStatus.INFO, "Click on Confirmation Ok button ");
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		wait = new WebDriverWait(driver, 10);
		 element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"successOrNotModal\"]/div/div/div[3]/button")));
		 
		driver.findElement(By.xpath("//*[@id=\"successOrNotModal\"]/div/div/div[3]/button")).click();
		test.log(LogStatus.INFO, "Click on Close button ");
				}
		
		/*driver.findElement(By.xpath("//*[@id=\"confirmApplyJobModal\"]/div/div/div[3]/button[1]")).click();
		wait = new WebDriverWait(driver, 10);*/
		/* element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"waitModal\\\"]/div/div/div[3]/button")));
		driver.findElement(By.xpath("//*[@id=\"waitModal\"]/div/div/div[3]/button")).click();*/
		/*System.out.println("Hi4");*/
		/*driver.findElement(By.xpath(propX.getProperty("ApplyJob"))).click();
		test.log(LogStatus.INFO, "Click on Apply Job button ");
		Thread.sleep(2000);*/
		//if not applied
		//driver.findElement(By.xpath("//*[@id=\"successOrNotModal\"]/div/div/div[3]/button")).click();
		//if applied
		/*driver.findElement(By.xpath(propX.getProperty("ClosebuttonifApplied"))).click();
		test.log(LogStatus.INFO, "Click on close button if already job applied ");
		Thread.sleep(2000);*/
		
		driver.findElement(By.xpath(propX.getProperty("DropDownForSignOut"))).click();
		test.log(LogStatus.INFO, "Open drop down from top of the menu for signing out ");
		Thread.sleep(1000);
		driver.findElement(By.xpath(propX.getProperty("SignOut"))).click();
		test.log(LogStatus.INFO, "Click on Sign Out button ");
		
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
		
	}
	
}
