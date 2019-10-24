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

//SACA EL PRECIO DEL HOTEL
public class ValidatePrice implements Question<Boolean> {
	private TrivagoPage trivago;

	@Override
	public Boolean answeredBy(Actor actor) {

		String prueba = Text.of(trivago.PRICE).viewedBy(actor).asString();

		System.out.println("El precio del hotel es: " + prueba);

		return true;

	}

	public static ValidatePrice at() {
		return new ValidatePrice();
	}
}