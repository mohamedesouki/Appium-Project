package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SplashScreen extends BaseScreen{
    public SplashScreen(AndroidDriver driver) {
        super(driver);
    }

    By splashForwardBtn = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]");

    By startBtn = By.xpath("//android.view.View[@content-desc=\"ابدأ\"]");

    public void navigateFromSplash(){
        for (int i=0;i<3;i++){
            driver.findElement(splashForwardBtn).click();
        }
        driver.findElement(startBtn).click();
    }
}
