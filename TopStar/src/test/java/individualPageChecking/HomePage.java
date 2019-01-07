package individualPageChecking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class HomePage extends individualBase {
	
	
	@Test
	public  void homepagebanner()
	{
		test.log(LogStatus.INFO, "HOME PAGE CONTENT AND OTHER STUFF CHECKING ");
		s=driver.findElement(By.xpath(propX.getProperty("HomeBannertext"))).getText();
		
		if(s!=null)
		{ 
			System.out.println(s+ " text is present");
			test.log(LogStatus.INFO, "Banner text is present. ");
		}
		
		s=driver.findElement(By.xpath(propX.getProperty("HomeDigitalIndia"))).getText();
		if(s!=null)
		{
			System.out.println(s+ " text is present");
			test.log(LogStatus.INFO, "Digital India text is present. ");
		}
		
		
	}
		
		@Test
		public void registration()
		{
			s=driver.findElement(By.xpath(propX.getProperty("HOMEUSERNAME"))).getAttribute("placeholder");
			if(s!=null)
				{
					System.out.println(s+ " text is present");
					test.log(LogStatus.INFO, "Username text is present in registration placeholder. ");
				}
				
			s=driver.findElement(By.xpath(propX.getProperty("HOMEPASSWORD"))).getAttribute("placeholder");
			if(s!=null)
				{
					System.out.println(s+ " text is present");
					test.log(LogStatus.INFO, "Password text is present in registration placeholder. ");
				}
		
			s=driver.findElement(By.xpath(propX.getProperty("HOMEUSEREMAIL"))).getAttribute("placeholder");
			if(s!=null)
				{
					System.out.println(s+ " text is present");
					test.log(LogStatus.INFO, "UserMail text is present in registration placeholder. ");
				}
		
			s=driver.findElement(By.xpath(propX.getProperty("HOMEDATE"))).getAttribute("placeholder");
			if(s!=null)
				{
					System.out.println(s+ " text is present");
					test.log(LogStatus.INFO, "DD text is present in date field placeholder. ");
				}
		
			s=driver.findElement(By.xpath(propX.getProperty("HOMEMONTH"))).getAttribute("placeholder");
			if(s!=null)
				{
					System.out.println(s+ " text is present");
					test.log(LogStatus.INFO, "MM text is present in month field placeholder. ");
				}
		
			s=driver.findElement(By.xpath(propX.getProperty("HOMEYEAR"))).getAttribute("placeholder");
			if(s!=null)
				{
					System.out.println(s+ " text is present");
					test.log(LogStatus.INFO, "Year text is present in year field placeholder. ");
				}
		
			s=driver.findElement(By.xpath(propX.getProperty("HOMEREGISTERNOW"))).getAttribute("value");
			if(s!=null)
				{
					System.out.println(s+ " button name is present");
					test.log(LogStatus.INFO, "Register now text is present in the Register now button. ");
				}
		
			b =driver.findElement(By.xpath(propX.getProperty("HomeCheckbox"))).isSelected();
			if(b!=null)
				{
					System.out.println( "check box is selected");
					test.log(LogStatus.INFO, "Check Box is selected. ");
				}
		
			s=driver.findElement(By.xpath(propX.getProperty("HomeTerms"))).getText();
			if(s!=null)
				{
					System.out.println(s+ ":  text is present");
				}
			test.log(LogStatus.PASS, "Test Pass");
			rep.endTest(test);
			rep.flush();
			
		}
		
		
		
		//Category button
		@Test
		public void categoryButtons()
		{
		s=driver.findElement(By.xpath(propX.getProperty("HomeDirector"))).getText();
		if(s!=null)
		{
			System.out.println(s+ " button name is present");
		}
		
		s=driver.findElement(By.xpath(propX.getProperty("HomeCinematographer"))).getText();
		if(s!=null)
		{
			System.out.println(s+ " button name is present");
		}
		
		s=driver.findElement(By.xpath(propX.getProperty("HomeProducer"))).getText();
		if(s!=null)
		{
			System.out.println(s+ " button name is present");
		}
		
		s=driver.findElement(By.xpath(propX.getProperty("HomeActor"))).getText();
		if(s!=null)
		{
			System.out.println(s+ " button name is present");
		}
		
		s=driver.findElement(By.xpath(propX.getProperty("HomeMusician"))).getText();
		if(s!=null)
		{
			System.out.println(s+ " button name is present");
		}
		
		s=driver.findElement(By.xpath(propX.getProperty("HomePhotographer"))).getText();
		if(s!=null)
		{
			System.out.println(s+ " button name is present");
		}
		
		s=driver.findElement(By.xpath(propX.getProperty("HomeModel"))).getText();
		if(s!=null)
		{
			System.out.println(s+ " button name is present");
		}
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
	}
	
		@Test
		public void generalChecking()
		{
			driver.navigate().refresh();
			s=driver.getCurrentUrl();
			if(s!=null)
				System.out.println(s);
			
			s=driver.getTitle();
			if(s!=null)
				System.out.println(s);
			
			s=driver.getPageSource();
			if(s!=null)
				System.out.println(s);
			
			driver.navigate().forward();
			driver.navigate().back();
			System.out.println("Getting all links in home page--------------------");
			//get all links in home page
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			System.out.println("All links found on web page are: " + allLinks.size() + " links");
			 for (WebElement link : allLinks) {
			 //print the links i.e. http://example.com or https://www.example.com
			System.out.println(link.getAttribute("href"));
			 //print the links text
			System.out.println(link.getText());
			}
			 
			 
			}
			
		}
		
	


