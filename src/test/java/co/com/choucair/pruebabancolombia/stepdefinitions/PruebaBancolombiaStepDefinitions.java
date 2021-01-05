package co.com.choucair.pruebabancolombia.stepdefinitions;

import co.com.choucair.pruebabancolombia.model.UtestData;
import co.com.choucair.pruebabancolombia.questions.Answer;
import co.com.choucair.pruebabancolombia.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class PruebaBancolombiaStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than luis wants create a new register$")
    public void thanLuisWantsCreateANewRegister() {
        OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thePage());

    }


    @When("^he enter your personal information$")
    public void heEnterYourPersonalInformation(List<UtestData> utestDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(PersonalInformation.the(utestDataList.get(0).getStrFirstName(),
                utestDataList.get(0).getStrLastName(),utestDataList.get(0).getStrEmail(),utestDataList.get(0).getStrMonth(),
                utestDataList.get(0).getStrDay(),utestDataList.get(0).getStrYear()), Location.the(utestDataList.get(0).getStrCity(),utestDataList.get(0).getStrZip()),
                Device.the(), LastStep.the(utestDataList.get(0).getStrPassword()));

    }

    @Then("^he will have a new register in the page$")
    public void heWillHaveANewRegisterInThePage(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrText())));

    }
}
