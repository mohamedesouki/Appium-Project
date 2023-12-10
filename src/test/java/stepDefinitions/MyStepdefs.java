package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import screens.*;
import static stepDefinitions.Hooks.driver;

public class MyStepdefs {

    RegistrationScreen registrationScreen;
    HomeScreen homeScreen;
    SplashScreen splashScreen;
    PermissionsScreen permissionsScreen;
    MainScreen mainScreen;

    @Given("user opens app")
    public void UserOpensAppAndNavigateToRegisterScreen(){

    }
    @When("user deny permission and navigate from splash")
    public void userDenyPermissionAndNavigateFromSplash() {
        permissionsScreen.userDenyPermissions();
        splashScreen.navigateFromSplash();

    }
    @And("user navigates to registration screen")
    public void userNavigatesToRegistrationScreen() {
        
        homeScreen.navigateToRegistration();
    }

    @And("user creates new account")
    public void userCreatesNewAccount() {
        registrationScreen.enterData("mohamed desouki","mohamedshanab205@gmail.com","12345678","12345678");

    }


    @And("user enters valid credentials")
    public void userEntersValidCredentials() {
        homeScreen.loginData("mohamedshanab205@gmail.com","12345678");
    }

    @And("user login successfully")
    public void userLoginSuccessfully() {
        homeScreen.userLogins();
    }


    @And("user click search bar and search for donate")
    public void userClickSearchBarAndSearchForDonate() {
        mainScreen.searchForDonate();
    }

    @And("user navigate settings screen")
    public void userNavigateSettingsScreen() {
        mainScreen.navToLogout();

    }

    @And("user click logout")
    public void userClickLogout() {
        mainScreen.logout();

    }
}

