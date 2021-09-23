package Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

public class MobileTest {


   static AppiumDriver<MobileElement> driver;




    public static void example() throws Exception{


        /*************** IOS ****************/

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.4");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
        cap.setCapability(MobileCapabilityType.UDID, "AB4E10E1-4A99-4503-857C-41315A439868");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
       // cap.setCapability("app", "location of .app or .ipa file"); para abrir una app

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        IOSDriver driver = new IOSDriver<MobileElement>(url, cap);


        /*************** Android ****************/

        /*
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","sdk_gphone_x86");
        cap.setCapability("platformName", "android");
        cap.setCapability("platformVersion", "11");

        cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        cap.setCapability("app", "location of .app or .ipa file");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

         driver = new AppiumDriver<MobileElement>(url, cap);*/
    }

}
