package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IndexPaginaUi {

    public static final Target POPUP = Target.the("Popup").located(By.id("sg-popup-content-wrapper-5998"));
    public static final Target BTN_TRABAJA_CON_NOSOTROS = Target.the("Trabaja con nosotros").locatedBy("(//a[contains(text(),'Trabaja Con Nosotros')])[1]");
    public static final Target INPUT_BUSCAR = Target.the("Input buscar").locatedBy("(//input[@id='s'])");
    public static final Target TITULO = Target.the("contador").locatedBy("//div[contains(@class,'cards elementor-grid')]/article[{0}]/descendant::div/h3/a");
    public static final Target DESCRIPCION = Target.the("contador").locatedBy("//div[contains(@class,'cards elementor-grid')]/article[{0}]/descendant::div/p");
    public static final Target FECHA = Target.the("contador").locatedBy("//div[contains(@class,'cards elementor-grid')]/article[{0}]/descendant::div/span[@class='elementor-post-date']");

}
