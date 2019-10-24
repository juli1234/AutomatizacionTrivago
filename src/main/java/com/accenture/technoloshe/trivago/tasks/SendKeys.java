/**
 * 
 */
package com.accenture.technoloshe.trivago.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import com.accenture.technoloshe.trivago.questions.ValidateFiltros;
import com.accenture.technoloshe.trivago.questions.ValidateName;
import com.accenture.technoloshe.trivago.questions.ValidatePoint;
import com.accenture.technoloshe.trivago.questions.ValidatePrice;
import com.accenture.technoloshe.trivago.userinterfaces.TrivagoPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

/**
 * @author Juliana
 *
 */
public class SendKeys implements Task {

	private static Target target;
	private static String text;
	private TrivagoPage trivago;

	public SendKeys(Target target, String text) {
		this.target = target;
		this.text = text;
	
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		
		actor.attemptsTo(Enter.theValue("medellin").into(trivago.IMPUT_CITY));
		trivago.IMPUT_CITY.resolveFor(actor).sendKeys(Keys.ENTER);

		actor.attemptsTo(Click.on(trivago.OPTION_DATE_START));
		actor.attemptsTo(Click.on(trivago.OPTION_DATE_END));

		
		trivago.ROOM.resolveFor(actor).sendKeys(Keys.PAGE_UP);
		trivago.ROOM.resolveFor(actor).sendKeys(Keys.ENTER);
		actor.attemptsTo(Click.on(trivago.BUTTON_BUSCAR));
		actor.attemptsTo(GoTo.the(trivago.LIST_TYPE_H), Click.on(trivago.LIST_PUNTUACION));

		actor.attemptsTo(Click.on(trivago.FILTROS), Click.on(trivago.FLITROS_ROOM), Click.on(trivago.COMODIDAD1),
				Click.on(trivago.COMODIDAD2), Click.on(trivago.COMODIDAD3) , Click.on(trivago.BUTTON_LISTO));

		
	    trivago.waitForTimeoutInMilliseconds();
	}

	public static SendKeys called() {
		return new SendKeys(target, text);

	}

}
