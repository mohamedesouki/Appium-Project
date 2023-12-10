package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qualityplus.flutter.driver.AppiumFlutterDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {


   public static AndroidDriver driver;


    DesiredCapabilities caps = new DesiredCapabilities();

    @Before
    public void openApp() throws MalformedURLException {

        caps.setCapability("deviceName","M2101K7BG");
        //caps.setCapability("appActivity","com.miui.notes.ui.NotesListActivity");
        //caps.setCapability("appPackage","com.miui.notes");
        caps.setCapability("appActivity","com.quantatil.ikhar.MainActivity");
        caps.setCapability("appPackage","com.quantatil.ikhar");


        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);


    }

    @After
    public void quitApp(){

        driver.quit();
    }
}
