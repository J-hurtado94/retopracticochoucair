package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theLoginPage() {
        return Task.where("{0} opens the sauce demo login page",
                Open.browserOn().the(SerenityDemo.class));
    }
}
