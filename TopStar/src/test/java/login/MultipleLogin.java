package login;



import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import utility.UtilityFile;

public class MultipleLogin extends LoginBase{
	/*ExtentReports rep=extentmanager.getInstance();
	ExtentTest test;
	
	WebDriver driver;
	private String fileName;
	private TestUtility tprop;
	private Properties propX;
	
	
	
	MultipleLogin(){
		tprop = new TestUtility();
		propX = tprop.getProp();
	}
	
	
	@BeforeTest
	public void beforetest()
	{
		test=rep.startTest("Multiple Login");
		test.log(LogStatus.INFO, "Starting the test");
		String chromeDriverPath = propX.getProperty("PATH");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver=new ChromeDriver();
		//driver= TestUtility.openBrowser();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Open the browser");
		
		driver.get(propX.getProperty("URL"));
		fileName = TestUtility.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		
		takeScreenShot();
		test.log(LogStatus.PASS, "Screenshot->"+test.addScreenCapture("E:\\Avishek\\ScreenShot\\a.png"));
		test.log(LogStatus.INFO, "Load the URL");
		
		driver.manage().window().maximize();
		
		test.log(LogStatus.INFO, "Maximize the screen");
	}*/
	
	
	@Test(enabled=true)
	public void multipleLogin() throws InterruptedException
	{
		
		test.log(LogStatus.INFO, "LOGIN AND LOGOUT FIVE TIMES");
		//For Loop starts
		for(int i=0;i<=5;i++) {
		
		driver.findElement(By.xpath(propX.getProperty("HEADERLOGINBUTTON"))).click();
		test.log(LogStatus.INFO, "Clicked header Login Button");
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		
		driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys(propX.getProperty("USERNAME"));
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(propX.getProperty("PASSWORD"));
		
		
		driver.findElement(By.xpath(propX.getProperty("LOGINBUTTON"))).click();
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		test.log(LogStatus.INFO, "Click on login button after provided id and password");
		
		driver.findElement(By.xpath(propX.getProperty("SIGNOUT"))).click();
		
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		test.log(LogStatus.INFO, "Click on Sign Out button ");
		}
		test.log(LogStatus.PASS, "Test Pass"+fileName);
		rep.endTest(test);
		rep.flush();
		
	}
	
}



