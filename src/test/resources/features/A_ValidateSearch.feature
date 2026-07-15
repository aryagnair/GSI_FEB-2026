@search
Feature: Validate search functionality 

Scenario: Validate searh for an item
 	Given user is home page
	When clicks the search field
	And  user enters item  "shirt"
	Then user click the search button 
	And search result is displayed 
	