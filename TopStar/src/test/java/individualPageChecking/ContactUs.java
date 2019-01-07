package individualPageChecking;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import utility.UtilityFile;

public class ContactUs extends individualBase{
	
	@Test
	public void contactUs()
	{
		
		test.log(LogStatus.INFO, "CONTACT US PAGE BODY CONTENT CHECKING? IDENTIFYING ");
		driver.findElement(By.xpath(propX.getProperty("HeaderContactUs"))).click();
		s=driver.findElement(By.xpath(propX.getProperty("contactustext"))).getText();
		System.out.println(s+ " text is present");
		
		
		s=driver.findElement(By.xpath(propX.getProperty("CULocationtext"))).getText();
		System.out.println(s+ "Location name is present");
		
		s=driver.findElement(By.xpath(propX.getProperty("CUcontactno"))).getText();
		System.out.println(s+ "Contact number is present");
		
		s=driver.findElement(By.xpath(propX.getProperty("CUmailid"))).getText();
		System.out.println(s+ "Mail id is present");
		
		
		
		s=driver.findElement(By.xpath(propX.getProperty("CUName"))).getAttribute("placeholder");
		System.out.println(s+ " placeholder is present");
		
		s=driver.findElement(By.xpath(propX.getProperty("CUEmail"))).getAttribute("placeholder");
		System.out.println(s+ " placeholder is present");
		
		s=driver.findElement(By.xpath(propX.getProperty("CUMobile"))).getAttribute("placeholder");
		System.out.println(s+ " placeholder is present");
		
		/*s=driver.findElement(By.xpath(propX.getProperty("CUMessage"))).getAttribute("placeholder");
		System.out.println(s+ " placeholder is present");*/
		
		try {
			s=driver.findElement(By.xpath(propX.getProperty("CUMessage"))).getAttribute("placeholder");
			System.out.println(s+ " placeholder is present");
		} catch(NoSuchElementException  e) {
		   // throw new AssertionError("A clear description of the failure", e);
			e.printStackTrace();
			System.out.println("A clear description of the failure");
		}
		
		//Calling take screenshot method from util class
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		//Attaching Screenshot into Extent Report
		test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
			
			test.log(LogStatus.PASS, "Test Pass");
			rep.endTest(test);
			rep.flush();
	}

}
