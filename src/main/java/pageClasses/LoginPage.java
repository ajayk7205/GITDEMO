package pageClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import propertyAndBrowserFile.BrowserAndURL;

public class LoginPage extends BrowserAndURL {
	public WebDriver driver;
	

	
	
	
	By email=	By.cssSelector("input[type='email']");
	By pass= By.id("user_password");
	By submit = By.cssSelector("input[type='submit']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	

	public WebElement getEmail()
	{
		return driver.findElement(email);
		}
	public WebElement getpass()
	{
		return driver.findElement(pass);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
	}}

