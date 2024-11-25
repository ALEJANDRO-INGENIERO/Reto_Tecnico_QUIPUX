package co.co.reto.gmail.stepdefinitios;


import co.co.reto.gmail.models.UserData;
import co.co.reto.gmail.tasks.Login;
import co.co.reto.gmail.tasks.SendEmail;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;


import static co.co.reto.gmail.utils.Datos.ACTOR;
import static co.co.reto.gmail.utils.Datos.URL;

public class InicioSesionStep {
    @Given("el usuario ingresa a la pagina de login")
    public void elUsuarioIngresaALaPaginaDeLogin() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }
    @When("ingresa su nombre de usuario {string} y contraseña {string}")
    public void ingresaSuNombreDeUsuarioYContraseña(String user, String pass) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.onTheSite(user, pass)
        );

    }
    @Then("el usuario envia un email")
    public void elUsuarioEnviaUnEmail(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SendEmail.onTheSite(UserData.setData(dataTable).get(0))
        );

    }



}
