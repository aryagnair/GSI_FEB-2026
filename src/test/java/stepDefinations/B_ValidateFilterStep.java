package stepDefinations;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import base.Base;
import io.cucumber.java.en.*;
import pageObject.PriceFilterPage;

public class B_ValidateFilterStep extends Base {

	PriceFilterPage pricefilterPage;
	WebElement filterByPrice;
	String inputRange;
	
	List<WebElement>priceList=new ArrayList<>();
	private static final Logger logger =
			LogManager.getLogger(B_ValidateFilterStep.class);
	 
	 @Given("user is on FootballMonk search page")
	 public void user_is_on_footballmonk_search_page() throws Exception {

	     getDriver().get(getsortUrl());

	 }
	 @When("user select the range {string}")
	 public void user_select_the_range(String range) {
	 
	   System.out.println("WHEN"); 
	   try {

		   pricefilterPage = new PriceFilterPage(getDriver());
		 
		   Thread.sleep(3000);
		   
		  priceList= pricefilterPage.getdisplaypriceItem();
		
		  System.out.println("Product : "+priceList.size());
		  
	   }
	   catch(Exception ex)
	   {
		   System.out.println(ex.getMessage());
		   logger.debug("Exception occurred:"+ex.getMessage());
	   }
	   
	}
	@Then("price is validated")
	public void price_is_validated() {
		double lastPrice = 0;
        boolean sort =true;
        double dressprice = 0;
		try 
		{
			 for (WebElement element : priceList) {

		            String price = element.getText();
			
				price = price.replaceAll("[^0-9.]", "");
				if(!price.isEmpty())
				{
					 dressprice=Double.parseDouble(price);
					 
			     
			     if(dressprice<lastPrice) {
			    	sort =false;
			    	
			     }
			   
			     lastPrice=dressprice;
			     
				}
				
			}
			System.out.println("VALIDATION COMPLETED*****");
			if(sort) {
				System.out.println("PASS****");
			}
			else
			{
				System.out.println("FAIL*******");
			}
			System.out.println("BUG FOUND");
            System.out.println("Current Price : " + dressprice);
            System.out.println("Previous Price : " + lastPrice);
            logger.debug("BUG FOUND**********");
        }
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			logger.debug("Exception occurred:"+ex.getMessage());
		}
     }
	
	}