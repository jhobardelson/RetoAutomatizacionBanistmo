package stepsdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.ValidationPageQuestion;
import tasks.FlowTask;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class FlowChallengeBanistmoStepDefinition {

    @Given("the user enter to website {string}")
    public void theUserEnterToWebsite(String url) {
        setTheStage(new OnlineCast());
        theActorCalled("Parck").wasAbleTo(Open.url(url));

    }
    @When("he browses the website to learn more about recycling in Banistmo")
    public void heBrowsesTheWebsiteToLearnMoreAboutRecyclingInBanistmo() {
        theActorInTheSpotlight().attemptsTo(FlowTask.flowTask());
    }
    @Then("Validate the url of the document the website {string}")
    public void validateTheUrlOfTheDocumentTheWebsite(String urlExpected) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationPageQuestion.value(), Matchers.is(Matchers.equalTo(urlExpected))));

    }


}
