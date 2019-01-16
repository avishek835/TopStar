package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

//import config.configuration;


public class UtilityFile 
{
	private static File screenshotFile;
	
	
	private Properties prop;
	private FileInputStream ip;
	
	static ExtentTest test;
	private static ExtentReports extent;
	
//	public static WebDriver Instance=null;
	/*//new ChromeDriver()
	public static ChromeDriver openBrowser() 
	{
	//System.setProperty("webdriver.chrome.driver","E:\\Avishek\\SeleniumProjects\\Drivers\\chromedriver_win32\\chromedriver.exe");
	//driver= new ChromeDriver();
	return new ChromeDriver();
	}
	*/
	

	public static String takeScreenShot(WebDriver chDriver, String filePath, String fileName) 
	{
		String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		screenshotFile = ((TakesScreenshot)chDriver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File(filePath+"\\"+fileName+timeStamp+".png"));
			return filePath+"\\"+fileName+timeStamp+".png";
			}
		catch(IOException e) 
							{
								e.printStackTrace();
								return "Unable to get file!!";
							}
	}
	
	
	public UtilityFile()
	{
		 prop= new Properties();
		 try {
			ip =new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\utility\\topstarproperties.properties");
			prop.load(ip);
		 } catch (FileNotFoundException e) 
		 		{
				e.printStackTrace();
		 		} 
		 		catch (IOException e) 
		 			{
		 				e.printStackTrace();
		 			}
			
	 }
	
	public Properties getProp() {
		return prop;
	}
	
	
	
	public static ExtentReports getInstance()
	{
		if(extent==null)
		{
			Date d=new Date();
			String fileName=d.toString().replace(":","_").replace(" ","_")+".html";
			extent=new ExtentReports("E:\\Avishek\\Report\\"+fileName, true, DisplayOrder.NEWEST_FIRST);
			extent.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
		}
		return extent;
		
	}

	
	
}
