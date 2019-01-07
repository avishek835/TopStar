package headerFooterLinksChecking;



import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;


public class CheckingHeaderLinks extends HeaderFooterBase {
	
	
	
	@Test(priority=1)
	public void checkingHeaderLinks()  {
		test.log(LogStatus.INFO, "CHECKING HEADER LINKS ");
		driver.findElement(By.xpath("//*[@id=\"mnuAboutUs\"]/a")).click();
		test.log(LogStatus.INFO, "Click on About Us menu from header section ");
		
		driver.findElement(By.xpath("//*[@id=\"mnuTalentDirectory\"]/a")).click();
		test.log(LogStatus.INFO, "Click on Talent Directory menu from header section ");
		
		driver.findElement(By.xpath("//*[@id=\"mnuEmployeeList\"]/a")).click();
		test.log(LogStatus.INFO, "Click on Employee List menu from header section ");
		
		driver.findElement(By.xpath("//*[@id=\"mnuAuditionJobs\"]/a")).click();
		test.log(LogStatus.INFO, "Click on Audition Jobs menu from header section ");
		
		driver.findElement(By.xpath("//*[@id=\"mnuContactUs\"]/a")).click();
		test.log(LogStatus.INFO, "Click on Contact Us menu from header section ");
		
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
			
	}

}
