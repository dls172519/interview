package pagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImdbPage extends BasePage {
	
	public ImdbPage(RemoteWebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	




	@FindBy(xpath = "//div[@aria-haspopup='listbox']/input")
	public WebElement searchTextField;
	
	@FindBy(xpath="(//a[@data-testid='search-result--const'])[1]")
	public WebElement searchresult;
	
	@FindBy(xpath = "//h3[@class='ipc-title__text']/span[text()='Details']")
	public WebElement detailSection;
	
	@FindBy(xpath = "//span[text()='Country of origin']/following::div[1]/ul/li/a")
	public WebElement countryValue;
	
	@FindBy(xpath = "//a[text()='Release date']/following::div[1]/ul/li/a")
	public WebElement releaseDateValue;

}
