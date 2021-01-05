package co.com.choucair.pruebabancolombia.tasks;

import co.com.choucair.pruebabancolombia.userinterface.LocationPage;
import co.com.choucair.pruebabancolombia.userinterface.PersonalInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Location implements Task {

    private String city;
    private String zip;

    public Location(String city, String zip) {
        this.city = city;
        this.zip=zip;
    }

    public static Performable the(String city, String zip){
        return Tasks.instrumented(Location.class,city,zip);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(city).into(LocationPage.INPUT_CITY),
                Enter.theValue(zip).into(LocationPage.INPUT_ZIP),
                Click.on(LocationPage.INPUT_COUNTRY),
                Click.on(LocationPage.DROPDOWN_COUNTRY),
                Click.on(LocationPage.BUTTON_NEXT_PAGE));
    }
}
