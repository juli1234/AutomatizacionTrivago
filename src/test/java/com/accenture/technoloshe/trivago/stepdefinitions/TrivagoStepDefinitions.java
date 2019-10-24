/**
 * 
 */
package com.accenture.technoloshe.trivago.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import java.util.List;

import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.accenture.technoloshe.trivago.userinterfaces.TrivagoPage;
import com.accenture.technoloshe.trivago.questions.ValidateFiltros;
import com.accenture.technoloshe.trivago.questions.ValidateName;
import com.accenture.technoloshe.trivago.questions.ValidatePoint;
import com.accenture.technoloshe.trivago.questions.ValidatePrice;
import com.accenture.technoloshe.trivago.tasks.*;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;

/**
 * @author Juliana
 *
 */
public class TrivagoStepDefinitions {

	@Managed(driver = "chrome")
	private WebDriver driver;
	private TrivagoPage trivago;
	private Actor juliana = Actor.named("juliana");


	@Before
	public void setUp() {

		juliana.can(BrowseTheWeb.with(driver));

	}

	@Given("^I Open the browser and go to the page$")
	public void iOpenTheBrowserAndGoToThePage() throws Exception {
		juliana.wasAbleTo(OpenBrowser.on(trivago));

		
	}

	@When("^I enter all the information and navegate for the page$")
	public void iEnterAllTheInformationAndNavegateForThePage() throws Exception {

		juliana.attemptsTo(SendKeys.called());

		
	}

	@Then("^I validate the information of the hotel$")
	public void iValidateTheInformationOfTheHotel() throws Exception {
	
		
		 juliana.should(seeThat(ValidateFiltros.at()));
		 juliana.should(seeThat(ValidatePrice.at()));
		 juliana.should(seeThat(ValidateName.at()));
		 juliana.should(seeThat(ValidatePoint.at()));
			
		 
	
	}

}
