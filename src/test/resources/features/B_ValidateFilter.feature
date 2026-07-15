@filter
Feature: Validate filter functionality 

Scenario: Validate price by filter
 	Given user is home page
	When clicks the search field
	And  user enters item  "shirt"
	Then user click the search button 
	And search result is displayed
	Given user is on FootballMonk search page
	When user select the range "Sort by price: low to high"
    Then price is validated
	