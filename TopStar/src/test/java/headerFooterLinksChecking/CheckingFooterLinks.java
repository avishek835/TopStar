package headerFooterLinksChecking;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;


public class CheckingFooterLinks extends HeaderFooterBase{
	
	
	@Test()
	//(priority=1)
	public void checkingFooterLinks() 
		{
		test.log(LogStatus.INFO, "CHECKING FOOTER LINKS");
		driver.findElement(By.xpath(propX.getProperty("AboutUs"))).click();
		test.log(LogStatus.INFO, "Click on About Us menu from footer");
		driver.findElement(By.xpath(propX.getProperty("TalentDirectory"))).click();
		test.log(LogStatus.INFO, "Click on Talent Directory menu from footer");
		driver.findElement(By.xpath(propX.getProperty("Employers"))).click();
		test.log(LogStatus.INFO, "Click on Employers menu from footer");
		driver.findElement(By.xpath(propX.getProperty("AuditionJobs"))).click();
		test.log(LogStatus.INFO, "Click on Auditions Jobs menu from footer");
		driver.findElement(By.xpath(propX.getProperty("ContactUs"))).click();
		test.log(LogStatus.INFO, "Click on Contact Us menu from footer");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();

		}
					
}
	
