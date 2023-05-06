package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.SostenibilidadPage.*;

public class SostenibilidadInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(LINK_RECICLAJE));
        actor.attemptsTo(Click.on(LINK_RECICLAJE));
        actor.attemptsTo(Click.on(LINK_CONOCE_MAS));
    }

    public static SostenibilidadInteraction sostenibilidadInteraction() {
        return instrumented(SostenibilidadInteraction.class);
    }
}
