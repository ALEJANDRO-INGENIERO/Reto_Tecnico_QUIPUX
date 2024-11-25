package co.co.reto.gmail.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        tags = "@Login",
        glue = "co.co.reto.gmail.stepdefinitios",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class LoginRunners {
}
