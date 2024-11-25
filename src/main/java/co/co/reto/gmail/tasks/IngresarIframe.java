package co.co.reto.gmail.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IngresarIframe implements Task {
    private final String xpathIframe;

    public IngresarIframe(String xpathIframe) {
        this.xpathIframe = xpathIframe;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = actor.usingAbilityTo(BrowseTheWeb.class).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(xpathIframe)));
    }

    public static IngresarIframe conElXpath(String xpath) {
        return new IngresarIframe(xpath);
    }

}
