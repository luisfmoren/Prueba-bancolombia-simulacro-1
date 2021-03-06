package co.com.choucair.pruebabancolombia.tasks;

import co.com.choucair.pruebabancolombia.userinterface.LastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LastStep implements Task {

    private String password;

    public LastStep(String password) {
        this.password = password;
    }

    public static Performable the(String password){
        return Tasks.instrumented(LastStep.class,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(password).into(LastStepPage.INPUT_PASSWORD),
                Enter.theValue(password).into(LastStepPage.INPUT_CONFIRM_PASSWORD),
                Click.on(LastStepPage.CHECK_STAY),
                Click.on(LastStepPage.CHECK_TERMS),
                Click.on(LastStepPage.CHECK_PRIVACY));
    }
}
