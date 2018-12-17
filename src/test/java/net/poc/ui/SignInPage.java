/**
 * 
 */
package net.poc.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

/**
 * @author datdc@gearinc.com
 * 
 */
public class SignInPage {
	public static final Target PHONE_NUMBER_FIELD = Target.the("phone number field")
			.located(By.xpath("//input[@name='username']"));
	public static final Target PASSWORD_FIELD = Target.the("password field")
			.located(By.xpath("//input[@name='password']"));
	public static final Target SIGN_IN_BUTTON = Target.the("sign in button")
			.located(By.xpath("//button[@type='submit']"));
}