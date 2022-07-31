package objectRepo;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath = "//android.widget.TextView[@text='English']")
    private MobileElement tv_English;

    @FindBy(xpath = "//android.widget.Button[@text = 'CONTINUE']")
    private MobileElement btn_Continue;

    @FindBy(xpath = "//android.widget.TextView[@text = 'Log In']")
    private MobileElement tv_Login;

    @FindBy(xpath = "//android.widget.EditText[@text='Email or mobile no']")
    private MobileElement et_EmailOrMobileNo;

    @FindBy(xpath = "//android.widget.TextView[@text = 'NEXT']")
    private MobileElement btn_Next;

    @FindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    private MobileElement btn_Allow;


    public LoginPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void LoginToApp(String phoneNo) {
        tv_English.click();
        btn_Continue.click();
        tv_Login.click();
        et_EmailOrMobileNo.sendKeys(phoneNo);
        btn_Next.click();
        btn_Allow.click();
    }
}
