package co.com.choucair.pruebabancolombia.tasks;

import co.com.choucair.pruebabancolombia.userinterface.DevicePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Device implements Task {

    public static Performable the(){
        return Tasks.instrumented(Device.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DevicePage.INPUT_COMPUTER),
                Click.on(DevicePage.DROPDOWN_COMPUTER),
                Click.on(DevicePage.INPUT_VERSION),
                Click.on(DevicePage.DROPDOWN_VERSION),
                Click.on(DevicePage.INPUT_LANGUAGE),
                Click.on(DevicePage.DROPDOWN_LANGUAGE),
                Click.on(DevicePage.INPUT_DEVICE),
                Click.on(DevicePage.DROPDOWN_DEVICE),
                Click.on(DevicePage.INPUT_MODEL),
                Click.on(DevicePage.DROPDOWN_MODEL),
                Click.on(DevicePage.INPUT_SYSTEM),
                Click.on(DevicePage.DROPDOWN_SYSTEM),
                Click.on(DevicePage.BUTTON_NEXT_PAGE));
    }
}
