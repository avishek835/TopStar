package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import utility.UtilityFile;

public class HomeRecenetPost extends HomePageBase{
	
	@Test
	public void homeRecenetPost() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2100)", "");
		
		wait = new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(propX.getProperty("HOMEVIEWALL"))));
		driver.findElement(By.xpath(propX.getProperty("HOMEVIEWALL"))).click();
		test.log(LogStatus.INFO, "Click on view all button to see the list page. ");
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		
		driver.findElement(By.xpath(propX.getProperty("ALLPOSTEDJOBSDETAILS"))).click();
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		test.log(LogStatus.INFO, "Click on view all button to see the details page. ");
		
		s=driver.findElement(By.xpath(propX.getProperty("JOBCATEGORY"))).getText();
		if(s!=null) 
		{ 
			System.out.println(s+ " text is present");
			test.log(LogStatus.INFO, "'Job Category: Actor' text is present. ");
		}
		
		s=driver.findElement(By.xpath(propX.getProperty("DETAILSTEXT"))).getText();
		if(s!=null) 
		{ 
			System.out.println(s+ " text is present");
			test.log(LogStatus.INFO, "Details Of A Posted Job is present. ");
		}
			
		s=driver.findElement(By.xpath(propX.getProperty("MAIL_ID"))).getText();
			//test.log(LogStatus.INFO, "Checking whether the Contact number is present. ");
			if(s.equals("biplab_goswami@mailinator.com")) 
			{
			System.out.println("biplab_goswami@mailinator.com mail is present");
			test.log(LogStatus.INFO, "biplab_goswami@mailinator.com mail is present ");
		
			}
			
			s=driver.findElement(By.xpath(propX.getProperty("PHONENO."))).getText();
			//test.log(LogStatus.INFO, "Checking whether the Contact number is present. ");
			if(s.equals("0790059079")) 
			{
			System.out.println("0790059079 phone number is present");
			test.log(LogStatus.INFO, "0790059079 phone number is present ");
		
			}
			
		
		driver.findElement(By.xpath(propX.getProperty("VIEWALLBACK"))).click();
		test.log(LogStatus.INFO, "'Click on back back button to come back on list page. ");
		driver.findElement(By.xpath(propX.getProperty("LOGO"))).click();
		test.log(LogStatus.INFO, "'Click on logo to return back to home page. ");
		
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
		
	}
}
