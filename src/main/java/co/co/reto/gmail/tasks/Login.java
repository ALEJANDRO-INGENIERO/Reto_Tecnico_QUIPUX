package co.co.reto.gmail.tasks;

import co.co.reto.gmail.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login {

    public static Performable onTheSite(String user, String pass){
       return Task.where("Ingresa sus credenciales",
               Click.on(LoginPage.ACCEDER),
               Enter.theValue(user).into(LoginPage.USUARIO),
               Click.on(LoginPage.BTN_FOLLOWING),
               Enter.theValue(pass).into(LoginPage.PASSWORD),
               Click.on(LoginPage.BTN_INI)
               );
    }
}
