package pageExecution;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageClasses.LandingPage;
import pageClasses.LoginPage;
import propertyAndBrowserFile.BrowserAndURL;


public class PageExecution {
	
	public WebDriver driver;
	@Test
	public void landingpageExecution () throws IOException
	{
		BrowserAndURL bl = new  BrowserAndURL();
		
		driver =bl.initializeDriver();
	    
	     LandingPage lp = new LandingPage(driver);
         lp.getlandingPage().click();
}@Test
	public void loginPageExecution()
	{
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys("AJAY");;
		lp.getpass().sendKeys("123");
		lp.getSubmit().click();
	}
		
}