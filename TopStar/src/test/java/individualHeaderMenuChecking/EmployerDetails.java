package individualHeaderMenuChecking;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;


public class EmployerDetails extends IndividualBase{
	
	
	
	
	@Test(priority=1)
	public void employerDetails() throws InterruptedException 
	{
		test.log(LogStatus.INFO, "CHECK EMPLOYER DETAILS");
		driver.findElement(By.xpath(propX.getProperty("Employers"))).click();
		test.log(LogStatus.INFO, "Click on Employers Menu");
		
		driver.findElement(By.xpath(propX.getProperty("Actor"))).click();
		test.log(LogStatus.INFO, " Click on Actor Categories menu  ");
		
		
		driver.findElement(By.xpath(propX.getProperty("Director"))).click();
		test.log(LogStatus.INFO, " Click on Director Categories menu  ");
		
		driver.findElement(By.xpath(propX.getProperty("Photographer"))).click();
		test.log(LogStatus.INFO, " Click on Photographer Categories menu  ");
		
		driver.findElement(By.xpath(propX.getProperty("Musician"))).click();
		test.log(LogStatus.INFO, " Click on Musician Categories menu  ");
		
		driver.findElement(By.xpath(propX.getProperty("Cinematographer"))).click();
		test.log(LogStatus.INFO, " Click on Cinematographer Categories menu  ");
		
		driver.findElement(By.xpath(propX.getProperty("Employers"))).click();
		test.log(LogStatus.INFO, "Click on Employers Menu");
//		System.out.println("Hello");
		driver.findElement(By.xpath(propX.getProperty("View_Details"))).click();
		test.log(LogStatus.INFO, "Click on View Details Page");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(propX.getProperty("UserName"))).sendKeys("UL000000005");
		driver.findElement(By.xpath(propX.getProperty("Password"))).sendKeys("TopStar@123");
		test.log(LogStatus.INFO, "Provide the Username and Password in the respective fields ");
		Thread.sleep(1000);
		driver.findElement(By.xpath(propX.getProperty("Login"))).click();
		test.log(LogStatus.INFO, "Click on Login button ");
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(30, SECONDS)
			    .pollingEvery(5, SECONDS)
			    .ignoring(NoSuchElementException.class);

			WebElement View_Details_Close = wait.until(new Function<WebDriver, WebElement>() 
			{
			  public WebElement apply(WebDriver driver) {
			  return driver.findElement(By.xpath(propX.getProperty("View_Details_Close")));
			}
			});*/
				
		/*wait = new WebDriverWait(driver, 100);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(propX.getProperty("View_Details_Close"))));*/
		driver.findElement(By.xpath("//*[@id=\"parent\"]/div[1]/div[2]/a")).click();
		test.log(LogStatus.INFO, "Click on view details button  ");
		driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/a")).click();
		
		test.log(LogStatus.INFO, "Click on back button  ");
		
		//Explicitly wait
		 wait = new WebDriverWait(driver, 10);
		 element = wait.until(ExpectedConditions.elementToBeClickable(By.tagName("a")));
		 test.log(LogStatus.INFO, "Wait for element 'a'for checking the hyperlink in employee page ");
		 //Count of the current page
		
		 java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 for (int i = 0; i<links.size(); i++)
		 {
			System.out.println(links.get(i).getText());
		 }
			test.log(LogStatus.INFO, "044 7949 3957\r\n, " + 
					"nantha@roycermade.com\r\n, " + 
					"JOIN FREE\r\n, " + 
					"LOG IN\r\n, " + 
					"Home\r\n, " + 
					"About Us\r\n, " + 
					"Talent Directory\r\n, " + 
					"Employers\r\n, " + 
					"Auditions & Jobs\r\n, " + 
					"Contact Us\r\n, " + 
					"Post A Job\r\n, " + 
					"http://carbyproductions.com\r\n, " + 
					"View Details\r\n, " + 
					"http://biplabproductions.com\r\n, " + 
					"View Details\r\n, " + 
					"http://taylorproductions.com\r\n, " + 
					"View Details\r\n, " + 
					"http://taylorproductions.com\r\n, " + 
					"View Details\r\n, " + 
					"http://katyproductions.com\r\n, " + 
					"View Details\r\n, " + 
					"http://nanthaproductions.com\r\n, " + 
					"View Details\r\n, " + 
					"http://johnproductions.com\r\n, " + 
					"View Details\r\n, " + 
					"http://tomproductions.com\r\n, " + 
					"View Details\r\n, " + 
					"nantha@roycermade.com\r\n, " + 
					"044 7949 3957\r\n, " + 
					"Sitemap\r\n, " + 
					"HOME\r\n, " + 
					"ABOUT US\r\n, " + 
					"TALENT DIRECTORY\r\n, " + 
					"EMPLOYERS\r\n, " + 
					"AUDITION & JOBS\r\n, " + 
					"CONTACT US\r\n, " + 
					"This is Full Description\r\n, " + 
					"Need a Producer for my own Outdoor Location\r\n, " + 
					"Need Male Singers as Extra Artist for my Live Show\r\n, " + 
					"Need Singers for my own Live Show\r\n, " + 
					"READ MORE\r\n, " + 
					" ");
			
		
								
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();

	}
	
	
}
