package co.co.reto.gmail.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SendEmailPage {
    public static final Target REDACTAR = Target.the("")
            .located(By.xpath("//div[contains(text(),'Redactar')]"));
    public static final Target DESTINATARIO = Target.the("")
            .located(By.xpath("//input[@type='text' and @aria-label='Destinatarios'] "));
    public static final Target ASUNTO = Target.the("")
            .located(By.name("subjectbox"));
    public static final Target DESCRIP = Target.the("")
            .located(By.xpath("//div[@role='textbox' and @aria-label='Cuerpo del mensaje']"));
    public static final Target ADJUNTAR = Target.the("")
            .located(By.xpath("//div[@class='aA7 aaA aMZ']"));
    public static final Target SELECCEIONAR = Target.the("")
            .located(By.xpath("//*[@id=':0.1kwf_S2FtRNFO-hoG5ot5HiQ0I1eRjIn_']/div[2]"));
    public static final Target ARCHIVO = Target.the("")
          .located(By.xpath("//button//span[text()='Añadir como archivo adjunto']"));
    public static final Target ENVIAR = Target.the("")
            .located(By.xpath("//div[text()='Enviar']"));

}
