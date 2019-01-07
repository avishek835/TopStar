package homePage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;





public class HomeRegistration extends HomePageBase{
	
	
	@Test
	public void homePageRegistration() throws InterruptedException
	{
		test.log(LogStatus.INFO, "HOME REGISTRATION");
		test.log(LogStatus.INFO, "Provide the input in all field in home registration");
		
		driver.findElement(By.xpath(propX.getProperty("HOMEUSERNAME"))).sendKeys("avishek0");
		test.log(LogStatus.INFO, "Starting the test");
		driver.findElement(By.xpath(propX.getProperty("HOMEPASSWORD"))).sendKeys("123456");
		
		driver.findElement(By.xpath(propX.getProperty("HOMEUSEREMAIL"))).sendKeys("avishek0@mailinator.com");
		
		driver.findElement(By.xpath(propX.getProperty("HOMEDATE"))).sendKeys("23");
		
		driver.findElement(By.xpath(propX.getProperty("HOMEMONTH"))).sendKeys("08");
		
		driver.findElement(By.xpath(propX.getProperty("HOMEYEAR"))).sendKeys("1985");
		Thread.sleep(2000);
		driver.findElement(By.xpath(propX.getProperty("HOMEREGISTERNOW"))).click();
		test.log(LogStatus.INFO, "Click on Register Now button after provided all details");
		
		WebDriverWait wait = new WebDriverWait(driver, 70);

		// Here we will wait until element is not visible, if element is visible then it will return web element
		// or else it will throw exception
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section[2]/div/div/div/div[2]/h3")));

		// if element found then we will use- In this example I just called isDisplayed method
		boolean status = element.isDisplayed();
		test.log(LogStatus.INFO, "Wait for the successful message");
		// if else condition
		if (status) {
			System.out.println("===== Thank you for registering with Top Star. Please check your email inbox. message is showing");
			test.log(LogStatus.INFO, "Thank you for registering with Top Star. Please check your email inbox. message is showing");
		} else {
			System.out.println("===== Thank you for registering with Top Star. Please check your email inbox. message is not showing");
			test.log(LogStatus.INFO, "Thank you for registering with Top Star. Please check your email inbox. message is not showing");
		}
				
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
		
	}

	
	
}
