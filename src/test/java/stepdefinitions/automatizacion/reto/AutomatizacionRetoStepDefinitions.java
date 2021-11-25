package stepdefinitions.automatizacion.reto;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import model.PalabraModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.AbrirPagina;
import tasks.BuscarOfertas;

public class AutomatizacionRetoStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor megan = Actor.named("Megan");

    @Before
    public void setUp(){
        megan.can(BrowseTheWeb.with(navegador));
    }

    @Dado("^que el actor ingresa a la pagina web$")
    public void queElActorIngresaALaPaginaWeb() throws Exception {
        megan.wasAbleTo(AbrirPagina.en());
    }

    @Cuando("^el usuario realiza la busqueda con (.*)$")
    public void elUsuarioRealizaLaBusqueda(PalabraModel modelo) throws Exception {
        megan.wasAbleTo(BuscarOfertas.enPagina(modelo));

    }

    @Entonces("^el debe ver la lista de ofertas$")
    public void elDebeVerLaListaDeOfertas() throws Exception {

    }

}
