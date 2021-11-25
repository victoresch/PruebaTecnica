package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import ui.UrlPagina;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPagina implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new UrlPagina()));
    }
    public static AbrirPagina en (){
        return instrumented(AbrirPagina.class);
    }
}
