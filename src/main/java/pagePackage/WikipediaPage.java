package pagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage extends BasePage {
	
	//RemoteWebDriver driver;

	public WikipediaPage(RemoteWebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='simpleSearch']/input")
	public WebElement searchTextField;
	
//	@FindBy(xpath = "//h3[@class='ipc-title__text']/span[text()='Details']")
//	public WebElement detailSection;
	@FindBy(xpath="//input[@id='searchButton']")
	public WebElement search;
	
	
	@FindBy(xpath = "//th[text()='Country']/following::td[1]")
	public WebElement countryValue;
	
	@FindBy(xpath = "//div[text()='Release date']/following::td[1]//li")
	public WebElement releaseDateValue;

}
