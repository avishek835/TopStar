package homePage;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;



public class HomeSearchOne extends HomePageBase{
	
	
	
	@Test(priority=1)
	public void homesearch1()
	{
		test.log(LogStatus.INFO, "Check the category 1st value with  country 1st value with all cities");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		/*WebDriverWait wait = new WebDriverWait(driver,5);
		
		element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//*[@id=\"prolist\"]/div/a/div")));*/
		//driver.findElement(By.xpath(propX.getProperty("BIPLABIMAGE"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
/*		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH")));
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		*/
	
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(6);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(7);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(8);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(10);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		test.log(LogStatus.INFO, "Checked completly the category 1st value with 1st country with all cities");

		
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
		}
		
		@Test (dependsOnMethods={"homesearch1"})
		public void homesearch2() {
			test.log(LogStatus.INFO, "Check the category 1st value with  country 2nd value with all cities");
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(6);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(7);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(8);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(10);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		test.log(LogStatus.INFO, "Checked the category 1st value with  country 2nd value with all cities");
		test.log(LogStatus.INFO, "Check the category 1st value with  country 3rd value with all cities");
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(6);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(7);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(8);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(10);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		test.log(LogStatus.INFO, "Checked the category 1st value with  country 3rd value with all cities");
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
		}
		

		@Test(dependsOnMethods={"homesearch2"})
		public void homesearch3() {
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			test.log(LogStatus.INFO, "Check the category 1st value with  country 4th value with all cities");
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(6);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(7);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(8);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(10);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		test.log(LogStatus.INFO, "Checked the category 1st value with  country 4th value with all cities");
	
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			test.log(LogStatus.INFO, "Check the category 1st value with  country 5th value with all cities");
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(6);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(7);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(8);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(10);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		test.log(LogStatus.INFO, "Checked the category 1st value with  country 5th value with all cities");
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
		}
		
		@Test(dependsOnMethods={"homesearch3"})
		public void homesearch4() {
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			test.log(LogStatus.INFO, "Checked the category 1st value with  country 6th value with all cities");
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(6);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(7);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(8);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(10);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		test.log(LogStatus.INFO, "Checked the category 1st value with  country 6th value with all cities");
		test.log(LogStatus.INFO, "Check the category 2nd value with  country 1st value with all cities");
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(6);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(7);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(8);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(10);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		test.log(LogStatus.INFO, "Checked the category 2nd value with  country 1st value with all cities");
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
		}
		
		@Test(dependsOnMethods={"homesearch4"})
		public void homesearch5() {
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			test.log(LogStatus.INFO, "Checked the category 2nd value with  country 2nd value with all cities");
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(6);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(7);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(8);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(10);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		test.log(LogStatus.INFO, "Checked the category 2nd value with  country 2nd value with all cities");
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
		}
		
		
		@Test(dependsOnMethods={"homesearch5"})
		public void homesearch6() {
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			test.log(LogStatus.INFO, "Check the category 2nd value with  country 3rd value with all cities");
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(6);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(7);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(8);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(10);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		test.log(LogStatus.INFO, "Checked the category 2nd value with  country 3rd value with all cities");
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			test.log(LogStatus.INFO, "Check the category 2nd value with  country 4th value with all cities");
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(6);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(7);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(8);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(10);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		test.log(LogStatus.INFO, "Check the category 2nd value with  country 4th value with all cities");
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
		}
		
		@Test(dependsOnMethods={"homesearch6"})
		public void homesearch7() {
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			test.log(LogStatus.INFO, "Check the category 2nd value with  country 5th value with all cities");
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(5);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(1);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(5);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(2);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(5);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(3);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(5);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(4);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(5);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(5);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(5);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(6);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(5);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(7);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(5);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(8);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(5);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(9);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(5);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(10);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			test.log(LogStatus.INFO, "Checked the category 2nd value with  country 5th value with all cities");
			test.log(LogStatus.INFO, "Check the category 2nd value with  country 6th value with all cities");
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(6);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(1);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(6);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(2);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(6);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(3);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(6);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(4);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(6);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(5);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(6);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(6);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(6);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(7);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(6);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(8);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(6);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(9);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
			dropdown.selectByIndex(2);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
			dropdown.selectByIndex(6);
			dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
			dropdown.selectByIndex(10);
			driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
			driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
			test.log(LogStatus.INFO, "Checked the category 2nd value with  country 6th value with all cities");
			test.log(LogStatus.PASS, "Test Pass");
			rep.endTest(test);
			rep.flush();
			
						
		}
		
		
}
