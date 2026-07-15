package stepDefinations;

import org.testng.Assert;

import base.Base;
import io.cucumber.java.en.*;

import pageObject.SearchPage;

public class A_ValidateSearchStep extends Base {
	SearchPage searchPage;
	@Given("user is home page")
	public void user_is_home_page() {
	  System.out.println("given"); 
	  
	  try {
			 Thread.sleep(3000);
			//logger.debug("Reached Method");
			getDriver().get(this.getUrl());
			 Thread.sleep(3000);
			//this.get(this.getUrl());
			//logger.debug("URL Launched");
		   	getDriver().manage().window().maximize();
		//   logger.debug("Window Maximized");
		    Thread.sleep(3000);
		   // Thread.sleep(3000);
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			//logger.error("Exception occurred:"+ex.getMessage());
		}
	   
	}
	@When("clicks the search field")
	public void clicks_the_search_field() {
		try {
			  searchPage=new SearchPage(getDriver());
			  Thread.sleep(3000);
			    searchPage.getSearchfld().click();
			    Thread.sleep(3000);
			    
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			//logger.error("Exception occurred:"+ex.getMessage());
		}
	}
	@When("user enters item  {string}")
	public void user_enters_item(String item) {
		try {
			 searchPage.getSearchfld().sendKeys(item);
			    Thread.sleep(3000);
			   
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			//logger.error("Exception occurred:"+ex.getMessage());
		}
	}
	@Then("user click the search button")
	public void user_click_the_search_button() {
		try {
			 Thread.sleep(2000);
			  searchPage.getSearchbtn().click();
			  Thread.sleep(2000);
			  Assert.assertTrue(searchPage.getSearchbtn().getText().isBlank());
			// logger.debug("User is successfully logged in");
			   // Thread.sleep(3000);
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			//logger.error("Exception occurred:"+ex.getMessage());
		}
	   
	    
	}
	@Then("search result is displayed")
	public void search_result_is_displayed() {
	   
	}
	 
}
