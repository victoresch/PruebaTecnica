package tasks;

import interactions.CapturaOfertas;
import model.PalabraModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.IndexPaginaUi.*;

public class BuscarOfertas implements Task {

    PalabraModel modelo;
    CapturaOfertas ofertas = new CapturaOfertas();

    public BuscarOfertas(PalabraModel modelo) {
        this.modelo = modelo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Check.whether(
                POPUP.resolveFor(actor).isPresent())
                .andIfSo(
                        Click.on(POPUP))
        );

        actor.attemptsTo(
                Click.on(BTN_TRABAJA_CON_NOSOTROS),
                Scroll.to(INPUT_BUSCAR),
                Enter.theValue(modelo.getPalabra()).into(INPUT_BUSCAR).thenHit(Keys.ENTER)
        );
        ofertas.imprimir(actor);
    }


    public static BuscarOfertas enPagina(PalabraModel modelo) {
        return instrumented(BuscarOfertas.class, modelo);
    }
}
