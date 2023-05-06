package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target BTN_COOKIES = Target.the("BOTON ACEPTAR COOKIES").located(By.xpath("//button[@id='btn-aceptar-cookies']"));
    public static final Target LINK_ACERCA_NOSOTRO = Target.the("LINK ACERCA DE NOSOTROS").located(By.xpath("//a[contains(text(), 'Acerca de nosotros')]"));
    public static final Target LINK_INFORMACION_CORPORATIVA = Target.the("INFORMACION CORPORATIVA").located(By.xpath("//a[contains(text(), 'Información Corporativa')]"));
    public static final Target LINK_SOSTENIBILIDAD = Target.the("lINK SOSTENIBILIDAD").located(By.xpath("//a[contains(text(), 'Sostenibilidad')]"));

}
