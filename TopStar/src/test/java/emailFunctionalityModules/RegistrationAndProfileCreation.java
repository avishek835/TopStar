package emailFunctionalityModules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import utility.UtilityFile;

public class RegistrationAndProfileCreation extends EmailFunctionalityBase {
	
	@Test
	public  void registrationAndProfileCreation()
		{
		
		test.log(LogStatus.INFO,"CREATE REGISTRATION, THEN LOGIN AND CREATE NEW PROFILE ");
		driver.findElement(By.xpath(propX.getProperty("JOINFREE"))).click();
		test.log(LogStatus.INFO,"Click on Join Free Button");
		wait = new WebDriverWait(driver, 50);
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(propX.getProperty("FINDWORKPOPUP"))));
		test.log(LogStatus.INFO,"Click on Find Work PopUp");
		driver.findElement(By.xpath(propX.getProperty("FINDWORKPOPUP"))).click();
		driver.findElement(By.xpath(propX.getProperty("SIGNUPACTOR"))).click();
		driver.findElement(By.xpath(propX.getProperty("SIGNUPUSERNAME"))).sendKeys("avishek16");
		driver.findElement(By.xpath(propX.getProperty("SIGNUPPASSWORD"))).sendKeys("123456");
		driver.findElement(By.xpath(propX.getProperty("SIGNUPUSEREMAIL"))).sendKeys("avishek16@mailinator.com");
		driver.findElement(By.xpath(propX.getProperty("SIGNUPDD"))).sendKeys("23");
		driver.findElement(By.xpath(propX.getProperty("SIGNUPMM"))).sendKeys("08");
		driver.findElement(By.xpath(propX.getProperty("SIGNUPYYYY"))).sendKeys("1985");
		driver.findElement(By.xpath(propX.getProperty("SIGNUPSUBMIT"))).click();
		test.log(LogStatus.INFO,"Click on Sign Up buttonafter giving necessary details");
		
		driver.findElement(By.xpath(propX.getProperty("HEADERLOGINBUTTON"))).click();
		test.log(LogStatus.INFO,"Click on Header Login Button");
		
		driver.findElement(By.xpath(propX.getProperty("USERID"))).sendKeys("UL000000026");
		driver.findElement(By.xpath(propX.getProperty("USERPASSWORD"))).sendKeys("123456");
		driver.findElement(By.xpath(propX.getProperty("LOGINBUTTON"))).click();
		test.log(LogStatus.INFO,"Click on Submit button after provided id and password.");
		wait = new WebDriverWait(driver, 20);
		 element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(propX.getProperty("DropDownForSignOut"))));
		
		driver.findElement(By.xpath(propX.getProperty("DropDownForSignOut"))).click();
		driver.findElement(By.xpath(propX.getProperty("PROFILEBUTTONFROMDROPDOWN"))).click();
		test.log(LogStatus.INFO,"Click on Profile button from dropdown");
		driver.findElement(By.xpath("//*[@id=\"lstCategories\"]/option[4]")).click();
		test.log(LogStatus.INFO,"Set categories value");
		driver.findElement(By.xpath("//*[@id=\"txtDescription\"]")).sendKeys("This is test description");
		test.log(LogStatus.INFO,"Set description.");
		driver.findElement(By.xpath("//*[@id=\"txtWebSiteLink\"]")).sendKeys("www.mailinator.com");
		test.log(LogStatus.INFO,"Set URL ");
		driver.findElement(By.xpath("//*[@id=\"ddlCountry\"]/option[2]")).click();
		test.log(LogStatus.INFO,"Set Country");
		driver.findElement(By.xpath("//*[@id=\"ddlCity\"]/option[2]")).click();
		test.log(LogStatus.INFO,"Set City");
		driver.findElement(By.xpath("//*[@id=\"txtContactNo\"]")).sendKeys("7894561230");
		test.log(LogStatus.INFO,"Set contact number");
		driver.findElement(By.xpath("//*[@id=\"txtAboutMe\"]")).sendKeys("Text About me");
		test.log(LogStatus.INFO,"Set About me");
		driver.findElement(By.xpath("//*[@id=\"txtPhysicalDetails\"]")).sendKeys("This is test physical description.");
		test.log(LogStatus.INFO,"Set Physical Button");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1900);");
		
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
		test.log(LogStatus.INFO,"Click on Save Button");	
		
		wait = new WebDriverWait(driver, 20);
		 element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"talentDetailSaveModal\"]/div/div/div[3]/button")));
		 UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		 test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		 	test.log(LogStatus.PASS, "Test Pass");
			rep.endTest(test);
			rep.flush();

		}
}
