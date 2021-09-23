package Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static Pages.BaseClass3.url;

public class SimpleAppiumTest {


    AppiumDriver<WebElement> driver;
    private String appiumServer = "http://127.0.0.1:4723/wd/hub";
    private final int port = 4723;
    private final AppiumDriverLocalService appiumService = AppiumDriverLocalService.buildDefaultService();

    @BeforeClass
    public  void setupServer() throws MalformedURLException {

        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        url = new URL(URL_STRING);


        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iOS");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.4");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        cap.setCapability(MobileCapabilityType.UDID, "C5B996EC-4C43-45BF-8D3F-22E7656A88EB");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");

        driver = new IOSDriver<>(new URL(appiumServer), cap);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.resetApp();
    }


    @Test
    public void SimpleTest(){

        System.out.println("estoy dentrto del test");
        driver.get("https://google.com");
    }
}
