package emailFunctionalityModules;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import utility.UtilityFile;



public class SubscriptionChecking extends EmailFunctionalityBase {
	
	@Test(enabled=true)
	public void subscription() throws InterruptedException
	{
		
		test.log(LogStatus.INFO, "SUBSCRIPTION CHECKING ");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 2000);");
		test.log(LogStatus.INFO, "Scroll to footer ");
		Thread.sleep(500);
		driver.findElement(By.xpath(propX.getProperty("EMAILFIELD"))).sendKeys("avishek4@mailinator.com");
		test.log(LogStatus.INFO, "Provide the emailid in subscription field ");
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		
		driver.findElement(By.xpath(propX.getProperty("SUBSCRIBE"))).click();
		test.log(LogStatus.INFO, "Click on subscription button. ");
		/*Thread.sleep(1000);
		jse.executeScript("scroll(0, 2000);");*/
		
		wait = new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(propX.getProperty("SUCCESSFULMESSAGE"))));
		
		String s=driver.findElement(By.xpath(propX.getProperty("SUCCESSFULMESSAGE"))).getText();
		test.log(LogStatus.INFO, "Wating for successful message ");
		
		if(s!=null) {
			System.out.println("Successful message is present");
			
		}
		test.log(LogStatus.INFO, "Thank you for Subscribing is showing successfully. ");
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
	}

}
