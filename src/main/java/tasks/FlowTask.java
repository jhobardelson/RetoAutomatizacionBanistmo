package tasks;

import interactions.HomePageInteraction;
import interactions.SostenibilidadInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FlowTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        //llamado de la interacion que se ejecuta en la HomePage
        actor.attemptsTo(HomePageInteraction.homePageInteraction());

        //llamado de la interacion que se ejecuta en la pagina de Sostenibilidad
        actor.attemptsTo(SostenibilidadInteraction.sostenibilidadInteraction());


    }

    public static FlowTask flowTask() {
        return instrumented(FlowTask.class);
    }
}
