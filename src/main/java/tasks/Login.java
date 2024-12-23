package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LoginInterface;

public class Login {

    public static Performable sauceDemo(String user, String password){
        return Task.where("{0} Login successful in sauce demo",
                Enter.theValue(user).into(LoginInterface.USER_NAME),
                Enter.theValue(password).into(LoginInterface.PASSWORD),
                Click.on(LoginInterface.LOGIN_BUTTON)

                );
    }
}
