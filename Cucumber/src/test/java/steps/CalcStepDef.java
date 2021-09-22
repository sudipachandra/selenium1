package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CalcStepDef {
    int a1,a2,intSumActual;
    float num1,num2,sumActual;

    @Given("I have number one as {int}")
    public void iHaveNumberOneAs(int arg0) {
        a1=arg0;
    }

    @And("I have number two as {int}")
    public void iHaveNumberTwoAs(int arg0) {
        a2=arg0;
    }

    @When("I add both numbers")
    public void iAddBothNumbers() {
        sumActual=num1+num2;
        intSumActual=a1+a2;
    }

    @Then("the sum is {int}")
    public void theSumIs(int sumExpected) {
        Assert.assertEquals(intSumActual,sumExpected);
    }

    @Given("I have number one float as {float}")
    public void iHaveNumberOneAs(float arg0) {
        num1=arg0;
    }

    @And("I have number two float as {float}")
    public void iHaveNumberTwoAs(float arg0) {
        num2=arg0;
    }

    @Then("the float sum is {float}")
    public void theSumIs(float sumExpected) {
        Assert.assertEquals(sumActual,sumExpected);
    }

    @Given("user has opened the login page")
    public void userHasOpenedTheLoginPage() {
    }

    @When("user enter login username {string}")
    public void userEnterLoginUsername(String arg0) {
    }

    @And("user enters login password {string}")
    public void userEntersLoginPassword(String arg0) {
    }

    @And("clicks login button")
    public void clicksLoginButton() {
    }

    @Then("user is able to login successfully")
    public void userIsAbleToLoginSuccessfully() {
    }
}
