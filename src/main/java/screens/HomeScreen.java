package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen extends BaseScreen{
    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    By emailLogin = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[5]/android.widget.EditText[1]");
    By passwordLogin = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[5]/android.widget.EditText[2]");

    By loginBtn = By.xpath("(//android.view.View[@content-desc=\"تسجيل الدخول\"])[2]");
    By createAccount = By.xpath("//android.view.View[@content-desc=\"إنشاء حساب\"]");

    public void navigateToRegistration(){
        driver.findElement(createAccount).click();
    }

    public void loginData(String email,String password){
        driver.findElement(emailLogin).sendKeys(email);
        driver.findElement(passwordLogin).sendKeys(password);
    }

    public void userLogins(){

        driver.findElement(loginBtn).click();
    }
}
