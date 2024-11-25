package co.co.reto.gmail.tasks;

import co.co.reto.gmail.models.UserData;
import co.co.reto.gmail.userinterfaces.SendEmailPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SendEmail implements Task {
    UserData userData;

    public SendEmail(UserData dataUser){
        this.userData = dataUser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SendEmailPage.REDACTAR),
                Enter.theValue(userData.getDestinatario()).into(SendEmailPage.DESTINATARIO),
                Enter.theValue(userData.getAsunto()).into(SendEmailPage.ASUNTO),
                Enter.theValue(userData.getDescripcion()).into(SendEmailPage.DESCRIP),
                Click.on(SendEmailPage.ADJUNTAR),
                IngresarIframe.conElXpath("//iframe[contains(@src, 'https://docs.google.com/picker')]"),
                Click.on(SendEmailPage.SELECCEIONAR),
                Click.on(SendEmailPage.ARCHIVO),
                Click.on(SendEmailPage.ENVIAR)
        );

    }
    public static SendEmail onTheSite(UserData userData) {
        return Instrumented.instanceOf(SendEmail.class).withProperties(userData);
    }
}
