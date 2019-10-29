/**
 * 
 */
package com.accenture.technoloshe.trivago.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * @author Juliana
 *
 */
@DefaultUrl(" https://www.trivago.com.co/")
public class TrivagoPage extends PageObject {
	
	//INICIO
	public static final Target IMPUT_CITY = Target.the("city").located(By.id("querytext"));
	public static final Target IMPUT_DATE_START = Target.the("date1").located(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div[1]/div[2]/div[2]/button[3]"));
	public static final Target IMPUT_DATE_END =Target.the("date2").located(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div[1]/div[2]/div[3]/button[3]"));
	public static final Target ROOM = Target.the("room").located(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div[1]/div[2]/button[1]"));
	public static final Target OPTION_DATE_START = Target.the("option1").located(By.xpath("/html/body/div[3]/div[1]/div[3]/div[1]/div[2]/div[4]/div[2]/div/table/tbody/tr[4]/td[5]/time"));
	public static final Target OPTION_DATE_END = Target.the("option2").located(By.xpath("/html/body/div[3]/div[1]/div[3]/div[1]/div[2]/div[4]/div[2]/div/table/tbody/tr[4]/td[6]/time"));
	public static final Target BUTTON_BUSCAR = Target.the("button").located(By.xpath("/html/body/div[3]/div[1]/div[3]/div[1]/div[2]/button[2]"));
	
	//HOME
    public static final Target LIST_TYPE_H = Target.the("tipohospedaje").located(By.xpath("//*[@id=\"page_wrapper\"]/section[1]/div/div/ul/li[2]/button"));
    public static final Target FILTROS = Target.the("fltros").locatedBy("//*[@id=\"page_wrapper\"]/section[1]/div/div/ul/li[5]/button");
	public static final Target LIST_PUNTUACION = Target.the("estrellas").locatedBy("/html/body/div[3]/section[1]/div/div/ul/li[2]/div/div/section/div/div/div[1]/div/ul/li[2]/button");
    public static final Target VIEW_OFERT = Target.the("ofert").locatedBy("/html/body/div[3]/main/div/div/div[4]/div/div/div[3]/div[1]/section/ol/li[1]/article/div[1]/div[2]/section/div/div[3]/button");
    public static final Target CONCEPT_LIST = Target.the("lista de filtros").locatedBy("/html/body/div[3]/main/div/div/div[4]/div/div/div[3]/div[1]/section/ol/li[1]/article/div[1]/div[2]/div/div[3]/dl/dt");
    
    
    public static final Target FLITROS_ROOM = Target.the("room filtros").locatedBy("/html/body/div[3]/section[1]/div/div/ul/li[5]/div/div/section/div/div/div[1]/div/div/div[1]/div[4]");
    public static final Target COMODIDAD1 = Target.the("comodidad1").locatedBy("/html/body/div[3]/section[1]/div/div/ul/li[5]/div/div/section/div/div/div[1]/div/div/div[2]/div[2]/details[4]/ul/li[7]/label");
    public static final Target COMODIDAD2 = Target.the("comodidad2").located(By.id("97/300-1"));
    public static final Target COMODIDAD3 = Target.the("comodidad3").locatedBy("/html/body/div[3]/section[1]/div/div/ul/li[5]/div/div/section/div/div/div[1]/div/div/div[2]/div[2]/details[4]/ul/li[1]/label");
    public static final Target BUTTON_LISTO= Target.the("listo").locatedBy("/html/body/div[3]/section[1]/div/div/ul/li[5]/div/div/section/div/div/footer/button[2]");
    
    //VALIDACIONES
    public static final Target PRICE = Target.the("precio").locatedBy("/html/body/div[3]/main/div/div/div[4]/div/div/div[3]/div[1]/section/ol/li[3]/article/div[1]/div[2]/section[2]/div/div[2]/div/strong");
    public static final Target NAME_HOTEL = Target.the("nombre del hotel").locatedBy("/html/body/div[3]/main/div/div/div[4]/div/div/div[3]/div[1]/section/ol/li[3]/article/div[1]/div[2]/div/div[1]/h3/span");
    public static final Target PUNTOS = Target.the("calificacion").locatedBy("/html/body/div[3]/main/div/div/div[4]/div/div/div[3]/div[1]/section/ol/li[3]/article/div[1]/div[2]/div/button/span[1]/span[1]/span");
	 
}


