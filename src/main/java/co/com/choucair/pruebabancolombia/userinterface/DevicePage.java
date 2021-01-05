package co.com.choucair.pruebabancolombia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicePage {

    public static final Target INPUT_COMPUTER = Target.the("input computer")
            .located(By.name("osId"));

    public static final Target DROPDOWN_COMPUTER = Target.the("dropdown computer")
            .located(By.xpath("//div[contains(text(),'Windows')]"));

    public static final Target INPUT_VERSION = Target.the("input version")
            .located(By.name("osVersionId"));

    public static final Target DROPDOWN_VERSION = Target.the("dropdown version")
            .located(By.xpath("//div[contains(text(),'10 64-bit')]"));

    public static final Target INPUT_LANGUAGE = Target.the("input language")
            .located(By.name("osLanguageId"));

    public static final Target DROPDOWN_LANGUAGE = Target.the("dropdown language")
            .located(By.xpath("//div[contains(text(),'Spanish')]"));

    public static final Target INPUT_DEVICE = Target.the("input device")
            .located(By.name("handsetMakerId"));

    public static final Target DROPDOWN_DEVICE = Target.the("dropdown device")
            .located(By.xpath("//div[contains(text(),'Apple')]"));

    public static final Target INPUT_MODEL = Target.the("input model")
            .located(By.name("handsetModelId"));

    public static final Target DROPDOWN_MODEL = Target.the("dropdown model")
            .located(By.xpath("//div[contains(text(),'iPad 1 3G')]"));

    public static final Target INPUT_SYSTEM = Target.the("input system")
            .located(By.name("handsetOSId"));

    public static final Target DROPDOWN_SYSTEM = Target.the("dropdown system")
            .located(By.xpath("//div[contains(text(),'iOS 4.0')]"));

    public static final Target BUTTON_NEXT_PAGE = Target.the("button next page")
            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));
}
