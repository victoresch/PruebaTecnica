package runners.automatizacion.reto;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/automatizacionReto.feature",
                 glue = "stepdefinitions.automatizacion.reto",
                 snippets = SnippetType.CAMELCASE)
public class RunnerAutomatizacionReto {

}
