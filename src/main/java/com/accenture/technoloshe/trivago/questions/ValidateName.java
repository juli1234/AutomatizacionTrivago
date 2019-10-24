/**
 * 
 */
package com.accenture.technoloshe.trivago.questions;

import com.accenture.technoloshe.trivago.userinterfaces.TrivagoPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * @author 1020491006
 *
 */

//SACA EL NOMBRE DEL HOTEL
public class ValidateName implements Question<Boolean> {

	private TrivagoPage trivago;

	@Override
	public Boolean answeredBy(Actor actor) {
		
		String prueba = Text.of(trivago.NAME_HOTEL).viewedBy(actor).asString();
		
	
			System.out.println("El Nombre del hotel es: "+ prueba);
			
			return true;
		
		
		
	

	}

	public static  ValidateName at() {
		return new  ValidateName();
	}
}