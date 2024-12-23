package userinterface;


import net.serenitybdd.screenplay.targets.Target;

public class LoginInterface {

   public static final Target USER_NAME = Target.the("Username").locatedBy("#user-name");
   public static final Target PASSWORD = Target.the("Password").locatedBy("#password");
   public static final Target LOGIN_BUTTON = Target.the("Login button").locatedBy("#login-button");
   public static final Target HOME_PAGE_TEXT = Target.the("Home page text").locatedBy(".product_label");


}
