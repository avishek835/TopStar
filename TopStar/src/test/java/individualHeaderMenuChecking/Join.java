package individualHeaderMenuChecking;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class Join extends IndividualBase{
	
	@Test
	
	public void join()
	{
		
					
			test.log(LogStatus.INFO,"JOIN FREE CATEGORY SELECTION ");
			driver.findElement(By.xpath(propX.getProperty("JOINFREE"))).click();
			test.log(LogStatus.INFO,"Click on Join Free Button");
			wait = new WebDriverWait(driver, 50);
			element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(propX.getProperty("FINDWORKPOPUP"))));
			driver.findElement(By.xpath(propX.getProperty("FINDWORKPOPUP"))).click();
			test.log(LogStatus.INFO,"Click on Find work button from pop up");
			test.log(LogStatus.INFO,"Click one by one category and refresh the page for 5 times");	
			for(int i=0; i<=5; i++) {
				
					System.out.println(i);
					
			driver.findElement(By.xpath(propX.getProperty("SIGNUPDIRECTORCATEGORY"))).click();
			test.log(LogStatus.INFO,"Click on Category");	
			driver.findElement(By.xpath(propX.getProperty("SIGNUPCINEMATOGRAPHER"))).click();
			test.log(LogStatus.INFO,"Click on Cinematographer");
			driver.findElement(By.xpath(propX.getProperty("SIGNUPPRODUCER"))).click();
			test.log(LogStatus.INFO,"Click on Producer");
			driver.findElement(By.xpath(propX.getProperty("SIGNUPACTOR"))).click();
			test.log(LogStatus.INFO,"Click on Actor");
			driver.findElement(By.xpath(propX.getProperty("SIGNUPMUSICIAN"))).click();
			test.log(LogStatus.INFO,"Click on Musician");
			driver.findElement(By.xpath(propX.getProperty("SIGNUPPHOTOGRAPHER"))).click();
			test.log(LogStatus.INFO,"Click on Photographer");
			
			driver.navigate().refresh();
			test.log(LogStatus.INFO,"Refresh the page");
			
			}
			
	
			test.log(LogStatus.PASS, "Test Pass");
			rep.endTest(test);
			rep.flush();
	}
}
