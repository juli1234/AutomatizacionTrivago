/**
 * 
 */
package com.accenture.technoloshe.trivago.questions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


import com.accenture.technoloshe.trivago.userinterfaces.TrivagoPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

/**
 * @author Juliana
 *
 */

public class ValidateFiltros implements Question<Boolean> {
	private TrivagoPage trivago;

	@Override
	public Boolean answeredBy(Actor actor) {
	
		String prueba = Text.of(trivago.CONCEPT_LIST).viewedBy(actor).asString();
		System.out.println(prueba);
		
		if(prueba.equalsIgnoreCase("Tu búsqueda:") || prueba.equalsIgnoreCase("Incluye:") ) {
			
			System.out.print("Se incluyeron los filtros deseados :)" + "\n");
			return true;
			
		}
		System.out.print("No se incluyeron los filtros :C");
		return false ;

	}

	public static ValidateFiltros at() {
		return new ValidateFiltros();
	}
}


