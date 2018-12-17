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
public class ProfilePage {
	public static final Target LOGO = Target.the("logo")
			.located(By.xpath("//a[@class='logo-custom']//img[@class='logo-lg']"));
	public static final Target ACCOUNT_TAB = Target.the("account tab")
			.located(By.xpath("//i[@class='fa fa-user-o']/.."));
	public static final Target VINID_CARD = Target.the("vinid card")
			.located(By.xpath("//i[@class='fa fa-id-card-o']/.."));
	public static final Target HISTORY_TAB = Target.the("history tab")
			.located(By.xpath("//i[@class='fa fa-list-ul']/.."));
	public static final Target SIGN_OUT_BUTTON = Target.the("sign out button")
			.located(By.xpath("//i[@class='fa fa-sign-out']/.."));
}
