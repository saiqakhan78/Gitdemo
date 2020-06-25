package stepdefination;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;




@RunWith(cucumber.class)
public class stepdefination {

    @Given("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
     System.out.println("long page out");
        
    }

    @When("^user login into application username and password$")
    public void user_login_into_application_username_and_password() throws Throwable {
        
    }

    @Then("^home page is polutated $")
    public void home_page_is_polutated() throws Throwable {
    	
    }
    

    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    
    }

}