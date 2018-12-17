/**
 * 
 */
package net.poc.tasks;

import net.poc.ui.HomePage;

/**
 * @author datdc@gearinc.com
 * 
 */

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;;

public class OpenTheApplication implements Task {

    HomePage vinIDPage;

    @Step("Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(vinIDPage)
        );
    }
    
    
}
