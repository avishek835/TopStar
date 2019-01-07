package homePage;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;



public class HomeServices extends HomePageBase{

	
	
	@Test
	
	public void homeservices() throws InterruptedException
	{
		test.log(LogStatus.INFO, "HOME PAGE SERVICES SECTION");
		test.log(LogStatus.INFO, "Scroll down the cursor to view the services view all button");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,995)", "");
		
		driver.findElement(By.xpath(propX.getProperty("SERVICESVIEWALL"))).click();
		test.log(LogStatus.INFO, "clicked on services view all button");
		driver.findElement(By.xpath(propX.getProperty("SERVICESFIRSTIMAGE"))).click();
		test.log(LogStatus.INFO, "clicked on services first image");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(propX.getProperty("SERVICESDETAILSBACKBUTTON"))).click();
		test.log(LogStatus.INFO, "clicked on services details of 1st image back button");
		driver.findElement(By.xpath(propX.getProperty("SERVICESSECONDIMAGE"))).click();
		test.log(LogStatus.INFO, "clicked on services second image");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(propX.getProperty("SERVICESDETAILSBACKBUTTON"))).click();
		test.log(LogStatus.INFO, "clicked on services details of 2nd image back button");
		driver.findElement(By.xpath(propX.getProperty("SERVICESTHIRDIMAGE"))).click();
		test.log(LogStatus.INFO, "clicked on services third image");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(propX.getProperty("SERVICESDETAILSBACKBUTTON"))).click();
		test.log(LogStatus.INFO, "clicked on services details of third image back button");
		driver.findElement(By.xpath(propX.getProperty("SERVICESFOURTHIMAGE"))).click();
		test.log(LogStatus.INFO, "clicked on services fourth image");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(propX.getProperty("SERVICESDETAILSBACKBUTTON"))).click();
		test.log(LogStatus.INFO, "clicked on services details of fouth image back button");
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
		
	}
	
	
}
