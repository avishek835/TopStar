package individualHeaderMenuChecking;



import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;


public class TalentDirectory extends IndividualBase{
	
	
	@Test
	public void talentdirectory() throws InterruptedException {
		
		test.log(LogStatus.INFO, "CHECK THE TALENT DIRECTORY ");
		driver.findElement(By.xpath(propX.getProperty("HeaderTalentDirectory"))).click();
		test.log(LogStatus.INFO, "Click on Talent Directory menu from header section ");
		driver.findElement(By.xpath(propX.getProperty("TDDIRECTOR"))).click();
		test.log(LogStatus.INFO, "Click on Talent Directory categories menu Director. ");
		driver.findElement(By.xpath(propX.getProperty("TDCINEMATOGRAPHER"))).click();
		test.log(LogStatus.INFO, "Click on Talent Directory categories menu Cinematographer. ");
		driver.findElement(By.xpath(propX.getProperty("TDPRODUCER"))).click();
		test.log(LogStatus.INFO, "Click on Talent Directory categories menu Producer. ");
		driver.findElement(By.xpath(propX.getProperty("TDACTOR"))).click();
		test.log(LogStatus.INFO, "Click on Talent Directory categories menu Actor. ");
		driver.findElement(By.xpath(propX.getProperty("TDMUSICIAN"))).click();
		test.log(LogStatus.INFO, "Click on Talent Directory categories menu Musician. ");
		driver.findElement(By.xpath(propX.getProperty("TDPHOTOGRAPHER"))).click();
		test.log(LogStatus.INFO, "Click on Talent Directory categories menu Photographer. ");
		driver.findElement(By.xpath(propX.getProperty("TDAll"))).click();
		test.log(LogStatus.INFO, "Click on Talent Directory categories menu All. ");
		driver.findElement(By.xpath(propX.getProperty("NANTHAIMAGE"))).click();
		test.log(LogStatus.INFO, "Click on first image from All menu categories. ");
		Thread.sleep(3000);
		driver.findElement(By.xpath(propX.getProperty("DETAILSLOGINREGISTER"))).click();
		test.log(LogStatus.INFO, "1st Image details page is appearing and click on Login/ Register hyperlink. ");
		Thread.sleep(3000);
		driver.findElement(By.xpath(propX.getProperty("UserName"))).sendKeys("UL000000005");
		driver.findElement(By.xpath(propX.getProperty("Password"))).sendKeys("TopStar@123");
		test.log(LogStatus.INFO, "Login pop up appears. ");
		test.log(LogStatus.INFO, "Provide the Username and Password in the respective fields ");
		Thread.sleep(3000);
		driver.findElement(By.xpath(propX.getProperty("Login"))).click();
		test.log(LogStatus.INFO, "Click on Login Button. ");
		Thread.sleep(5000);
		String s=driver.findElement(By.xpath(propX.getProperty("CONTACT_NUMBER"))).getText();
		test.log(LogStatus.INFO, "Checking whether the Contact number is present. ");
		
		if(s.equals("0044 7949395729")) {
		System.out.println("Contact Number is present");
		test.log(LogStatus.INFO, "If present then this message will appear. ");
	}
	
	
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
	}
	
	
}
