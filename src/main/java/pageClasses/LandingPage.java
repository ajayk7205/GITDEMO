package pageClasses;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import propertyAndBrowserFile.BrowserAndURL;


public class LandingPage extends BrowserAndURL {
public WebDriver driver;	
public String wbpage;

  By signup=By.cssSelector("a[href*='sign_in']");    
    
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getlandingPage() throws IOException 
	{
		return driver.findElement(signup);
	}

}
