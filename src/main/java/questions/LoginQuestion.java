package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.LoginInterface;

public class LoginQuestion {


    public static Question<String> titlePage(){
        return Text.of(LoginInterface.HOME_PAGE_TEXT).asString();
    }
}
