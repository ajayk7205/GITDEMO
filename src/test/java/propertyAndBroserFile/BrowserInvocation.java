package propertyAndBroserFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class BrowserInvocation {
	 public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("C:\\Users\\Lucky\\eclipse-workspace\\Maven\\src\\test\\java\\propertyAndBroserFile\\data.properties");
	Properties p = new Properties();
	p.load(fis);
	System.out.println(p.getProperty("browser"));	  
	if(p.getProperty("browser").equalsIgnoreCase("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lucky\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get(p.getProperty("url"));
	}
	
}}
