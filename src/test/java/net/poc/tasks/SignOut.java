/**
 * 
 */
package net.poc.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

import net.poc.ui.ProfilePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

/**
 * @author datdc@gearinc.com
 * 
 */
public class SignOut implements Task {


	@Step("{0} sign out the page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				WaitUntil.the(ProfilePage.SIGN_OUT_BUTTON, isCurrentlyEnabled()).forNoMoreThan(30)
				.seconds(),
				Click.on(ProfilePage.SIGN_OUT_BUTTON));
	}

	public static SignOut done() {
		return instrumented(SignOut.class);
	}
}