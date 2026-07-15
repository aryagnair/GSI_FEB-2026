package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PriceFilterPage {

	WebDriver driver;
	By filterbtn=By.name("orderby");
	By price = By.xpath("//ins//span[@class='woocommerce-Price-amount amount']");
	public PriceFilterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getPriceFilter() {
		return this.driver.findElement(this.filterbtn);
	}


	public List<WebElement> getdisplaypriceItem() {
		return this.driver.findElements(this.price);
	}
	

}
