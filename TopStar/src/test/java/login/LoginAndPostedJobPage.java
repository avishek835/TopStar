package login;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class LoginAndPostedJobPage extends LoginBase
{
	
	@Test()
	public void Login() throws InterruptedException
	{
		
		test.log(LogStatus.INFO, "LOGIN AND POSTED JOB PAGE CHECKING ");
		driver.findElement(By.xpath(propX.getProperty("HEADERLOGINBUTTON"))).click();
		test.log(LogStatus.INFO, "Click on Login button from header part ");
		driver.findElement(By.xpath(propX.getProperty("USERID"))).sendKeys(propX.getProperty("USERNAME"));
		driver.findElement(By.xpath(propX.getProperty("USERPASSWORD"))).sendKeys(propX.getProperty("PASSWORD"));
		test.log(LogStatus.INFO, "Provide UserId and Password. ");
		driver.findElement(By.xpath(propX.getProperty("LOGINBUTTON"))).click();
		test.log(LogStatus.INFO, "Click on Login button ");
		wait = new WebDriverWait(driver, 100);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(propX.getProperty("DropDownForSignOut"))));
		element.click();
		test.log(LogStatus.INFO, "Click on drop down to check the posted job link ");
		//driver.findElement(By.xpath(propX.getProperty(""))).click();
		driver.findElement(By.id("PostedJobs")).click();
		test.log(LogStatus.INFO, "Click on Posted Job Link ");
		driver.findElement(By.xpath("//*[@id=\"jobList\"]/div[1]/div[2]/div[3]/a")).click();
		test.log(LogStatus.INFO, "Click on View all applied jobs ");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div/a")).click();
		test.log(LogStatus.INFO, "Click on back button from View all applied jobs ");
		
		test.log(LogStatus.INFO, "Click on view posted job link page. ");
		driver.findElement(By.xpath("//*[@id=\"jobList\"]/div[1]/div[2]/div[3]/a[2]")).click();
		
		driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/a")).click();
		test.log(LogStatus.INFO, "Click on back button from posted job link page. ");
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
	}
}
