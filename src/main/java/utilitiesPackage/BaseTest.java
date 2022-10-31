package utilitiesPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class BaseTest {
	
	public RemoteWebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		

		System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		
		
		 driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void quitBrowser() {
		
		driver.quit();
		
	}

}
