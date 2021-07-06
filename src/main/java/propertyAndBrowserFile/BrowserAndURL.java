package propertyAndBrowserFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserAndURL {
	public WebDriver driver;
	public String url1;
		
	

	public WebDriver initializeDriver() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Lucky\\eclipse-workspace\\Maven\\src\\main\\java\\propertyAndBrowserFile\\data.properties");
		Properties p = new Properties();
		p.load(fis);
		String brow = p.getProperty("browser");

		if (brow.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lucky\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		driver.get("http://www.qaclickacademy.com");
		
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
}



	

}

