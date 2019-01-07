package emailFunctionalityModules;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import utility.UtilityFile;



public class PostAJob extends EmailFunctionalityBase {
	
	@Test(enabled=true)
	public void postAJob() throws InterruptedException
	{
		test.log(LogStatus.INFO, "POST A JOB ");
		driver.findElement(By.xpath(propX.getProperty("HEADERLOGINBUTTON"))).click();
		driver.findElement(By.xpath(propX.getProperty("USERID"))).sendKeys("UL000000005");
		
		driver.findElement(By.xpath(propX.getProperty("USERPASSWORD"))).sendKeys("TopStar@123");
		driver.findElement(By.xpath(propX.getProperty("LOGINBUTTON"))).click();
		test.log(LogStatus.INFO, "Logged in ");
		Thread.sleep(500);
		driver.findElement(By.xpath(propX.getProperty("POSTAJOB"))).click();
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		
		driver.findElement(By.xpath(propX.getProperty("BASICDESCRIPTION"))).sendKeys("RAMP MODEL REQUIRED FOR UPCOMING SPRING EVENT ");
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("CATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("COUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("CITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("PROJECTDESCRIPTION"))).sendKeys("Good Communication skills. Good Communication skills"
				+ "Good Communication skillsGood Communication skillsGood Communication skillsGood Communication skillsGood Communication skills"
					);
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		
		driver.findElement(By.id(propX.getProperty("NEXT"))).click();
		Thread.sleep(500);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("GENDER"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("NUDITYREQUIRED"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.id(propX.getProperty("AGEFROM"))).sendKeys("20");
		driver.findElement(By.id(propX.getProperty("AGETO"))).sendKeys("30");;
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("ETHNICITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("MINEXP"))).sendKeys("3");
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("JOBCOMPANSATION"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("APPLYFROM"))));
		dropdown.selectByIndex(1);
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		
		driver.findElement(By.id(propX.getProperty("NEXT2"))).click();
		Thread.sleep(500);
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 330);");*/
		driver.findElement(By.xpath(propX.getProperty("USERJOBPOSTEMAIL"))).sendKeys("avishek5@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.id(propX.getProperty("CONTACT_NUMB"))).sendKeys("45678912300002569874");
		
		
		driver.findElement(By.id(propX.getProperty("CONTACTNAME"))).sendKeys("Avishek5 Chakraborty");
		driver.findElement(By.id(propX.getProperty("WEBURL"))).sendKeys("http://www.google.com");
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 550);");
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		driver.findElement(By.xpath(propX.getProperty("SUBMIT"))).click();
		test.log(LogStatus.INFO, "Click on submit button after given all input in respective fields. ");
		
		String s=driver.findElement(By.xpath(propX.getProperty("POSTAJOBTHANKYOUMESSAGE"))).getText();
		
		test.log(LogStatus.INFO, "Waiting for Thank You Message ");
		if(s.equals("Hurray. A New Job has been posted successfully.")) {
			System.out.println("Hurray. A New Job has been posted successfully.");
			test.log(LogStatus.INFO, "Hurray. A New Job has been posted successfully. ");
		}
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		
		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
				
		
		}
	
	
}
