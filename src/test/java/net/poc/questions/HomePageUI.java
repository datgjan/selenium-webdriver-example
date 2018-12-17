/**
 * 
 */
package net.poc.questions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.poc.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

/**
 * @author datdc@gearinc.com
 * 
 */
public class HomePageUI implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		
		actor.attemptsTo(WaitUntil.the(HomePage.LOGO, isVisible()).forNoMoreThan(30).seconds());

		return (HomePage.LOGO.resolveFor(actor).isDisplayed()
				&& HomePage.ABOUT.resolveFor(actor).isDisplayed()
				&& HomePage.HOME.resolveFor(actor).isDisplayed()
				&& HomePage.SIGN_IN.resolveFor(actor).isDisplayed()
				&& HomePage.SIGN_UP.resolveFor(actor).isDisplayed()
				&& HomePage.PROMOTION.resolveFor(actor).isDisplayed()
				&& HomePage.NEW.resolveFor(actor).isDisplayed()
				&& HomePage.SAVE_AND_USE_POINTS.resolveFor(actor).isDisplayed());
	}
	
	public static Question<Boolean> isDisplayed() {
		return new HomePageUI();
	}

}
