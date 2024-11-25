package co.co.reto.gmail.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target ACCEDER = Target.the("Usuario")
            .located(By.xpath("//a[@class='button button--medium header__aside__button button--desktop button--tablet button--mobile']"));
    public static final Target USUARIO = Target.the("Usuario")
            .located(By.id("identifierId"));
    public static final Target BTN_FOLLOWING = Target.the("Usuario")
            .located(By.xpath("//span[contains(text(),'Siguiente')]"));
    public static final Target PASSWORD = Target.the("Usuario")
            .located(By.xpath("//input[@name='Passwd']"));
    public static final Target BTN_INI = Target.the("Usuario")
            .located(By.xpath("//span[contains(text(),'Siguiente')]"));
}
