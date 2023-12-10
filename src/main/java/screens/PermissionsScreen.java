package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class PermissionsScreen extends BaseScreen{

    public PermissionsScreen(AndroidDriver driver) {
        super(driver);
    }
    By doNotAllow = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]");

    public void userDenyPermissions(){
        driver.findElement(doNotAllow).click();
    }
}
