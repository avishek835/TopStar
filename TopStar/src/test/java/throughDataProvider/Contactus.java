package throughDataProvider;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import utility.UtilityFile;

public class Contactus extends DataProviderBase 
{
	
	@Test(dataProvider="getData")
	public void contactUs(String Contact_Name, String Contact_Email,String Contact_Mobile, String Contact_Message)
	{

		test.log(LogStatus.PASS, "CONTACT US PAGE FORM CHECKING BY DATA PROVIDER ");
		driver.findElement(By.xpath(propX.getProperty("HeaderContactUs"))).click();
		test.log(LogStatus.PASS, "Click on Contact Us menu from header section ");
		
		driver.findElement(By.xpath(propX.getProperty("ContactUsName"))).sendKeys(Contact_Name);
		driver.findElement(By.xpath(propX.getProperty("ContactUsEmail"))).sendKeys(Contact_Email);
		driver.findElement(By.xpath(propX.getProperty("ConatctUsMobileNumber"))).sendKeys(Contact_Mobile);
		driver.findElement(By.xpath(propX.getProperty("ConatctUsMessageBox"))).sendKeys(Contact_Message);
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		
		driver.findElement(By.xpath(propX.getProperty("ContactUsSubmit"))).click();
		test.log(LogStatus.PASS, "Contact message sent successfully ");
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();			
	}
	
	@DataProvider(name="getData")
	 
	 public Object[][] getData() {
			Object[][] arrayObject = getExcelData("E:\\Avishek\\SeleniumProjects\\TopStar\\src\\test\\java\\throughDataProvider\\Data.xls","Sheet2");
			return arrayObject;
}		
}


