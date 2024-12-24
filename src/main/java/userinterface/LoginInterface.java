package userinterface;


import net.serenitybdd.screenplay.targets.Target;

public class LoginInterface {

   public static final Target USER_NAME = Target.the("Username").locatedBy("#LoginPanel0_Username");
   public static final Target PASSWORD = Target.the("Password").locatedBy("#LoginPanel0_Password");
   public static final Target LOGIN_BUTTON = Target.the("Login button").locatedBy("#LoginPanel0_LoginButton");
   public static final Target HOME_PAGE_TEXT = Target.the("Home page text").locatedBy(".content-header");


}
