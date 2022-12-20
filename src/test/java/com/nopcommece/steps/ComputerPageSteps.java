package com.nopcommece.steps;// **** Created By Harshit Patel ****

import com.nopcommece.pages.ComputerPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComputerPageSteps {
    @Given("^I am on computerpage$")
    public void iAmOnComputerpage() {
        new ComputerPage().clickOnMenuTab("Computers");

    }

    @When("^I click on Computers and Desktops$")
    public void iClickOnComputersAndDesktops() {
        new ComputerPage().clickOnComputerAndDesktop();
    }

    @Then("^I click on sort computer and desktop \"([^\"]*)\"$")
    public void iClickOnSortComputerAndDesktop(String order){
        new ComputerPage().sortComputerDesktops(order);
    }


}
