package co.com.choucair.pruebabancolombia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastStepPage {
    public static final Target INPUT_PASSWORD = Target.the("input password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("input confirm password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_STAY = Target.the("check stay informed")
            .located(By.name("newsletterOptIn"));

    public static final Target CHECK_TERMS = Target.the("check terms of use")
            .located(By.id("termOfUse"));

    public static final Target CHECK_PRIVACY = Target.the("check privacy and security")
            .located(By.id("privacySetting"));

    public static final Target TEXT_CONFIRM = Target.the("Text confirm")
            .located(By.xpath("//*[@id='side_banner']/div[2]/div[1]"));
}
