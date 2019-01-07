package homePage;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class HomeSitemap extends HomePageBase{
	
	
	@Test
	public  void homesitemap()
	{
		test.log(LogStatus.INFO, "Test the functionality of Site Map");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 2100);");
		test.log(LogStatus.INFO, "Scroll down to footer to click Site map");
		driver.findElement(By.xpath(propX.getProperty("Sitemap"))).click();
		test.log(LogStatus.INFO, "clicked Site Map button");
		
		/*Alert alert= new driver.switchTo().alert();
		alert.accept();*/
		
		Set <String> st= driver.getWindowHandles();//getWindowHandles handles the multiple windows,
		Iterator<String> it = st.iterator();
		String p =  it.next();
		//String child =it.next();
		test.log(LogStatus.INFO, "Site map page is showing ");		
		driver.findElement(By.xpath(propX.getProperty("AboutUsLink"))).click();//identify the only element and elements list of all webelements in the page.
		test.log(LogStatus.INFO, "clicked on About us link");
		//driver.switchTo().window(child);
		driver.switchTo().window(p);
		test.log(LogStatus.INFO, "Came back to Site map pages");
		
		driver.findElement(By.xpath(propX.getProperty("SiteMapPageLoginLink"))).click();
		test.log(LogStatus.INFO, "clicked on services details of fouth image back button");
		driver.switchTo().window(p);
		test.log(LogStatus.INFO, "Came back to Site map pages");
		
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
	}

}
