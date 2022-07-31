package genericUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    public AppiumDriverLocalService service;

    public URL url;
    public AppiumDriver driver;
    public DesiredCapabilities caps = new DesiredCapabilities();



    @BeforeSuite
    public void openDB() {
        System.out.println("open the database");

    }

    @BeforeClass
    public void openServer() {
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        caps.setCapability("appPackage", "com.app.dream11Pro");
        caps.setCapability("appActivity", "com.app.dream11.dream11.SplashActivity");
    }

    @BeforeMethod
    public void openApp() throws MalformedURLException {
        url = new URL("http://localhost:4723/wd/hub");
        driver = new AppiumDriver(url, caps);
       // wLib.waitForDom(driver);
    }

    @AfterClass
    public void quitApp() {
        driver.closeApp();
    }

    @AfterSuite
    public void closeDB() {
        System.out.println("close database");
    }

}
