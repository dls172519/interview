package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagePackage.BasePage;
import pagePackage.ImdbPage;
import pagePackage.WikipediaPage;
import utilitiesPackage.BaseTest;
import utilitiesPackage.CommonUtilities;

public class TestVagrant extends BaseTest{
	
	

	@Test
	public void movieDetailValidationin() {
		

		ImdbPage imdbPage=new ImdbPage(driver);
		
		CommonUtilities utility = new CommonUtilities();
		
		// navigate to url
		driver.get("https://www.imdb.com/");
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// searching the movie	
		imdbPage.searchTextField.sendKeys("Pushpa: The Rise - Part 1");
		imdbPage.searchresult.click();
		
		utility.scrollToParticularElement(driver, imdbPage.detailSection);
		
		
		
		String Imdbcountry=imdbPage.countryValue.getText().trim();
		System.out.println("Imdb country : "+Imdbcountry);
		
		
		String Imdbdate=imdbPage.releaseDateValue.getText().split("\\(")[0].replace(",", "");
		System.out.println("Imdb Date : "+Imdbdate);
		
		
		WikipediaPage wikiPage=new WikipediaPage(driver);
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// searching the movie
		
		wikiPage.searchTextField.sendKeys("Pushpa: The Rise - Part 1");
		wikiPage.search.click();
		
		utility.scrollToParticularElement(driver, wikiPage.countryValue);
				
				
				
		String Wikicountry=wikiPage.countryValue.getText().trim();
		System.out.println("Wiki country : "+Wikicountry);
		String Wikidate=wikiPage.releaseDateValue.getText();
		System.out.println("Wiki Date : "+Wikidate);
	
		
		if (Imdbcountry.equals(Wikicountry))
		{
			System.out.println("Country matches on IMDB ->> Pass");
		}
		
		else
		{
			System.out.println("Country not matches on IMDB ->> Fail IMDB is "+Imdbcountry+" Wiki is "+Wikicountry);
		}
		
 		if (Imdbdate.trim().contains(Wikidate.trim()))
		{
			System.out.println("Date matches on IMDB ->> Pass");
		}
		
		else
		{
			System.out.println("Date not matches on IMDB ->> Fail");
		}		
		
}
	
	
	
	

}
