package urlPageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import propertyAndBroserFile.*; 

public  class LandingPage {
	 public WebDriver driver;
	 
	 
	 public  LandingPage(WebDriver driver) {
			this.driver = driver;
			
		}
	
	
	By login = (By.cssSelector("a[href*='sign_in']"));	


	public  WebElement getSignup() {
		
		return	driver.findElement(login);
	}

	}
