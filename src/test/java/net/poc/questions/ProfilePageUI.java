/**
 * 
 */
package net.poc.questions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.poc.ui.ProfilePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

/**
 * @author datdc@gearinc.com
 * 
 */
public class ProfilePageUI implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		
		actor.attemptsTo(WaitUntil.the(ProfilePage.LOGO, isVisible()).forNoMoreThan(30).seconds());

		return (ProfilePage.LOGO.resolveFor(actor).isDisplayed()
				&& ProfilePage.ACCOUNT_TAB.resolveFor(actor).isDisplayed()
				&& ProfilePage.VINID_CARD.resolveFor(actor).isDisplayed()
				&& ProfilePage.HISTORY_TAB.resolveFor(actor).isDisplayed()
				&& ProfilePage.SIGN_OUT_BUTTON.resolveFor(actor).isDisplayed());
	}
	
	public static Question<Boolean> isDisplayed() {
		return new ProfilePageUI();
	}

}
