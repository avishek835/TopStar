package emailFunctionalityModules;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.UtilityFile;

public class EmailFunctionalityBase {

	ExtentReports rep=UtilityFile.getInstance();
	ExtentTest test;
	Select dropdown;
	WebDriver driver;
	//public  tprop;
	public Properties propX;
	WebDriverWait wait;
	WebElement element;
	String s;
	
	//int a=10, b=20;
	
	//String s;
	EmailFunctionalityBase(){
		UtilityFile tprop = new UtilityFile();
		propX = tprop.getProp();
		
	}
	
	@BeforeTest
	public  void beforetest()
	{
		test=rep.startTest("EMAIL FUNCTIONALITY");
		String chromeDriverPath = propX.getProperty("PATH");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
	}
	
	
	@BeforeMethod
	public void beforemethod()
	{
		test.log(LogStatus.INFO, "Starting the test");
		test.log(LogStatus.INFO, "Open Chrome Browser");
		System.out.println(propX.getProperty("Authorname"));
		test.log(LogStatus.INFO, "Report Created by: Avishek");
		System.out.println(System.getProperty("user.dir"));
		driver.get(propX.getProperty("URL"));
		test.log(LogStatus.INFO, "TopStar URL Loaded");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Maximized the Window");
	}
	
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
}
