package pagePackage;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import utilitiesPackage.BaseTest;

public class BasePage extends BaseTest{

	public RemoteWebDriver driver;
	
	public BasePage(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}
	

}
