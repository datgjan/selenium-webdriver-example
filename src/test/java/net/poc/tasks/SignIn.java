/**
 * 
 */
package net.poc.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

import net.poc.ui.HomePage;
import net.poc.ui.SignInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

/**
 * @author datdc@gearinc.com
 * 
 */
public class SignIn implements Task {
	String phoneNumber = "";
	String password = "";

	public SignIn(String phoneNumber, String password) {
		this.phoneNumber = phoneNumber;
		this.password = password;
	}

	@Step("{0} Sign In with the #phoneNumber phone number and #password password")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				WaitUntil.the(HomePage.SIGN_IN, isCurrentlyEnabled()).forNoMoreThan(30)
				.seconds(),
				Click.on(HomePage.SIGN_IN),
				WaitUntil.the(SignInPage.PHONE_NUMBER_FIELD, isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
				SendKeys.of(phoneNumber).into(SignInPage.PHONE_NUMBER_FIELD),
				WaitUntil.the(SignInPage.PASSWORD_FIELD, isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
				SendKeys.of(password).into(SignInPage.PASSWORD_FIELD),
				Click.on(SignInPage.SIGN_IN_BUTTON));
	}

	public static SignIn done(String phoneNumber, String password) {
		return instrumented(SignIn.class, phoneNumber, password);
	}
}