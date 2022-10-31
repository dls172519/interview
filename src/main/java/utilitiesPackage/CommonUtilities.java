package utilitiesPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CommonUtilities {
	public void scrollToParticularElement(RemoteWebDriver driver,WebElement element) {
		try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", element);			
		} catch (Exception e) {

		}
	}
}
