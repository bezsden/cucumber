package com.luxoft.dbdc.etsycom.stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefinition {

    @Given("^I am on the main page$")
    public void i_am_on_the_main_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("step 1");
     }

    @When("^I accept terms and conditions$")
    public void i_accept_terms_and_conditions() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("step 1");
    }

    @When("^I search for \"(.*?)\" items$")
    public void i_search_for_items(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("step 1");    }

    @Then("^I see search results$")
    public void i_see_search_results() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("step 1");    }

    @Then("^I get search results for \"(.*?)\" items$")
    public void i_get_search_results_for_items(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("step 1");
    }

}
