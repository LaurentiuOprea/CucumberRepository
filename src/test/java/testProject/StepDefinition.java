package testProject;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

    @Given("^I have (\\d+) cukes in my belly$")
    public void i_have_cukes_in_my_belly(int cukes) throws Exception {
        Belly belly = new Belly();
        belly.eat(cukes);
        throw new PendingException();
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int eat) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
