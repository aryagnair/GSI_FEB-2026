package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	WebDriver driver;
	By searchfld=By.id("elementor-search-form-dd78eab");
	By searchbtn=By.xpath("//*[@type='submit']");	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getSearchfld() {
		return this.driver.findElement(this.searchfld);
	}
	
	
	public WebElement getSearchbtn() {
		return this.driver.findElement(this.searchbtn);
	}
	
}
