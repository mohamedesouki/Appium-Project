package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainScreen extends BaseScreen {
    public MainScreen(AndroidDriver driver) {
        super(driver);
    }

    By searchBtn = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    By sideMenu = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]");
    By searchBar = By.xpath("//android.widget.EditText");
    By firstResult = By.xpath("//android.view.View[@content-desc=\"مؤسسة القلب الكبير\"]/android.widget.ImageView");

    By settingBtn = By.xpath("//android.widget.ImageView[@content-desc=\"الإعدادات\"]");
    By logoutBtn = By.xpath("//android.view.View[@content-desc=\"تسجيل الخروج\"]");


    public void searchForDonate() {
        driver.findElement(searchBtn).click();
        driver.findElement(searchBar).sendKeys("تبرع");
        driver.findElement(firstResult).click();

    }

    public void navToLogout() {
        driver.findElement(sideMenu).click();
        driver.findElement(settingBtn).click();


    }

    public void logout(){
        driver.findElement(logoutBtn).click();
    }
}

