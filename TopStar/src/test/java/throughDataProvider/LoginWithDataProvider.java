package throughDataProvider;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import utility.UtilityFile;

public class LoginWithDataProvider extends DataProviderBase {
	
	@Test(dataProvider="getData")
	public void loginWithDataProvider(String Uname, String Pass)
	{
		/*System.setProperty("webdriver.chrome.driver","E:\\Avishek\\SeleniumProjects\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://103.94.84.77:7085/");*/
		//driver.findElement(By.xpath("/html/body/section[1]/div/div/div[2]/div/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath(propX.getProperty("HEADERLOGINBUTTON"))).click();
		driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys(Uname);
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(Pass);
		System.out.println(Uname);
		System.out.println(Pass);
		/*test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		test.log(LogStatus.INFO, "Provide UserId and Password. ");*/
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div/form/ul/li[1]/button")).click();
		UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, "Login Screen Shot: "+test.addScreenCapture(UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
		test.log(LogStatus.INFO, "Logged in successfully. ");
		driver.findElement(By.xpath(propX.getProperty("SIGNOUT"))).click();

		
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
	}
	
	 @DataProvider(name="getData")
	 
	 public Object[][] getData() {
			Object[][] arrayObject = getExcelData("E:\\Avishek\\SeleniumProjects\\TopStar\\src\\test\\java\\\\throughDataProvider\\Data.xls","Sheet1");
			return arrayObject;
		}
	/* public Object[][] getData(){
	 //Object [][] data = new Object [rowCount][colCount];
	 Object [][] data = new Object [3][2];
	 
	 data [0][0] = "UL000000005";
	 data [0][1] = "TopStar@123";
	 
	 data[1][0] = "UL000000006";
	 data[1][1] = "TopStar@123";
	 
	 data[2][0]="UL000000004";
	 data[2][1]="TopStar@123";
	  return data;
	 }*/
	 
	 
	/* public String[][] getExcelData(String fileName, String sheetName) {
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
*/
	 
	
}
