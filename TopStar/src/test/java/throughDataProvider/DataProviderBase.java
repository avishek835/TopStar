package throughDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

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

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import utility.UtilityFile;

public class DataProviderBase {
	ExtentReports rep=UtilityFile.getInstance();
	ExtentTest test;
	Select dropdown;
	WebDriver driver;
	WebDriverWait wait;
	WebElement element;
	public UtilityFile tprop;
	public Properties propX;
		
	public String fileName;
	String s;
	DataProviderBase(){
		tprop = new UtilityFile();
		propX = tprop.getProp();
	}
	
	@BeforeTest
	public void beforetest()
	{
		test=rep.startTest("LOGIN FUNCTIONALITY");
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
	
	
	/**/
			
			 public String[][] getExcelData(String fileName, String sheetName) {
					String[][] arrayExcelData = null;
					try {
						FileInputStream fs = new FileInputStream(fileName);
						Workbook wb = Workbook.getWorkbook(fs);
						Sheet sh = wb.getSheet(sheetName);

						int totalNoOfCols = sh.getColumns();
						int totalNoOfRows = sh.getRows();
						
						arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
						
						for (int i= 1 ; i < totalNoOfRows; i++) {

							for (int j=0; j < totalNoOfCols; j++) {
								arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
							}

						}
						fs.close();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
						e.printStackTrace();
					} catch (BiffException e) {
						e.printStackTrace();
					}
					
					
					return arrayExcelData;
				}

			 
			
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}

}
