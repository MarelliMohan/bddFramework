package stepDefinitions;


@RunWith(Cucumber.class)
public class MyStepDefinitions 
{

	@Given("^User is in home page$")
    public void user_is_in_home_page() throws Throwable 
	{
		System.out.println("Given");
    }

	 @When("^User enters (.+) and (.+)$")
	    public void user_enters_and(String username, String password) throws Throwable {
	      System.out.println(username);
	      System.out.println(password);
	    }

    @Then("^User should be logged in$")
    public void user_should_be_logged_in() throws Throwable 
    {
		System.out.println("then");
    }

    @And("^Home page should be displayed$")
    public void home_page_should_be_displayed() throws Throwable 
    {
		System.out.println("And");
    }

}