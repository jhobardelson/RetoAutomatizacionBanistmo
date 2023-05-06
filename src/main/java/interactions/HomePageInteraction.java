package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;


public class HomePageInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_COOKIES));
        actor.attemptsTo(Click.on(LINK_ACERCA_NOSOTRO));
        actor.attemptsTo(Click.on(LINK_INFORMACION_CORPORATIVA));
        actor.attemptsTo(Click.on(LINK_SOSTENIBILIDAD));
    }

    public static HomePageInteraction homePageInteraction() {
        return instrumented(HomePageInteraction.class);
    }
}
