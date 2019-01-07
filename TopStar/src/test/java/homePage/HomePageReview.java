package homePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class HomePageReview extends HomePageBase{
	
	@Test
	
	public void homepagereview()
	{
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "HOME PAGE REVIEW SECTION");
		test.log(LogStatus.INFO, "Scroll down the cursor to view the services view all button");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1500)", "");
		test.log(LogStatus.INFO, "Click on write a review button. ");
		driver.findElement(By.xpath(propX.getProperty("WRITEREVIEWBUTTON"))).click();
		test.log(LogStatus.INFO, "Provide id and password in respective fields. ");
		driver.findElement(By.xpath(propX.getProperty("USERID"))).sendKeys(propX.getProperty("USERNAME"));
		driver.findElement(By.xpath(propX.getProperty("USERPASSWORD"))).sendKeys(propX.getProperty("PASSWORD"));
		test.log(LogStatus.INFO, "Provided UserId and Password. ");
		driver.findElement(By.xpath(propX.getProperty("LOGINBUTTON"))).click();
		test.log(LogStatus.INFO, "Clicked on login button. ");
		driver.findElement(By.id(propX.getProperty("WRITEAREVIEW"))).sendKeys("15th review.");
		test.log(LogStatus.INFO, "Input the text in write a review button. ");
		driver.findElement(By.id("BlogStar4")).click();
		test.log(LogStatus.INFO, "Provided 5 star ratings. ");
		driver.findElement(By.id("btnSubmit")).click();
		test.log(LogStatus.INFO, "Click on submit button. ");
		wait = new WebDriverWait(driver, 100);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(propX.getProperty("REVIEWSUMITPOPOVERCLOSE"))));
		element.click();
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
		
	}

}
