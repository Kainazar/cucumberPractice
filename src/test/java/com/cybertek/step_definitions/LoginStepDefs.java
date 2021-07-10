package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User is on login page");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters Librarian username");

    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters Librarian password");

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User able to see dashboard displayed");
        System.out.println("****************************");

    }
    @Then("user enters student username")
    public void user_enters_student_username() {
        System.out.println("User enters Student username");

    }


    @When("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("User enters Student password");

    }

    @When("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("User enters Admin Password");

    }

    @Then("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("User enters Admin username");

    }
}





