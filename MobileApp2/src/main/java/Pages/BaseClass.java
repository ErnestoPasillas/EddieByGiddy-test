package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    private final AppiumDriverLocalService appiumService = AppiumDriverLocalService.buildDefaultService();

    static AppiumDriver<WebElement> driver;

    @BeforeTest
    public void setup()  {
        appiumService.start();
        try {

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.4");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
            cap.setCapability(MobileCapabilityType.UDID, "AB4E10E1-4A99-4503-857C-41315A439868");
            cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            cap.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");


            URL url = new URL("http://127.0.0s.4723/wd/hub");

            driver = new AppiumDriver<WebElement>(url, cap);
           //  driver = new IOSDriver<WebElement>(url,cap);

        }catch (Exception e){
            System.out.println("Causado por :" + e.getCause());
            System.out.println("Mensaje : " + e.getMessage());
            e.printStackTrace();
        }

    }


    @Test
    public void sampleTest(){

        System.out.println("estoy dentrto del test");
    }



    @AfterTest
    public void teardown(){

        driver.quit();

    }


}
