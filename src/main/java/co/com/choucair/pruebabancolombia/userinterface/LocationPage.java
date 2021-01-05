package co.com.choucair.pruebabancolombia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage {

    public static final Target INPUT_CITY = Target.the("input city")
            .located(By.id("city"));

    public static final Target INPUT_ZIP = Target.the("input zip")
            .located(By.id("zip"));

    public static final Target INPUT_COUNTRY = Target.the("input country")
            .located(By.name("countryId"));

    public static final Target DROPDOWN_COUNTRY = Target.the("dropdown month")
            .located(By.xpath("//div[contains(text(),'Colombia')]"));

    public static final Target BUTTON_NEXT_PAGE = Target.the("button next page")
            .located(By.xpath("//span[contains(text(),'Next: Devices')]"));
}
