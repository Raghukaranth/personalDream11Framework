package dream11;

import genericUtility.BaseClass;
import objectRepo.LoginPage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TesterApp extends BaseClass {
    @Test
    public void LaunchApp() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage login = new LoginPage(driver);
        login.LoginToApp("7019234137");
    }
}
