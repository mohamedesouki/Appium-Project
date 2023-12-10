package screens;

import io.appium.java_client.android.AndroidDriver;

public class BaseScreen {

    protected final AndroidDriver driver;

            public BaseScreen(AndroidDriver driver){
                this.driver = driver;
            }
}
