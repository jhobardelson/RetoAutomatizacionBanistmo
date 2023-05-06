package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import javax.swing.plaf.PanelUI;

public class SostenibilidadPage {

    public static final Target LINK_RECICLAJE = Target.the("LINK DE RECICLAJE").located(By.xpath("//a[contains(text(), 'Reciclaje')]"));
    public static final Target LINK_CONOCE_MAS = Target.the("LINK DE CONOCE MAS").located(By.xpath("//a[@id='¿Porqué es importante reciclar?']"));

}
