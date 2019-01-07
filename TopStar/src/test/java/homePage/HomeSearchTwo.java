package homePage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.UtilityFile;

public class HomeSearchTwo {
	ExtentReports rep=UtilityFile.getInstance();
	ExtentTest test;
	WebDriver driver;
	WebElement element;
	Select dropdown;
	private UtilityFile tprop;
	private Properties propX;
	
	//Created Constructor
	HomeSearchTwo(){
		tprop = new UtilityFile();
		propX = tprop.getProp();
	}

	@BeforeTest
	public void beforetest()
	{
		test=rep.startTest("Home Search Part Two");
		String chromeDriverPath = propX.getProperty("PATH");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver=new ChromeDriver();
		test.log(LogStatus.INFO, "Open the Browser");
		driver.get(propX.getProperty("URL"));
		test.log(LogStatus.INFO, "TopStar URL Loaded");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Maximize the window");
	}
	
	@Test(enabled=true)
	public void homesearch8() {
		test.log(LogStatus.INFO, "Check the category 3rd value with  country 1st value with all cities");
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(6);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(7);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(8);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(1);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(10);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		test.log(LogStatus.INFO, "Checked the category 3rd value with  country 1st value with all cities");
		test.log(LogStatus.INFO, "Check the category 3rd value with  country 2nd value with all cities");
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(6);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(7);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(8);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(2);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(10);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		test.log(LogStatus.INFO, "Checked the category 3rd value with  country 2nd value with all cities");
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
	}
	@Test(enabled=true)
	public void homesearch9() {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Check the category 3rd value with  country 3rd value with all cities");
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(6);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(7);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(8);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(10);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Checked the category 3rd value with  country 3rd value with all cities");
		test.log(LogStatus.INFO, "Check the category 3rd value with  country 4th value with all cities");
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(6);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(7);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(8);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(4);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(10);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		test.log(LogStatus.INFO, "Checked the category 3rd value with  country 4th value with all cities");
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
	}
	
	@Test(enabled=false)
	public void homesearch10() {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Check the category 3rd value with  country 5th value with all cities");
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(6);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(7);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(8);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(5);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(10);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Checked the category 3rd value with  country 5th value with all cities");
		test.log(LogStatus.INFO, "Check the category 3rd value with  country 6th value with all cities");
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(4);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(6);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(7);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(8);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(9);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECATEGORY"))));
		dropdown.selectByIndex(3);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECOUNTRY"))));
		dropdown.selectByIndex(6);
		dropdown = new Select(driver.findElement(By.id(propX.getProperty("HOMECITY"))));
		dropdown.selectByIndex(10);
		driver.findElement(By.xpath(propX.getProperty("HOMESEARCH"))).click();
		driver.findElement(By.xpath(propX.getProperty("HOMELOGO"))).click();
		
		test.log(LogStatus.INFO, "Checked the category 3rd value with  country 6th value with all cities");
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
	}
	
		
}
