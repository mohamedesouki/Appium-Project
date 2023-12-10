package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class RegistrationScreen extends BaseScreen {


    public RegistrationScreen(AndroidDriver driver) {
        super(driver);
    }

    By nameField = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View[1]/android.widget.EditText[1]");
    By emailField = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View[1]/android.widget.EditText[2]");
    By passwordField = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View[1]/android.widget.EditText[3]");
    By confirmPasswor = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View[1]/android.widget.EditText[4]");
    By saveBtn = By.xpath("//android.view.View[@content-desc=\"إنشاء حساب\"]");

    public void enterData (String name,String email,String password,String confirmPassword){
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(confirmPasswor).sendKeys(confirmPassword);
        driver.findElement(saveBtn).click();

    }



}

