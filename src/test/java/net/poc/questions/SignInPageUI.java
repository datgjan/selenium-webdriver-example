/**
 * 
 */
package net.poc.questions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.poc.ui.SignInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

/**
 * @author datdc@gearinc.com
 * 
 */
public class SignInPageUI implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		
		actor.attemptsTo(WaitUntil.the(SignInPage.PHONE_NUMBER_FIELD, isVisible()).forNoMoreThan(30).seconds());

		return (SignInPage.PHONE_NUMBER_FIELD.resolveFor(actor).isDisplayed()
				&& SignInPage.PASSWORD_FIELD.resolveFor(actor).isDisplayed()
				&& SignInPage.SIGN_IN_BUTTON.resolveFor(actor).isDisplayed());
	}
	
	public static Question<Boolean> isDisplayed() {
		return new SignInPageUI();
	}

}
