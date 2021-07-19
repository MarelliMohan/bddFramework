package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class MyStepDefinitions2 
{
	    @Given("^User is in home page$")
	    public void user_is_in_home_page() throws Throwable {
	       System.out.println("a1");
	    }

	    @Given("^User is not in home page$")
	    public void user_is_not_in_home_page() throws Throwable {
	    	System.out.println("b1");
	    }

	    @When("^User enters username and password$")
	    public void user_enters_username_and_password() throws Throwable {
	    	System.out.println("a2");
	    }

	    @When("^User enters wrong username and password$")
	    public void user_enters_wrong_username_and_password() throws Throwable {
	    	System.out.println("b2");
	    }

	    @Then("^User should be logged in$")
	    public void user_should_be_logged_in() throws Throwable {
	    	System.out.println("a3");
	    }

	    @Then("^User should not be logged in$")
	    public void user_should_not_be_logged_in() throws Throwable {
	    	System.out.println("b3");
	    }

	    @And("^Home page should be displayed$")
	    public void home_page_should_be_displayed() throws Throwable {
	    	System.out.println("a4");
	    }

	    @And("^Home page should not be displayed$")
	    public void home_page_should_not_be_displayed() throws Throwable {
	    	System.out.println("b4");
	    }

	}