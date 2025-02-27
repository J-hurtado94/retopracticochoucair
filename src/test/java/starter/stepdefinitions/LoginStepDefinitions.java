package starter.stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import questions.LoginQuestion;
import tasks.Login;
import tasks.NavigateTo;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {
    @Given("{actor} is on the login page")
    public void user_is_on_the_login_page(Actor actor) {
       actor.wasAbleTo(NavigateTo.theLoginPage());
    }

    @DataTableType
    public Usuario usuario(Map<String,String> userData){
        return new Usuario(userData.get("user"),userData.get("password"));

    }

    @When("{actor} use valid credentials")
    public void user_use_valid_credentials(Actor actor, List<Usuario> usuarioData) {

        String username= System.getenv("USER_NAME");
        String password= System.getenv("USER_PASSWORD");

        usuarioData.stream().map(
                 data -> {
                     data.setUsername(username);
                     data.setPassword(password);
                     return data;

                 }).forEach( data ->
                actor.attemptsTo(Login.sauceDemo(data.getUsername(), data.getPassword()))
        );



    }
    @Then("should see a {string} message")
    public void should_see_a_message(String message) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(LoginQuestion.titlePage()).isEqualTo(message)
        );
    }





}
