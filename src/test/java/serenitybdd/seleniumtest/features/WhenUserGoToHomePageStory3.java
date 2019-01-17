/**
 * 
 */
package serenitybdd.seleniumtest.features;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.poc.tasks.OpenTheApplication;
import net.poc.tasks.SignIn;
import net.poc.tasks.SignOut;
import net.poc.questions.HomePageUI;
import net.poc.questions.ProfilePageUI;
import net.poc.questions.SignInPageUI;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

/**
 * @author datdc@gearinc.com
 * 
 */
@RunWith(SerenityRunner.class)
public class WhenUserGoToHomePageStory3{
	
	@Managed(uniqueSession = true)
	public WebDriver hisBrowser;

	String datdc = "User";

	@Steps
	OpenTheApplication openTheApplication;

	@Before
	public void annaCanBrowseTheMobileApp() throws MalformedURLException {
		OnStage.setTheStage(new OnlineCast());
		
		// Given
		theActorCalled(datdc).can(BrowseTheWeb.with(hisBrowser));
		theActorInTheSpotlight().attemptsTo(openTheApplication);
	}
	
	@Test
	public void tcid00001_show_home_page() {
		
		theActorInTheSpotlight().should(seeThat(HomePageUI.isDisplayed(), is(true)));
		
	}
	
	@Test
	public void tcid00002_sign_in_page() {
		String phoneNumber = "0335828813";
		String password = "Sgs123456";
		
		theActorInTheSpotlight().attemptsTo(SignIn.done(phoneNumber, password));
		theActorInTheSpotlight().should(seeThat(ProfilePageUI.isDisplayed(), is(true)));
		
	}
	
	@Test
	public void tcid00003_sign_out_page() {
		String phoneNumber = "0335828813";
		String password = "Sgs123456";
		
		theActorInTheSpotlight().attemptsTo(SignIn.done(phoneNumber, password), SignOut.done());
		theActorInTheSpotlight().should(seeThat(SignInPageUI.isDisplayed(), is(true)));
		
	}

}