package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static ui.IndexPaginaUi.*;

public class CapturaOfertas implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public void imprimir(Actor actor) {
        int conta = 1;
        while (TITULO.of(String.valueOf(conta)).resolveFor(actor).isPresent()) {
            System.out.println("Oferta " + conta + ":");
            System.out.println("Nombre de la oferta: " + TITULO.of(String.valueOf(conta)).resolveFor(actor).getText());
            System.out.println("Fecha de publicacion: " + FECHA.of(String.valueOf(conta)).resolveFor(actor).getText());
            System.out.println("Descripcion: " + DESCRIPCION.of(String.valueOf(conta)).resolveFor(actor).getText() + "\n");
            conta++;
        }
    }
}
