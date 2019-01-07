package headerFooterLinksChecking;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import utility.UtilityFile;

public class HeaderFooterBase {

	ExtentReports rep=UtilityFile.getInstance();
	ExtentTest test;
	Select dropdown;
	WebDriver driver;
	public UtilityFile tprop;
	public Properties propX;
	
	//int a=10, b=20;
	
	//String s;
	HeaderFooterBase(){
		tprop = new UtilityFile();
		propX = tprop.getProp();
	}
	
	@BeforeTest
	public void beforetest()
	{
		test=rep.startTest("HEADER/ FOOTER LINKS CHECKING");
		String chromeDriverPath = propX.getProperty("PATH");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		test.log(LogStatus.INFO, "Starting the test");
		test.log(LogStatus.INFO, "Open Chrome Browser");
		System.out.println(propX.getProperty("Authorname"));
		test.log(LogStatus.INFO, "Author name: Avishek");
		System.out.println(System.getProperty("user.dir"));
		driver.get(propX.getProperty("URL"));
		test.log(LogStatus.INFO, "TopStar URL Loaded");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Maximize Window");
	}
	
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
}
