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
//SACA LA CALIFICACION DEL HOTEL
public class ValidatePoint implements Question<Boolean> {

	private TrivagoPage trivago;
	

	@Override
	public Boolean answeredBy(Actor actor) {
	
		String prueba = Text.of(trivago.PUNTOS).viewedBy(actor).asString();
	
		
		if(prueba.equalsIgnoreCase("8.0") || prueba.equalsIgnoreCase("8.1") ||  prueba.equalsIgnoreCase("8.2") || prueba.equalsIgnoreCase("8.3") || prueba.equalsIgnoreCase("8.4")  ) {
			
			System.out.print("La puntuacion es: Muy Bueno " + prueba );
			return true;
			
		}
		
		if(prueba.equalsIgnoreCase("8.5") || prueba.equalsIgnoreCase("8.6") ||  prueba.equalsIgnoreCase("8.7") || prueba.equalsIgnoreCase("8.8") || prueba.equalsIgnoreCase("8.9")) { 
			
			
			System.out.print("La puntuacion es: Excelente " + prueba );
			return true;
		
		
		
		
		   }
		else {
			
			System.out.print("La puntuacion es: Buena " + prueba);
		}
		
		return false ;
	}

	public static ValidatePoint at() {
		return new ValidatePoint();
	}
}
