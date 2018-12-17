/**
 * 
 */
package net.poc.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * @author datdc@gearinc.com
 * 
 */
@DefaultUrl("https://vinid.net/")
public class HomePage extends PageObject {
	public static final Target LOGO = Target.the("logo")
			.located(By.xpath("//img[@class='logo-light default']"));
	public static final Target HOME = Target.the("home")
			.located(By.xpath("//li[@class='dropdown active']"));
	public static final Target ABOUT = Target.the("about")
			.located(By.xpath("//a[@href='javascript:void(0);'][contains(text(),'Giới thiệu')]"));
	public static final Target PROMOTION = Target.the("promotion")
			.located(By.xpath("//ul[@id='accordion']/li/a[@href='/doi-tac'][contains(text(),'Ưu đãi')]"));
	public static final Target SAVE_AND_USE_POINTS = Target.the("save and use point")
			.located(By.xpath("//ul[@id='accordion']/li/a[contains(text(),'Tích & Sử dụng điểm')]"));
	public static final Target NEW = Target.the("new")
			.located(By.xpath("//ul[@id='accordion']/li/a[contains(text(),'Tin tức')]"));
	public static final Target SIGN_UP = Target.the("sign up")
			.located(By.xpath("//a[@href='https://account.vinid.net/signup']//div"));
	public static final Target SIGN_IN = Target.the("sign in")
			.located(By.xpath("//a[@href='https://account.vinid.net']//i"));
}
